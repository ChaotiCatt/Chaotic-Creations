
package net.mcreator.chaoticcreations.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.chaoticcreations.procedures.RocketItemIsDroppedByPlayerProcedure;
import net.mcreator.chaoticcreations.itemgroup.ChaoticItemsItemGroup;
import net.mcreator.chaoticcreations.ChaoticCreationsModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@ChaoticCreationsModElements.ModElement.Tag
public class RocketItem extends ChaoticCreationsModElements.ModElement {
	@ObjectHolder("chaotic_creations:rocket")
	public static final Item block = null;
	public RocketItem(ChaoticCreationsModElements instance) {
		super(instance, 98);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ChaoticItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("rocket");
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
			list.add(new StringTextComponent("BOOOM!!!"));
			list.add(new StringTextComponent("//DO NOT DROP//"));
		}

		@Override
		public boolean onDroppedByPlayer(ItemStack itemstack, PlayerEntity entity) {
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			World world = entity.world;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("itemstack", itemstack);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				RocketItemIsDroppedByPlayerProcedure.executeProcedure($_dependencies);
			}
			return true;
		}
	}
}
