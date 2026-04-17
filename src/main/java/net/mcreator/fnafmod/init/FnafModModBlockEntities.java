
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.fnafmod.block.entity.WhiteClothTableTileEntity;
import net.mcreator.fnafmod.block.entity.VendingMachineBlockEntity;
import net.mcreator.fnafmod.block.entity.VassDollTileEntity;
import net.mcreator.fnafmod.block.entity.UnWitheredFreddyHeadTileEntity;
import net.mcreator.fnafmod.block.entity.UnWitheredFoxyHeadTileEntity;
import net.mcreator.fnafmod.block.entity.UnWitheredChicaHeadTileEntity;
import net.mcreator.fnafmod.block.entity.UnWitheredBonnieHeadTileEntity;
import net.mcreator.fnafmod.block.entity.TrashCanTileEntity;
import net.mcreator.fnafmod.block.entity.ToyFreddySignOnTileEntity;
import net.mcreator.fnafmod.block.entity.ToyFreddySignOffTileEntity;
import net.mcreator.fnafmod.block.entity.TortureFreddyTileEntity;
import net.mcreator.fnafmod.block.entity.TortureChairTileEntity;
import net.mcreator.fnafmod.block.entity.StageLightRedTileEntity;
import net.mcreator.fnafmod.block.entity.StageLightRedOnTileEntity;
import net.mcreator.fnafmod.block.entity.StageLightPinkTileEntity;
import net.mcreator.fnafmod.block.entity.StageLightPinkOnTileEntity;
import net.mcreator.fnafmod.block.entity.StageLightOrangeTileEntity;
import net.mcreator.fnafmod.block.entity.StageLightOrangeOnTileEntity;
import net.mcreator.fnafmod.block.entity.StageLightGreenTileEntity;
import net.mcreator.fnafmod.block.entity.StageLightGreenOnTileEntity;
import net.mcreator.fnafmod.block.entity.SpringBonnieHeadTileEntity;
import net.mcreator.fnafmod.block.entity.SpringBonnieDecorTileEntity;
import net.mcreator.fnafmod.block.entity.ShelfTileEntity;
import net.mcreator.fnafmod.block.entity.SecurityDoorOpenBlockEntity;
import net.mcreator.fnafmod.block.entity.RetroFreddySignTileEntity;
import net.mcreator.fnafmod.block.entity.RetroFreddySignOnTileEntity;
import net.mcreator.fnafmod.block.entity.RetroComputerTileEntity;
import net.mcreator.fnafmod.block.entity.RemantInfuserBlockEntity;
import net.mcreator.fnafmod.block.entity.PurpleStripeTableTileEntity;
import net.mcreator.fnafmod.block.entity.PurpleStarTableTileEntity;
import net.mcreator.fnafmod.block.entity.ProtonsPlushRatTileEntity;
import net.mcreator.fnafmod.block.entity.PlushFreddyBlockEntity;
import net.mcreator.fnafmod.block.entity.PlushFredbearBlockEntity;
import net.mcreator.fnafmod.block.entity.PlushFoxyBlockEntity;
import net.mcreator.fnafmod.block.entity.PlushChicaBlockEntity;
import net.mcreator.fnafmod.block.entity.PlushBonnieBlockEntity;
import net.mcreator.fnafmod.block.entity.ModularLightTileEntity;
import net.mcreator.fnafmod.block.entity.ModularLightFlatTileEntity;
import net.mcreator.fnafmod.block.entity.MeshTrashCanTileEntity;
import net.mcreator.fnafmod.block.entity.LockerYellowBlockEntity;
import net.mcreator.fnafmod.block.entity.LockerSilverBlockEntity;
import net.mcreator.fnafmod.block.entity.LightSwitchTileEntity;
import net.mcreator.fnafmod.block.entity.LightButtonTileEntity;
import net.mcreator.fnafmod.block.entity.LightButtonFlatTileEntity;
import net.mcreator.fnafmod.block.entity.LargeIndustrialDoorTileEntity;
import net.mcreator.fnafmod.block.entity.IndustrialFanTileEntity;
import net.mcreator.fnafmod.block.entity.GeneratorRightCreativeTileEntity;
import net.mcreator.fnafmod.block.entity.GeneratorOutletBlockEntity;
import net.mcreator.fnafmod.block.entity.GeneratorMiddlePowerTileEntity;
import net.mcreator.fnafmod.block.entity.GeneratorLeftBreakerTileEntity;
import net.mcreator.fnafmod.block.entity.GenPercentTileEntity;
import net.mcreator.fnafmod.block.entity.GarageDoorTileEntity;
import net.mcreator.fnafmod.block.entity.FreddysCupcakeBonanzaTileEntity;
import net.mcreator.fnafmod.block.entity.FreddySignOnTileEntity;
import net.mcreator.fnafmod.block.entity.FreddySignOffTileEntity;
import net.mcreator.fnafmod.block.entity.FreddyHeadTileEntity;
import net.mcreator.fnafmod.block.entity.FredbearSignTileEntity;
import net.mcreator.fnafmod.block.entity.FredbearHeadTileEntity;
import net.mcreator.fnafmod.block.entity.FoxyHeadTileEntity;
import net.mcreator.fnafmod.block.entity.FoxyHeadDecorationTileEntity;
import net.mcreator.fnafmod.block.entity.FluorescentLightTileEntity;
import net.mcreator.fnafmod.block.entity.FloodLightsTileEntity;
import net.mcreator.fnafmod.block.entity.FlashLightLightBlockEntity;
import net.mcreator.fnafmod.block.entity.EndoBlockTileEntity;
import net.mcreator.fnafmod.block.entity.DrumsetBlockEntity;
import net.mcreator.fnafmod.block.entity.DoorButtonTileEntity;
import net.mcreator.fnafmod.block.entity.DoorButtonOnBlockEntity;
import net.mcreator.fnafmod.block.entity.DoorButtonFlatTileEntity;
import net.mcreator.fnafmod.block.entity.DoorBoarderBlockEntity;
import net.mcreator.fnafmod.block.entity.DisplayShelvesTileEntity;
import net.mcreator.fnafmod.block.entity.DisplayMonitorTileEntity;
import net.mcreator.fnafmod.block.entity.DeskBlockEntity;
import net.mcreator.fnafmod.block.entity.Desk3BlockEntity;
import net.mcreator.fnafmod.block.entity.Desk2BlockEntity;
import net.mcreator.fnafmod.block.entity.ConnectingTableTileEntity;
import net.mcreator.fnafmod.block.entity.ClownfulDollTileEntity;
import net.mcreator.fnafmod.block.entity.CinematicSignToysTileEntity;
import net.mcreator.fnafmod.block.entity.CinematicSignFreddyTileEntity;
import net.mcreator.fnafmod.block.entity.CinematicSignBaseTileEntity;
import net.mcreator.fnafmod.block.entity.CinematicSignBaseSequelTileEntity;
import net.mcreator.fnafmod.block.entity.ChicaHeadTileEntity;
import net.mcreator.fnafmod.block.entity.ChicaHeadDecorationTileEntity;
import net.mcreator.fnafmod.block.entity.CenteredFreddySignTileEntity;
import net.mcreator.fnafmod.block.entity.CenteredFreddySignOnTileEntity;
import net.mcreator.fnafmod.block.entity.CelebrateFunTileEntity;
import net.mcreator.fnafmod.block.entity.CeilingLampBlockEntity;
import net.mcreator.fnafmod.block.entity.CarouselTileEntity;
import net.mcreator.fnafmod.block.entity.BonnieHeadTileEntity;
import net.mcreator.fnafmod.block.entity.BigWideRedWindowedDoorTileEntity;
import net.mcreator.fnafmod.block.entity.BigWideRedEntranceDoorTileEntity;
import net.mcreator.fnafmod.block.entity.BigWideGlassEntranceDoorTileEntity;
import net.mcreator.fnafmod.block.entity.BigWideDualColourEntranceDoorTileEntity;
import net.mcreator.fnafmod.block.entity.BigWideCyanKitchenDoorTileEntity;
import net.mcreator.fnafmod.block.entity.BigWhiteDoorTileEntity;
import net.mcreator.fnafmod.block.entity.BigSecurityDoorTileEntity;
import net.mcreator.fnafmod.block.entity.BigRedWindowedDoorTileEntity;
import net.mcreator.fnafmod.block.entity.BigRedEntranceDoorTileEntity;
import net.mcreator.fnafmod.block.entity.BigRedDoorTileEntity;
import net.mcreator.fnafmod.block.entity.BigHeavyDutyDoorTileEntity;
import net.mcreator.fnafmod.block.entity.BigGlassEntranceDoorTileEntity;
import net.mcreator.fnafmod.block.entity.BigDualColourEntranceDoorTileEntity;
import net.mcreator.fnafmod.block.entity.BigCyanKitchenDoorTileEntity;
import net.mcreator.fnafmod.block.entity.BigCyanBackstageDoorTileEntity;
import net.mcreator.fnafmod.block.entity.BigClosetDoorTileEntity;
import net.mcreator.fnafmod.block.entity.BigBackstageDoorTileEntity;
import net.mcreator.fnafmod.block.entity.AlternateGarageDoorTileEntity;
import net.mcreator.fnafmod.FnafModMod;

public class FnafModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FnafModMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> DESK = register("desk", FnafModModBlocks.DESK, DeskBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DOOR_BUTTON_ON = register("door_button_on", FnafModModBlocks.DOOR_BUTTON_ON, DoorButtonOnBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SECURITY_DOOR_OPEN = register("security_door_open", FnafModModBlocks.SECURITY_DOOR_OPEN, SecurityDoorOpenBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DESK_2 = register("desk_2", FnafModModBlocks.DESK_2, Desk2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DESK_3 = register("desk_3", FnafModModBlocks.DESK_3, Desk3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REMNANT_INFUSER = register("remnant_infuser", FnafModModBlocks.REMNANT_INFUSER, RemantInfuserBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FLASH_LIGHT_LIGHT = register("flash_light_light", FnafModModBlocks.FLASH_LIGHT_LIGHT, FlashLightLightBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PLUSH_FREDDY = register("plush_freddy", FnafModModBlocks.PLUSH_FREDDY, PlushFreddyBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PLUSH_BONNIE = register("plush_bonnie", FnafModModBlocks.PLUSH_BONNIE, PlushBonnieBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PLUSH_CHICA = register("plush_chica", FnafModModBlocks.PLUSH_CHICA, PlushChicaBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PLUSH_FOXY = register("plush_foxy", FnafModModBlocks.PLUSH_FOXY, PlushFoxyBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PLUSH_FREDBEAR = register("plush_fredbear", FnafModModBlocks.PLUSH_FREDBEAR, PlushFredbearBlockEntity::new);
	public static final RegistryObject<BlockEntityType<MeshTrashCanTileEntity>> MESH_TRASH_CAN = REGISTRY.register("mesh_trash_can", () -> BlockEntityType.Builder.of(MeshTrashCanTileEntity::new, FnafModModBlocks.MESH_TRASH_CAN.get()).build(null));
	public static final RegistryObject<BlockEntityType<TrashCanTileEntity>> TRASH_CAN = REGISTRY.register("trash_can", () -> BlockEntityType.Builder.of(TrashCanTileEntity::new, FnafModModBlocks.TRASH_CAN.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddyHeadTileEntity>> FREDDY_HEAD = REGISTRY.register("freddy_head", () -> BlockEntityType.Builder.of(FreddyHeadTileEntity::new, FnafModModBlocks.FREDDY_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnieHeadTileEntity>> BONNIE_HEAD = REGISTRY.register("bonnie_head", () -> BlockEntityType.Builder.of(BonnieHeadTileEntity::new, FnafModModBlocks.BONNIE_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChicaHeadTileEntity>> CHICA_HEAD = REGISTRY.register("chica_head", () -> BlockEntityType.Builder.of(ChicaHeadTileEntity::new, FnafModModBlocks.CHICA_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyHeadTileEntity>> FOXY_HEAD = REGISTRY.register("foxy_head", () -> BlockEntityType.Builder.of(FoxyHeadTileEntity::new, FnafModModBlocks.FOXY_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<FredbearHeadTileEntity>> FREDBEAR_HEAD = REGISTRY.register("fredbear_head", () -> BlockEntityType.Builder.of(FredbearHeadTileEntity::new, FnafModModBlocks.FREDBEAR_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringBonnieHeadTileEntity>> SPRING_BONNIE_HEAD = REGISTRY.register("spring_bonnie_head",
			() -> BlockEntityType.Builder.of(SpringBonnieHeadTileEntity::new, FnafModModBlocks.SPRING_BONNIE_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<EndoBlockTileEntity>> ENDO_BLOCK = REGISTRY.register("endo_block", () -> BlockEntityType.Builder.of(EndoBlockTileEntity::new, FnafModModBlocks.ENDO_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<UnWitheredFreddyHeadTileEntity>> UN_WITHERED_FREDDY_HEAD = REGISTRY.register("un_withered_freddy_head",
			() -> BlockEntityType.Builder.of(UnWitheredFreddyHeadTileEntity::new, FnafModModBlocks.UN_WITHERED_FREDDY_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<UnWitheredBonnieHeadTileEntity>> UN_WITHERED_BONNIE_HEAD = REGISTRY.register("un_withered_bonnie_head",
			() -> BlockEntityType.Builder.of(UnWitheredBonnieHeadTileEntity::new, FnafModModBlocks.UN_WITHERED_BONNIE_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<UnWitheredFoxyHeadTileEntity>> UN_WITHERED_FOXY_HEAD = REGISTRY.register("un_withered_foxy_head",
			() -> BlockEntityType.Builder.of(UnWitheredFoxyHeadTileEntity::new, FnafModModBlocks.UN_WITHERED_FOXY_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<UnWitheredChicaHeadTileEntity>> UN_WITHERED_CHICA_HEAD = REGISTRY.register("un_withered_chica_head",
			() -> BlockEntityType.Builder.of(UnWitheredChicaHeadTileEntity::new, FnafModModBlocks.UN_WITHERED_CHICA_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<ShelfTileEntity>> SHELF = REGISTRY.register("shelf", () -> BlockEntityType.Builder.of(ShelfTileEntity::new, FnafModModBlocks.SHELF.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChicaHeadDecorationTileEntity>> CHICA_HEAD_DECORATION = REGISTRY.register("chica_head_decoration",
			() -> BlockEntityType.Builder.of(ChicaHeadDecorationTileEntity::new, FnafModModBlocks.CHICA_HEAD_DECORATION.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyHeadDecorationTileEntity>> FOXY_HEAD_DECORATION = REGISTRY.register("foxy_head_decoration",
			() -> BlockEntityType.Builder.of(FoxyHeadDecorationTileEntity::new, FnafModModBlocks.FOXY_HEAD_DECORATION.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddySignOffTileEntity>> FREDDY_SIGN_OFF = REGISTRY.register("freddy_sign_off",
			() -> BlockEntityType.Builder.of(FreddySignOffTileEntity::new, FnafModModBlocks.FREDDY_SIGN_OFF.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddySignOnTileEntity>> FREDDY_SIGN_ON = REGISTRY.register("freddy_sign_on", () -> BlockEntityType.Builder.of(FreddySignOnTileEntity::new, FnafModModBlocks.FREDDY_SIGN_ON.get()).build(null));
	public static final RegistryObject<BlockEntityType<VassDollTileEntity>> VASS_DOLL = REGISTRY.register("vass_doll", () -> BlockEntityType.Builder.of(VassDollTileEntity::new, FnafModModBlocks.VASS_DOLL.get()).build(null));
	public static final RegistryObject<BlockEntityType<CenteredFreddySignTileEntity>> CENTERED_FREDDY_SIGN = REGISTRY.register("centered_freddy_sign",
			() -> BlockEntityType.Builder.of(CenteredFreddySignTileEntity::new, FnafModModBlocks.CENTERED_FREDDY_SIGN.get()).build(null));
	public static final RegistryObject<BlockEntityType<CenteredFreddySignOnTileEntity>> CENTERED_FREDDY_SIGN_ON = REGISTRY.register("centered_freddy_sign_on",
			() -> BlockEntityType.Builder.of(CenteredFreddySignOnTileEntity::new, FnafModModBlocks.CENTERED_FREDDY_SIGN_ON.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFreddySignOffTileEntity>> TOY_FREDDY_SIGN_OFF = REGISTRY.register("toy_freddy_sign_off",
			() -> BlockEntityType.Builder.of(ToyFreddySignOffTileEntity::new, FnafModModBlocks.TOY_FREDDY_SIGN_OFF.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFreddySignOnTileEntity>> TOY_FREDDY_SIGN_ON = REGISTRY.register("toy_freddy_sign_on",
			() -> BlockEntityType.Builder.of(ToyFreddySignOnTileEntity::new, FnafModModBlocks.TOY_FREDDY_SIGN_ON.get()).build(null));
	public static final RegistryObject<BlockEntityType<RetroFreddySignTileEntity>> RETRO_FREDDY_SIGN = REGISTRY.register("retro_freddy_sign",
			() -> BlockEntityType.Builder.of(RetroFreddySignTileEntity::new, FnafModModBlocks.RETRO_FREDDY_SIGN.get()).build(null));
	public static final RegistryObject<BlockEntityType<RetroFreddySignOnTileEntity>> RETRO_FREDDY_SIGN_ON = REGISTRY.register("retro_freddy_sign_on",
			() -> BlockEntityType.Builder.of(RetroFreddySignOnTileEntity::new, FnafModModBlocks.RETRO_FREDDY_SIGN_ON.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringBonnieDecorTileEntity>> SPRING_BONNIE_DECOR = REGISTRY.register("spring_bonnie_decor",
			() -> BlockEntityType.Builder.of(SpringBonnieDecorTileEntity::new, FnafModModBlocks.SPRING_BONNIE_DECOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<FredbearSignTileEntity>> FREDBEAR_SIGN = REGISTRY.register("fredbear_sign", () -> BlockEntityType.Builder.of(FredbearSignTileEntity::new, FnafModModBlocks.FREDBEAR_SIGN.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> LOCKER_YELLOW = register("locker_yellow", FnafModModBlocks.LOCKER_YELLOW, LockerYellowBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LOCKER_SILVER = register("locker_silver", FnafModModBlocks.LOCKER_SILVER, LockerSilverBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> VENDING_MACHINE = register("vending_machine", FnafModModBlocks.VENDING_MACHINE, VendingMachineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<StageLightGreenTileEntity>> STAGE_LIGHT_GREEN = REGISTRY.register("stage_light_green",
			() -> BlockEntityType.Builder.of(StageLightGreenTileEntity::new, FnafModModBlocks.STAGE_LIGHT_GREEN.get()).build(null));
	public static final RegistryObject<BlockEntityType<StageLightPinkTileEntity>> STAGE_LIGHT_PINK = REGISTRY.register("stage_light_pink",
			() -> BlockEntityType.Builder.of(StageLightPinkTileEntity::new, FnafModModBlocks.STAGE_LIGHT_PINK.get()).build(null));
	public static final RegistryObject<BlockEntityType<StageLightOrangeTileEntity>> STAGE_LIGHT_ORANGE = REGISTRY.register("stage_light_orange",
			() -> BlockEntityType.Builder.of(StageLightOrangeTileEntity::new, FnafModModBlocks.STAGE_LIGHT_ORANGE.get()).build(null));
	public static final RegistryObject<BlockEntityType<StageLightRedTileEntity>> STAGE_LIGHT_RED = REGISTRY.register("stage_light_red",
			() -> BlockEntityType.Builder.of(StageLightRedTileEntity::new, FnafModModBlocks.STAGE_LIGHT_RED.get()).build(null));
	public static final RegistryObject<BlockEntityType<StageLightGreenOnTileEntity>> STAGE_LIGHT_GREEN_ON = REGISTRY.register("stage_light_green_on",
			() -> BlockEntityType.Builder.of(StageLightGreenOnTileEntity::new, FnafModModBlocks.STAGE_LIGHT_GREEN_ON.get()).build(null));
	public static final RegistryObject<BlockEntityType<StageLightPinkOnTileEntity>> STAGE_LIGHT_PINK_ON = REGISTRY.register("stage_light_pink_on",
			() -> BlockEntityType.Builder.of(StageLightPinkOnTileEntity::new, FnafModModBlocks.STAGE_LIGHT_PINK_ON.get()).build(null));
	public static final RegistryObject<BlockEntityType<StageLightOrangeOnTileEntity>> STAGE_LIGHT_ORANGE_ON = REGISTRY.register("stage_light_orange_on",
			() -> BlockEntityType.Builder.of(StageLightOrangeOnTileEntity::new, FnafModModBlocks.STAGE_LIGHT_ORANGE_ON.get()).build(null));
	public static final RegistryObject<BlockEntityType<StageLightRedOnTileEntity>> STAGE_LIGHT_RED_ON = REGISTRY.register("stage_light_red_on",
			() -> BlockEntityType.Builder.of(StageLightRedOnTileEntity::new, FnafModModBlocks.STAGE_LIGHT_RED_ON.get()).build(null));
	public static final RegistryObject<BlockEntityType<PurpleStripeTableTileEntity>> PURPLE_STRIPE_TABLE = REGISTRY.register("purple_stripe_table",
			() -> BlockEntityType.Builder.of(PurpleStripeTableTileEntity::new, FnafModModBlocks.PURPLE_STRIPE_TABLE.get()).build(null));
	public static final RegistryObject<BlockEntityType<PurpleStarTableTileEntity>> PURPLE_STAR_TABLE = REGISTRY.register("purple_star_table",
			() -> BlockEntityType.Builder.of(PurpleStarTableTileEntity::new, FnafModModBlocks.PURPLE_STAR_TABLE.get()).build(null));
	public static final RegistryObject<BlockEntityType<WhiteClothTableTileEntity>> WHITE_CLOTH_TABLE = REGISTRY.register("white_cloth_table",
			() -> BlockEntityType.Builder.of(WhiteClothTableTileEntity::new, FnafModModBlocks.WHITE_CLOTH_TABLE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ConnectingTableTileEntity>> CONNECTING_TABLE = REGISTRY.register("connecting_table",
			() -> BlockEntityType.Builder.of(ConnectingTableTileEntity::new, FnafModModBlocks.CONNECTING_TABLE.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> CEILING_LAMP = register("ceiling_lamp", FnafModModBlocks.CEILING_LAMP, CeilingLampBlockEntity::new);
	public static final RegistryObject<BlockEntityType<CarouselTileEntity>> CAROUSEL = REGISTRY.register("carousel", () -> BlockEntityType.Builder.of(CarouselTileEntity::new, FnafModModBlocks.CAROUSEL.get()).build(null));
	public static final RegistryObject<BlockEntityType<ClownfulDollTileEntity>> CLOWNFUL_DOLL = REGISTRY.register("clownful_doll", () -> BlockEntityType.Builder.of(ClownfulDollTileEntity::new, FnafModModBlocks.CLOWNFUL_DOLL.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddysCupcakeBonanzaTileEntity>> FREDDYS_CUPCAKE_BONANZA = REGISTRY.register("freddys_cupcake_bonanza",
			() -> BlockEntityType.Builder.of(FreddysCupcakeBonanzaTileEntity::new, FnafModModBlocks.FREDDYS_CUPCAKE_BONANZA.get()).build(null));
	public static final RegistryObject<BlockEntityType<DisplayShelvesTileEntity>> DISPLAY_SHELVES = REGISTRY.register("display_shelves",
			() -> BlockEntityType.Builder.of(DisplayShelvesTileEntity::new, FnafModModBlocks.DISPLAY_SHELVES.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigBackstageDoorTileEntity>> BIG_BACKSTAGE_DOOR = REGISTRY.register("big_backstage_door",
			() -> BlockEntityType.Builder.of(BigBackstageDoorTileEntity::new, FnafModModBlocks.BIG_BACKSTAGE_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigCyanBackstageDoorTileEntity>> BIG_CYAN_BACKSTAGE_DOOR = REGISTRY.register("big_cyan_backstage_door",
			() -> BlockEntityType.Builder.of(BigCyanBackstageDoorTileEntity::new, FnafModModBlocks.BIG_CYAN_BACKSTAGE_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigGlassEntranceDoorTileEntity>> BIG_GLASS_ENTRANCE_DOOR = REGISTRY.register("big_glass_entrance_door",
			() -> BlockEntityType.Builder.of(BigGlassEntranceDoorTileEntity::new, FnafModModBlocks.BIG_GLASS_ENTRANCE_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigRedEntranceDoorTileEntity>> BIG_RED_ENTRANCE_DOOR = REGISTRY.register("big_red_entrance_door",
			() -> BlockEntityType.Builder.of(BigRedEntranceDoorTileEntity::new, FnafModModBlocks.BIG_RED_ENTRANCE_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigRedDoorTileEntity>> BIG_RED_DOOR = REGISTRY.register("big_red_door", () -> BlockEntityType.Builder.of(BigRedDoorTileEntity::new, FnafModModBlocks.BIG_RED_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigRedWindowedDoorTileEntity>> BIG_RED_WINDOWED_DOOR = REGISTRY.register("big_red_windowed_door",
			() -> BlockEntityType.Builder.of(BigRedWindowedDoorTileEntity::new, FnafModModBlocks.BIG_RED_WINDOWED_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigDualColourEntranceDoorTileEntity>> BIG_DUAL_COLOUR_ENTRANCE_DOOR = REGISTRY.register("big_dual_colour_entrance_door",
			() -> BlockEntityType.Builder.of(BigDualColourEntranceDoorTileEntity::new, FnafModModBlocks.BIG_DUAL_COLOUR_ENTRANCE_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigWhiteDoorTileEntity>> BIG_WHITE_DOOR = REGISTRY.register("big_white_door", () -> BlockEntityType.Builder.of(BigWhiteDoorTileEntity::new, FnafModModBlocks.BIG_WHITE_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigClosetDoorTileEntity>> BIG_CLOSET_DOOR = REGISTRY.register("big_closet_door",
			() -> BlockEntityType.Builder.of(BigClosetDoorTileEntity::new, FnafModModBlocks.BIG_CLOSET_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigCyanKitchenDoorTileEntity>> BIG_CYAN_KITCHEN_DOOR = REGISTRY.register("big_cyan_kitchen_door",
			() -> BlockEntityType.Builder.of(BigCyanKitchenDoorTileEntity::new, FnafModModBlocks.BIG_CYAN_KITCHEN_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigWideRedWindowedDoorTileEntity>> BIG_WIDE_RED_WINDOWED_DOOR = REGISTRY.register("big_wide_red_windowed_door",
			() -> BlockEntityType.Builder.of(BigWideRedWindowedDoorTileEntity::new, FnafModModBlocks.BIG_WIDE_RED_WINDOWED_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigWideDualColourEntranceDoorTileEntity>> BIG_WIDE_DUAL_COLOUR_ENTRANCE_DOOR = REGISTRY.register("big_wide_dual_colour_entrance_door",
			() -> BlockEntityType.Builder.of(BigWideDualColourEntranceDoorTileEntity::new, FnafModModBlocks.BIG_WIDE_DUAL_COLOUR_ENTRANCE_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigWideGlassEntranceDoorTileEntity>> BIG_WIDE_GLASS_ENTRANCE_DOOR = REGISTRY.register("big_wide_glass_entrance_door",
			() -> BlockEntityType.Builder.of(BigWideGlassEntranceDoorTileEntity::new, FnafModModBlocks.BIG_WIDE_GLASS_ENTRANCE_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigWideCyanKitchenDoorTileEntity>> BIG_WIDE_CYAN_KITCHEN_DOOR = REGISTRY.register("big_wide_cyan_kitchen_door",
			() -> BlockEntityType.Builder.of(BigWideCyanKitchenDoorTileEntity::new, FnafModModBlocks.BIG_WIDE_CYAN_KITCHEN_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigWideRedEntranceDoorTileEntity>> BIG_WIDE_RED_ENTRANCE_DOOR = REGISTRY.register("big_wide_red_entrance_door",
			() -> BlockEntityType.Builder.of(BigWideRedEntranceDoorTileEntity::new, FnafModModBlocks.BIG_WIDE_RED_ENTRANCE_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> DOOR_BOARDER = register("door_boarder", FnafModModBlocks.DOOR_BOARDER, DoorBoarderBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DRUMSET = register("drumset", FnafModModBlocks.DRUMSET, DrumsetBlockEntity::new);
	public static final RegistryObject<BlockEntityType<CinematicSignBaseTileEntity>> CINEMATIC_SIGN_BASE = REGISTRY.register("cinematic_sign_base",
			() -> BlockEntityType.Builder.of(CinematicSignBaseTileEntity::new, FnafModModBlocks.CINEMATIC_SIGN_BASE.get()).build(null));
	public static final RegistryObject<BlockEntityType<CinematicSignBaseSequelTileEntity>> CINEMATIC_SIGN_BASE_SEQUEL = REGISTRY.register("cinematic_sign_base_sequel",
			() -> BlockEntityType.Builder.of(CinematicSignBaseSequelTileEntity::new, FnafModModBlocks.CINEMATIC_SIGN_BASE_SEQUEL.get()).build(null));
	public static final RegistryObject<BlockEntityType<CinematicSignFreddyTileEntity>> CINEMATIC_SIGN_FREDDY = REGISTRY.register("cinematic_sign_freddy",
			() -> BlockEntityType.Builder.of(CinematicSignFreddyTileEntity::new, FnafModModBlocks.CINEMATIC_SIGN_FREDDY.get()).build(null));
	public static final RegistryObject<BlockEntityType<CinematicSignToysTileEntity>> CINEMATIC_SIGN_TOYS = REGISTRY.register("cinematic_sign_toys",
			() -> BlockEntityType.Builder.of(CinematicSignToysTileEntity::new, FnafModModBlocks.CINEMATIC_SIGN_TOYS.get()).build(null));
	public static final RegistryObject<BlockEntityType<FluorescentLightTileEntity>> FLUORESCENT_LIGHT = REGISTRY.register("fluorescent_light",
			() -> BlockEntityType.Builder.of(FluorescentLightTileEntity::new, FnafModModBlocks.FLUORESCENT_LIGHT.get()).build(null));
	public static final RegistryObject<BlockEntityType<RetroComputerTileEntity>> RETRO_COMPUTER = REGISTRY.register("retro_computer", () -> BlockEntityType.Builder.of(RetroComputerTileEntity::new, FnafModModBlocks.RETRO_COMPUTER.get()).build(null));
	public static final RegistryObject<BlockEntityType<FloodLightsTileEntity>> FLOOD_LIGHTS = REGISTRY.register("flood_lights", () -> BlockEntityType.Builder.of(FloodLightsTileEntity::new, FnafModModBlocks.FLOOD_LIGHTS.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigSecurityDoorTileEntity>> BIG_SECURITY_DOOR = REGISTRY.register("big_security_door",
			() -> BlockEntityType.Builder.of(BigSecurityDoorTileEntity::new, FnafModModBlocks.BIG_SECURITY_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigHeavyDutyDoorTileEntity>> BIG_HEAVY_DUTY_DOOR = REGISTRY.register("big_heavy_duty_door",
			() -> BlockEntityType.Builder.of(BigHeavyDutyDoorTileEntity::new, FnafModModBlocks.BIG_HEAVY_DUTY_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GarageDoorTileEntity>> GARAGE_DOOR = REGISTRY.register("garage_door", () -> BlockEntityType.Builder.of(GarageDoorTileEntity::new, FnafModModBlocks.GARAGE_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<AlternateGarageDoorTileEntity>> ALTERNATE_GARAGE_DOOR = REGISTRY.register("alternate_garage_door",
			() -> BlockEntityType.Builder.of(AlternateGarageDoorTileEntity::new, FnafModModBlocks.ALTERNATE_GARAGE_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<TortureFreddyTileEntity>> TORTURE_FREDDY = REGISTRY.register("torture_freddy", () -> BlockEntityType.Builder.of(TortureFreddyTileEntity::new, FnafModModBlocks.TORTURE_FREDDY.get()).build(null));
	public static final RegistryObject<BlockEntityType<TortureChairTileEntity>> TORTURE_CHAIR = REGISTRY.register("torture_chair", () -> BlockEntityType.Builder.of(TortureChairTileEntity::new, FnafModModBlocks.TORTURE_CHAIR.get()).build(null));
	public static final RegistryObject<BlockEntityType<LargeIndustrialDoorTileEntity>> LARGE_INDUSTRIAL_DOOR = REGISTRY.register("large_industrial_door",
			() -> BlockEntityType.Builder.of(LargeIndustrialDoorTileEntity::new, FnafModModBlocks.LARGE_INDUSTRIAL_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<IndustrialFanTileEntity>> INDUSTRIAL_FAN = REGISTRY.register("industrial_fan", () -> BlockEntityType.Builder.of(IndustrialFanTileEntity::new, FnafModModBlocks.INDUSTRIAL_FAN.get()).build(null));
	public static final RegistryObject<BlockEntityType<GeneratorLeftBreakerTileEntity>> GENERATOR_LEFT_BREAKER = REGISTRY.register("generator_left_breaker",
			() -> BlockEntityType.Builder.of(GeneratorLeftBreakerTileEntity::new, FnafModModBlocks.GENERATOR_LEFT_BREAKER.get()).build(null));
	public static final RegistryObject<BlockEntityType<GeneratorMiddlePowerTileEntity>> GENERATOR_MIDDLE_POWER = REGISTRY.register("generator_middle_power",
			() -> BlockEntityType.Builder.of(GeneratorMiddlePowerTileEntity::new, FnafModModBlocks.GENERATOR_MIDDLE_POWER.get()).build(null));
	public static final RegistryObject<BlockEntityType<GeneratorRightCreativeTileEntity>> GENERATOR_RIGHT_CREATIVE = REGISTRY.register("generator_right_creative",
			() -> BlockEntityType.Builder.of(GeneratorRightCreativeTileEntity::new, FnafModModBlocks.GENERATOR_RIGHT_CREATIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> GENERATOR_OUTLET = register("generator_outlet", FnafModModBlocks.GENERATOR_OUTLET, GeneratorOutletBlockEntity::new);
	public static final RegistryObject<BlockEntityType<CelebrateFunTileEntity>> CELEBRATE_FUN = REGISTRY.register("celebrate_fun", () -> BlockEntityType.Builder.of(CelebrateFunTileEntity::new, FnafModModBlocks.CELEBRATE_FUN.get()).build(null));
	public static final RegistryObject<BlockEntityType<ModularLightTileEntity>> MODULAR_LIGHT = REGISTRY.register("modular_light", () -> BlockEntityType.Builder.of(ModularLightTileEntity::new, FnafModModBlocks.MODULAR_LIGHT.get()).build(null));
	public static final RegistryObject<BlockEntityType<LightSwitchTileEntity>> LIGHT_SWITCH = REGISTRY.register("light_switch", () -> BlockEntityType.Builder.of(LightSwitchTileEntity::new, FnafModModBlocks.LIGHT_SWITCH.get()).build(null));
	public static final RegistryObject<BlockEntityType<DisplayMonitorTileEntity>> DISPLAY_MONITOR = REGISTRY.register("display_monitor",
			() -> BlockEntityType.Builder.of(DisplayMonitorTileEntity::new, FnafModModBlocks.DISPLAY_MONITOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DoorButtonTileEntity>> DOOR_BUTTON = REGISTRY.register("door_button", () -> BlockEntityType.Builder.of(DoorButtonTileEntity::new, FnafModModBlocks.DOOR_BUTTON.get()).build(null));
	public static final RegistryObject<BlockEntityType<GenPercentTileEntity>> GEN_PERCENT = REGISTRY.register("gen_percent", () -> BlockEntityType.Builder.of(GenPercentTileEntity::new, FnafModModBlocks.GEN_PERCENT.get()).build(null));
	public static final RegistryObject<BlockEntityType<ProtonsPlushRatTileEntity>> PROTONS_PLUSH_RAT = REGISTRY.register("protons_plush_rat",
			() -> BlockEntityType.Builder.of(ProtonsPlushRatTileEntity::new, FnafModModBlocks.PROTONS_PLUSH_RAT.get()).build(null));
	public static final RegistryObject<BlockEntityType<LightButtonTileEntity>> LIGHT_BUTTON = REGISTRY.register("light_button", () -> BlockEntityType.Builder.of(LightButtonTileEntity::new, FnafModModBlocks.LIGHT_BUTTON.get()).build(null));
	public static final RegistryObject<BlockEntityType<DoorButtonFlatTileEntity>> DOOR_BUTTON_FLAT = REGISTRY.register("door_button_flat",
			() -> BlockEntityType.Builder.of(DoorButtonFlatTileEntity::new, FnafModModBlocks.DOOR_BUTTON_FLAT.get()).build(null));
	public static final RegistryObject<BlockEntityType<LightButtonFlatTileEntity>> LIGHT_BUTTON_FLAT = REGISTRY.register("light_button_flat",
			() -> BlockEntityType.Builder.of(LightButtonFlatTileEntity::new, FnafModModBlocks.LIGHT_BUTTON_FLAT.get()).build(null));
	public static final RegistryObject<BlockEntityType<ModularLightFlatTileEntity>> MODULAR_LIGHT_FLAT = REGISTRY.register("modular_light_flat",
			() -> BlockEntityType.Builder.of(ModularLightFlatTileEntity::new, FnafModModBlocks.MODULAR_LIGHT_FLAT.get()).build(null));

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
