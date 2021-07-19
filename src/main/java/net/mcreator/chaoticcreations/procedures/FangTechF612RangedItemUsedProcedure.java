package net.mcreator.chaoticcreations.procedures;

@ChaoticCreationsModElements.ModElement.Tag
public class FangTechF612RangedItemUsedProcedure extends ChaoticCreationsModElements.ModElement {

	public FangTechF612RangedItemUsedProcedure(ChaoticCreationsModElements instance) {
		super(instance, 61);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency entity for procedure FangTechF612RangedItemUsed!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency world for procedure FangTechF612RangedItemUsed!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");

		new Object() {

			private int ticks = 0;
			private float waitTicks;
			private IWorld world;

			public void start(IWorld world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (entity instanceof LivingEntity) {
					Entity _ent = entity;
					if (!_ent.world.isRemote()) {
						BasicbulletgunItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 9, (float) 0.2, (int) 2);
					}
				}
				new Object() {

					private int ticks = 0;
					private float waitTicks;
					private IWorld world;

					public void start(IWorld world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						if (entity instanceof LivingEntity) {
							Entity _ent = entity;
							if (!_ent.world.isRemote()) {
								BasicbulletgunItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 9, (float) 0.2, (int) 2);
							}
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}

				}.start(world, (int) 2);

				MinecraftForge.EVENT_BUS.unregister(this);
			}

		}.start(world, (int) 2);

	}

}
