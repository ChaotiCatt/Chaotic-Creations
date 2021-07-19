
package net.mcreator.chaoticcreations.item;

@ChaoticCreationsModElements.ModElement.Tag
public class E2Item extends ChaoticCreationsModElements.ModElement {

	@ObjectHolder("chaotic_creations:e_2")
	public static final Item block = null;

	public E2Item(ChaoticCreationsModElements instance) {
		super(instance, 92);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(null).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("e_2");
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
			list.add(new StringTextComponent("you shouldn't have this!"));
		}

	}

}
