
package net.mcreator.fnafmod.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class StageWoodSlabBlock extends SlabBlock {
	public StageWoodSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2f, 3f).dynamicShape());
	}
}
