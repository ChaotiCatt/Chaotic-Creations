
package net.mcreator.chaoticcreations.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.chaoticcreations.item.TrustItem;
import net.mcreator.chaoticcreations.ChaoticCreationsModElements;

@ChaoticCreationsModElements.ModElement.Tag
public class ChaoticCreationsItemGroup extends ChaoticCreationsModElements.ModElement {
	public ChaoticCreationsItemGroup(ChaoticCreationsModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabchaotic_creations") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TrustItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
