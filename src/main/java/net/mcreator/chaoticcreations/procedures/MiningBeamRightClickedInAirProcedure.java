package net.mcreator.chaoticcreations.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.chaoticcreations.item.MiningBeamLaserItem;
import net.mcreator.chaoticcreations.ChaoticCreationsModElements;
import net.mcreator.chaoticcreations.ChaoticCreationsMod;

import java.util.Random;
import java.util.Map;

@ChaoticCreationsModElements.ModElement.Tag
public class MiningBeamRightClickedInAirProcedure extends ChaoticCreationsModElements.ModElement {
	public MiningBeamRightClickedInAirProcedure(ChaoticCreationsModElements instance) {
		super(instance, 31);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency entity for procedure MiningBeamRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			Entity _ent = entity;
			if (!_ent.world.isRemote()) {
				MiningBeamLaserItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 8, (float) 5, (int) 5);
			}
		}
	}
}
