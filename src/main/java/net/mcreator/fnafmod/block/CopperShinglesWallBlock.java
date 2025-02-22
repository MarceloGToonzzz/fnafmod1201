
package net.mcreator.fnafmod.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class CopperShinglesWallBlock extends WallBlock {
	public CopperShinglesWallBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.COPPER).strength(1.5f, 10f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
