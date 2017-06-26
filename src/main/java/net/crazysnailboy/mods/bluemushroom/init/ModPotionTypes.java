package net.crazysnailboy.mods.bluemushroom.init;

import net.minecraft.init.MobEffects;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;


public class ModPotionTypes
{

	public static final PotionType BLINDNESS = new PotionType("blindness", new PotionEffect[] { new PotionEffect(MobEffects.BLINDNESS, 3600) }).setRegistryName("blindness");


	public static void registerPotionTypes()
	{
		ForgeRegistries.POTION_TYPES.register(BLINDNESS);
	}

	public static void registerBrewingRecipes()
	{
		PotionHelper.addMix(PotionTypes.AWKWARD, Ingredient.fromItem(Item.getItemFromBlock(ModBlocks.BLUE_MUSHROOM)), BLINDNESS);
	}

}
