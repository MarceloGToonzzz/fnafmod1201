package net.mcreator.fnafmod.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.fnafmod.init.FnafModModBlockEntities;
import net.mcreator.fnafmod.block.renderer.WhiteClothTableTileRenderer;
import net.mcreator.fnafmod.block.renderer.VassDollTileRenderer;
import net.mcreator.fnafmod.block.renderer.UnWitheredFreddyHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.UnWitheredFoxyHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.UnWitheredChicaHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.UnWitheredBonnieHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.TrashCanTileRenderer;
import net.mcreator.fnafmod.block.renderer.ToyFreddySignOnTileRenderer;
import net.mcreator.fnafmod.block.renderer.ToyFreddySignOffTileRenderer;
import net.mcreator.fnafmod.block.renderer.StageLightRedTileRenderer;
import net.mcreator.fnafmod.block.renderer.StageLightRedOnTileRenderer;
import net.mcreator.fnafmod.block.renderer.StageLightPinkTileRenderer;
import net.mcreator.fnafmod.block.renderer.StageLightPinkOnTileRenderer;
import net.mcreator.fnafmod.block.renderer.StageLightOrangeTileRenderer;
import net.mcreator.fnafmod.block.renderer.StageLightOrangeOnTileRenderer;
import net.mcreator.fnafmod.block.renderer.StageLightGreenTileRenderer;
import net.mcreator.fnafmod.block.renderer.StageLightGreenOnTileRenderer;
import net.mcreator.fnafmod.block.renderer.SpringBonnieHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.SpringBonnieDecorTileRenderer;
import net.mcreator.fnafmod.block.renderer.ShelfTileRenderer;
import net.mcreator.fnafmod.block.renderer.RetroFreddySignTileRenderer;
import net.mcreator.fnafmod.block.renderer.RetroFreddySignOnTileRenderer;
import net.mcreator.fnafmod.block.renderer.PurpleStripeTableTileRenderer;
import net.mcreator.fnafmod.block.renderer.PurpleStarTableTileRenderer;
import net.mcreator.fnafmod.block.renderer.MeshTrashCanTileRenderer;
import net.mcreator.fnafmod.block.renderer.FreddySignOnTileRenderer;
import net.mcreator.fnafmod.block.renderer.FreddySignOffTileRenderer;
import net.mcreator.fnafmod.block.renderer.FreddyHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.FredbearSignTileRenderer;
import net.mcreator.fnafmod.block.renderer.FredbearHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.FoxyHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.FoxyHeadDecorationTileRenderer;
import net.mcreator.fnafmod.block.renderer.EndoBlockTileRenderer;
import net.mcreator.fnafmod.block.renderer.ConnectingTableTileRenderer;
import net.mcreator.fnafmod.block.renderer.ChicaHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.ChicaHeadDecorationTileRenderer;
import net.mcreator.fnafmod.block.renderer.CenteredFreddySignTileRenderer;
import net.mcreator.fnafmod.block.renderer.CenteredFreddySignOnTileRenderer;
import net.mcreator.fnafmod.block.renderer.BonnieHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.BephDollTileRenderer;
import net.mcreator.fnafmod.FnafModMod;

@Mod.EventBusSubscriber(modid = FnafModMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(FnafModModBlockEntities.MESH_TRASH_CAN.get(), context -> new MeshTrashCanTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.TRASH_CAN.get(), context -> new TrashCanTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.FREDDY_HEAD.get(), context -> new FreddyHeadTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.BONNIE_HEAD.get(), context -> new BonnieHeadTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.CHICA_HEAD.get(), context -> new ChicaHeadTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.FOXY_HEAD.get(), context -> new FoxyHeadTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.FREDBEAR_HEAD.get(), context -> new FredbearHeadTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.SPRING_BONNIE_HEAD.get(), context -> new SpringBonnieHeadTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.ENDO_BLOCK.get(), context -> new EndoBlockTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.UN_WITHERED_FREDDY_HEAD.get(), context -> new UnWitheredFreddyHeadTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.UN_WITHERED_BONNIE_HEAD.get(), context -> new UnWitheredBonnieHeadTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.UN_WITHERED_FOXY_HEAD.get(), context -> new UnWitheredFoxyHeadTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.UN_WITHERED_CHICA_HEAD.get(), context -> new UnWitheredChicaHeadTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.SHELF.get(), context -> new ShelfTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.CHICA_HEAD_DECORATION.get(), context -> new ChicaHeadDecorationTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.FOXY_HEAD_DECORATION.get(), context -> new FoxyHeadDecorationTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.FREDDY_SIGN_OFF.get(), context -> new FreddySignOffTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.FREDDY_SIGN_ON.get(), context -> new FreddySignOnTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.VASS_DOLL.get(), context -> new VassDollTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.CENTERED_FREDDY_SIGN.get(), context -> new CenteredFreddySignTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.CENTERED_FREDDY_SIGN_ON.get(), context -> new CenteredFreddySignOnTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.BEPH_DOLL.get(), context -> new BephDollTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.TOY_FREDDY_SIGN_OFF.get(), context -> new ToyFreddySignOffTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.TOY_FREDDY_SIGN_ON.get(), context -> new ToyFreddySignOnTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.RETRO_FREDDY_SIGN.get(), context -> new RetroFreddySignTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.RETRO_FREDDY_SIGN_ON.get(), context -> new RetroFreddySignOnTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.SPRING_BONNIE_DECOR.get(), context -> new SpringBonnieDecorTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.FREDBEAR_SIGN.get(), context -> new FredbearSignTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.STAGE_LIGHT_GREEN.get(), context -> new StageLightGreenTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.STAGE_LIGHT_PINK.get(), context -> new StageLightPinkTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.STAGE_LIGHT_ORANGE.get(), context -> new StageLightOrangeTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.STAGE_LIGHT_RED.get(), context -> new StageLightRedTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.STAGE_LIGHT_GREEN_ON.get(), context -> new StageLightGreenOnTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.STAGE_LIGHT_PINK_ON.get(), context -> new StageLightPinkOnTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.STAGE_LIGHT_ORANGE_ON.get(), context -> new StageLightOrangeOnTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.STAGE_LIGHT_RED_ON.get(), context -> new StageLightRedOnTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.PURPLE_STRIPE_TABLE.get(), context -> new PurpleStripeTableTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.PURPLE_STAR_TABLE.get(), context -> new PurpleStarTableTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.WHITE_CLOTH_TABLE.get(), context -> new WhiteClothTableTileRenderer());
		event.registerBlockEntityRenderer(FnafModModBlockEntities.CONNECTING_TABLE.get(), context -> new ConnectingTableTileRenderer());
	}
}
