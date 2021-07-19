package net.mcreator.chaoticcreations.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.chaoticcreations.ChaoticCreationsModElements;
import net.mcreator.chaoticcreations.ChaoticCreationsMod;

import java.util.Map;

@ChaoticCreationsModElements.ModElement.Tag
public class BlazenKatanaLivingEntityIsHitWithToolProcedure extends ChaoticCreationsModElements.ModElement {
	public BlazenKatanaLivingEntityIsHitWithToolProcedure(ChaoticCreationsModElements instance) {
		super(instance, 48);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency entity for procedure BlazenKatanaLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 5);
		entity.attackEntityFrom(DamageSource.ON_FIRE, (float) 5);
	}
}
