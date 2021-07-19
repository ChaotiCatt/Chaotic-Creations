
package net.mcreator.chaoticcreations.world.structure;

@ChaoticCreationsModElements.ModElement.Tag
public class SkyGarden1Structure extends ChaoticCreationsModElements.ModElement {

	private static Feature<NoFeatureConfig> feature = null;
	private static ConfiguredFeature<?, ?> configuredFeature = null;

	public SkyGarden1Structure(ChaoticCreationsModElements instance) {
		super(instance, 60);

		MinecraftForge.EVENT_BUS.register(this);
		FMLJavaModLoadingContext.get().getModEventBus().register(new FeatureRegisterHandler());
	}

	private static class FeatureRegisterHandler {

		@SubscribeEvent
		public void registerFeature(RegistryEvent.Register<Feature<?>> event) {
			feature = new Feature<NoFeatureConfig>(NoFeatureConfig.field_236558_a_) {
				@Override
				public boolean generate(ISeedReader world, ChunkGenerator generator, Random random, BlockPos pos, NoFeatureConfig config) {
					int ci = (pos.getX() >> 4) << 4;
					int ck = (pos.getZ() >> 4) << 4;

					RegistryKey<World> dimensionType = world.getWorld().getDimensionKey();
					boolean dimensionCriteria = false;

					if (dimensionType == World.OVERWORLD)
						dimensionCriteria = true;

					if (!dimensionCriteria)
						return false;

					if ((random.nextInt(1000000) + 1) <= 300) {
						int count = random.nextInt(1) + 1;
						for (int a = 0; a < count; a++) {
							int i = ci + random.nextInt(16);
							int k = ck + random.nextInt(16);
							int j = world.getHeight(Heightmap.Type.OCEAN_FLOOR_WG, i, k);

							j += random.nextInt(50) + 16;

							Rotation rotation = Rotation.values()[random.nextInt(3)];
							Mirror mirror = Mirror.values()[random.nextInt(2)];

							BlockPos spawnTo = new BlockPos(i + 0, j + 0, k + 0);

							int x = spawnTo.getX();
							int y = spawnTo.getY();
							int z = spawnTo.getZ();

							Template template = world.getWorld().getStructureTemplateManager()
									.getTemplateDefaulted(new ResourceLocation("chaotic_creations", "sky_garden"));

							if (template == null)
								return false;

							template.func_237144_a_(world, spawnTo,
									new PlacementSettings().setRotation(rotation).setRandom(random).setMirror(mirror)
											.addProcessor(BlockIgnoreStructureProcessor.STRUCTURE_BLOCK).setChunk(null).setIgnoreEntities(false),
									random);

						}
					}

					return true;
				}
			};

			configuredFeature = feature.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
					.withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG));

			event.getRegistry().register(feature.setRegistryName("sky_garden_1"));
			Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation("chaotic_creations:sky_garden_1"), configuredFeature);
		}

	}

	@SubscribeEvent
	public void addFeatureToBiomes(BiomeLoadingEvent event) {

		event.getGeneration().getFeatures(GenerationStage.Decoration.RAW_GENERATION).add(() -> configuredFeature);
	}

}
