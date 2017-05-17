package net.crazysnailboy.mods.bluemushroom;

import net.crazysnailboy.mods.bluemushroom.proxy.CommonProxy;
import net.crazysnailboy.mods.bluemushroom.world.gen.ModWorldGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


@Mod(modid = BlueMushroomMod.MODID, name = BlueMushroomMod.NAME, version = BlueMushroomMod.VERSION)
public class BlueMushroomMod
{

	public static final String MODID = "bluemushroom";
	public static final String NAME = "Don't Eat the Blue Mushrooms";
	public static final String VERSION = "1.0";

	private static final String CLIENT_PROXY_CLASS = "net.crazysnailboy.mods.bluemushroom.proxy.ClientProxy";
	private static final String SERVER_PROXY_CLASS = "net.crazysnailboy.mods.bluemushroom.proxy.CommonProxy";



	@Instance(MODID)
	public static Object instance;

	@SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
	public static CommonProxy proxy;


	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init();
		GameRegistry.registerWorldGenerator(new ModWorldGenerator(), 0);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit();
	}

}
