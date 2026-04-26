package net.mcreator.fnafmod;

import java.util.List;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;

import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;

// net.mcreator.fnafmod.CustomSnippets.spawnRandomTaggedEntity(world, x, y, z, tag);

public class CustomSnippets {
	public static void spawnRandomTaggedEntity(LevelAccessor world, double x, double y, double z, String tagS) {
	
	    if (!(world instanceof Level level)) return;
	
	    TagKey<EntityType<?>> tag = TagKey.create(
	        Registries.ENTITY_TYPE,
	        new ResourceLocation("fnaf_mod", tagS)
	    );
	
	    List<EntityType<?>> entities = BuiltInRegistries.ENTITY_TYPE.stream()
	        .filter(type -> type.builtInRegistryHolder().is(tag))
	        .toList();
	
	    if (!entities.isEmpty()) {
	        EntityType<?> type = entities.get(level.random.nextInt(entities.size()));
	        Entity entity = type.create(level);
	
	        if (entity != null) {
	            entity.moveTo(x, y, z);
	            level.addFreshEntity(entity);
	        }
	    }
	}
}
