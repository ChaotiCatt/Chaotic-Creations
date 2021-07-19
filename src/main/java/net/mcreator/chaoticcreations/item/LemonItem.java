
package net.mcreator.chaoticcreations.item;

@ChaoticCreationsModElements.ModElement.Tag
public class LemonItem extends ChaoticCreationsModElements.ModElement {

	@ObjectHolder("chaotic_creations:lemon")
	public static final Item block = null;

	public LemonItem(ChaoticCreationsModElements instance) {
		super(instance, 85);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ChaoticCreationsItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC)
					.food((new Food.Builder()).hunger(4).saturation(0.3f).setAlwaysEdible()

							.build()));
			setRegistryName("lemon");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);

			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();

				$_dependencies.put("entity", entity);

				LemonFoodEatenProcedure.executeProcedure($_dependencies);
			}

			return retval;
		}

	}

}
