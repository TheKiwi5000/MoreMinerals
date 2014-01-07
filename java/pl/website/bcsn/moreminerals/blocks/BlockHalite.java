package pl.website.bcsn.moreminerals.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockHalite extends Block{

	public BlockHalite() {
		super(Material.field_151576_e);
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	    {
	        this.field_149761_L = par1IconRegister.registerIcon("MMinerals:blockHalite");
	    }
}
