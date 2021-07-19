
package net.mcreator.chaoticcreations.world.dimension;

import net.minecraft.block.material.Material;

@ChaoticCreationsModElements.ModElement.Tag
public class CorruptedRealmDimension extends ChaoticCreationsModElements.ModElement {

	public CorruptedRealmDimension(ChaoticCreationsModElements instance) {
		super(instance, 47);

	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		DeferredWorkQueue.runLater(() -> {
			try {
				ObfuscationReflectionHelper.setPrivateValue(WorldCarver.class, WorldCarver.CAVE, new ImmutableSet.Builder<Block>()
						.addAll((Set<Block>) ObfuscationReflectionHelper.getPrivateValue(WorldCarver.class, WorldCarver.CAVE, "field_222718_j"))
						.add(Blocks.STONE.getDefaultState().getBlock()).build(), "field_222718_j");

				ObfuscationReflectionHelper.setPrivateValue(WorldCarver.class, WorldCarver.CANYON, new ImmutableSet.Builder<Block>()
						.addAll((Set<Block>) ObfuscationReflectionHelper.getPrivateValue(WorldCarver.class, WorldCarver.CANYON, "field_222718_j"))
						.add(Blocks.STONE.getDefaultState().getBlock()).build(), "field_222718_j");
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
				return new Vector3d(0.172549019608, 0, 0);
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
				effectsRegistry.put(new ResourceLocation("chaotic_creations:corrupted_realm"), customEffect);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

	}

}
