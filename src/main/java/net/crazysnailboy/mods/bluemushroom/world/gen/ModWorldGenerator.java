package net.crazysnailboy.mods.bluemushroom.world.gen;

import java.util.Random;
import net.crazysnailboy.mods.bluemushroom.init.ModBlocks;
import net.crazysnailboy.mods.bluemushroom.world.gen.feature.WorldGenBigBlueMushroom;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeMushroomIsland;
import net.minecraft.world.biome.BiomeSwamp;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenBush;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;


public class ModWorldGenerator implements IWorldGenerator
{

	private BlockPos chunkPos = BlockPos.ORIGIN;

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		int blockX = chunkX * 16;
		int blockZ = chunkZ * 16;
		chunkPos = new BlockPos(blockX, 0, blockZ);

		switch (world.provider.getDimension())
		{
			case -1:
				generateNether(world, random, blockX, blockZ);
				break;
			case 0:
				generateOverworld(world, random, blockX, blockZ);
				break;
			case 1:
				generateEnd(world, random, blockX, blockZ);
				break;
		}
	}

	private void generateNether(World world, Random rand, int blockX, int blockZ)
	{
	}

	private void generateOverworld(World world, Random rand, int blockX, int blockZ)
	{
		WorldGenerator mushroomBlueGen = new WorldGenBush(ModBlocks.BLUE_MUSHROOM);
		WorldGenerator bigMushroomGen = new WorldGenBigBlueMushroom(ModBlocks.BLUE_MUSHROOM_BLOCK);

		Biome biome = world.getBiomeForCoordsBody(new BlockPos(blockX, 64, blockZ));
		if (biome instanceof BiomeSwamp)
		{
			int mushroomsPerChunk = 8;

			for (int l3 = 0; l3 < mushroomsPerChunk; ++l3)
			{
				if (rand.nextInt(4) == 0)
				{
					int i8 = rand.nextInt(16) + 8;
					int l11 = rand.nextInt(16) + 8;
					BlockPos blockpos2 = world.getHeight(this.chunkPos.add(i8, 0, l11));

					mushroomBlueGen.generate(world, rand, blockpos2);
				}
			}
			if (rand.nextInt(10) == 0)
			{
				int l6 = rand.nextInt(16) + 8;
				int k10 = rand.nextInt(16) + 8;
				bigMushroomGen.generate(world, rand, world.getHeight(this.chunkPos.add(l6, 0, k10)));
			}
		}
		else if (biome instanceof BiomeMushroomIsland)
		{
			int mushroomsPerChunk = 4;
			int bigMushroomsPerChunk = 1;

			for (int l3 = 0; l3 < mushroomsPerChunk; ++l3)
			{
				if (rand.nextInt(4) == 0)
				{
					int i8 = rand.nextInt(16) + 8;
					int l11 = rand.nextInt(16) + 8;
					BlockPos blockpos2 = world.getHeight(this.chunkPos.add(i8, 0, l11));

					System.out.println(blockpos2.toString());

					mushroomBlueGen.generate(world, rand, blockpos2);
				}
			}
			for (int k2 = 0; k2 < bigMushroomsPerChunk; ++k2)
			{
				int l6 = rand.nextInt(16) + 8;
				int k10 = rand.nextInt(16) + 8;
				bigMushroomGen.generate(world, rand, world.getHeight(this.chunkPos.add(l6, 0, k10)));
			}
		}
	}

	private void generateEnd(World world, Random rand, int blockX, int blockZ)
	{
	}

}
