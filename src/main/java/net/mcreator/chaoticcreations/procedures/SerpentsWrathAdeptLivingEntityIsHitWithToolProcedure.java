package net.mcreator.chaoticcreations.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.chaoticcreations.ChaoticCreationsModElements;
import net.mcreator.chaoticcreations.ChaoticCreationsMod;

import java.util.Map;

@ChaoticCreationsModElements.ModElement.Tag
public class SerpentsWrathAdeptLivingEntityIsHitWithToolProcedure extends ChaoticCreationsModElements.ModElement {
	public SerpentsWrathAdeptLivingEntityIsHitWithToolProcedure(ChaoticCreationsModElements instance) {
		super(instance, 90);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency entity for procedure SerpentsWrathAdeptLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 140, (int) 3));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WITHER, (int) 140, (int) 3));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 140, (int) 3));
	}
}
