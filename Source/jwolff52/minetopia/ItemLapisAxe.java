package jwolff52.minetopia;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemAxe;

public class ItemLapisAxe extends ItemAxe {

	public ItemLapisAxe(int i, EnumToolMaterial material){
		super(i, material);
		maxStackSize = 1;
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	
	public String getTextureFile(){
		return "/SpriteSheet.png";
	}
}