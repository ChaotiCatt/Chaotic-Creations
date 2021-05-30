package net.mcreator.chaoticcreations.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Util;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.EntityType;

import net.mcreator.chaoticcreations.ChaoticCreationsModElements;
import net.mcreator.chaoticcreations.ChaoticCreationsMod;

import java.util.Map;

@ChaoticCreationsModElements.ModElement.Tag
public class OdinEntityDiesProcedure extends ChaoticCreationsModElements.ModElement {
	public OdinEntityDiesProcedure(ChaoticCreationsModElements instance) {
		super(instance, 64);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency x for procedure OdinEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency y for procedure OdinEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency z for procedure OdinEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency world for procedure OdinEntityDies!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof ServerWorld) {
			LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
			_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) x, (int) y, (int) z)));
			_ent.setEffectOnly(false);
			((World) world).addEntity(_ent);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 5, Explosion.Mode.NONE);
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
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 6, Explosion.Mode.NONE);
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
						if (world instanceof World && !((World) world).isRemote) {
							((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 7, Explosion.Mode.NONE);
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
								if (world instanceof World && !((World) world).isRemote) {
									((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 8, Explosion.Mode.NONE);
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
										if (world instanceof World && !((World) world).isRemote) {
											((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 9, Explosion.Mode.NONE);
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
												if (world instanceof World && !((World) world).isRemote) {
													((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 10, Explosion.Mode.NONE);
												}
												if (!world.isRemote()) {
													MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
													if (mcserv != null)
														mcserv.getPlayerList().func_232641_a_(
																new StringTextComponent("The Wolves seek to crown a new king....."), ChatType.SYSTEM,
																Util.DUMMY_UUID);
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
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 5);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 5);
	}
}
