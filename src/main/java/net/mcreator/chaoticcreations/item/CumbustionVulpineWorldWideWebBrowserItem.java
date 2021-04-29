
package net.mcreator.chaoticcreations.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.chaoticcreations.itemgroup.ChaoticCreationsItemGroup;
import net.mcreator.chaoticcreations.ChaoticCreationsModElements;

import java.util.List;

@ChaoticCreationsModElements.ModElement.Tag
public class CumbustionVulpineWorldWideWebBrowserItem extends ChaoticCreationsModElements.ModElement {
	@ObjectHolder("chaotic_creations:cumbustion_vulpine_world_wide_web_browser")
	public static final Item block = null;
	public CumbustionVulpineWorldWideWebBrowserItem(ChaoticCreationsModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 0;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 997f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(ChaoticCreationsItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("AAAAaaAAaaaahH iT lOOks LikE YOu CaN BRoWsE tHe intERneT WITh thIS.... AAAaaAAaAHHHhhHaAA"));
			}
		}.setRegistryName("cumbustion_vulpine_world_wide_web_browser"));
	}
}
