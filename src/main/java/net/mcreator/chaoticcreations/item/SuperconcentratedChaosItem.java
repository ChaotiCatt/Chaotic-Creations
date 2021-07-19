
package net.mcreator.chaoticcreations.item;

@ChaoticCreationsModElements.ModElement.Tag
public class SuperconcentratedChaosItem extends ChaoticCreationsModElements.ModElement {

	@ObjectHolder("chaotic_creations:superconcentrated_chaos")
	public static final Item block = null;

	public SuperconcentratedChaosItem(ChaoticCreationsModElements instance) {
		super(instance, 80);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ChaoticItemsItemGroup.tab).maxStackSize(64).isImmuneToFire().rarity(Rarity.RARE));
			setRegistryName("superconcentrated_chaos");
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

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("A point in space time of pure corruption."));
		}

	}

}
