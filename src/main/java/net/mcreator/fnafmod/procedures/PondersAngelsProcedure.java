package net.mcreator.fnafmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.fnafmod.init.FnafModModItems;
import net.mcreator.fnafmod.entity.WitheredFoxyEntity;
import net.mcreator.fnafmod.FnafModMod;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class PondersAngelsProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double distance = 0;
		double Y_Val = 0;
		double Z_Val = 0;
		double X_Val = 0;
		while (distance < 7) {
			if (!(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
					.getType() == HitResult.Type.BLOCK)) {
				distance = distance + 1;
				if (!world.getEntitiesOfClass(Mob.class, AABB.ofSize(new Vec3(X_Val, Y_Val, Z_Val), 4, 4, 4), e -> true).isEmpty()) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafModModItems.FLASH_LIGHT_ON.get()) {
						{
							final Vec3 _center = new Vec3(X_Val, Y_Val, Z_Val);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("fnaf_mod:angels")))) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 2, 255, false, false));
									FnafModMod.queueServerWork(4, () -> {
										if (entityiterator instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(MobEffects.MOVEMENT_SLOWDOWN)) {
											{
												Entity _ent = entityiterator;
												if (!_ent.level().isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
															_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
															"data merge entity @s {NoAI:1}");
												}
											}
											if (entityiterator instanceof WitheredFoxyEntity) {
												((WitheredFoxyEntity) entityiterator).setAnimation("animation.witheredfoxy.sneak");
											}
										} else {
											{
												Entity _ent = entityiterator;
												if (!_ent.level().isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
															_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
															"data merge entity @s {NoAI:0}");
												}
											}
											if (entityiterator instanceof WitheredFoxyEntity) {
												((WitheredFoxyEntity) entityiterator).setAnimation("empty");
											}
										}
									});
								}
							}
						}
					}
					break;
				} else {
					X_Val = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
					Y_Val = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
					Z_Val = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
					continue;
				}
			} else {
				break;
			}
		}
	}
}
