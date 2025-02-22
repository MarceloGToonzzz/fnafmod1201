package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModEntities;
import net.mcreator.fnafmod.init.FnafModModBlocks;
import net.mcreator.fnafmod.entity.SittingPlushtrapEntity;
import net.mcreator.fnafmod.entity.SittingNightmareBBEntity;
import net.mcreator.fnafmod.entity.SecretNightmareFredbearEntity;
import net.mcreator.fnafmod.entity.PlushtrapEntity;
import net.mcreator.fnafmod.entity.NightmarionneEntity;
import net.mcreator.fnafmod.entity.NightmareMangleEntity;
import net.mcreator.fnafmod.entity.NightmareFreddyEntity;
import net.mcreator.fnafmod.entity.NightmareFredbearEntity;
import net.mcreator.fnafmod.entity.NightmareFoxyEntity;
import net.mcreator.fnafmod.entity.NightmareEntity;
import net.mcreator.fnafmod.entity.NightmareChicaEntity;
import net.mcreator.fnafmod.entity.NightmareBonnieEntity;
import net.mcreator.fnafmod.entity.NightmareBBEntity;
import net.mcreator.fnafmod.entity.JackOChicaEntity;
import net.mcreator.fnafmod.entity.JackOBonnieEntity;
import net.mcreator.fnafmod.entity.FreddlesEntity;
import net.mcreator.fnafmod.FnafModMod;

public class NightmareTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rand = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double rand2 = 0;
		double rand3 = 0;
		boolean found = false;
		boolean Bright = false;
		SetSpawnNbtProcedure.execute(entity);
		if (entity instanceof NightmareFreddyEntity || entity instanceof NightmareBonnieEntity || entity instanceof JackOBonnieEntity || entity instanceof NightmareChicaEntity || entity instanceof JackOChicaEntity) {
			rand = Mth.nextInt(RandomSource.create(), 1, 300);
			if (world instanceof Level _lvl6 && _lvl6.isDay()) {
				if (!entity.level().isClientSide())
					entity.discard();
			} else {
				if (69 == rand) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 200, 1, false, false));
				}
			}
		} else if (entity instanceof NightmareFoxyEntity || entity instanceof NightmareMangleEntity) {
			rand = Mth.nextInt(RandomSource.create(), 1, 300);
			if (world instanceof Level _lvl12 && _lvl12.isDay()) {
				if (!entity.level().isClientSide())
					entity.discard();
			} else {
				if (69 == rand) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 140, 1, false, false));
				}
			}
			sx = 0;
			found = false;
			for (int index0 = 0; index0 < 3; index0++) {
				sy = 0;
				for (int index1 = 0; index1 < 3; index1++) {
					sz = 0;
					for (int index2 = 0; index2 < 3; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == FnafModModBlocks.FLASH_LIGHT_LIGHT.get()) {
							found = true;
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			if (found == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 8, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 60, 8, false, false));
				entity.setShiftKeyDown(true);
				FnafModMod.queueServerWork(60, () -> {
					entity.setShiftKeyDown(false);
				});
			}
		} else if (entity instanceof NightmareEntity) {
			rand = Mth.nextInt(RandomSource.create(), 1, 300);
			rand2 = Mth.nextInt(RandomSource.create(), 1, 8);
			if (world instanceof Level _lvl25 && _lvl25.isDay()) {
				if (!entity.level().isClientSide())
					entity.discard();
			} else {
				if (rand == 100) {
					if (rand2 == 1) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, z, _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 2) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, z, _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 3) {
						{
							Entity _ent = entity;
							_ent.teleportTo(x, y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 4) {
						{
							Entity _ent = entity;
							_ent.teleportTo(x, y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 5) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 6) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 7) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 8) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					}
				}
			}
			if (entity.isInWall()) {
				if (rand == 100) {
					if (rand2 == 1) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, z, _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 2) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, z, _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 3) {
						{
							Entity _ent = entity;
							_ent.teleportTo(x, y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 4) {
						{
							Entity _ent = entity;
							_ent.teleportTo(x, y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 5) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 6) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 7) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 8) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					}
				}
			}
			if (!world.isEmptyBlock(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()))) {
				if (rand == 100) {
					if (rand2 == 1) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, z, _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 2) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, z, _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 3) {
						{
							Entity _ent = entity;
							_ent.teleportTo(x, y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 4) {
						{
							Entity _ent = entity;
							_ent.teleportTo(x, y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 5) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 6) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 7) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 8) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					}
				}
			}
			rand3 = Mth.nextInt(RandomSource.create(), 1, 300);
			if (world instanceof Level _lvl93 && _lvl93.isDay()) {
				if (!entity.level().isClientSide())
					entity.discard();
			} else {
				if (69 == rand3) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 200, 1, false, false));
				}
			}
		} else if (entity instanceof SecretNightmareFredbearEntity) {
			if (world.getBlockState(BlockPos.containing(x, y + 3, z)).canOcclude()) {
				entity.setShiftKeyDown(true);
			} else {
				entity.setShiftKeyDown(false);
			}
		} else if (entity instanceof NightmareFredbearEntity || entity instanceof NightmarionneEntity) {
			rand = Mth.nextInt(RandomSource.create(), 1, 300);
			rand2 = Mth.nextInt(RandomSource.create(), 1, 8);
			if (world instanceof Level _lvl104 && _lvl104.isDay()) {
				if (!entity.level().isClientSide())
					entity.discard();
			} else {
				if (rand == 100) {
					if (rand2 == 1) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, z, _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 2) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, z, _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 3) {
						{
							Entity _ent = entity;
							_ent.teleportTo(x, y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 4) {
						{
							Entity _ent = entity;
							_ent.teleportTo(x, y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 5) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 6) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 7) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 8) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					}
				}
			}
			if (entity.isInWall()) {
				if (rand == 100) {
					if (rand2 == 1) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, z, _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 2) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, z, _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 3) {
						{
							Entity _ent = entity;
							_ent.teleportTo(x, y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 4) {
						{
							Entity _ent = entity;
							_ent.teleportTo(x, y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 5) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 6) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 7) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 8) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					}
				}
			}
			if (!world.isEmptyBlock(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()))) {
				if (rand == 100) {
					if (rand2 == 1) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, z, _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 2) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, z, _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 3) {
						{
							Entity _ent = entity;
							_ent.teleportTo(x, y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 4) {
						{
							Entity _ent = entity;
							_ent.teleportTo(x, y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 5) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 6) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 7) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (rand2 == 8) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
						}
					}
				}
			}
		} else if (entity instanceof PlushtrapEntity || entity instanceof SittingPlushtrapEntity || entity instanceof NightmareBBEntity || entity instanceof SittingNightmareBBEntity) {
			if (entity instanceof PlushtrapEntity || entity instanceof NightmareBBEntity) {
				Bright = false;
				sx = 0;
				found = false;
				for (int index3 = 0; index3 < 3; index3++) {
					sy = 0;
					for (int index4 = 0; index4 < 3; index4++) {
						sz = 0;
						for (int index5 = 0; index5 < 3; index5++) {
							if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == FnafModModBlocks.FLASH_LIGHT_LIGHT.get()) {
								found = true;
							}
							sz = sz + 1;
						}
						sy = sy + 1;
					}
					sx = sx + 1;
				}
				if (found == true) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 120, 8, false, false));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 120, 8, false, false));
					entity.setShiftKeyDown(true);
					FnafModMod.queueServerWork(120, () -> {
						entity.setShiftKeyDown(false);
					});
				}
				if (world instanceof Level _lvl184 && _lvl184.isDay()) {
					if (!entity.level().isClientSide())
						entity.discard();
					if (entity instanceof PlushtrapEntity) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FnafModModEntities.SITTING_PLUSHTRAP.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					} else if (entity instanceof NightmareBBEntity) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FnafModModEntities.SITTING_NIGHTMARE_BB.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
				}
			}
			if (entity instanceof SittingNightmareBBEntity || entity instanceof SittingPlushtrapEntity) {
				if (!(world instanceof Level _lvl192 && _lvl192.isDay())) {
					if (!entity.level().isClientSide())
						entity.discard();
					if (entity instanceof SittingPlushtrapEntity) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FnafModModEntities.PLUSHTRAP.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					} else if (entity instanceof SittingNightmareBBEntity) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FnafModModEntities.NIGHTMARE_BB.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
				}
			}
		} else if (entity instanceof FreddlesEntity) {
			if (entity.getPersistentData().getDouble("FNAFTimer") == 0) {
				entity.getPersistentData().putDouble("FNAFTimer", 180);
			} else {
				entity.getPersistentData().putDouble("FNAFTimer", (entity.getPersistentData().getDouble("FNAFTimer") - 1));
			}
			sx = 0;
			found = false;
			for (int index6 = 0; index6 < 3; index6++) {
				sy = 0;
				for (int index7 = 0; index7 < 3; index7++) {
					sz = 0;
					for (int index8 = 0; index8 < 3; index8++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == FnafModModBlocks.FLASH_LIGHT_LIGHT.get()) {
							found = true;
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			if (found == true) {
				if (!entity.level().isClientSide())
					entity.discard();
			}
			if (entity.getPersistentData().getDouble("FNAFTimer") == 0) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = FnafModModEntities.NIGHTMARE_FREDDY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
		}
	}
}
