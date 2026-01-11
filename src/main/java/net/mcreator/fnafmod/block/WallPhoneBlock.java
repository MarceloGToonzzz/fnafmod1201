
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

public class WallPhoneBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public WallPhoneBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(2.5, 1, 0, 13.5, 15, 2), box(3.5, 15, 0, 6.5, 17, 2), box(9.5, 15, 0, 12.5, 17, 2), box(4, 3, 2, 7, 13, 4), box(5, -2, 0, 6, 3, 3));
			case NORTH -> Shapes.or(box(2.5, 1, 14, 13.5, 15, 16), box(9.5, 15, 14, 12.5, 17, 16), box(3.5, 15, 14, 6.5, 17, 16), box(9, 3, 12, 12, 13, 14), box(10, -2, 13, 11, 3, 16));
			case EAST -> Shapes.or(box(0, 1, 2.5, 2, 15, 13.5), box(0, 15, 9.5, 2, 17, 12.5), box(0, 15, 3.5, 2, 17, 6.5), box(2, 3, 9, 4, 13, 12), box(0, -2, 10, 3, 3, 11));
			case WEST -> Shapes.or(box(14, 1, 2.5, 16, 15, 13.5), box(14, 15, 3.5, 16, 17, 6.5), box(14, 15, 9.5, 16, 17, 12.5), box(12, 3, 4, 14, 13, 7), box(13, -2, 5, 16, 3, 6));
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
