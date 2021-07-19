package net.mcreator.chaoticcreations.procedures;

@ChaoticCreationsModElements.ModElement.Tag
public class BlazenKatanaRightClickedInAir2Procedure extends ChaoticCreationsModElements.ModElement {

	public BlazenKatanaRightClickedInAir2Procedure(ChaoticCreationsModElements instance) {
		super(instance, 49);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency entity for procedure BlazenKatanaRightClickedInAir2!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity) {
			Entity _ent = entity;
			if (!_ent.world.isRemote()) {
				InfernalsVenganceItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 5, (int) 5);
			}
		}

	}

}
