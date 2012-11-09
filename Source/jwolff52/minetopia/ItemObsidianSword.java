package jwolff52.minetopia;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;
import net.minecraft.src.ItemSword;

public class ItemObsidianSword extends ItemSword {

	public ItemObsidianSword(int i, EnumToolMaterial material){
		super(i, material);
		maxStackSize = 1;
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	
	public String getTextureFile(){
		return "/SpriteSheet.png";
	}
}
