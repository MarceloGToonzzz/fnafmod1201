
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

public class MiniPuppetDecorBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public MiniPuppetDecorBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.BAMBOO_WOOD).instabreak().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(6, 8, 6, 10, 13, 10), box(5, 9, 9, 6, 10, 10), box(10, 9, 9, 11, 10, 10), box(6.25, 7.85, 5.75, 9.75, 12.35, 10.25), box(6.5, 4, 7, 9.5, 8, 9), box(8.5, 0, 7.5, 9.5, 4, 8.5), box(5.5, 3, 7.5, 6.5, 8, 8.5));
			case NORTH -> Shapes.or(box(6, 8, 6, 10, 13, 10), box(10, 9, 6, 11, 10, 7), box(5, 9, 6, 6, 10, 7), box(6.25, 7.85, 5.75, 9.75, 12.35, 10.25), box(6.5, 4, 7, 9.5, 8, 9), box(6.5, 0, 7.5, 7.5, 4, 8.5), box(9.5, 3, 7.5, 10.5, 8, 8.5));
			case EAST -> Shapes.or(box(6, 8, 6, 10, 13, 10), box(9, 9, 10, 10, 10, 11), box(9, 9, 5, 10, 10, 6), box(5.75, 7.85, 6.25, 10.25, 12.35, 9.75), box(7, 4, 6.5, 9, 8, 9.5), box(7.5, 0, 6.5, 8.5, 4, 7.5), box(7.5, 3, 9.5, 8.5, 8, 10.5));
			case WEST -> Shapes.or(box(6, 8, 6, 10, 13, 10), box(6, 9, 5, 7, 10, 6), box(6, 9, 10, 7, 10, 11), box(5.75, 7.85, 6.25, 10.25, 12.35, 9.75), box(7, 4, 6.5, 9, 8, 9.5), box(7.5, 0, 8.5, 8.5, 4, 9.5), box(7.5, 3, 5.5, 8.5, 8, 6.5));
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
