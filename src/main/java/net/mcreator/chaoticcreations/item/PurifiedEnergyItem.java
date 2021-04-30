
package net.mcreator.chaoticcreations.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.chaoticcreations.itemgroup.ChaoticItemsItemGroup;
import net.mcreator.chaoticcreations.ChaoticCreationsModElements;

@ChaoticCreationsModElements.ModElement.Tag
public class PurifiedEnergyItem extends ChaoticCreationsModElements.ModElement {
	@ObjectHolder("chaotic_creations:purified_energy")
	public static final Item block = null;
	public PurifiedEnergyItem(ChaoticCreationsModElements instance) {
		super(instance, 36);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ChaoticItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("purified_energy");
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
