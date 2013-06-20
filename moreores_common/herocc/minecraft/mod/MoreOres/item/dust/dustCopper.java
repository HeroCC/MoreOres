package herocc.minecraft.mod.MoreOres.item.dust;

import java.util.Random;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class dustCopper extends Item{

    public dustCopper(int ID) {
        super(ID);
        this.setCreativeTab(CreativeTabs.tabRedstone);
        maxStackSize = 64;
    }
    public void registerIcons(IconRegister iconRegister)
    {
             itemIcon = iconRegister.registerIcon("moreores:copperdust");
    }
}