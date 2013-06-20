package herocc.minecraft.mod.MoreOres.block.ore;

import java.util.Random;

import herocc.minecraft.mod.MoreOres.MoreOres;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class oreCopper extends Block {

        public oreCopper(int par1) {
            super(par1, Material.rock);
            this.setCreativeTab(CreativeTabs.tabBlock);
    }
        public void registerIcons(IconRegister iconRegister){
                 blockIcon = iconRegister.registerIcon("moreores:copperore");
        }

        public int idDropped(int par1, Random rand, int par2){
            return MoreOres.dustCopper.itemID;
        }
        
        public int quantityDropped(Random rand){
            return rand.nextInt(8);
        }
}