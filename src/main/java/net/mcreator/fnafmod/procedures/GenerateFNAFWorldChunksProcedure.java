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
		double xPos = 0;
		double zPos = 0;
		if (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("fnaf_mod:fnaf_world")) == (entity.level().dimension())) {
			if (24 < entity.getY()) {
				for (int chuckX = (int) 0; chuckX < (int) (Minecraft.getInstance().options.renderDistance().get()); chuckX++) {
					for (int chuckZ = (int) 0; chuckZ < (int) (Minecraft.getInstance().options.renderDistance().get()); chuckZ++) {
						xPos = (chuckX - Minecraft.getInstance().options.renderDistance().get() / 2 + Math.floor(x / 48)) * 48;
						zPos = (chuckZ - Minecraft.getInstance().options.renderDistance().get() / 2 + Math.floor(z / 48)) * 48;
						if (world.hasChunkAt(BlockPos.containing(xPos, 0, zPos))) {
							if (!(FnafModModBlocks.ERROR_TILE.get() == (world.getBlockState(BlockPos.containing(xPos, 0, zPos))).getBlock())) {
								world.setBlock(BlockPos.containing(xPos, 0, zPos), FnafModModBlocks.ERROR_TILE.get().defaultBlockState(), 3);
								if (Math.random() < (1) / ((float) 30) && !(FnafModModBlocks.ERROR_TILE.get() == (world.getBlockState(BlockPos.containing(xPos + 1, 0, zPos))).getBlock())) {
									world.setBlock(BlockPos.containing(xPos + 1, 0, zPos), FnafModModBlocks.ERROR_TILE.get().defaultBlockState(), 3);
									if (world instanceof ServerLevel _serverworld) {
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "fnaf_world_cave"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(xPos, 1, zPos), BlockPos.containing(xPos, 1, zPos),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								} else {
									if ((world.getLevelData().getGameTime()) % 5 == 0) {
										if (world instanceof ServerLevel _serverworld) {
											StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "choppys_woods_0"));
											if (template != null) {
												template.placeInWorld(_serverworld, BlockPos.containing(xPos, 25, zPos), BlockPos.containing(xPos, 25, zPos),
														new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
											}
										}
									} else {
										if (Math.random() < (1) / ((float) 20)) {
											if (world instanceof ServerLevel _serverworld) {
												StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "fnaf_world_top_mansion_0"));
												if (template != null) {
													template.placeInWorld(_serverworld, BlockPos.containing(xPos, 25, zPos), BlockPos.containing(xPos, 25, zPos),
															new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
												}
											}
										} else {
											if (world instanceof ServerLevel _serverworld) {
												StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "fnaf_world_top_normal_0"));
												if (template != null) {
													template.placeInWorld(_serverworld, BlockPos.containing(xPos, 25, zPos), BlockPos.containing(xPos, 25, zPos),
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
			} else {
				for (int chuckX = (int) 0; chuckX < (int) 3; chuckX++) {
					for (int chuckZ = (int) 0; chuckZ < (int) 3; chuckZ++) {
						xPos = (chuckX - 1 + Math.floor(x / 48)) * 48;
						zPos = (chuckZ - 1 + Math.floor(z / 48)) * 48;
						if (world.hasChunkAt(BlockPos.containing(xPos, 0, zPos))) {
							if (!(FnafModModBlocks.ERROR_TILE.get() == (world.getBlockState(BlockPos.containing(xPos + 1, 0, zPos))).getBlock())) {
								world.setBlock(BlockPos.containing(xPos + 1, 0, zPos), FnafModModBlocks.ERROR_TILE.get().defaultBlockState(), 3);
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "fnaf_world_cave_normal_0"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(xPos, 1, zPos), BlockPos.containing(xPos, 1, zPos),
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
