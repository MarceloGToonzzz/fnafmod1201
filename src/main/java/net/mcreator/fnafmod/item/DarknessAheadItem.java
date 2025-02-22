
package net.mcreator.fnafmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class DarknessAheadItem extends RecordItem {
	public DarknessAheadItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_mod:darkness_ahead")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 1960);
	}
}
