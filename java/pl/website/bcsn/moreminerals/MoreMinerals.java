package pl.website.bcsn.moreminerals;

import net.minecraft.creativetab.CreativeTabs;
import pl.website.bcsn.moreminerals.blocks.BlockHalite;
import pl.website.bcsn.moreminerals.blocks.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;




@Mod(modid = "MMinerals", name = "More minerals mod", version = "0.0.1a")
public class MoreMinerals {
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		
		//Blocks.initialize();
	}
	
	
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		
	}
}
