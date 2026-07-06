package net.mcreator.fnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModItems;

import java.util.ArrayList;

public class ArcadeMachineShadowFreddyOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean spawn = false;
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if (new Vec3(x, y, z).distanceTo(new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()))) < 5
					&& (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(FnafModModItems.SHADOW_REMNANT.get())) : false)) {
				spawn = true;
			}
		}
		if (spawn) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 5, 2, 2, 2, 1);
			if (Math.random() < (1) / ((float) 5)) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.portal.ambient")), SoundSource.BLOCKS, 1, (float) (Mth.nextInt(RandomSource.create(), 7, 11) / 10));
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.portal.ambient")), SoundSource.BLOCKS, 1, (float) (Mth.nextInt(RandomSource.create(), 7, 11) / 10), false);
					}
				}
			}
		}
	}
}
