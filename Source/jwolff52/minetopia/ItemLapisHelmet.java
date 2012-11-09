package jwolff52.minetopia;

import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class ItemLapisHelmet extends ItemArmor implements IArmorTextureProvider{

	public ItemLapisHelmet(int par1,EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
	}
	
	public String getArmorTextureFile(ItemStack par1){
		if(par1.itemID==Minetopia.lapHelmet.shiftedIndex||par1.itemID==Minetopia.lapChestplate.shiftedIndex||par1.itemID==Minetopia.lapBoots.shiftedIndex){
			return "/armor/lapis_1.png";
		}
		if(par1.itemID==Minetopia.lapLeggings.shiftedIndex){
			return "/armor/lapis_2.png";
		}
		else{
			return "/armor/lapis_2.png";
		}
	}
	
	public String getTextureFile(){
		return "/SpriteSheet.png";
	}

}
