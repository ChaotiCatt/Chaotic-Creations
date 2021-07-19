
package net.mcreator.chaoticcreations.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.chaoticcreations.procedures.HammerofMightLivingEntityIsHitWithToolProcedure;
import net.mcreator.chaoticcreations.itemgroup.ChaoticCreationsItemGroup;
import net.mcreator.chaoticcreations.ChaoticCreationsModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@ChaoticCreationsModElements.ModElement.Tag
public class HammerofMightItem extends ChaoticCreationsModElements.ModElement {
	@ObjectHolder("chaotic_creations:hammerof_might")
	public static final Item block = null;
	public HammerofMightItem(ChaoticCreationsModElements instance) {
		super(instance, 86);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 5f;
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
		}, 1, -3f, new Item.Properties().group(ChaoticCreationsItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("A mighty hammer forged in the depths of a mountain."));
			}

			@Override
			public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
				boolean retval = super.hitEntity(itemstack, entity, sourceentity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("sourceentity", sourceentity);
					HammerofMightLivingEntityIsHitWithToolProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("hammerof_might"));
	}
}
