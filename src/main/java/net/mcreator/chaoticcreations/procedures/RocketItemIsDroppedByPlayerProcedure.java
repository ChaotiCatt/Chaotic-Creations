package net.mcreator.chaoticcreations.procedures;

@ChaoticCreationsModElements.ModElement.Tag
public class RocketItemIsDroppedByPlayerProcedure extends ChaoticCreationsModElements.ModElement {

	public RocketItemIsDroppedByPlayerProcedure(ChaoticCreationsModElements instance) {
		super(instance, 100);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency itemstack for procedure RocketItemIsDroppedByPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency x for procedure RocketItemIsDroppedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency y for procedure RocketItemIsDroppedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency z for procedure RocketItemIsDroppedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency world for procedure RocketItemIsDroppedByPlayer!");
			return;
		}

		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 4, Explosion.Mode.NONE);
		}
		((itemstack)).setCount((int) 0);

	}

}
