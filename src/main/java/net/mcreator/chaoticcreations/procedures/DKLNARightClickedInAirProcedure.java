package net.mcreator.chaoticcreations.procedures;

@ChaoticCreationsModElements.ModElement.Tag
public class DKLNARightClickedInAirProcedure extends ChaoticCreationsModElements.ModElement {

	public DKLNARightClickedInAirProcedure(ChaoticCreationsModElements instance) {
		super(instance, 58);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency entity for procedure DKLNARightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency world for procedure DKLNARightClickedInAir!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");

		if (((entity instanceof PlayerEntity)
				? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(Riflerounds1Item.block, (int) (1)))
				: false)) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(Riflerounds1Item.block, (int) (1));
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 3,
						((PlayerEntity) entity).container.func_234641_j_());
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
											BasicbulletgunItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 9, (float) 0.2,
													(int) 2);
										}
									}
									MinecraftForge.EVENT_BUS.unregister(this);
								}

							}.start(world, (int) 5);

							MinecraftForge.EVENT_BUS.unregister(this);
						}

					}.start(world, (int) 5);

					MinecraftForge.EVENT_BUS.unregister(this);
				}

			}.start(world, (int) 5);
		}

	}

}
