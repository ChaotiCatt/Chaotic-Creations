
package net.mcreator.chaoticcreations.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.chaoticcreations.itemgroup.ChaoticItemsItemGroup;
import net.mcreator.chaoticcreations.ChaoticCreationsModElements;

import java.util.List;

@ChaoticCreationsModElements.ModElement.Tag
public class MasteryTokenItem extends ChaoticCreationsModElements.ModElement {
	@ObjectHolder("chaotic_creations:mastery_token")
	public static final Item block = null;
	public MasteryTokenItem(ChaoticCreationsModElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ChaoticItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("mastery_token");
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
			list.add(new StringTextComponent("Maybe it does things when combined with rare items......."));
		}
	}
}
