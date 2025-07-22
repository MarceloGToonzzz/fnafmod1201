
package net.mcreator.fnafmod.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class FazeerramicsControlPanelBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public FazeerramicsControlPanelBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.ANVIL).strength(6f, 5f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(0, 0, 0, 16, 32, 16), box(0, 13, 16, 16, 32, 19), box(5, 19, 16, 11, 22, 18), box(2, 23, 16, 7, 28, 18), box(9, 23, 16, 14, 28, 18));
			case NORTH -> Shapes.or(box(0, 0, 0, 16, 32, 16), box(0, 13, -3, 16, 32, 0), box(5, 19, -2, 11, 22, 0), box(9, 23, -2, 14, 28, 0), box(2, 23, -2, 7, 28, 0));
			case EAST -> Shapes.or(box(0, 0, 0, 16, 32, 16), box(16, 13, 0, 19, 32, 16), box(16, 19, 5, 18, 22, 11), box(16, 23, 9, 18, 28, 14), box(16, 23, 2, 18, 28, 7));
			case WEST -> Shapes.or(box(0, 0, 0, 16, 32, 16), box(-3, 13, 0, 0, 32, 16), box(-2, 19, 5, 0, 22, 11), box(-2, 23, 2, 0, 28, 7), box(-2, 23, 9, 0, 28, 14));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}
}
