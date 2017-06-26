package net.crazysnailboy.mods.bluemushroom;

import net.crazysnailboy.mods.bluemushroom.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = BlueMushroomMod.MODID, name = BlueMushroomMod.NAME, version = BlueMushroomMod.VERSION)
public class BlueMushroomMod
{

	public static final String MODID = "bluemushroom";
	public static final String NAME = "Don't Eat the Blue Mushrooms";
	public static final String VERSION = "${version}";

	private static final String CLIENT_PROXY_CLASS = "net.crazysnailboy.mods.bluemushroom.proxy.ClientProxy";
	private static final String SERVER_PROXY_CLASS = "net.crazysnailboy.mods.bluemushroom.proxy.CommonProxy";


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
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit();
	}

}
