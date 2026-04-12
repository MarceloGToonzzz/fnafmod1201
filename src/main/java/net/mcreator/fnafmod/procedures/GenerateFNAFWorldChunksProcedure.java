package net.mcreator.fnafmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.fnafmod.init.FnafModModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GenerateFNAFWorldChunksProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double z, Entity entity) {
		execute(null, world, x, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double z, Entity entity) {
		if (entity == null)
			return;
		if (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("fnaf_mod:fnaf_world")) == (entity.level().dimension())) {
			for (int chuckX = (int) 0; chuckX < (int) (Minecraft.getInstance().options.renderDistance().get() * 2); chuckX++) {
				for (int chuckZ = (int) 0; chuckZ < (int) (Minecraft.getInstance().options.renderDistance().get() * 2); chuckZ++) {
					if (world.hasChunkAt(
							BlockPos.containing((chuckX - Minecraft.getInstance().options.renderDistance().get() + Math.floor(x / 48)) * 48, 0, (chuckZ - Minecraft.getInstance().options.renderDistance().get() + Math.floor(z / 48)) * 48))) {
						if (!(FnafModModBlocks.ERROR_TILE.get() == (world.getBlockState(
								BlockPos.containing((chuckX - Minecraft.getInstance().options.renderDistance().get() + Math.floor(x / 48)) * 48, 0, (chuckZ - Minecraft.getInstance().options.renderDistance().get() + Math.floor(z / 48)) * 48)))
								.getBlock())) {
							world.setBlock(
									BlockPos.containing((chuckX - Minecraft.getInstance().options.renderDistance().get() + Math.floor(x / 48)) * 48, 0, (chuckZ - Minecraft.getInstance().options.renderDistance().get() + Math.floor(z / 48)) * 48),
									FnafModModBlocks.ERROR_TILE.get().defaultBlockState(), 3);
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "fnaf_world_cave_normal_0"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing((chuckX - Minecraft.getInstance().options.renderDistance().get() + Math.floor(x / 48)) * 48, 1,
													(chuckZ - Minecraft.getInstance().options.renderDistance().get() + Math.floor(z / 48)) * 48),
											BlockPos.containing((chuckX - Minecraft.getInstance().options.renderDistance().get() + Math.floor(x / 48)) * 48, 1,
													(chuckZ - Minecraft.getInstance().options.renderDistance().get() + Math.floor(z / 48)) * 48),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
							if (Math.random() < (1) / ((float) 20)) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "fnaf_world_top_normal_0"));
									if (template != null) {
										template.placeInWorld(_serverworld,
												BlockPos.containing((chuckX - Minecraft.getInstance().options.renderDistance().get() + Math.floor(x / 48)) * 48, 26,
														(chuckZ - Minecraft.getInstance().options.renderDistance().get() + Math.floor(z / 48)) * 48),
												BlockPos.containing((chuckX - Minecraft.getInstance().options.renderDistance().get() + Math.floor(x / 48)) * 48, 26,
														(chuckZ - Minecraft.getInstance().options.renderDistance().get() + Math.floor(z / 48)) * 48),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
