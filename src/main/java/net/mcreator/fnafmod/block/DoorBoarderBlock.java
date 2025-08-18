
package net.mcreator.fnafmod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.MenuProvider;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.procedures.DoorBoarderBlockChangeProcedure;
import net.mcreator.fnafmod.block.entity.DoorBoarderBlockEntity;

public class DoorBoarderBlock extends Block implements EntityBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 6);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public DoorBoarderBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.5f, 6f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				if (s.getValue(BLOCKSTATE) == 2)
					return 0;
				if (s.getValue(BLOCKSTATE) == 3)
					return 0;
				if (s.getValue(BLOCKSTATE) == 4)
					return 0;
				if (s.getValue(BLOCKSTATE) == 5)
					return 0;
				if (s.getValue(BLOCKSTATE) == 6)
					return 0;
				return 0;
			}
		}.getLightLevel())).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
		if (state.getValue(BLOCKSTATE) == 1) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, 0, 0, 2, 14, 16), box(0, 14, 0, 16, 16, 16));
				case NORTH -> Shapes.or(box(14, 0, 0, 16, 14, 16), box(0, 14, 0, 16, 16, 16));
				case EAST -> Shapes.or(box(0, 0, 14, 16, 14, 16), box(0, 14, 0, 16, 16, 16));
				case WEST -> Shapes.or(box(0, 0, 0, 16, 14, 2), box(0, 14, 0, 16, 16, 16));
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 14, 0, 16, 16, 16);
				case NORTH -> box(0, 14, 0, 16, 16, 16);
				case EAST -> box(0, 14, 0, 16, 16, 16);
				case WEST -> box(0, 14, 0, 16, 16, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(14, 0, 0, 16, 14, 16), box(0, 14, 0, 16, 16, 16));
				case NORTH -> Shapes.or(box(0, 0, 0, 2, 14, 16), box(0, 14, 0, 16, 16, 16));
				case EAST -> Shapes.or(box(0, 0, 0, 16, 14, 2), box(0, 14, 0, 16, 16, 16));
				case WEST -> Shapes.or(box(0, 0, 14, 16, 14, 16), box(0, 14, 0, 16, 16, 16));
			};
		}
		if (state.getValue(BLOCKSTATE) == 4) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, 0, 0, 2, 14, 16), box(0, 14, 0, 2, 16, 16));
				case NORTH -> Shapes.or(box(14, 0, 0, 16, 14, 16), box(14, 14, 0, 16, 16, 16));
				case EAST -> Shapes.or(box(0, 0, 14, 16, 14, 16), box(0, 14, 14, 16, 16, 16));
				case WEST -> Shapes.or(box(0, 0, 0, 16, 14, 2), box(0, 14, 0, 16, 16, 2));
			};
		}
		if (state.getValue(BLOCKSTATE) == 5) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(14, 0, 0, 16, 14, 16), box(14, 14, 0, 16, 16, 16));
				case NORTH -> Shapes.or(box(0, 0, 0, 2, 14, 16), box(0, 14, 0, 2, 16, 16));
				case EAST -> Shapes.or(box(0, 0, 0, 16, 14, 2), box(0, 14, 0, 16, 16, 2));
				case WEST -> Shapes.or(box(0, 0, 14, 16, 14, 16), box(0, 14, 14, 16, 16, 16));
			};
		}
		if (state.getValue(BLOCKSTATE) == 6) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(14, 0, 0, 16, 16, 16), box(0, 0, 0, 2, 16, 16));
				case NORTH -> Shapes.or(box(0, 0, 0, 2, 16, 16), box(14, 0, 0, 16, 16, 16));
				case EAST -> Shapes.or(box(0, 0, 0, 16, 16, 2), box(0, 0, 14, 16, 16, 16));
				case WEST -> Shapes.or(box(0, 0, 14, 16, 16, 16), box(0, 0, 0, 16, 16, 2));
			};
		}
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(14, 0, 0, 16, 14, 16), box(0, 0, 0, 2, 14, 16), box(0, 14, 0, 16, 16, 16));
			case NORTH -> Shapes.or(box(0, 0, 0, 2, 14, 16), box(14, 0, 0, 16, 14, 16), box(0, 14, 0, 16, 16, 16));
			case EAST -> Shapes.or(box(0, 0, 0, 16, 14, 2), box(0, 0, 14, 16, 14, 16), box(0, 14, 0, 16, 16, 16));
			case WEST -> Shapes.or(box(0, 0, 14, 16, 14, 16), box(0, 0, 0, 16, 14, 2), box(0, 14, 0, 16, 16, 16));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, BLOCKSTATE);
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

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		DoorBoarderBlockChangeProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		DoorBoarderBlockChangeProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new DoorBoarderBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}
}
