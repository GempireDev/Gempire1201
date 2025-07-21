package com.gempire.container;

import com.gempire.entities.gems.EntityPearl;
import com.gempire.init.ModContainers;
import com.gempire.items.ItemGem;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

import java.util.Objects;

public class PearlUIContainer extends AbstractContainerMenu {
    public final ContainerLevelAccess canInteract;
    public final EntityPearl gem;

    public PearlUIContainer(int windowID, Inventory playerInventory, EntityPearl gem) {
        super(ModContainers.PEARL_UI_CONTAINER.get(), windowID);
        this.gem = gem;
        this.canInteract = ContainerLevelAccess.create(this.gem.level(), this.gem.blockPosition());

        // GEM INVENTORY
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 9; col++) {
                this.addSlot(new Slot(gem, col + row * 9, 182 + col * 18, 135 - (6 - row) * 18) {
                    @Override
                    public boolean mayPlace(ItemStack stack) {
                        return !(stack.getItem() instanceof ItemGem || !stack.getItem().canFitInsideContainerItems());
                    }
                });
            }
        }

        // PLAYER INVENTORY
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                this.addSlot(new Slot(playerInventory, col + row * 9 + 9, 95 + col * 18, 240 - (4 - row) * 18 - 10));
            }
        }

        // PLAYER HOTBAR
        for (int col = 0; col < 9; col++) {
            this.addSlot(new Slot(playerInventory, col, 95 + col * 18, 216));
        }
    }

    public PearlUIContainer(int windowID, Inventory playerInventory, FriendlyByteBuf extraData) {
        this(windowID, playerInventory, getGem(playerInventory, extraData));
    }

    public static EntityPearl getGem(Inventory playerInventory, FriendlyByteBuf extraData) {
        Objects.requireNonNull(playerInventory, "Player Inventory cannot be null");
        Objects.requireNonNull(extraData, "Data Packet cannot be null");

        int ID = extraData.readInt();
        Entity entity = playerInventory.player.level().getEntity(ID);
        if (entity instanceof EntityPearl) {
            return (EntityPearl) entity;
        }
        throw new IllegalStateException("Entity is not a Pearl");
    }

    @Override
    public boolean stillValid(Player playerIn) {
        return gem.isOwner(playerIn);
    }

    @Override
    public ItemStack quickMoveStack(Player playerIn, int index) {
        ItemStack stack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);

        if (slot != null && slot.hasItem()) {
            ItemStack slotStack = slot.getItem();
            stack = slotStack.copy();

            int gemSlots = EntityPearl.NUMBER_OF_SLOTS_PEARL;
            int totalSlots = this.slots.size();

            // From Pearl inventory to player
            if (index < gemSlots) {
                if (!this.moveItemStackTo(slotStack, gemSlots, totalSlots, true)) {
                    return ItemStack.EMPTY;
                }
            } else {
                // From player to Pearl inventory
                if (!this.moveItemStackTo(slotStack, 0, gemSlots, false)) {
                    return ItemStack.EMPTY;
                }
            }

            if (slotStack.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
        }

        return stack;
    }
}