
package net.mcreator.chaoticcreations.block;

import net.minecraft.block.material.Material;

@ChaoticCreationsModElements.ModElement.Tag
public class PurifiedClusterBlock extends ChaoticCreationsModElements.ModElement {

	@ObjectHolder("chaotic_creations:purified_cluster")
	public static final Block block = null;

	public PurifiedClusterBlock(ChaoticCreationsModElements instance) {
		super(instance, 73);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ChaoticCreationsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));

			setRegistryName("purified_cluster");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(PurifiedEnergyItem.block, (int) (1)));
		}

	}

}
