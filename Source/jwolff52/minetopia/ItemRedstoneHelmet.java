package jwolff52.minetopia;

import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class ItemRedstoneHelmet extends ItemArmor implements IArmorTextureProvider{

	public ItemRedstoneHelmet(int par1,EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
	}
	
	public String getArmorTextureFile(ItemStack par1){
		if(par1.itemID==Minetopia.redHelmet.shiftedIndex||par1.itemID==Minetopia.redChestplate.shiftedIndex||par1.itemID==Minetopia.redBoots.shiftedIndex){
			return "/armor/redstone_1.png";
		}
		if(par1.itemID==Minetopia.redLeggings.shiftedIndex){
			return "/armor/redstone_2.png";
		}
		else{
			return "/armor/redstone_2.png";
		}
	}
	
	public String getTextureFile(){
		return "/SpriteSheet.png";
	}

}
