
package net.mcreator.fnafmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class PizzaSliceItem extends Item {
	public PizzaSliceItem() {
		super(new Item.Properties().stacksTo(8).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(6).saturationMod(1f).meat().build()));
	}
}
