
package net.mcreator.fnafmod.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class ChainFenceBlock extends IronBarsBlock {
	public ChainFenceBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().sound(SoundType.CHAIN).strength(0.8f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}
