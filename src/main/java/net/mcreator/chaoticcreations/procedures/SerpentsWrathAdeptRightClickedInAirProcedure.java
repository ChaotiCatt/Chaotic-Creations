package net.mcreator.chaoticcreations.procedures;

@ChaoticCreationsModElements.ModElement.Tag
public class SerpentsWrathAdeptRightClickedInAirProcedure extends ChaoticCreationsModElements.ModElement {

	public SerpentsWrathAdeptRightClickedInAirProcedure(ChaoticCreationsModElements instance) {
		super(instance, 93);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency entity for procedure SerpentsWrathAdeptRightClickedInAir!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency itemstack for procedure SerpentsWrathAdeptRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency world for procedure SerpentsWrathAdeptRightClickedInAir!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		IWorld world = (IWorld) dependencies.get("world");

		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getCooldownTracker().setCooldown(((itemstack)).getItem(), (int) 60);
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
		}
		if (entity instanceof LivingEntity) {
			Entity _ent = entity;
			if (!_ent.world.isRemote()) {
				SerpentsProjectileItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 6, (float) 0.5, (int) 5);
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
					((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
				}
				if (entity instanceof LivingEntity) {
					Entity _ent = entity;
					if (!_ent.world.isRemote()) {
						SerpentsProjectileItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 6, (float) 0.5, (int) 5);
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
							((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
						}
						if (entity instanceof LivingEntity) {
							Entity _ent = entity;
							if (!_ent.world.isRemote()) {
								SerpentsProjectileItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 6, (float) 0.5, (int) 5);
							}
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}

				}.start(world, (int) 0.5);
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
							((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
						}
						if (entity instanceof LivingEntity) {
							Entity _ent = entity;
							if (!_ent.world.isRemote()) {
								SerpentsProjectileItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 6, (float) 0.5, (int) 5);
							}
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}

				}.start(world, (int) 0.5);

				MinecraftForge.EVENT_BUS.unregister(this);
			}

		}.start(world, (int) 0.5);

	}

}
