package jwolff52.minetopia;

import net.minecraft.src.Item;
import net.minecraft.src.CreativeTabs;

public class ItemRedstoneMesh extends Item{

	protected ItemRedstoneMesh(int par1) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}
	
	public String getTextureFile(){
		return "/SpriteSheet.png";
	}

}
