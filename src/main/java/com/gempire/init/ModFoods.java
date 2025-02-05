package com.gempire.init;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

public class ModFoods {
    public static final FoodProperties SPODUMENE_PIECE = (new FoodProperties.Builder()).alwaysEat().fast().nutrition(0).saturationMod(0).effect(()->{
        return new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 18000, 4);
    }, 1).effect(()->{
        return new MobEffectInstance(MobEffects.WATER_BREATHING, 18000, 4);
    }, 1).effect(()->{
        return new MobEffectInstance(MobEffects.HUNGER, 400);
    }, 0.005F).build();

    public static final FoodProperties SHOCK_BERRY = (new FoodProperties.Builder()).alwaysEat().nutrition(1).saturationMod(1).effect(()->{
        return new MobEffectInstance(ModEffects.SHOCK_RESISTANCE.get(), 400, 4);
    }, 1).build();

    public static final FoodProperties SHADED_APPLE = (new FoodProperties.Builder()).alwaysEat().nutrition(1).saturationMod(1).effect(()->{
        return new MobEffectInstance(ModEffects.SHADE.get(), 400, 4);
    }, 1).build();

    public static final FoodProperties CALMING_JELLY = (new FoodProperties.Builder()).alwaysEat().nutrition(1).saturationMod(1).effect(()->{
        return new MobEffectInstance(ModEffects.CALM.get(), 400, 4);
    }, 1).build();

    public static final FoodProperties ALIEN_FLOWER = (new FoodProperties.Builder()).alwaysEat().nutrition(1).saturationMod(1).effect(()->{
        return new MobEffectInstance(ModEffects.FLORAL_PROTECTION.get(), 400, 4);
    }, 1).build();

    public static final FoodProperties PINCULE_FRUIT = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).build();

    public static final FoodProperties RAW_MANTAWING = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).meat().build();
    public static final FoodProperties COOKED_MANTAWING = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).meat().build();

    public static final FoodProperties RAW_OPALIZED_MANTAWING = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).meat().build();
    public static final FoodProperties COOKED_OPALIZED_MANTAWING = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.8F).meat().build();

    public static final FoodProperties RAW_CRYSTAL_SHANK = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).meat().build();
    public static final FoodProperties COOKED_CRYSTAL_SHANK = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).meat().build();

    public static final FoodProperties STRAWBERRY = (new FoodProperties.Builder()).nutrition(2).saturationMod(4).build();

    public static final FoodProperties CRYSTAL_APPLE = (new FoodProperties.Builder()).alwaysEat().nutrition(2).saturationMod(4).build();

    public static final FoodProperties BLUE_CRYSTAL_APPLE_TOAST = (new FoodProperties.Builder()).nutrition(7).saturationMod(4.6F).build();
    public static final FoodProperties PINK_CRYSTAL_APPLE_TOAST = (new FoodProperties.Builder()).nutrition(7).saturationMod(4.6F).build();
    public static final FoodProperties PURPLE_CRYSTAL_APPLE_TOAST = (new FoodProperties.Builder()).nutrition(7).saturationMod(4.6F).build();
    public static final FoodProperties PINCULE_FRUIT_TOAST = (new FoodProperties.Builder()).nutrition(8).saturationMod(4.3F).build();
    public static final FoodProperties STRAWBERRY_TOAST = (new FoodProperties.Builder()).nutrition(7).saturationMod(4.6F).build();

    public static final FoodProperties CRYSTAL_SHANK_BREAD = (new FoodProperties.Builder()).nutrition(11).saturationMod(4.6F).build();
    public static final FoodProperties MANTAWING_BREAD = (new FoodProperties.Builder()).nutrition(8).saturationMod(4.6F).build();
    public static final FoodProperties OPALIZED_MANTAWING_BREAD = (new FoodProperties.Builder()).nutrition(13).saturationMod(4.8F).build();

    public static final FoodProperties SHADED_APPLE_COOKIE = (new FoodProperties.Builder()).alwaysEat().nutrition(1).saturationMod(1).effect(()->{
        return new MobEffectInstance(ModEffects.SHADE.get(), 400, 4);
    }, 1).build();
    public static final FoodProperties SHOCK_BERRY_COOKIE = (new FoodProperties.Builder()).alwaysEat().nutrition(1).saturationMod(1).effect(()->{
        return new MobEffectInstance(ModEffects.SHOCK_RESISTANCE.get(), 400, 4);
    }, 1).build();
    public static final FoodProperties CALMING_JELLY_COOKIE = (new FoodProperties.Builder()).alwaysEat().nutrition(1).saturationMod(1).effect(()->{
        return new MobEffectInstance(ModEffects.CALM.get(), 400, 4);
    }, 1).build();
    public static final FoodProperties ALIEN_FLOWER_COOKIE = (new FoodProperties.Builder()).alwaysEat().nutrition(1).saturationMod(1).effect(()->{
        return new MobEffectInstance(ModEffects.FLORAL_PROTECTION.get(), 400, 4);
    }, 1).build();
}