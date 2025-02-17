package com.gempire.entities.abilities;

import com.gempire.entities.abilities.base.Ability;
import com.gempire.entities.abilities.interfaces.IIdleAbility;
import com.gempire.entities.bases.EntityGem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;

import java.util.List;

public class AbilityKindergartener extends Ability implements IIdleAbility {

    public AbilityKindergartener(){
        super("kindergartener", 3);
    }
    @Override
    public Component getName() {
        return Component.translatable("ability.gempire.kindergardener");
    }

    @Override
    public void execute() {

    }
}
