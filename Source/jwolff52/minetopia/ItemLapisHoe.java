package jwolff52.minetopia;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemHoe;

public class ItemLapisHoe extends ItemHoe {

	public ItemLapisHoe(int i, EnumToolMaterial material){
		super(i, material);
		maxStackSize = 1;
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	
	public String getTextureFile(){
		return "/SpriteSheet.png";
	}
}