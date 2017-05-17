package net.crazysnailboy.mods.bluemushroom.init;

import net.minecraft.init.MobEffects;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionType;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModPotionTypes
{
	public static final PotionType BLINDNESS = new PotionType("blindness", new PotionEffect[] { new PotionEffect(MobEffects.BLINDNESS, 3600) }).setRegistryName("blindness");


	public static void registerPotionTypes()
	{
		GameRegistry.register(BLINDNESS);
	}

	public static void registerBrewingRecipes()
	{
		PotionHelper.registerPotionTypeConversion(PotionTypes.AWKWARD, new PotionHelper.ItemPredicateInstance(Item.getItemFromBlock(ModBlocks.BLUE_MUSHROOM)), BLINDNESS);
	}

}
