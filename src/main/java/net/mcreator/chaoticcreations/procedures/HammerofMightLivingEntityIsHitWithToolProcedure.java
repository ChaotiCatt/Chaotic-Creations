package net.mcreator.chaoticcreations.procedures;

@ChaoticCreationsModElements.ModElement.Tag
public class HammerofMightLivingEntityIsHitWithToolProcedure extends ChaoticCreationsModElements.ModElement {

	public HammerofMightLivingEntityIsHitWithToolProcedure(ChaoticCreationsModElements instance) {
		super(instance, 87);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency sourceentity for procedure HammerofMightLivingEntityIsHitWithTool!");
			return;
		}

		Entity sourceentity = (Entity) dependencies.get("sourceentity");

		if (((new Object() {
			int check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == Effects.STRENGTH)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check(sourceentity)) == 0)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 60, (int) 1));
		} else {
			if (((new Object() {
				int check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == Effects.STRENGTH)
								return effect.getAmplifier();
						}
					}
					return 0;
				}
			}.check(sourceentity)) == 1)) {
				if (sourceentity instanceof LivingEntity)
					((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 60, (int) 2));
			} else {
				if (sourceentity instanceof LivingEntity)
					((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 60, (int) 3));
			}
		}

	}

}
