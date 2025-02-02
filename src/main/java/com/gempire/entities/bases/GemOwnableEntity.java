package com.gempire.entities.bases;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.EntityGetter;

import javax.annotation.Nullable;
import java.util.UUID;

public interface GemOwnableEntity {
    @Nullable
    int getOwnerID();

    EntityGetter level();
}
