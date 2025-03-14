package com.gempire.entities.abilities;

import com.gempire.entities.abilities.base.Ability;
import com.gempire.entities.abilities.interfaces.ICraftingAbility;
import com.gempire.init.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class AbilityHydration extends Ability implements ICraftingAbility {
    public AbilityHydration(){
        super("hydration", 3);
    }
    @Override
    public void setup() {
        if (holder.level().dimension() != Level.NETHER) {
            input.add(Items.BUCKET);
            output.add(Items.WATER_BUCKET);
            input2.add(Items.AIR);
        }
        holder.input2List = input2;
        holder.inputList = input;
        holder.outputList = output;
    }
    @Override
    public Component getName() {
        return Component.translatable("ability.gempire.hydration");
    }
}
