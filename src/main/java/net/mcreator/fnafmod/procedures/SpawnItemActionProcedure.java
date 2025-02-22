package net.mcreator.fnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.fnafmod.init.FnafModModItems;

public class SpawnItemActionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double xex = 0;
		double yey = 0;
		double zez = 0;
		double yaw = 0;
		String command = "";
		String spawned = "";
		spawned = ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace("_spawn_item", "")).replace("fnaf_mod:", "");
		if (itemstack.getItem() == FnafModModItems.FREDDY.get()) {
			spawned = "passive_freddy";
		} else if (itemstack.getItem() == FnafModModItems.EVIL_FREDDY_ITEM_SPAWN.get()) {
			spawned = "full_hostile_freddy";
		} else if (itemstack.getItem() == FnafModModItems.STATUE_FREDDY_ITEM.get()) {
			spawned = "statue_freddy";
		} else if (itemstack.getItem() == FnafModModItems.BONNIE.get()) {
			spawned = "passive_bonnie";
		} else if (itemstack.getItem() == FnafModModItems.EVIL_BONNIE.get()) {
			spawned = "full_hostile_bonnie";
		} else if (itemstack.getItem() == FnafModModItems.STATUE_BONNIE_SPAWN.get()) {
			spawned = "statue_bonnie";
		} else if (itemstack.getItem() == FnafModModItems.CHICA.get()) {
			spawned = "passive_chica";
		} else if (itemstack.getItem() == FnafModModItems.EVIL_CHICA_ITEM.get()) {
			spawned = "full_hostile_chica";
		} else if (itemstack.getItem() == FnafModModItems.STATUE_CHICA_ITEM.get()) {
			spawned = "statue_chica";
		} else if (itemstack.getItem() == FnafModModItems.FOXY.get()) {
			spawned = "passive_foxy";
		} else if (itemstack.getItem() == FnafModModItems.EVIL_FOXY_ITEM.get()) {
			spawned = "full_hostile_foxy";
		} else if (itemstack.getItem() == FnafModModItems.STATUE_FOXY_ITEM.get()) {
			spawned = "statue_foxy";
		}
		if (itemstack.getItem() == FnafModModItems.YELLOWBEAR.get()) {
			spawned = "passive_goldie";
		} else if (itemstack.getItem() == FnafModModItems.FREDBEAR_ITEM.get()) {
			spawned = "passive_fredbear";
		} else if (itemstack.getItem() == FnafModModItems.SPRING_BONNIE.get()) {
			spawned = "passive_spring_bonnie";
		}
		if (itemstack.getItem() == FnafModModItems.FREDDY_SPAWN_ITEM.get()) {
			spawned = "freddy_fazbear";
		} else if (itemstack.getItem() == FnafModModItems.BONNIE_SPAWN.get()) {
			spawned = "bonnie_bunny";
		} else if (itemstack.getItem() == FnafModModItems.CHICA_SPAWN_ITEM.get()) {
			spawned = "chica_chicken";
		} else if (itemstack.getItem() == FnafModModItems.FOXY_SPAWN.get()) {
			spawned = "foxy_pirate";
		} else if (itemstack.getItem() == FnafModModItems.ENDO.get()) {
			spawned = "endo_skeleton";
		} else if (itemstack.getItem() == FnafModModItems.GOLDEN_FREDDY_SPAWN_ITEM.get()) {
			spawned = "golden_freddy";
		}
		if (itemstack.getItem() == FnafModModItems.TOY_FREDDY_SPAWN_ITEM.get()) {
			spawned = "toy_freddy";
		} else if (itemstack.getItem() == FnafModModItems.TOY_BONNIE_SPAWN_ITEM.get()) {
			spawned = "toy_bonnie";
		} else if (itemstack.getItem() == FnafModModItems.TOY_CHICA_SPAWN_ITEM.get()) {
			spawned = "nightime_toy_chica";
		} else if (itemstack.getItem() == FnafModModItems.TOY_FOXY_SPAWN_ITEM.get()) {
			spawned = "toy_foxy";
		} else if (itemstack.getItem() == FnafModModItems.MANGLE_SPAWN_ITEM.get()) {
			spawned = "mangle";
		} else if (itemstack.getItem() == FnafModModItems.BB_SPAWN_ITEM.get()) {
			spawned = "bb";
		} else if (itemstack.getItem() == FnafModModItems.JJ_SPAWN_ITEM.get()) {
			spawned = "jj";
		} else if (itemstack.getItem() == FnafModModItems.PUPPET_SPAWN_ITEM.get()) {
			spawned = "puppet";
		}
		if (itemstack.getItem() == FnafModModItems.WITHERED_FREDDY_SPAWN_ITEM.get()) {
			spawned = "withered_freddy";
		} else if (itemstack.getItem() == FnafModModItems.WITHERED_BONNIE_SPAWN_ITEM.get()) {
			spawned = "withered_bonnie";
		} else if (itemstack.getItem() == FnafModModItems.WITHERED_CHICA_SPAWN_ITEM.get()) {
			spawned = "withered_chica";
		} else if (itemstack.getItem() == FnafModModItems.WITHERED_FOXY_SPAWN_ITEM.get()) {
			spawned = "withered_foxy";
		}
		command = "summon REGISTRY XYZ {Brain: {memories: {}}, HurtByTimestamp: 0, ForgeData: {got_coords: 1b, x: ZEX, y: ZEY, z: ZEZ, yaw: YAWd},NoAI:move,Rotation:[YAWf]}";
		xex = Math.round(Math.pow(10, 0) * x) / Math.pow(10, 0) + 0.5;
		if (!(world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:slabs")))) {
			yey = Math.round(Math.pow(10, 0) * y) / Math.pow(10, 0) + 1;
		} else {
			yey = Math.round(Math.pow(10, 0) * y) / Math.pow(10, 0) + 0.5;
		}
		zez = Math.round(Math.pow(10, 0) * z) / Math.pow(10, 0) + 0.5;
		yaw = entity.getYRot() / 45;
		yaw = Math.round(yaw);
		yaw = yaw * 45;
		yaw = yaw + 180;
		command = ((((("summon REGISTRY XYZ {Brain: {memories: {}}, HurtByTimestamp: 0, ForgeData: {got_coords: 1b, x: ZEX, y: ZEY, z: ZEZ, yaw: YAWd},NoAI:move,Rotation:[YAWf]}".replace("YAW", "" + yaw)).replace("ZEZ", "" + zez)).replace("ZEY",
				"" + yey)).replace("ZEX", "" + xex)).replace("XYZ", (xex + " ") + "" + (yey + " ") + zez)).replace("REGISTRY", "fnaf_mod:" + spawned);
		if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), command);
	}
}
