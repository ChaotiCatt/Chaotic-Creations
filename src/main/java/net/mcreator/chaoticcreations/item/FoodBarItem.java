
package net.mcreator.chaoticcreations.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.chaoticcreations.itemgroup.ChaoticItemsItemGroup;
import net.mcreator.chaoticcreations.ChaoticCreationsModElements;

import java.util.List;

@ChaoticCreationsModElements.ModElement.Tag
public class FoodBarItem extends ChaoticCreationsModElements.ModElement {
	@ObjectHolder("chaotic_creations:food_bar")
	public static final Item block = null;
	public FoodBarItem(ChaoticCreationsModElements instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ChaoticItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(10).saturation(0.3f).setAlwaysEdible().meat().build()));
			setRegistryName("food_bar");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Yum!"));
		}
	}
}
