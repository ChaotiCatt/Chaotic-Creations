
package net.mcreator.chaoticcreations.item;

@ChaoticCreationsModElements.ModElement.Tag
public class FinalTeleporterItem extends ChaoticCreationsModElements.ModElement {

	@ObjectHolder("chaotic_creations:final_teleporter")
	public static final Item block = null;

	public FinalTeleporterItem(ChaoticCreationsModElements instance) {
		super(instance, 78);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ChaoticCreationsItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("final_teleporter");
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
			list.add(new StringTextComponent("Click to enter the final dimension.............."));
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
			ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
			ItemStack itemstack = ar.getResult();
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();

			{
				Map<String, Object> $_dependencies = new HashMap<>();

				$_dependencies.put("entity", entity);

				FinalTeleporterRightClickedInAirProcedure.executeProcedure($_dependencies);
			}
			return ar;
		}

	}

}
