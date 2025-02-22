
package net.mcreator.fnafmod.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class CopperShinglesSlabBlock extends SlabBlock {
	public CopperShinglesSlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.COPPER).strength(1.5f, 10f).requiresCorrectToolForDrops().dynamicShape());
	}
}
