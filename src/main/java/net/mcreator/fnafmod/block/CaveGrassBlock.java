
package net.mcreator.fnafmod.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class CaveGrassBlock extends Block {
	public CaveGrassBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(0.6f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
