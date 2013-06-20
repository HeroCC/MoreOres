package herocc.minecraft.mod.MoreOres;

import herocc.minecraft.mod.MoreOres.block.ore.*;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.SidedProxy;
import herocc.minecraft.mod.MoreOres.item.*;
import herocc.minecraft.mod.MoreOres.lib.reference;
import herocc.minecraft.mod.MoreOres.worldgen.*;
import net.minecraftforge.common.Configuration;
import herocc.minecraft.mod.MoreOres.item.dust.*;


@Mod(modid=reference.MOD_ID, name=reference.MOD_NAME, version=reference.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MoreOres {
	
	
	//Java Block Define
	public static Block OreRuby;
	public static Block OreSapphire;
	public static Block OreSilver;
	public static Block OreCopper;
	public static Block OreTin;
	
	//Java Item Define
	public static Item Ruby;
	public static Item Sapphire;
	public static Item dustSilver;
	public static Item dustCopper;
	public static Item dustTin;
	public static Item ingotTin;
	
	//ID Java Definers
	public static int oreSilverID;
	
	
		@SidedProxy(clientSide = "herocc.minecraft.mod.MoreOres.client.ClientProxy", serverSide = "herocc.minecraft.mod.moreores.ServerProxy")
		public static ServerProxy proxy;

        @PreInit
        public void preInit(FMLPreInitializationEvent event) {
        	// Begin Configuration File
            Configuration config = new Configuration(event.getSuggestedConfigurationFile());
            
            config.load();
            
            
            config.save();
        	
        }
       
        @Init
        public void load(FMLInitializationEvent event) {
    		proxy.registerRenderThings();
    		
    		// Define Blocks
    		OreRuby = new OreRuby(1000).setHardness(4.0F).setResistance(6.0F).setUnlocalizedName("oreRuby");
    		OreSapphire = new OreSapphire(1001).setHardness(7.0F).setResistance(9.0F).setUnlocalizedName("oreSapphire");
    		OreSilver = new oreSilver(1002).setHardness(6.0F).setResistance(7.5F).setUnlocalizedName("oreSilver");
    		OreCopper = new oreCopper(1003).setHardness(6.5F).setResistance(7.0F).setUnlocalizedName("oreCopper");
    		
    		// Register Items
    		Ruby = new Ruby(5000).setUnlocalizedName("Ruby");
    		Sapphire = new Sapphire(5001).setUnlocalizedName("Sapphire");
    		dustSilver = new dustSilver(5002).setUnlocalizedName("Silver Dust");
            dustCopper = new dustCopper(5003).setUnlocalizedName("Copper Copper");
    		
    		
    		// Register Blocks
    		GameRegistry.registerBlock(OreRuby, "ore.Ruby");
    		GameRegistry.registerBlock(OreSapphire, "ore.Sapphire");
    		GameRegistry.registerBlock(OreSilver, "ore.Silver");
    		GameRegistry.registerBlock(OreCopper, "ore.Copper");
    		
    		// Adding Block Names
    		LanguageRegistry.addName(OreRuby, "Ruby Ore");
    		LanguageRegistry.addName(OreSapphire, "Sapphire Ore");
    		LanguageRegistry.addName(OreSilver, "Silver Ore");
    		LanguageRegistry.addName(OreCopper, "Copper Ore");
    		
    		//Adding Item Names
    		LanguageRegistry.addName(Ruby, "Ruby");
    		LanguageRegistry.addName(Sapphire, "Sapphire");
    		LanguageRegistry.addName(dustSilver, "Silver Dust");
    		LanguageRegistry.addName(dustCopper, "Copper Dust");
    		
    		// Add Recipes
    		
    		// Add Smelting Output
    		GameRegistry.addSmelting(MoreOres.OreRuby.blockID, new ItemStack(Ruby), 0.5F);
    		GameRegistry.addSmelting(MoreOres.OreSapphire.blockID, new ItemStack(Sapphire), 10.0F);
    		
    		// Generate Ores
    		GameRegistry.registerWorldGenerator(new RubyOreGen());
    		GameRegistry.registerWorldGenerator(new SapphireOreGen());
    		GameRegistry.registerWorldGenerator(new SilverOreGen());
    		GameRegistry.registerWorldGenerator(new CopperOreGen());

        }
       
        @PostInit
        public void postInit(FMLPostInitializationEvent event) {
            
            
        }
}