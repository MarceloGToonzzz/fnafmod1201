
package net.mcreator.fnafmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class OurLittleHorrorStoryItem extends RecordItem {
	public OurLittleHorrorStoryItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_mod:ourlittlehorrorstory")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 6220);
	}
}
