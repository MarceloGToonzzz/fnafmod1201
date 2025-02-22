
package net.mcreator.fnafmod.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class MovieExteriorWallSlabBlock extends SlabBlock {
	public MovieExteriorWallSlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.GILDED_BLACKSTONE).strength(1.5f, 10f).requiresCorrectToolForDrops().dynamicShape());
	}
}
