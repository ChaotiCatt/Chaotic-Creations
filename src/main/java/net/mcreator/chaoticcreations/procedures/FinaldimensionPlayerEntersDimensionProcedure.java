package net.mcreator.chaoticcreations.procedures;

@ChaoticCreationsModElements.ModElement.Tag
public class FinaldimensionPlayerEntersDimensionProcedure extends ChaoticCreationsModElements.ModElement {

	public FinaldimensionPlayerEntersDimensionProcedure(ChaoticCreationsModElements instance) {
		super(instance, 83);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency x for procedure FinaldimensionPlayerEntersDimension!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency y for procedure FinaldimensionPlayerEntersDimension!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency z for procedure FinaldimensionPlayerEntersDimension!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency world for procedure FinaldimensionPlayerEntersDimension!");
			return;
		}

		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		if (((ChaoticCreationsModVariables.WorldVariables.get(world).finalbosskilled) == 0)) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new OdinEntity.CustomEntity(OdinEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
				entityToSpawn.setRenderYawOffset((float) 0);

				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);

				world.addEntity(entityToSpawn);
			}
		}

	}

}
