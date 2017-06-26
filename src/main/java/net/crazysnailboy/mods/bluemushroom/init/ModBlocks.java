package net.crazysnailboy.mods.bluemushroom.init;

import net.crazysnailboy.mods.bluemushroom.block.BlockMushroom;
import net.crazysnailboy.mods.bluemushroom.item.ItemBlockHugeMushroom;
import net.crazysnailboy.mods.bluemushroom.item.ItemBlockMushroom;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockHugeMushroom;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;


public class ModBlocks
{

	public static final BlockBush BLUE_MUSHROOM = (BlockMushroom)new BlockMushroom().setRegistryName("blue_mushroom").setUnlocalizedName("blueMushroom");

	public static final Block BLUE_MUSHROOM_BLOCK = new BlockHugeMushroom(Material.WOOD, MapColor.LIGHT_BLUE, BLUE_MUSHROOM).setRegistryName("blue_mushroom_block").setUnlocalizedName("blueMushroom");


	public static void registerBlocks()
	{
		ForgeRegistries.BLOCKS.register(BLUE_MUSHROOM);
		ForgeRegistries.ITEMS.register(new ItemBlockMushroom(BLUE_MUSHROOM).setRegistryName(BLUE_MUSHROOM.getRegistryName()));

		ForgeRegistries.BLOCKS.register(BLUE_MUSHROOM_BLOCK);
		ForgeRegistries.ITEMS.register(new ItemBlockHugeMushroom(BLUE_MUSHROOM_BLOCK).setRegistryName(BLUE_MUSHROOM_BLOCK.getRegistryName()));
	}


	public static void registerInventoryModels()
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(BLUE_MUSHROOM), 0, new ModelResourceLocation(BLUE_MUSHROOM.getRegistryName(), "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(BLUE_MUSHROOM_BLOCK), 0, new ModelResourceLocation(BLUE_MUSHROOM_BLOCK.getRegistryName(), "inventory"));
	}

}
