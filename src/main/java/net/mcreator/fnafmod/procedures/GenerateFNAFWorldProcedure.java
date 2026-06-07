package net.mcreator.fnafmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModBlocks;

import javax.annotation.Nullable;

import java.util.ArrayList;

@Mod.EventBusSubscriber
public class GenerateFNAFWorldProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		double chunkXPosition = 0;
		double chunkYPosition = 0;
		double chunkXOffset = 0;
		double chunkYOffset = 0;
		double y = 0;
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("fnaf_mod:fnaf_world")) == (entityiterator.level().dimension())) {
				for (int chunkY = (int) 0; chunkY < (int) 11; chunkY++) {
					for (int chunkX = (int) 0; chunkX < (int) 11; chunkX++) {
						chunkYPosition = (chunkY - 5) * 16 + Math.floor(entityiterator.getZ() / 16) * 16;
						chunkXPosition = (chunkX - 5) * 16 + Math.floor(entityiterator.getX() / 16) * 16;
						if (world.hasChunkAt(BlockPos.containing(chunkXPosition, 0, chunkYPosition))) {
							if (Blocks.AIR == (world.getBlockState(BlockPos.containing(chunkXPosition, 0, chunkYPosition))).getBlock()) {
								world.setBlock(BlockPos.containing(chunkXPosition, 0, chunkYPosition), FnafModModBlocks.ERROR_TILE.get().defaultBlockState(), 3);
							} else if (FnafModModBlocks.ERROR_TILE.get() == (world.getBlockState(BlockPos.containing(chunkXPosition, 0, chunkYPosition))).getBlock()) {
								if (Math.random() < (1) / ((float) 20)) {
									for (int ChunkYOffset = (int) 0; ChunkYOffset < (int) 3; ChunkYOffset++) {
										for (int ChunkXOffset = (int) 0; ChunkXOffset < (int) 3; ChunkXOffset++) {
											chunkYOffset = (ChunkYOffset - 1) * 16 + chunkYPosition;
											chunkXOffset = (ChunkXOffset - 1) * 16 + chunkXPosition;
											if (world.hasChunkAt(BlockPos.containing(chunkXOffset, 0, chunkYOffset))) {
												world.setBlock(BlockPos.containing(chunkXOffset, 0, chunkYOffset), FnafModModBlocks.CHOPPYS_WOODS_GRASS.get().defaultBlockState(), 3);
											}
										}
									}
								} else {
									world.setBlock(BlockPos.containing(chunkXPosition, 0, chunkYPosition), FnafModModBlocks.FAZBEAR_HILLS_GRASS.get().defaultBlockState(), 3);
								}
							} else if (FnafModModBlocks.CHOPPYS_WOODS_GRASS.get() == (world.getBlockState(BlockPos.containing(chunkXPosition, 0, chunkYPosition))).getBlock()) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "choppys_woods_core"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(chunkXPosition, Mth.nextInt(RandomSource.create(), 1, 4) + 10, chunkYPosition),
												BlockPos.containing(chunkXPosition, Mth.nextInt(RandomSource.create(), 1, 4) + 10, chunkYPosition),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
								world.setBlock(BlockPos.containing(chunkXPosition + 1, 0, chunkYPosition), FnafModModBlocks.CHOPPYS_WOODS_GRASS.get().defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(chunkXPosition, 0, chunkYPosition), FnafModModBlocks.FIRE_AXE_BLOCK.get().defaultBlockState(), 3);
							} else if (FnafModModBlocks.FAZBEAR_HILLS_GRASS.get() == (world.getBlockState(BlockPos.containing(chunkXPosition, 0, chunkYPosition))).getBlock()) {
								y = Mth.nextInt(RandomSource.create(), 1, 6) + 10;
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "fazbear_hills_core"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(chunkXPosition, y, chunkYPosition), BlockPos.containing(chunkXPosition, y, chunkYPosition),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
								world.setBlock(BlockPos.containing(chunkXPosition + 1, 0, chunkYPosition), FnafModModBlocks.FAZBEAR_HILLS_GRASS.get().defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(chunkXPosition, 0, chunkYPosition), FnafModModBlocks.FIRE_AXE_BLOCK.get().defaultBlockState(), 3);
								if (!world.isClientSide()) {
									BlockPos _bp = BlockPos.containing(chunkXPosition, 0, chunkYPosition);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble("height", y);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							}
						}
					}
				}
				for (int chunkY = (int) 0; chunkY < (int) 11; chunkY++) {
					for (int chunkX = (int) 0; chunkX < (int) 11; chunkX++) {
						chunkYPosition = (chunkY - 5) * 16 + Math.floor(entityiterator.getZ() / 16) * 16;
						chunkXPosition = (chunkX - 5) * 16 + Math.floor(entityiterator.getX() / 16) * 16 + 1;
						if (world.hasChunkAt(BlockPos.containing(chunkXPosition, 0, chunkYPosition))) {
							if (FnafModModBlocks.CHOPPYS_WOODS_GRASS.get() == (world.getBlockState(BlockPos.containing(chunkXPosition, 0, chunkYPosition))).getBlock()) {
								world.setBlock(BlockPos.containing(chunkXPosition, 0, chunkYPosition), FnafModModBlocks.ERROR_TILE.get().defaultBlockState(), 3);
							}
						}
					}
				}
			}
		}
	}
}
