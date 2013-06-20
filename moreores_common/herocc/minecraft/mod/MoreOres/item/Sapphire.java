package herocc.minecraft.mod.MoreOres.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Sapphire extends Item {

	public Sapphire(int ID) {
		super(ID);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		maxStackSize = 64;
	}
	public void registerIcons(IconRegister iconRegister)
	{
	         itemIcon = iconRegister.registerIcon("moreores:sapphire");
	}
}
