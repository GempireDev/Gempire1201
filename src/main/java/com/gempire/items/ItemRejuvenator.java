package com.gempire.items;

import com.gempire.entities.bases.EntityGem;
import com.gempire.entities.gems.EntityTourmaline;
import com.gempire.entities.gems.EntityZircon;
import com.gempire.init.ModEnchants;
import com.gempire.init.ModItems;
import com.gempire.util.PaletteType;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class ItemRejuvenator extends DestabBase{

    private final Multimap<Attribute, AttributeModifier> defaultModifiers;

    public ItemRejuvenator(Properties properties){
        super(properties);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Weapon modifier", -3F, AttributeModifier.Operation.ADDITION));
        this.defaultModifiers = builder.build();
    }

    @Override
    public void poofGem(LivingEntity pTarget) {
        if (pTarget.isAlive()) {
            if (pTarget instanceof EntityGem) {
                if (this == ModItems.WHITE_REJUVENATOR.get()) {
                    ((EntityGem) pTarget).setSkinColor(((EntityGem) pTarget).generatePaletteColor(PaletteType.SKIN));
                    ((EntityGem) pTarget).setHairColor(((EntityGem) pTarget).generatePaletteColor(PaletteType.HAIR));
                    ((EntityGem) pTarget).setGemColor(((EntityGem) pTarget).generatePaletteColor(PaletteType.GEM));
                    if (((EntityGem) pTarget).hasMarkings()) {
                        ((EntityGem) pTarget).setMarking2Color(((EntityGem) pTarget).generatePaletteColor(PaletteType.MARKINGS_2));
                    }
                    if (((EntityGem) pTarget).hasMarkings()) {
                        ((EntityGem) pTarget).setMarkingColor(((EntityGem) pTarget).generatePaletteColor(PaletteType.MARKINGS));
                    }
                    ((EntityGem) pTarget).rebelPoints += 0.5F;
                } else if (this == ModItems.PINK_REJUVENATOR.get()) {
                    ((EntityGem) pTarget).resetOwners();
                    ((EntityGem) pTarget).setRebelled(false);
                    ((EntityGem) pTarget).rebelPoints = 1F;
                } else if (this == ModItems.YELLOW_REJUVENATOR.get()) {
                    if (!((EntityGem) pTarget).getRebelled()) {
                        ((EntityGem) pTarget).setHairVariant(((EntityGem) pTarget).generateHairVariant());
                        ((EntityGem) pTarget).setOutfitVariant(((EntityGem) pTarget).generateOutfitVariant());
                        ((EntityGem) pTarget).setInsigniaVariant(((EntityGem) pTarget).generateInsigniaVariant());
                        ((EntityGem) pTarget).rebelPoints += 0.5F;
                    }
                } else if (this == ModItems.BLUE_REJUVENATOR.get()) {
                    ((EntityGem) pTarget).setAbilities(((EntityGem) pTarget).generateAbilities());
                    if (pTarget instanceof EntityZircon)
                    {
                        if (((EntityZircon) pTarget).isPrimary()) {
                            ((EntityZircon) pTarget).setEnchantPage(RandomSource.create().nextInt(ModEnchants.GEMPIRE_ENCHANTMENTS.size()));
                        } else {
                            ((EntityZircon) pTarget).setEnchantPage(RandomSource.create().nextInt(ModEnchants.VANILLA_ENCHANTMENTS.size()));
                        }
                    }
                    else if (pTarget instanceof EntityTourmaline) {
                        ((EntityTourmaline) pTarget).setCrops(((EntityTourmaline) pTarget).generateCrops());
                    }
                    ((EntityGem) pTarget).rebelPoints += 2.5F;
                }

                pTarget.hurt(pTarget.damageSources().magic(), pTarget.getMaxHealth()*20);
                ((EntityGem) pTarget).setCracked(false);
            }
        }
    }
    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot p_43383_) {
        return p_43383_ == EquipmentSlot.MAINHAND ? this.defaultModifiers : super.getDefaultAttributeModifiers(p_43383_);
    }
}
