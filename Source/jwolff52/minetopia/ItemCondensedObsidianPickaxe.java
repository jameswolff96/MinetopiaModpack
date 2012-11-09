package jwolff52.minetopia;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemPickaxe;
import net.minecraft.src.Material;

public class ItemCondensedObsidianPickaxe extends ItemPickaxe {

	public ItemCondensedObsidianPickaxe(int i, EnumToolMaterial material){
		super(i, material);
		maxStackSize = 1;
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	
	public String getTextureFile(){
		return "/SpriteSheet.png";
	}
	
	public boolean canHarvestBlock(Block par1Block){
		return par1Block == jwolff52.minetopia.Minetopia.CondensedObsidanBlock ? this.toolMaterial.getHarvestLevel() == 4 : (par1Block == Block.obsidian ? this.toolMaterial.getHarvestLevel() >= 3 : (par1Block != Block.blockDiamond && par1Block != Block.oreDiamond ? (par1Block == Block.oreEmerald ? this.toolMaterial.getHarvestLevel() >= 2 : (par1Block != Block.blockGold && par1Block != Block.oreGold ? (par1Block != Block.blockSteel && par1Block != Block.oreIron ? (par1Block != Block.blockLapis && par1Block != Block.oreLapis ? (par1Block != Block.oreRedstone && par1Block != Block.oreRedstoneGlowing ? (par1Block.blockMaterial == Material.rock ? true : par1Block.blockMaterial == Material.iron) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 2)) : this.toolMaterial.getHarvestLevel() >= 2));
	}
}