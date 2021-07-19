package net.mcreator.chaoticcreations.procedures;

@ChaoticCreationsModElements.ModElement.Tag
public class SerpentsProjectileBulletHitsLivingEntityProcedure extends ChaoticCreationsModElements.ModElement {

	public SerpentsProjectileBulletHitsLivingEntityProcedure(ChaoticCreationsModElements instance) {
		super(instance, 91);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency entity for procedure SerpentsProjectileBulletHitsLivingEntity!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 60, (int) 1));

	}

}
