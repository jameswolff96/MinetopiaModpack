package jwolff52.minetopia;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
public class BlockMinetopia extends Block{

	public BlockMinetopia(int par1, int par2) {
		super(par1, par2, Material.rock);
		this.setCreativeTab(CreativeTabs.tabDecorations);
	}
	
	public String getTextureFile(){
		return "/SpriteSheet.png";
	}

	
}
