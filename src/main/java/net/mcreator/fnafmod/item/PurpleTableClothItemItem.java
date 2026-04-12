
package net.mcreator.fnafmod.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.fnafmod.procedures.PurpleTableClothRightclickedOnBlockProcedure;

public class PurpleTableClothItemItem extends Item {
	public PurpleTableClothItemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		PurpleTableClothRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getLevel().getBlockState(context.getClickedPos()),
				context.getClickedFace(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
