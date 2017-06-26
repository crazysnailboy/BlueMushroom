package net.crazysnailboy.mods.bluemushroom.proxy;

import net.crazysnailboy.mods.bluemushroom.init.ModBlocks;
import net.crazysnailboy.mods.bluemushroom.init.ModPotionTypes;
import net.crazysnailboy.mods.bluemushroom.world.gen.ModWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class CommonProxy
{

	public void preInit()
	{
		registerBlocks();
		registerPotionTypes();
	}

	public void init()
	{
		registerBrewingRecipes();
		registerWorldGenerators();
	}

	public void postInit()
	{
	}


	private void registerBlocks()
	{
		ModBlocks.registerBlocks();
	}

	private void registerBrewingRecipes()
	{
		ModPotionTypes.registerBrewingRecipes();
	}

	private void registerPotionTypes()
	{
		ModPotionTypes.registerPotionTypes();
	}

	private void registerWorldGenerators()
	{
		GameRegistry.registerWorldGenerator(new ModWorldGenerator(), 0);
	}

}
