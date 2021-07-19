package net.mcreator.chaoticcreations.procedures;

@ChaoticCreationsModElements.ModElement.Tag
public class GadgetBulletHitsBlockProcedure extends ChaoticCreationsModElements.ModElement {

	public GadgetBulletHitsBlockProcedure(ChaoticCreationsModElements instance) {
		super(instance, 96);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency x for procedure GadgetBulletHitsBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency y for procedure GadgetBulletHitsBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency z for procedure GadgetBulletHitsBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency world for procedure GadgetBulletHitsBlock!");
			return;
		}

		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) (y - 2), (int) z, (float) 14, Explosion.Mode.NONE);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) (y - 1), (int) z, (float) 12, Explosion.Mode.NONE);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) (y + 0), (int) z, (float) 5, Explosion.Mode.NONE);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) (y + 1), (int) z, (float) 1, Explosion.Mode.NONE);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) (y + 2), (int) z, (float) 1, Explosion.Mode.NONE);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) (y + 3), (int) z, (float) 1, Explosion.Mode.NONE);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) (y + 4), (int) z, (float) 1, Explosion.Mode.NONE);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) (y + 5), (int) z, (float) 4, Explosion.Mode.NONE);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) (y + 7), (int) z, (float) 9, Explosion.Mode.NONE);
		}

	}

}
