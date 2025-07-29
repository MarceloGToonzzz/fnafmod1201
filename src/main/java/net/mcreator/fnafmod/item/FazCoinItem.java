
package net.mcreator.fnafmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FazCoinItem extends Item {
	public FazCoinItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
