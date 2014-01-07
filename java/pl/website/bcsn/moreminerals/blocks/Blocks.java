package pl.website.bcsn.moreminerals.blocks;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;

public class Blocks {
	
	public static BlockHalite blockHalite;
	
	
	public static void initialize(){
		blockHalite = (BlockHalite) new BlockHalite().func_149647_a(CreativeTabs.tabBlock);
		
		register();
	}
	
	private static void register(){
		GameRegistry.registerBlock(blockHalite, "blockHalite");
	}
	
	
}
