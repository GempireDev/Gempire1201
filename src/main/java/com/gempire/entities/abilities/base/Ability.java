package com.gempire.entities.abilities.base;

import com.gempire.entities.bases.EntityGem;
import net.minecraft.network.chat.Component;

import java.util.HashMap;

public abstract class Ability {
    public EntityGem holder;
    int id;
    int weight;
    public int cooldown;
    public Ability(int id, int weight) {
        this.id = id;
        this.weight = weight;
    }

    public Ability assignAbility(EntityGem holder){
        this.holder = holder;
        return this;
    }

    public int getId() {
        return this.id;
    }

    public int getWeight() {
        return this.weight;
    }

    public abstract Component getName();
}
