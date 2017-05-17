package net.crazysnailboy.mods.bluemushroom.block;

import java.util.Random;
import net.crazysnailboy.mods.bluemushroom.init.ModBlocks;
import net.crazysnailboy.mods.bluemushroom.world.gen.feature.WorldGenBigBlueMushroom;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BlockMushroom extends net.minecraft.block.BlockMushroom
{
	public BlockMushroom()
	{
		super();
		this.setHardness(0.0F);
		this.setSoundType(SoundType.PLANT);
		this.setLightLevel(0.125F);
	}

	@Override
	public boolean generateBigMushroom(World worldIn, BlockPos pos, IBlockState state, Random rand)
	{
		worldIn.setBlockToAir(pos);
		WorldGenerator worldgenerator = null;

		worldgenerator = new WorldGenBigBlueMushroom(ModBlocks.BLUE_MUSHROOM_BLOCK);

		if (worldgenerator != null && worldgenerator.generate(worldIn, rand, pos))
		{
			return true;
		}
		else
		{
			worldIn.setBlockState(pos, state, 3);
			return false;
		}
	}

}
