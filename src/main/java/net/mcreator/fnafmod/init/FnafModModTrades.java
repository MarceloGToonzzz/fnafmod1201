
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.fnafmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class FnafModModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 8),

				new ItemStack(FnafModModItems.BATTERY.get()), 3, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == FnafModModVillagerProfessions.PRIZE_COUNTER_TELLER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 6),

					new ItemStack(FnafModModBlocks.FREDDY_PLUSHIE.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 6),

					new ItemStack(FnafModModBlocks.BONNIE_PLUSHIE.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 5),

					new ItemStack(FnafModModBlocks.CHICA_PLUSHIE.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 4),

					new ItemStack(FnafModModBlocks.FOXY_PLUSHIE.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 9),

					new ItemStack(FnafModModBlocks.TOY_FREDDY_PLUSHIE.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 7),

					new ItemStack(FnafModModBlocks.TOY_BONNIE_PLUSHIE.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 8),

					new ItemStack(FnafModModBlocks.TOY_CHICA_PLUSHIE.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 10),

					new ItemStack(FnafModModBlocks.TOY_FOXY_PLUSHIE.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 13),

					new ItemStack(FnafModModBlocks.FREDBEAR_PLUSHIE.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 13),

					new ItemStack(FnafModModBlocks.SPRING_BONNIE_PLUSHIE.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 10),

					new ItemStack(FnafModModBlocks.GOLDEN_FREDDY_PLUSHIE.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 14),

					new ItemStack(FnafModModBlocks.TOY_FREDDY_FIGURE.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 13),

					new ItemStack(FnafModModBlocks.TOY_BONNIE_FIGURE.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 11),

					new ItemStack(FnafModModBlocks.TOY_CHICA_FIGURE.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 13),

					new ItemStack(FnafModModBlocks.TOY_FOXY_FIGURE.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 9),

					new ItemStack(FnafModModBlocks.BB_FIGURE.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 12),

					new ItemStack(FnafModModBlocks.MARIONETTE_FIGURE.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 19),

					new ItemStack(FnafModModBlocks.BLACK_LIGHT_FREDDY_PLUSHIE.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 18),

					new ItemStack(FnafModModBlocks.BLACK_LIGHT_BONNIE_PLUSHIE.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 18),

					new ItemStack(FnafModModBlocks.BLACK_LIGHT_CHICA_PLUSHIE.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 16),

					new ItemStack(FnafModModBlocks.BLACK_LIGHT_FOXY_PLUSHIE.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 21),

					new ItemStack(FnafModModBlocks.BLACK_LIGHT_GOLDEN_FREDDY_PLUSH.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 22),

					new ItemStack(FnafModModBlocks.BLACK_LIGHT_FREDBEAR_PLUSH.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 21),

					new ItemStack(FnafModModBlocks.BLACK_LIGHT_SPRING_BONNIE_PLUSH.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 40),

					new ItemStack(FnafModModBlocks.SPRING_BONNIE_PLUSH.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 25),

					new ItemStack(FnafModModBlocks.VASS_DOLL.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 25),

					new ItemStack(FnafModModBlocks.CLOWNFUL_DOLL.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(FnafModModItems.FAZ_COIN.get(), 64),

					new ItemStack(FnafModModBlocks.FREDBEAR_PLUSH.get()), 10, 5, 0.05f));
		}
	}
}
