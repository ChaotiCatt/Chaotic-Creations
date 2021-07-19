
package net.mcreator.chaoticcreations.world.dimension;

import net.minecraft.block.material.Material;

@ChaoticCreationsModElements.ModElement.Tag
public class FinaldimensionDimension extends ChaoticCreationsModElements.ModElement {

	public FinaldimensionDimension(ChaoticCreationsModElements instance) {
		super(instance, 53);

		MinecraftForge.EVENT_BUS.register(this);

	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		DeferredWorkQueue.runLater(() -> {
			try {
				ObfuscationReflectionHelper.setPrivateValue(WorldCarver.class, WorldCarver.CAVE, new ImmutableSet.Builder<Block>()
						.addAll((Set<Block>) ObfuscationReflectionHelper.getPrivateValue(WorldCarver.class, WorldCarver.CAVE, "field_222718_j"))
						.add(NullstoneBlock.block.getDefaultState().getBlock()).build(), "field_222718_j");

				ObfuscationReflectionHelper.setPrivateValue(WorldCarver.class, WorldCarver.CANYON, new ImmutableSet.Builder<Block>()
						.addAll((Set<Block>) ObfuscationReflectionHelper.getPrivateValue(WorldCarver.class, WorldCarver.CANYON, "field_222718_j"))
						.add(NullstoneBlock.block.getDefaultState().getBlock()).build(), "field_222718_j");
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		DimensionRenderInfo customEffect = new DimensionRenderInfo(Float.NaN, true, DimensionRenderInfo.FogType.NONE, false, false) {

			@Override
			public Vector3d func_230494_a_(Vector3d color, float sunHeight) {
				return new Vector3d(1, 0.2, 0.2);
			}

			@Override
			public boolean func_230493_a_(int x, int y) {
				return false;
			}

		};

		DeferredWorkQueue.runLater(() -> {
			try {
				Object2ObjectMap<ResourceLocation, DimensionRenderInfo> effectsRegistry = (Object2ObjectMap<ResourceLocation, DimensionRenderInfo>) ObfuscationReflectionHelper
						.getPrivateValue(DimensionRenderInfo.class, null, "field_239208_a_");
				effectsRegistry.put(new ResourceLocation("chaotic_creations:finaldimension"), customEffect);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

	}

	@SubscribeEvent
	public void onPlayerChangedDimensionEvent(PlayerEvent.PlayerChangedDimensionEvent event) {
		Entity entity = event.getPlayer();
		World world = entity.world;
		double x = entity.getPosX();
		double y = entity.getPosY();
		double z = entity.getPosZ();

		if (event.getTo() == RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("chaotic_creations:finaldimension"))) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();

				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);

				FinaldimensionPlayerEntersDimensionProcedure.executeProcedure($_dependencies);
			}
		}
	}

}
