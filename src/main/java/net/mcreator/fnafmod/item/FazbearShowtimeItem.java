
package net.mcreator.fnafmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class FazbearShowtimeItem extends RecordItem {
	public FazbearShowtimeItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_mod:showtimefunky")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 100);
	}
}
