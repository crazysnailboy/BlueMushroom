package net.crazysnailboy.mods.bluemushroom.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockHugeMushroom extends ItemBlock
{

	public ItemBlockHugeMushroom(Block block)
	{
		super(block);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int meta)
	{
		return meta;
	}

	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return this.block.getUnlocalizedName();
	}

}
