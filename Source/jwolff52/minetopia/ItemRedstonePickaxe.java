package jwolff52.minetopia;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemPickaxe;

public class ItemRedstonePickaxe extends ItemPickaxe {

	public ItemRedstonePickaxe(int i, EnumToolMaterial material){
		super(i, material);
		maxStackSize = 1;
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	
	public String getTextureFile(){
		return "/SpriteSheet.png";
	}
}