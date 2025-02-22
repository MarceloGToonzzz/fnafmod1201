package net.mcreator.fnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModEntities;
import net.mcreator.fnafmod.init.FnafModModBlocks;
import net.mcreator.fnafmod.entity.CrawlingToyChicaEntity;

import java.util.Comparator;

public class NightimeToyChicaOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getPersistentData().getString("GotCoordinates")).equals("true")) {
			entity.getPersistentData().putDouble("spawnX", (entity.getX()));
			entity.getPersistentData().putDouble("spawnY", (entity.getY()));
			entity.getPersistentData().putDouble("spawnZ", (entity.getZ()));
			entity.getPersistentData().putDouble("spawnYaw", (entity.getYRot()));
			entity.getPersistentData().putString("GotCoordinates", "true");
		}
		if (world instanceof Level _lvl10 && _lvl10.isDay()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = FnafModModEntities.TOY_CHICA.get().spawn(_level,
						BlockPos.containing(entity.getPersistentData().getDouble("spawnX"), entity.getPersistentData().getDouble("spawnY"), entity.getPersistentData().getDouble("spawnZ")), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot((float) entity.getPersistentData().getDouble("spawnYaw"));
					entityToSpawn.setYBodyRot((float) entity.getPersistentData().getDouble("spawnYaw"));
					entityToSpawn.setYHeadRot((float) entity.getPersistentData().getDouble("spawnYaw"));
				}
			}
			if (!entity.level().isClientSide())
				entity.discard();
		}
		if ((world.getBlockState(BlockPos.containing(x, entity.getY() - 1, z))).getBlock() == FnafModModBlocks.VENT.get()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = FnafModModEntities.CRAWLING_TOY_CHICA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			((Entity) world.getEntitiesOfClass(CrawlingToyChicaEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("spawnX", (entity.getPersistentData().getDouble("spawnX")));
			((Entity) world.getEntitiesOfClass(CrawlingToyChicaEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("spawnY", (entity.getPersistentData().getDouble("spawnY")));
			((Entity) world.getEntitiesOfClass(CrawlingToyChicaEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("spawnZ", (entity.getPersistentData().getDouble("spawnZ")));
			((Entity) world.getEntitiesOfClass(CrawlingToyChicaEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("spawnYaw", (entity.getPersistentData().getDouble("spawnYaw")));
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
