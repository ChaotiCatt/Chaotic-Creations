
package net.mcreator.chaoticcreations.item;

@ChaoticCreationsModElements.ModElement.Tag
public class Riflerounds1Item extends ChaoticCreationsModElements.ModElement {

	@ObjectHolder("chaotic_creations:riflerounds_1")
	public static final Item block = null;

	public Riflerounds1Item(ChaoticCreationsModElements instance) {
		super(instance, 58);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ChaoticItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("riflerounds_1");
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
