package net.mcreator.chaoticcreations.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.particles.ParticleTypes;

import net.mcreator.chaoticcreations.ChaoticCreationsModElements;
import net.mcreator.chaoticcreations.ChaoticCreationsMod;

import java.util.Map;

@ChaoticCreationsModElements.ModElement.Tag
public class GadgetWhileBulletFlyingTickProcedure extends ChaoticCreationsModElements.ModElement {
	public GadgetWhileBulletFlyingTickProcedure(ChaoticCreationsModElements instance) {
		super(instance, 97);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency x for procedure GadgetWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency y for procedure GadgetWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency z for procedure GadgetWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency world for procedure GadgetWhileBulletFlyingTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, (int) 2, 0.1, 0.1, 0.1, 0.1);
		}
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(ParticleTypes.LAVA, x, y, z, (int) 5, 0.1, 0.1, 0.1, 0.1);
		}
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(ParticleTypes.FLAME, x, y, z, (int) 2, 0.1, 0.1, 0.1, 0.1);
		}
	}
}
