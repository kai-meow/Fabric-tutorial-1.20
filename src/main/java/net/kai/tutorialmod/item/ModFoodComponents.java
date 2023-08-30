package net.kai.tutorialmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent TINY_KAI = new FoodComponent.Builder().hunger(8).saturationModifier(5).statusEffect(
            new StatusEffectInstance(StatusEffects.ABSORPTION, 100), 1).meat().build();
}
