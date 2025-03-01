package com.gempire.entities.abilities;

import com.gempire.entities.abilities.base.Ability;
import com.gempire.entities.abilities.interfaces.IIdleAbility;
import com.gempire.entities.abilities.interfaces.IPhysicalAbility;
import com.gempire.entities.gems.EntityTourmaline;
import net.minecraft.network.chat.Component;

public class AbilityLumberjack extends Ability implements IPhysicalAbility {

    //TODO: IMPLEMENT LUMBERJACK
    public AbilityLumberjack(){
        super("lumberjack", 3);
    }

    @Override
    public Component getName() {
        return Component.translatable("ability.gempire.lumberjack");
    }

}
