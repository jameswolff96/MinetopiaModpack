package jwolff52.minetopia;

import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "MinetopiaMP", name="Minetopia Mod Pack!", version = "Alpha v0.02")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Minetopia{

	//Telling forge to create these
	public static net.minecraft.src.Block MinetopiaBlock;
	public static net.minecraft.src.Block CondensedObsidanBlock;
	public static net.minecraft.src.Item obbySword;
	public static net.minecraft.src.Item obbySpade;
	public static net.minecraft.src.Item obbyPickaxe;
	public static net.minecraft.src.Item obbyAxe;
	public static net.minecraft.src.Item obbyHoe;
	public static net.minecraft.src.Item conobbySword;
	public static net.minecraft.src.Item conobbySpade;
	public static net.minecraft.src.Item conobbyPickaxe;
	public static net.minecraft.src.Item conobbyAxe;
	public static net.minecraft.src.Item conobbyHoe;
	public static net.minecraft.src.Item redMesh;
	public static net.minecraft.src.Item lapSword;
	public static net.minecraft.src.Item lapSpade;
	public static net.minecraft.src.Item lapPickaxe;
	public static net.minecraft.src.Item lapAxe;
	public static net.minecraft.src.Item lapHoe;
	public static net.minecraft.src.Item redSword;
	public static net.minecraft.src.Item redSpade;
	public static net.minecraft.src.Item redPickaxe;
	public static net.minecraft.src.Item redAxe;
	public static net.minecraft.src.Item redHoe;
	public static net.minecraft.src.Item obbyHelmet;
	public static net.minecraft.src.Item obbyChestplate;
	public static net.minecraft.src.Item obbyLeggings;
	public static net.minecraft.src.Item obbyBoots;
	public static net.minecraft.src.Item lapHelmet;
	public static net.minecraft.src.Item lapChestplate;
	public static net.minecraft.src.Item lapLeggings;
	public static net.minecraft.src.Item lapBoots;
	public static net.minecraft.src.Item redHelmet;
	public static net.minecraft.src.Item redChestplate;
	public static net.minecraft.src.Item redLeggings;
	public static net.minecraft.src.Item redBoots;
	
	
	@SidedProxy(clientSide="jwolff52.minetopia.client.MinetopiaClientProxy", serverSide="jwolff52.minetopia.server.MinetopiaServerProxy")
	public static MinetopiaCommonProxy proxy;	
	
	//Tool Material
	
	static EnumToolMaterial EnumToolMaterialObsidian=EnumHelper.addToolMaterial("Obsidian",4, 2000,17.0F,8,28);
	static EnumToolMaterial EnumToolMaterialCondensedObsidian=EnumHelper.addToolMaterial("Condensed Obsidian",4, 99999,30.0F,40,30);
	static EnumToolMaterial EnumToolMaterialLapis=EnumHelper.addToolMaterial("Lapis",1, 131,4.0F,1,5);
	static EnumToolMaterial EnumToolMaterialRedstone=EnumHelper.addToolMaterial("Redstone",1, 120,3.0F,1,5);
	static EnumArmorMaterial EnumArmorMaterialObsidian=EnumHelper.addArmorMaterial("Obsidian",50, new int[]{5,10,8,5},10);
	static EnumArmorMaterial EnumArmorMaterialLapis=EnumHelper.addArmorMaterial("Lapis",15, new int[]{2,5,4,1},12);
	static EnumArmorMaterial EnumArmorMaterialRedstone=EnumHelper.addArmorMaterial("Redstone",15, new int[]{2,4,4,1},12);
	
	@Init
	public void load(FMLInitializationEvent event){
		
		//Declaring everything
		
		//Blocks
		MinetopiaBlock = new BlockMinetopia(230, 0).setHardness(5F).setResistance(5F).setBlockName("minetopia");
		CondensedObsidanBlock=new BlockCondensedObsidian(231, 15).setHardness(75.0F).setResistance(6000000.0F).setBlockName("Condensed Obsidian");
		
		//Items
		
		//Miscellaneous
		
		redMesh=new ItemRedstoneMesh(1032).setIconIndex(34).setItemName("Redstone Mesh");
		
		//Tools
		//Obsidian
		obbySword=new ItemObsidianSword(1000, EnumToolMaterialObsidian).setIconIndex(1).setItemName("Obsidian Sword");
		obbySpade=new ItemObsidianSpade(1001, EnumToolMaterialObsidian).setIconIndex(2).setItemName("Obsidian Spade");
		obbyPickaxe=new ItemObsidianPickaxe(1002, EnumToolMaterialObsidian).setIconIndex(3).setItemName("Obsidian Pickaxe");
		obbyAxe=new ItemObsidianAxe(1003, EnumToolMaterialObsidian).setIconIndex(4).setItemName("Obsidian Axe");
		obbyHoe=new ItemObsidianHoe(1004, EnumToolMaterialObsidian).setIconIndex(5).setItemName("Obsidian Hoe");
		
		//Condensed Obsidian
		conobbySword=new ItemCondensedObsidianSword(1005, EnumToolMaterialCondensedObsidian).setIconIndex(6).setItemName("Condensed Obsidian Sword");
		conobbySpade=new ItemCondensedObsidianSpade(1006, EnumToolMaterialCondensedObsidian).setIconIndex(7).setItemName("Condensed Obsidian Spade");
		conobbyPickaxe=new ItemCondensedObsidianPickaxe(1007, EnumToolMaterialCondensedObsidian).setIconIndex(8).setItemName("Condensed Obsidian Pickaxe");
		conobbyAxe=new ItemCondensedObsidianAxe(1008, EnumToolMaterialCondensedObsidian).setIconIndex(9).setItemName("Condensed Obsidian Axe");
		conobbyHoe=new ItemCondensedObsidianHoe(1009, EnumToolMaterialCondensedObsidian).setIconIndex(10).setItemName("Condensed Obsidian Hoe");
		
		//Lapis
		lapSword=new ItemLapisSword(1014, EnumToolMaterialLapis).setIconIndex(16).setItemName("Lapis Sword");
		lapSpade=new ItemLapisSpade(1015, EnumToolMaterialLapis).setIconIndex(17).setItemName("Lapis Spade");
		lapPickaxe=new ItemLapisPickaxe(1016, EnumToolMaterialLapis).setIconIndex(18).setItemName("Lapis Pickaxe");
		lapAxe=new ItemLapisAxe(1017, EnumToolMaterialLapis).setIconIndex(19).setItemName("Lapis Axe");
		lapHoe=new ItemLapisHoe(1018, EnumToolMaterialLapis).setIconIndex(20).setItemName("Lapis Hoe");
		
		//Redstone
		redSword=new ItemRedstoneSword(1019, EnumToolMaterialRedstone).setIconIndex(21).setItemName("Redstone Sword");
		redSpade=new ItemRedstoneSpade(1020, EnumToolMaterialRedstone).setIconIndex(22).setItemName("Redstone Spade");
		redPickaxe=new ItemRedstonePickaxe(1021, EnumToolMaterialRedstone).setIconIndex(23).setItemName("Redstone Pickaxe");
		redAxe=new ItemRedstoneAxe(1022, EnumToolMaterialRedstone).setIconIndex(24).setItemName("Redstone Axe");
		redHoe=new ItemRedstoneHoe(1023, EnumToolMaterialRedstone).setIconIndex(25).setItemName("Redstone Hoe");
		
		//Armor
		//Lapis
		lapHelmet=new ItemLapisHelmet(1024, EnumArmorMaterialLapis, ModLoader.addArmor("Lapis"), 0).setIconIndex(26).setItemName("Lapis Helmet");
		lapChestplate=new ItemLapisChestplate(1025, EnumArmorMaterialLapis, ModLoader.addArmor("Lapis"), 1).setIconIndex(27).setItemName("Lapis Chestplate");
		lapLeggings=new ItemLapisLeggings(1026, EnumArmorMaterialLapis, ModLoader.addArmor("Lapis"), 2).setIconIndex(28).setItemName("Lapis Leggings");
		lapBoots=new ItemLapisBoots(1027, EnumArmorMaterialLapis, ModLoader.addArmor("Lapis"), 3).setIconIndex(29).setItemName("Lapis Boots");
		
		//Redstone
		redHelmet=new ItemRedstoneHelmet(1028, EnumArmorMaterialRedstone, ModLoader.addArmor("Redstone"), 0).setIconIndex(30).setItemName("Redstone Helmet");
		redChestplate=new ItemRedstoneChestplate(1029, EnumArmorMaterialRedstone, ModLoader.addArmor("Redstone"), 1).setIconIndex(31).setItemName("Redstone Chestplate");
		redLeggings=new ItemRedstoneLeggings(1030, EnumArmorMaterialRedstone, ModLoader.addArmor("Redstone"), 2).setIconIndex(32).setItemName("Redstone Leggings");
		redBoots=new ItemRedtoneBoots(1031, EnumArmorMaterialRedstone, ModLoader.addArmor("Redstone"), 3).setIconIndex(33).setItemName("Redstone Boots");
		
		//Obsidian
		obbyHelmet=new ItemObsidianHelmet(1010, EnumArmorMaterialObsidian, ModLoader.addArmor("Obsidian"), 0).setIconIndex(11).setItemName("Obsidian Helmet");
		obbyChestplate=new ItemObsidianChestplate(1011, EnumArmorMaterialObsidian, ModLoader.addArmor("Obsidian"), 1).setIconIndex(12).setItemName("Obsidian Chestplate");
		obbyLeggings=new ItemObsidianLeggings(1012, EnumArmorMaterialObsidian, ModLoader.addArmor("Obsidian"), 2).setIconIndex(13).setItemName("Obsidian Leggings");
		obbyBoots=new ItemObsidianBoots(1013, EnumArmorMaterialObsidian, ModLoader.addArmor("Obsidian"), 3).setIconIndex(14).setItemName("Obsidian Boots");
		
		//Register Stuff
		GameRegistry.registerBlock(MinetopiaBlock);
		GameRegistry.registerBlock(CondensedObsidanBlock);
		
		//Naming
		LanguageRegistry.addName(MinetopiaBlock, "Minetopia Block");
		LanguageRegistry.addName(CondensedObsidanBlock, "Condensed Obsidian");
		LanguageRegistry.addName(redMesh,  "Redstone Mesh");
		LanguageRegistry.addName(obbySword, "Obsidian Sword");
		LanguageRegistry.addName(obbySpade, "Obsidian Shovel");
		LanguageRegistry.addName(obbyPickaxe, "Obsidian Pickaxe");
		LanguageRegistry.addName(obbyAxe, "Obsidian Axe");
		LanguageRegistry.addName(obbyHoe, "Obsidian Hoe");
		LanguageRegistry.addName(conobbySword, "Condensed Obsidian Sword");
		LanguageRegistry.addName(conobbySpade, "Condensed Obsidian Shovel");
		LanguageRegistry.addName(conobbyPickaxe, "Condensed Obsidian Pickaxe");
		LanguageRegistry.addName(conobbyAxe, "Condensed Obsidian Axe");
		LanguageRegistry.addName(conobbyHoe, "Condensed Obsidian Hoe");
		LanguageRegistry.addName(lapSword, "Lapis Sword");
		LanguageRegistry.addName(lapSpade, "Lapis Shovel");
		LanguageRegistry.addName(lapPickaxe, "Lapis Pickaxe");
		LanguageRegistry.addName(lapAxe, "Lapis Axe");
		LanguageRegistry.addName(lapHoe, "Lapis Hoe");
		LanguageRegistry.addName(redSword, "Rdstone Sword");
		LanguageRegistry.addName(redSpade, "Redstone Shovel");
		LanguageRegistry.addName(redPickaxe, "Redstone Pickaxe");
		LanguageRegistry.addName(redAxe, "Redstone Axe");
		LanguageRegistry.addName(redHoe, "Redstone Hoe");
		LanguageRegistry.addName(obbyHelmet, "Obsidian Helmet");
		LanguageRegistry.addName(obbyChestplate, "Obsidian Chestplate");
		LanguageRegistry.addName(obbyLeggings, "Obsidian Leggings");
		LanguageRegistry.addName(obbyBoots, "Obsidian Boots");
		LanguageRegistry.addName(lapHelmet, "Lapis Helmet");
		LanguageRegistry.addName(lapChestplate, "Lapis Chestplate");
		LanguageRegistry.addName(lapLeggings, "Lapis Leggings");
		LanguageRegistry.addName(lapBoots, "Lapis Boots");
		LanguageRegistry.addName(redHelmet, "Redstone Helmet");
		LanguageRegistry.addName(redChestplate, "Redstone Chestplate");
		LanguageRegistry.addName(redLeggings, "Redstone Leggings");
		LanguageRegistry.addName(redBoots, "Redstone Boots");
		
		//Crafting
		GameRegistry.addRecipe(new ItemStack(MinetopiaBlock, 1), new Object[]{
			"SSS","SOS","SSS", 'S', net.minecraft.src.Block.stone, 'O', net.minecraft.src.Block.pumpkin
		});
		GameRegistry.addRecipe(new ItemStack(CondensedObsidanBlock, 1), new Object[]{
			"OOO","OOO","OOO", 'O', net.minecraft.src.Block.obsidian
		});
		GameRegistry.addRecipe(new ItemStack(redMesh, 2), new Object[]{
			"RR ","RR ","   ", 'R', net.minecraft.src.Item.redstone
		});
		GameRegistry.addRecipe(new ItemStack(obbySword, 1), new Object[]{
			" X "," X ", " S ", 'X', net.minecraft.src.Block.obsidian,'S',net.minecraft.src.Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(obbySpade, 1), new Object[]{
			" X "," S ", " S ", 'X', net.minecraft.src.Block.obsidian,'S',net.minecraft.src.Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(obbyPickaxe, 1), new Object[]{
			"XXX"," S ", " S ", 'X', net.minecraft.src.Block.obsidian,'S',net.minecraft.src.Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(obbyAxe, 1), new Object[]{
			"XX ","XS ", " S ", 'X', net.minecraft.src.Block.obsidian,'S',net.minecraft.src.Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(obbyHoe, 1), new Object[]{
			" XX"," S ", " S ", 'X', net.minecraft.src.Block.obsidian,'S',net.minecraft.src.Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(conobbySword, 1), new Object[]{
			" X "," X ", " S ", 'X', CondensedObsidanBlock,'S',net.minecraft.src.Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(conobbySpade, 1), new Object[]{
			" X "," S ", " S ", 'X', CondensedObsidanBlock,'S',net.minecraft.src.Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(conobbyPickaxe, 1), new Object[]{
			"XXX"," S ", " S ", 'X', CondensedObsidanBlock,'S',net.minecraft.src.Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(conobbyAxe, 1), new Object[]{
			"XX ","XS ", " S ", 'X', CondensedObsidanBlock,'S',net.minecraft.src.Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(conobbyHoe, 1), new Object[]{
			" XX"," S ", " S ", 'X', CondensedObsidanBlock,'S',net.minecraft.src.Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(lapSword, 1), new Object[]{
			" X "," X ", " S ", 'X', net.minecraft.src.Block.blockLapis,'S',net.minecraft.src.Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(lapSpade, 1), new Object[]{
			" X "," S ", " S ", 'X', net.minecraft.src.Block.blockLapis,'S',net.minecraft.src.Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(lapPickaxe, 1), new Object[]{
			"XXX"," S ", " S ", 'X', net.minecraft.src.Block.blockLapis,'S',net.minecraft.src.Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(lapAxe, 1), new Object[]{
			"XX ","XS ", " S ", 'X', net.minecraft.src.Block.blockLapis,'S',net.minecraft.src.Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(lapHoe, 1), new Object[]{
			" XX"," S ", " S ", 'X', net.minecraft.src.Block.blockLapis,'S',net.minecraft.src.Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(redSword, 1), new Object[]{
			" X "," X ", " S ", 'X', redMesh,'S',net.minecraft.src.Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(redSpade, 1), new Object[]{
			" X "," S ", " S ", 'X', redMesh,'S',net.minecraft.src.Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(redPickaxe, 1), new Object[]{
			"XXX"," S ", " S ", 'X', redMesh,'S',net.minecraft.src.Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(redAxe, 1), new Object[]{
			"XX ","XS ", " S ", 'X', redMesh,'S',net.minecraft.src.Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(redHoe, 1), new Object[]{
			" XX"," S ", " S ", 'X', redMesh,'S',net.minecraft.src.Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(obbyHelmet, 1), new Object[]{
			"XXX","X X", "   ", 'X', net.minecraft.src.Block.obsidian
		});
		GameRegistry.addRecipe(new ItemStack(obbyChestplate, 1), new Object[]{
			"X X","XXX", "XXX", 'X', net.minecraft.src.Block.obsidian
		});
		GameRegistry.addRecipe(new ItemStack(obbyLeggings, 1), new Object[]{
			"XXX","X X", "X X", 'X', net.minecraft.src.Block.obsidian
		});
		GameRegistry.addRecipe(new ItemStack(obbyBoots, 1), new Object[]{
			"   ","X X","X X", 'X', net.minecraft.src.Block.obsidian
		});
		GameRegistry.addRecipe(new ItemStack(lapHelmet, 1), new Object[]{
			"XXX","X X", "   ", 'X', net.minecraft.src.Block.blockLapis
		});
		GameRegistry.addRecipe(new ItemStack(lapChestplate, 1), new Object[]{
			"X X","XXX", "XXX", 'X', net.minecraft.src.Block.blockLapis
		});
		GameRegistry.addRecipe(new ItemStack(lapLeggings, 1), new Object[]{
			"XXX","X X", "X X", 'X', net.minecraft.src.Block.blockLapis
		});
		GameRegistry.addRecipe(new ItemStack(lapBoots, 1), new Object[]{
			"   ","X X","X X", 'X', net.minecraft.src.Block.blockLapis
		});
		GameRegistry.addRecipe(new ItemStack(redHelmet, 1), new Object[]{
			"XXX","X X", "   ", 'X', redMesh
		});
		GameRegistry.addRecipe(new ItemStack(redChestplate, 1), new Object[]{
			"X X","XXX", "XXX", 'X', redMesh
		});
		GameRegistry.addRecipe(new ItemStack(redLeggings, 1), new Object[]{
			"XXX","X X", "X X", 'X', redMesh
		});
		GameRegistry.addRecipe(new ItemStack(redBoots, 1), new Object[]{
			"   ","X X","X X", 'X', redMesh
		});
		
		//Texture Registering
		proxy.registerRenderThings();
	}
}
