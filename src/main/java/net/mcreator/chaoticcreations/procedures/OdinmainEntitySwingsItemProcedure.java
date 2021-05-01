package net.mcreator.chaoticcreations.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.chaoticcreations.item.OdinlightningattackItem;
import net.mcreator.chaoticcreations.ChaoticCreationsModElements;
import net.mcreator.chaoticcreations.ChaoticCreationsMod;

import java.util.Random;
import java.util.Map;

@ChaoticCreationsModElements.ModElement.Tag
public class OdinmainEntitySwingsItemProcedure extends ChaoticCreationsModElements.ModElement {
	public OdinmainEntitySwingsItemProcedure(ChaoticCreationsModElements instance) {
		super(instance, 43);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ChaoticCreationsMod.LOGGER.warn("Failed to load dependency entity for procedure OdinmainEntitySwingsItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			Entity _ent = entity;
			if (!_ent.world.isRemote()) {
				OdinlightningattackItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 9, (float) 0.1, (int) 5);
			}
		}
	}
}
