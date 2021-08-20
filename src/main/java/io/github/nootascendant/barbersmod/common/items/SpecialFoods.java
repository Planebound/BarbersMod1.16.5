package io.github.nootascendant.barbersmod.common.items;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class SpecialFoods {

	public static final Food IMBUED_BERRY = new Food.Builder().effect(
			() -> new EffectInstance(Effects.MOVEMENT_SPEED, 100, 1), 1.0f)
			.nutrition(2)
			.saturationMod(0.2f)
			.alwaysEat()
			.fast()
			.build();
}
