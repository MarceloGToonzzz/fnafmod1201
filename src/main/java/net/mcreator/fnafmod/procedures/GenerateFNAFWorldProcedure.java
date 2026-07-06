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
import net.minecraft.client.Minecraft;

import net.mcreator.fnafmod.init.FnafModModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GenerateFNAFWorldProcedure {
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
		double chunkXPosition = 0;
		double chunkYPosition = 0;
		double chunkXOffset = 0;
		double chunkYOffset = 0;
		double y = 0;
		double xD = 0;
		double zD = 0;
		if (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("fnaf_mod:fnaf_world")) == (entity.level().dimension())) {
			for (int chunkY = (int) 0; chunkY < (int) (Minecraft.getInstance().options.renderDistance().get() * 2 + 1); chunkY++) {
				for (int chunkX = (int) 0; chunkX < (int) (Minecraft.getInstance().options.renderDistance().get() * 2 + 1); chunkX++) {
					chunkYPosition = (chunkY - Minecraft.getInstance().options.renderDistance().get() + Math.floor(z / 16)) * 16;
					chunkXPosition = (chunkX - Minecraft.getInstance().options.renderDistance().get() + Math.floor(x / 16)) * 16;
					if (world.hasChunkAt(BlockPos.containing(chunkXPosition, 0, chunkYPosition))) {
						if (Blocks.AIR == (world.getBlockState(BlockPos.containing(chunkXPosition, 0, chunkYPosition))).getBlock()) {
							if (world.getBiome(BlockPos.containing(chunkXPosition, 15, chunkYPosition)).is(new ResourceLocation("fnaf_mod:fazbear_hills"))) {
								world.setBlock(BlockPos.containing(chunkXPosition, 0, chunkYPosition), FnafModModBlocks.FAZBEAR_HILLS_GRASS.get().defaultBlockState(), 3);
							} else if (world.getBiome(BlockPos.containing(chunkXPosition, 15, chunkYPosition)).is(new ResourceLocation("fnaf_mod:choppy_woods"))) {
								world.setBlock(BlockPos.containing(chunkXPosition, 0, chunkYPosition), FnafModModBlocks.CHOPPYS_WOODS_GRASS.get().defaultBlockState(), 3);
							}
						} else if (FnafModModBlocks.FAZBEAR_HILLS_GRASS.get() == (world.getBlockState(BlockPos.containing(chunkXPosition, 0, chunkYPosition))).getBlock()) {
							y = Mth.nextInt(RandomSource.create(), 1, 5) + 10;
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "fazbear_hills_core"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(chunkXPosition, y, chunkYPosition), BlockPos.containing(chunkXPosition, y, chunkYPosition),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
							world.setBlock(BlockPos.containing(chunkXPosition, 0, chunkYPosition), FnafModModBlocks.CHUNK_DATA_BLOCK.get().defaultBlockState(), 3);
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(chunkXPosition, 0, chunkYPosition);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putDouble("y", y);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "world_rock"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 12) + 2, new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 6, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 12) + 2),
											BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 12) + 2, new Object() {
												public double getValue(LevelAccessor world, BlockPos pos, String tag) {
													BlockEntity blockEntity = world.getBlockEntity(pos);
													if (blockEntity != null)
														return blockEntity.getPersistentData().getDouble(tag);
													return -1;
												}
											}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 6, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 12) + 2),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.values()[_serverworld.random.nextInt(2)]).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "fazbear_hills_tree_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 6, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
											BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
												public double getValue(LevelAccessor world, BlockPos pos, String tag) {
													BlockEntity blockEntity = world.getBlockEntity(pos);
													if (blockEntity != null)
														return blockEntity.getPersistentData().getDouble(tag);
													return -1;
												}
											}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 6, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.values()[_serverworld.random.nextInt(2)]).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
							if (Math.random() < (3) / ((float) 5)) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "fazbear_hills_tree_1"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 6, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
												BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
													public double getValue(LevelAccessor world, BlockPos pos, String tag) {
														BlockEntity blockEntity = world.getBlockEntity(pos);
														if (blockEntity != null)
															return blockEntity.getPersistentData().getDouble(tag);
														return -1;
													}
												}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 6, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
												new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.values()[_serverworld.random.nextInt(2)]).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
						} else if (FnafModModBlocks.CHOPPYS_WOODS_GRASS.get() == (world.getBlockState(BlockPos.containing(chunkXPosition, 0, chunkYPosition))).getBlock()) {
							y = Mth.nextInt(RandomSource.create(), 1, 3) + 10;
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "choppys_woods_core"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(chunkXPosition, y, chunkYPosition), BlockPos.containing(chunkXPosition, y, chunkYPosition),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
							world.setBlock(BlockPos.containing(chunkXPosition, 0, chunkYPosition), FnafModModBlocks.CHUNK_DATA_BLOCK.get().defaultBlockState(), 3);
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(chunkXPosition, 0, chunkYPosition);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putDouble("y", y);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							for (int index0 = 0; index0 < 3; index0++) {
								if (Math.random() < (1) / ((float) 5)) {
									if (world instanceof ServerLevel _serverworld) {
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "choppys_woods_core_small"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
												public double getValue(LevelAccessor world, BlockPos pos, String tag) {
													BlockEntity blockEntity = world.getBlockEntity(pos);
													if (blockEntity != null)
														return blockEntity.getPersistentData().getDouble(tag);
													return -1;
												}
											}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 5, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
													BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
														public double getValue(LevelAccessor world, BlockPos pos, String tag) {
															BlockEntity blockEntity = world.getBlockEntity(pos);
															if (blockEntity != null)
																return blockEntity.getPersistentData().getDouble(tag);
															return -1;
														}
													}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 5, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
													new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.values()[_serverworld.random.nextInt(2)]).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
							}
							if (Math.random() < (1) / ((float) 5)) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "choppys_woods_tree_stump_1"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 6, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
												BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
													public double getValue(LevelAccessor world, BlockPos pos, String tag) {
														BlockEntity blockEntity = world.getBlockEntity(pos);
														if (blockEntity != null)
															return blockEntity.getPersistentData().getDouble(tag);
														return -1;
													}
												}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 6, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
												new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.values()[_serverworld.random.nextInt(2)]).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
							if (Math.random() < (2) / ((float) 5)) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "choppys_woods_tree_1"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 7, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
												BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
													public double getValue(LevelAccessor world, BlockPos pos, String tag) {
														BlockEntity blockEntity = world.getBlockEntity(pos);
														if (blockEntity != null)
															return blockEntity.getPersistentData().getDouble(tag);
														return -1;
													}
												}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 7, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
												new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.values()[_serverworld.random.nextInt(2)]).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (Math.random() < (1) / ((float) 5)) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "world_fan_0"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 8, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
												BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
													public double getValue(LevelAccessor world, BlockPos pos, String tag) {
														BlockEntity blockEntity = world.getBlockEntity(pos);
														if (blockEntity != null)
															return blockEntity.getPersistentData().getDouble(tag);
														return -1;
													}
												}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 8, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
												new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.values()[_serverworld.random.nextInt(2)]).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (Math.random() < (1) / ((float) 12)) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "world_axe_in_log"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 8, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
												BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
													public double getValue(LevelAccessor world, BlockPos pos, String tag) {
														BlockEntity blockEntity = world.getBlockEntity(pos);
														if (blockEntity != null)
															return blockEntity.getPersistentData().getDouble(tag);
														return -1;
													}
												}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 8, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
												new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.values()[_serverworld.random.nextInt(2)]).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (Math.random() < (1) / ((float) 12)) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "world_small_fallen_tree"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 8, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
												BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
													public double getValue(LevelAccessor world, BlockPos pos, String tag) {
														BlockEntity blockEntity = world.getBlockEntity(pos);
														if (blockEntity != null)
															return blockEntity.getPersistentData().getDouble(tag);
														return -1;
													}
												}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 8, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
												new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.values()[_serverworld.random.nextInt(2)]).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (Math.random() < (1) / ((float) 12)) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "world_direction_sign"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 8, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
												BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
													public double getValue(LevelAccessor world, BlockPos pos, String tag) {
														BlockEntity blockEntity = world.getBlockEntity(pos);
														if (blockEntity != null)
															return blockEntity.getPersistentData().getDouble(tag);
														return -1;
													}
												}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 8, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
												new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.values()[_serverworld.random.nextInt(2)]).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
							if (Math.random() < (2) / ((float) 5)) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "choppys_woods_tree_1"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 7, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
												BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
													public double getValue(LevelAccessor world, BlockPos pos, String tag) {
														BlockEntity blockEntity = world.getBlockEntity(pos);
														if (blockEntity != null)
															return blockEntity.getPersistentData().getDouble(tag);
														return -1;
													}
												}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 7, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
												new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.values()[_serverworld.random.nextInt(2)]).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
							if (Math.random() < (1) / ((float) 7)) {
								if (Math.random() < (3) / ((float) 5)) {
									if (world instanceof ServerLevel _serverworld) {
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "fazbear_hills_tree_1"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
												public double getValue(LevelAccessor world, BlockPos pos, String tag) {
													BlockEntity blockEntity = world.getBlockEntity(pos);
													if (blockEntity != null)
														return blockEntity.getPersistentData().getDouble(tag);
													return -1;
												}
											}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 6, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
													BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
														public double getValue(LevelAccessor world, BlockPos pos, String tag) {
															BlockEntity blockEntity = world.getBlockEntity(pos);
															if (blockEntity != null)
																return blockEntity.getPersistentData().getDouble(tag);
															return -1;
														}
													}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 6, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
													new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.values()[_serverworld.random.nextInt(2)]).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								} else {
									if (world instanceof ServerLevel _serverworld) {
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "fazbear_hills_tree_fallen_1"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
												public double getValue(LevelAccessor world, BlockPos pos, String tag) {
													BlockEntity blockEntity = world.getBlockEntity(pos);
													if (blockEntity != null)
														return blockEntity.getPersistentData().getDouble(tag);
													return -1;
												}
											}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 7, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
													BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3, new Object() {
														public double getValue(LevelAccessor world, BlockPos pos, String tag) {
															BlockEntity blockEntity = world.getBlockEntity(pos);
															if (blockEntity != null)
																return blockEntity.getPersistentData().getDouble(tag);
															return -1;
														}
													}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 7, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 10) + 3),
													new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.values()[_serverworld.random.nextInt(2)]).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
							}
						} else if (FnafModModBlocks.CHUNK_DATA_BLOCK.get() == (world.getBlockState(BlockPos.containing(chunkXPosition, 0, chunkYPosition))).getBlock()) {
							if (Math.random() < (2) / ((float) 5)) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("fnaf_mod", "world_rock"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 12) + 2, new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 6, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 12) + 2),
												BlockPos.containing(chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 12) + 2, new Object() {
													public double getValue(LevelAccessor world, BlockPos pos, String tag) {
														BlockEntity blockEntity = world.getBlockEntity(pos);
														if (blockEntity != null)
															return blockEntity.getPersistentData().getDouble(tag);
														return -1;
													}
												}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 6, chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 12) + 2),
												new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.values()[_serverworld.random.nextInt(2)]).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
							for (int index1 = 0; index1 < 10; index1++) {
								xD = chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 15) + 0;
								zD = chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 15) + 0;
								if ((world.getBlockState(BlockPos.containing(xD, new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getPersistentData().getDouble(tag);
										return -1;
									}
								}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 8, zD))).canBeReplaced()
										&& FnafModModBlocks.ROUND_BUSH.get().defaultBlockState().canSurvive(world, BlockPos.containing(xD, new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 8, zD))) {
									world.setBlock(BlockPos.containing(xD, new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 8, zD), FnafModModBlocks.ROUND_BUSH.get().defaultBlockState(), 3);
								}
							}
							for (int index2 = 0; index2 < 20; index2++) {
								xD = chunkXPosition + Mth.nextInt(RandomSource.create(), 0, 16) + 0;
								zD = chunkYPosition + Mth.nextInt(RandomSource.create(), 0, 16) + 0;
								if ((world.getBlockState(BlockPos.containing(xD, new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getPersistentData().getDouble(tag);
										return -1;
									}
								}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 8, zD))).canBeReplaced() && Blocks.GRASS.defaultBlockState().canSurvive(world, BlockPos.containing(xD, new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getPersistentData().getDouble(tag);
										return -1;
									}
								}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 8, zD))) {
									world.setBlock(BlockPos.containing(xD, new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, BlockPos.containing(chunkXPosition, 0, chunkYPosition), "y") + 8, zD), Blocks.GRASS.defaultBlockState(), 3);
								}
							}
							world.setBlock(BlockPos.containing(chunkXPosition, 0, chunkYPosition), FnafModModBlocks.BLACK_WHITE_TILE.get().defaultBlockState(), 3);
						}
					}
				}
			}
		}
	}
}
