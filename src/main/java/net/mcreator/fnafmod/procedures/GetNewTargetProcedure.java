package net.mcreator.fnafmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import net.mcreator.fnafmod.init.FnafModModItems;
import net.mcreator.fnafmod.entity.PuppetEntity;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class GetNewTargetProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean stop = false;
		double rangetest = 0;
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("fnaf_mod:fnafmod-animatronics")))
				&& !entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("fnaf_mod:fnafmod-passiveanimatronics")))) {
			rangetest = 0.55125;
			if (!(!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) && !entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:passive_animatronics")))) {
				if (entity.getPersistentData().getBoolean("visited_targetspot") == false && entity.getPersistentData().getBoolean("had_target") == true) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo((entity.getPersistentData().getDouble("target_x")), (entity.getPersistentData().getDouble("target_y")), (entity.getPersistentData().getDouble("target_z")), 1);
					if (2 > new Vec3(x, y, z).distanceTo(new Vec3((entity.getPersistentData().getDouble("target_x")), (entity.getPersistentData().getDouble("target_y")), (entity.getPersistentData().getDouble("target_z"))))
							|| 5 > new Vec3(x, y, z).distanceTo(new Vec3((entity.getPersistentData().getDouble("target_x")), (entity.getPersistentData().getDouble("target_y")), (entity.getPersistentData().getDouble("target_z"))))
									&& y != entity.getPersistentData().getDouble("target_y")) {
						entity.getPersistentData().putBoolean("visited_targetspot", true);
						entity.getPersistentData().putDouble("target_x", (entity.getX()));
						entity.getPersistentData().putDouble("target_y", (entity.getY()));
						entity.getPersistentData().putDouble("target_z", (entity.getZ()));
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						stop = false;
						if (entityiterator instanceof Player || entityiterator instanceof Villager) {
							if (!IsEntityBeingLookedAtProcedure.execute(world, entityiterator, entity, entityiterator.getEyeHeight(), rangetest)) {
								if (!(entityiterator.getDeltaMovement().horizontalDistanceSqr() > 1.0E-6D)) {
									stop = true;
								} else if (entityiterator.isShiftKeyDown() || entityiterator.isSwimming()) {
									stop = true;
								}
							}
							if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("fnaf_mod:animatronic-maskfoolers")))
									&& (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == FnafModModItems.FREDDY_MASK_HELMET.get()) {
								stop = true;
							}
							if (stop == false) {
								if (!(new Object() {
									public boolean checkGamemode(Entity _ent) {
										if (_ent instanceof ServerPlayer _serverPlayer) {
											return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
										} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
											return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
													&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
										}
										return false;
									}
								}.checkGamemode(entityiterator)) && !(new Object() {
									public boolean checkGamemode(Entity _ent) {
										if (_ent instanceof ServerPlayer _serverPlayer) {
											return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
										} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
											return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
													&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
										}
										return false;
									}
								}.checkGamemode(entityiterator))) {
									if (entity instanceof Mob _entity && entityiterator instanceof LivingEntity _ent)
										_entity.setTarget(_ent);
								}
							}
						}
					}
				}
			} else if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
				entity.getPersistentData().putBoolean("had_target", true);
				entity.getPersistentData().putBoolean("visited_targetspot", false);
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("fnaf_mod:animatronic-maskfoolers")))
						&& ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == FnafModModItems.FREDDY_MASK_HELMET
								.get()) {
					entity.getPersistentData().putDouble("fnafmod-safetick", (entity.getPersistentData().getDouble("fnafmod-safetick") + 1));
				}
				if (new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
						} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
									&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
						}
						return false;
					}
				}.checkGamemode((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) || new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
						} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
									&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
						}
						return false;
					}
				}.checkGamemode((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null))
						|| !(entity instanceof LivingEntity _entity ? _entity.hasLineOfSight((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) : false) && !(entity instanceof PuppetEntity)
						|| ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) != null ? entity.distanceTo((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) : -1) > 24
						|| !(entity instanceof LivingEntity _liveEnt && (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) != null
								? _liveEnt.hasLineOfSight((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null))
								: false)
						|| entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("fnaf_mod:animatronic-maskfoolers")))
								&& ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
										.getItem() == FnafModModItems.FREDDY_MASK_HELMET.get()
								&& entity.getPersistentData().getDouble("fnafmod-safetick") < 40) {
					entity.getPersistentData().putDouble("fnafmod-safetick", 0);
					if (entity instanceof Mob) {
						try {
							((Mob) entity).setTarget(null);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
}
