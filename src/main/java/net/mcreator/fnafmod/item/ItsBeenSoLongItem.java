
package net.mcreator.fnafmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class ItsBeenSoLongItem extends RecordItem {
	public ItsBeenSoLongItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_mod:itsbeensolong")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3460);
	}
}
