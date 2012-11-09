package jwolff52.minetopia;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemAxe;

public class ItemRedstoneAxe extends ItemAxe {

	public ItemRedstoneAxe(int i, EnumToolMaterial material){
		super(i, material);
		maxStackSize = 1;
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	
	public String getTextureFile(){
		return "/SpriteSheet.png";
	}
}