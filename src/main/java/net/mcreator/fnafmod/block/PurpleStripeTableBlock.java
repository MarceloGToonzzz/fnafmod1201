
package net.mcreator.fnafmod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.procedures.PurpleStripedTableCodeProcedure;
import net.mcreator.fnafmod.init.FnafModModBlockEntities;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Collections;

public class PurpleStripeTableBlock extends BaseEntityBlock implements EntityBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 16);
	public static final IntegerProperty ANIMATION = IntegerProperty.create("animation", 0, (int) 1);

	public PurpleStripeTableBlock() {
		super(BlockBehaviour.Properties.of()

				.sound(SoundType.WOOD).strength(1f, 10f).lightLevel(s -> (new Object() {
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
						if (s.getValue(BLOCKSTATE) == 7)
							return 0;
						if (s.getValue(BLOCKSTATE) == 8)
							return 0;
						if (s.getValue(BLOCKSTATE) == 9)
							return 0;
						if (s.getValue(BLOCKSTATE) == 10)
							return 0;
						if (s.getValue(BLOCKSTATE) == 11)
							return 0;
						if (s.getValue(BLOCKSTATE) == 12)
							return 0;
						if (s.getValue(BLOCKSTATE) == 13)
							return 0;
						if (s.getValue(BLOCKSTATE) == 14)
							return 0;
						if (s.getValue(BLOCKSTATE) == 15)
							return 0;
						if (s.getValue(BLOCKSTATE) == 16)
							return 0;
						return 0;
					}
				}.getLightLevel())).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public RenderShape getRenderShape(BlockState state) {
		return RenderShape.ENTITYBLOCK_ANIMATED;
	}

	@Nullable
	@Override
	public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
		return FnafModModBlockEntities.PURPLE_STRIPE_TABLE.get().create(blockPos, blockState);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {

		return box(0, 0, 0, 16, 16, 16);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(ANIMATION, BLOCKSTATE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState();
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		PurpleStripedTableCodeProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		PurpleStripedTableCodeProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
