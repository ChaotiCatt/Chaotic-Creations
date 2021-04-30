
package net.mcreator.chaoticcreations.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.chaoticcreations.itemgroup.ChaoticCreationsItemGroup;
import net.mcreator.chaoticcreations.item.PistolItem;
import net.mcreator.chaoticcreations.ChaoticCreationsModElements;

import java.util.List;
import java.util.Collections;

@ChaoticCreationsModElements.ModElement.Tag
public class SupplyCrateBlock extends ChaoticCreationsModElements.ModElement {
	@ObjectHolder("chaotic_creations:supply_crate")
	public static final Block block = null;
	public SupplyCrateBlock(ChaoticCreationsModElements instance) {
		super(instance, 39);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ChaoticCreationsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.METAL).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));
			setRegistryName("supply_crate");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(PistolItem.block, (int) (1)));
		}
	}
}
