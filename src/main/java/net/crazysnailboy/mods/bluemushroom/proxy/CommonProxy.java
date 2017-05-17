package net.crazysnailboy.mods.bluemushroom.proxy;

import net.crazysnailboy.mods.bluemushroom.init.ModBlocks;
import net.crazysnailboy.mods.bluemushroom.init.ModPotionTypes;

public class CommonProxy
{

	public void preInit()
	{
		registerBlocks();
		registerPotionTypes();
	}

	public void init()
	{
		registerCraftingRecipes();
	}

	public void postInit()
	{
	}


	private void registerBlocks()
	{
		ModBlocks.registerBlocks();
	}

	private void registerCraftingRecipes()
	{
		ModBlocks.registerCraftingRecipes();
		ModPotionTypes.registerBrewingRecipes();
	}

	private void registerPotionTypes()
	{
		ModPotionTypes.registerPotionTypes();
	}

}
