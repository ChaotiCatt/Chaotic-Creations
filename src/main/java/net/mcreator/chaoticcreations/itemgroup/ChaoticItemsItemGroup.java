
package net.mcreator.chaoticcreations.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.chaoticcreations.item.ChaoticEnergyItem;
import net.mcreator.chaoticcreations.ChaoticCreationsModElements;

@ChaoticCreationsModElements.ModElement.Tag
public class ChaoticItemsItemGroup extends ChaoticCreationsModElements.ModElement {
	public ChaoticItemsItemGroup(ChaoticCreationsModElements instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabchaotic_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ChaoticEnergyItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
