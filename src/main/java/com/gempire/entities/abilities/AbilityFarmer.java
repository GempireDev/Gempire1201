package com.gempire.entities.abilities;

import com.gempire.entities.abilities.base.Ability;
import com.gempire.entities.abilities.interfaces.IIdleAbility;
import com.gempire.entities.abilities.interfaces.IPhysicalAbility;
import com.gempire.entities.gems.EntityTourmaline;
import net.minecraft.network.chat.Component;

public class AbilityFarmer extends Ability implements IPhysicalAbility {

    public AbilityFarmer(){
        super("farmer", 5);
    }

    @Override
    public Component getName() {
        return Component.translatable("ability.gempire.farmer");
    }

}
