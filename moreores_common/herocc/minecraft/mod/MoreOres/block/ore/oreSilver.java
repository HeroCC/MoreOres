package herocc.minecraft.mod.MoreOres.block.ore;

import herocc.minecraft.mod.MoreOres.MoreOres;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class oreSilver extends Block {

    public oreSilver(int par1) {
        super(par1, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
}
    public void registerIcons(IconRegister iconRegister)
    {
             blockIcon = iconRegister.registerIcon("moreores:silverore");
    }
    
    public int idDropped(int par1, Random rand, int par2){
        return MoreOres.dustSilver.itemID;
    }
    
    public int quantityDropped(Random rand){
        return rand.nextInt(4);
    }
    

}
