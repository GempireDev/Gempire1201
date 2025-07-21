package com.gempire.container;

import com.gempire.entities.bases.EntityGem;
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

public class PearlDefectiveUIContainer extends AbstractContainerMenu {
    public final EntityGem gem;
    public final ContainerLevelAccess canInteract;

    // Inventory slot constants
    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_INV_ROWS = 3;
    private static final int PLAYER_INV_COLS = 9;
    private static final int PLAYER_INV_SLOT_COUNT = PLAYER_INV_ROWS * PLAYER_INV_COLS;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INV_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int GEM_SLOT_COUNT = 16; // 4x4
    private static final int GEM_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;

    public PearlDefectiveUIContainer(int windowId, Inventory playerInventory, EntityGem gem) {
        super(ModContainers.PEARL_DEFECTIVE_UI_CONTAINER.get(), windowId);
        this.gem = gem;
        this.canInteract = ContainerLevelAccess.create(gem.level(), gem.blockPosition());

        // PLAYER INVENTORY (3 rows x 9)
        for (int row = 0; row < PLAYER_INV_ROWS; row++) {
            for (int col = 0; col < PLAYER_INV_COLS; col++) {
                int slotIndex = col + row * 9 + 9;
                this.addSlot(new Slot(playerInventory, slotIndex, 19 + col * 18, 250 - (4 - row) * 18 - 10));
            }
        }

        // HOTBAR (1 row x 9)
        for (int col = 0; col < HOTBAR_SLOT_COUNT; col++) {
            this.addSlot(new Slot(playerInventory, col, 19 + col * 18, 226));
        }

        // GEM INVENTORY (4x4)
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                int index = col + row * 4;
                this.addSlot(new Slot(gem, index, 27 + col * 18, 103 - (4 - row) * 18 - 10) {
                    @Override
                    public boolean mayPlace(ItemStack stack) {
                        return !(stack.getItem() instanceof ItemGem || !stack.getItem().canFitInsideContainerItems());
                    }
                });
            }
        }
    }

    public PearlDefectiveUIContainer(int windowId, Inventory playerInventory, FriendlyByteBuf extraData) {
        this(windowId, playerInventory, getGem(playerInventory, extraData));
    }

    private static EntityGem getGem(Inventory playerInventory, FriendlyByteBuf extraData) {
        Objects.requireNonNull(playerInventory, "Player Inventory cannot be null");
        Objects.requireNonNull(extraData, "Data Packet cannot be null");
        int id = extraData.readInt();
        Entity entity = playerInventory.player.level().getEntity(id);
        if (entity instanceof EntityGem) return (EntityGem) entity;
        throw new IllegalStateException("Entity is not a Gem");
    }

    @Override
    public boolean stillValid(Player player) {
        return gem.isOwner(player);
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        Slot sourceSlot = this.slots.get(index);
        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;

        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copy = sourceStack.copy();

        if (index < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
            // Player -> Gem
            if (!moveItemStackTo(sourceStack, GEM_FIRST_SLOT_INDEX, GEM_FIRST_SLOT_INDEX + GEM_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else if (index < GEM_FIRST_SLOT_INDEX + GEM_SLOT_COUNT) {
            // Gem -> Player
            if (!moveItemStackTo(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            System.out.println("Invalid slotIndex: " + index);
            return ItemStack.EMPTY;
        }

        if (sourceStack.isEmpty()) {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }

        sourceSlot.onTake(player, sourceStack);
        return copy;
    }
}