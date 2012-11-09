package jwolff52.minetopia;

import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class ItemObsidianHelmet extends ItemArmor implements IArmorTextureProvider{

	public ItemObsidianHelmet(int par1,EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
	}
	
	public String getArmorTextureFile(ItemStack par1){
		if(par1.itemID==Minetopia.obbyHelmet.shiftedIndex||par1.itemID==Minetopia.obbyChestplate.shiftedIndex||par1.itemID==Minetopia.obbyBoots.shiftedIndex){
			return "/armor/obsidian_1.png";
		}
		if(par1.itemID==Minetopia.obbyLeggings.shiftedIndex){
			return "/armor/obsidian_2.png";
		}
		else{
			return "/armor/obsidian_2.png";
		}
	}
	
	public String getTextureFile(){
		return "/SpriteSheet.png";
	}

}
