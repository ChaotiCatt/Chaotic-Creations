
package net.mcreator.chaoticcreations.item;

@ChaoticCreationsModElements.ModElement.Tag
public class HeavyRifleRoundItem extends ChaoticCreationsModElements.ModElement {

	@ObjectHolder("chaotic_creations:heavy_rifle_round")
	public static final Item block = null;

	public HeavyRifleRoundItem(ChaoticCreationsModElements instance) {
		super(instance, 103);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("heavy_rifle_round");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
