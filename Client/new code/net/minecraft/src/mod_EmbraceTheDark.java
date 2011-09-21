package net.minecraft.src;
//makes git work
import java.io.ObjectInputStream.GetField;
import java.util.Map;

import net.minecraft.src.embracethedark.BlockDarkOre;
import net.minecraft.src.embracethedark.BlockDarkPortal;
import net.minecraft.src.embracethedark.BrickCreeper;
import net.minecraft.src.embracethedark.BrickMob;
import net.minecraft.src.embracethedark.EntityAntiSkeleton;
import net.minecraft.src.embracethedark.EntityAntiSpider;
import net.minecraft.src.embracethedark.EntityHellHound;
import net.minecraft.src.embracethedark.EntityVampire;
import net.minecraft.src.embracethedark.EnumDarkToolMaterial;
import net.minecraft.src.embracethedark.ItemDarkAxe;
import net.minecraft.src.embracethedark.ItemDarkPickaxe;
import net.minecraft.src.embracethedark.ItemDarkSpade;
import net.minecraft.src.embracethedark.ItemDarkSword;
import net.minecraft.src.embracethedark.ModelHellHound;
import net.minecraft.src.embracethedark.RenderAntiSpider;
import net.minecraft.src.embracethedark.RenderHellHound;

public class mod_EmbraceTheDark extends BaseMod{

	@Override
	public String Version() {
		// TODO Auto-generated method stub
		return "[1.8.1] Embrace The Dark v0.1";
	}
	
	public static final Block darkPortal = new BlockDarkPortal(231, 0).setBlockName("darkportal");
	
	public static final Block brickBone = new BrickMob(200, 0).setBlockName("brickbone");
	public static final Block brickCreeper = new BrickCreeper(201, 0).setBlockName("brickcreeper");
	public static final Block brickSpider = new BrickMob(202, 0).setBlockName("brickspider");
	public static final Block brickZom = new BrickMob(203, 0).setBlockName("brickzom");
	
	public static final Block deadwood = new Block(204, Material.wood).setBlockName("deadwood");
	public static final Block planksDeadwood = new Block(205, Material.wood).setBlockName("planksdeadwood");
	public static final Block blockCoffinrock = new Block(209, Material.rock).setBlockName("blockcoffinrock");
	public static final Block oreCoffinrock = new BlockDarkOre(206, 0).setBlockName("oreCoffinrock");
	public static final Block oreVulcan = new BlockDarkOre(207, 0).setBlockName("orevulcan");
	public static final Block oreDemonicus = new BlockDarkOre(208, 0).setBlockName("oredemonicus");
	
	public static final Item darkLighter = new ItemFlintAndSteel(210).setItemName("darklighter");
	public static final Item darkFeather = new Item(211).setItemName("darkfeather");
	
	public static final Item pickaxeDeadwood = new ItemDarkPickaxe(212, EnumDarkToolMaterial.DEADWOOD).setItemName("pickaxeDeadwood");
	public static final Item axeDeadwood = new ItemDarkAxe(213, EnumDarkToolMaterial.DEADWOOD).setItemName("axeDeadwood");
	public static final Item shovelDeadwood = new ItemDarkSpade(214, EnumDarkToolMaterial.DEADWOOD).setItemName("shovelDeadwood");
	public static final Item swordDeadwood = new ItemDarkSword(215, EnumDarkToolMaterial.DEADWOOD).setItemName("swordDeadwood");
	
	public static final Item pickaxeCoffinrock = new ItemDarkPickaxe(216, EnumDarkToolMaterial.COFFINROCK).setItemName("pickaxeCoffinrock");
	public static final Item axeCoffinrock = new ItemDarkAxe(217, EnumDarkToolMaterial.COFFINROCK).setItemName("axeCoffinrock");
	public static final Item shovelCoffinrock = new ItemDarkSpade(218, EnumDarkToolMaterial.COFFINROCK).setItemName("shovelCoffinrock");
	public static final Item swordCoffinrock = new ItemDarkSword(219, EnumDarkToolMaterial.COFFINROCK).setItemName("swordCoffinrock");
	
	public static final Item pickaxeVulcan = new ItemDarkPickaxe(220, EnumDarkToolMaterial.VULCAN).setItemName("pickaxeVulcan");
	public static final Item axeVulcan = new ItemDarkAxe(221, EnumDarkToolMaterial.VULCAN).setItemName("axeVulcan");
	public static final Item shovelVulcan = new ItemDarkSpade(222, EnumDarkToolMaterial.VULCAN).setItemName("shovelVulcan");
	public static final Item swordVulcan = new ItemDarkSword(223, EnumDarkToolMaterial.VULCAN).setItemName("swordVulcan");
	
	public static final Item pickaxeDemonicus = new ItemDarkPickaxe(224, EnumDarkToolMaterial.DEMONICUS).setItemName("pickaxeDemonicus");
	public static final Item axeDemonicus = new ItemDarkAxe(225, EnumDarkToolMaterial.DEMONICUS).setItemName("axeDemonicus");
	public static final Item shovelDemonicus = new ItemDarkSpade(226, EnumDarkToolMaterial.DEMONICUS).setItemName("shovelDemonicus");
	public static final Item swordDemonicus = new ItemDarkSword(227, EnumDarkToolMaterial.DEMONICUS).setItemName("swordDemonicus");
	
	public static final Item stickDeadwood = new Item(228).setItemName("stickDeadwood");
	public static final Item ingotVulcan = new Item(229).setItemName("ingotVulcan");
	public static final Item gemDemonicus = new Item(230).setItemName("gemDemonicus");
	
	public void AddRenderer(Map map) {
		map.put(EntityAntiSkeleton.class, new RenderBiped(new ModelBiped(), 0.5F));
		map.put(EntityVampire.class, new RenderBiped(new ModelBiped(), 0.5F));
		map.put(EntityAntiSpider.class, new RenderAntiSpider());
		map.put(EntityHellHound.class, new RenderHellHound(new ModelHellHound(), 0.5F));
	};
	
	public mod_EmbraceTheDark() {
		
		
		ModLoader.RegisterEntityID(EntityAntiSkeleton.class, "antiskeleton", ModLoader.getUniqueEntityId());
		ModLoader.RegisterEntityID(EntityVampire.class, "vampire", ModLoader.getUniqueEntityId());
		ModLoader.RegisterEntityID(EntityAntiSpider.class, "antispider", ModLoader.getUniqueEntityId());
		ModLoader.RegisterEntityID(EntityHellHound.class, "hellhound", ModLoader.getUniqueEntityId());
		
		ModLoader.AddSpawn("antiskeleton", 32, 2, 4, EnumCreatureType.monster);
		ModLoader.AddSpawn("vampire", 32, 2, 4, EnumCreatureType.monster);
		ModLoader.AddSpawn("antispider", 32, 2, 4, EnumCreatureType.monster);
		ModLoader.AddSpawn("hellhound", 32, 2, 4, EnumCreatureType.monster);
		
		//darkPortal.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/DarkTextures/darkPortal.png");
		brickBone.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/DarkTextures/brickBone.png");
		brickCreeper.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/DarkTextures/brickCreeper.png");
		brickSpider.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/DarkTextures/brickSpider.png");
		brickZom.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/DarkTextures/brickZom.png");
		
		deadwood.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/DarkTextures/blockDeadwoodSides.png");
		planksDeadwood.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/DarkTextures/planksDeadwood.png");
		oreCoffinrock.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/DarkTextures/oreCoffinrock.png");
		oreVulcan.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/DarkTextures/oreVulcan.png");
		oreDemonicus.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/DarkTextures/oreDemonicus.png");
		blockCoffinrock.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/DarkTextures/blockCoffinrock.png");
		
		darkFeather.iconIndex = ModLoader.addOverride("/gui/items.png", "/DarkItems/darkFeather.png");
		darkLighter.iconIndex = ModLoader.addOverride("/gui/items.png", "/DarkItems/darkLighter.png");
		
		pickaxeDeadwood.iconIndex = ModLoader.addOverride("/gui/items.png", "/DarkTools/pickaxeDeadwood.png");
		axeDeadwood.iconIndex = ModLoader.addOverride("/gui/items.png", "/DarkTools/axeDeadwood.png");
		shovelDeadwood.iconIndex = ModLoader.addOverride("/gui/items.png", "/DarkTools/shovelDeadwood.png");
		swordDeadwood.iconIndex = ModLoader.addOverride("/gui/items.png", "/DarkTools/swordDeadwood.png");
		
		pickaxeCoffinrock.iconIndex = ModLoader.addOverride("/gui/items.png", "/DarkTools/pickaxeCoffinrock.png");
		axeCoffinrock.iconIndex = ModLoader.addOverride("/gui/items.png", "/DarkTools/axeCoffinrock.png");
		shovelCoffinrock.iconIndex = ModLoader.addOverride("/gui/items.png", "/DarkTools/shovelCoffinrock.png");
		swordCoffinrock.iconIndex = ModLoader.addOverride("/gui/items.png", "/DarkTools/swordCoffinrock.png");
		
		pickaxeVulcan.iconIndex = ModLoader.addOverride("/gui/items.png", "/DarkTools/pickaxeVulcan.png");
		axeVulcan.iconIndex = ModLoader.addOverride("/gui/items.png", "/DarkTools/axeVulcan.png");
		shovelVulcan.iconIndex = ModLoader.addOverride("/gui/items.png", "/DarkTools/shovelVulcan.png");
		swordVulcan.iconIndex = ModLoader.addOverride("/gui/items.png", "/DarkTools/swordVulcan.png");
		
		pickaxeDemonicus.iconIndex = ModLoader.addOverride("/gui/items.png", "/DarkTools/pickaxeDemonicus.png");
		axeDemonicus.iconIndex = ModLoader.addOverride("/gui/items.png", "/DarkTools/axeDemonicus.png");
		shovelDemonicus.iconIndex = ModLoader.addOverride("/gui/items.png", "/DarkTools/shovelDemonicus.png");
		swordDemonicus.iconIndex = ModLoader.addOverride("/gui/items.png", "/DarkTools/swordDemonicus.png");
		
		stickDeadwood.iconIndex = ModLoader.addOverride("/gui/items.png", "/DarkItems/stickDeadwood.png");
		ingotVulcan.iconIndex = ModLoader.addOverride("/gui/items.png", "/DarkItems/ingotVulcan.png");
		gemDemonicus.iconIndex = ModLoader.addOverride("/gui/items.png", "/DarkItems/gemDemonicus.png");
		
		
		ModLoader.RegisterBlock(darkPortal);
        ModLoader.RegisterBlock(brickBone);
        ModLoader.RegisterBlock(brickCreeper);
        ModLoader.RegisterBlock(brickSpider);
        ModLoader.RegisterBlock(brickZom);
        
        ModLoader.RegisterBlock(deadwood);
        ModLoader.RegisterBlock(planksDeadwood);
        ModLoader.RegisterBlock(oreCoffinrock);
        ModLoader.RegisterBlock(oreVulcan);
        ModLoader.RegisterBlock(oreDemonicus);
        ModLoader.RegisterBlock(blockCoffinrock);
        
        ModLoader.AddName(darkPortal, "Dark Portal");
        ModLoader.AddName(brickBone, "Bonebrick");
        ModLoader.AddName(brickCreeper, "Creeperbrick");
        ModLoader.AddName(brickSpider, "Spiderbrick");
        ModLoader.AddName(brickZom, "Zombrick");
        
        ModLoader.AddName(deadwood, "Deadwood");
        ModLoader.AddName(planksDeadwood, "Deadwood Planks");
        ModLoader.AddName(oreCoffinrock, "Coffinrock Ore");
        ModLoader.AddName(oreVulcan, "Vulcan Ore");
        ModLoader.AddName(oreDemonicus, "Demonicus Ore");
        ModLoader.AddName(blockCoffinrock, "Coffinrock");
        
        ModLoader.AddName(darkFeather, "Dark Feather");
        ModLoader.AddName(darkLighter, "Dark Lighter");
        
        ModLoader.AddName(pickaxeDeadwood, "Deadwood Pickaxe");
        ModLoader.AddName(axeDeadwood, "Deadwood Axe");
        ModLoader.AddName(shovelDeadwood, "Deadwood Shovel");
        ModLoader.AddName(swordDeadwood, "Deadwood Sword");
        
        ModLoader.AddName(pickaxeCoffinrock, "Coffinrock Pickaxe");
        ModLoader.AddName(axeCoffinrock, "Coffinrock Axe");
        ModLoader.AddName(shovelCoffinrock, "Coffinrock Shovel");
        ModLoader.AddName(swordCoffinrock, "Coffinrock Sword");
        
        ModLoader.AddName(pickaxeVulcan, "Vulcan Pickaxe");
        ModLoader.AddName(axeVulcan, "Vulcan Axe");
        ModLoader.AddName(shovelVulcan, "Vulcan Shovel");
        ModLoader.AddName(swordVulcan, "Vulcan Sword");
        
        ModLoader.AddName(pickaxeDemonicus, "Demonicus Pickaxe");
        ModLoader.AddName(axeDemonicus, "Demonicus Axe");
        ModLoader.AddName(shovelDemonicus, "Demonicus Shovel");
        ModLoader.AddName(swordDemonicus, "Demonicus Sword");
        
        ModLoader.AddName(stickDeadwood, "Deadwood Stick");
        ModLoader.AddName(ingotVulcan, "Vulcan Ingot");
        ModLoader.AddName(gemDemonicus, "Demonicus Gem");
        
        //TODO once ores and blocks are in, create recipes to create the weapons.
        ModLoader.AddRecipe(new ItemStack(brickBone, 1), new Object[] {
           "XYX", "YXY", "XYX", Character.valueOf('X'), Item.bone, Character.valueOf('Y'), Item.arrow
        });
        ModLoader.AddRecipe(new ItemStack(brickCreeper, 1), new Object[] {
            "XXX", "XXX", "XXX", Character.valueOf('X'), Item.gunpowder, 
         });
        ModLoader.AddRecipe(new ItemStack(brickSpider, 1), new Object[] {
        	"XXX", "XXX", "XXX", Character.valueOf('X'), Item.silk, 
         });
        ModLoader.AddRecipe(new ItemStack(brickZom, 1), new Object[] {
        	"XXX", "XXX", "XXX", Character.valueOf('X'), darkFeather, 
         });
        ModLoader.AddRecipe(new ItemStack(darkLighter, 1), new Object[] {
        	" X ", " Y ", " Z ", Character.valueOf('X'), Item.lightStoneDust, Character.valueOf('Y'), Item.gunpowder, Character.valueOf('Z'), Item.flintAndSteel
         });
        
        ModLoader.AddRecipe(new ItemStack(stickDeadwood, 4), new Object[] {
            "X  ", "X  ", "   ", Character.valueOf('X'), planksDeadwood
         });
        ModLoader.AddRecipe(new ItemStack(stickDeadwood, 4), new Object[] {
            " X ", " X ", "   ", Character.valueOf('X'), planksDeadwood
         });
        ModLoader.AddRecipe(new ItemStack(stickDeadwood, 4), new Object[] {
            "  X", "  X", "   ", Character.valueOf('X'), planksDeadwood
         });
        ModLoader.AddRecipe(new ItemStack(stickDeadwood, 4), new Object[] {
            "   ", "X  ", "X  ", Character.valueOf('X'), planksDeadwood
         });
        ModLoader.AddRecipe(new ItemStack(stickDeadwood, 4), new Object[] {
            "   ", " X ", " X ", Character.valueOf('X'), planksDeadwood
         });
        ModLoader.AddRecipe(new ItemStack(stickDeadwood, 4), new Object[] {
            "   ", "  X", "  X", Character.valueOf('X'), planksDeadwood
         });
        
        ModLoader.AddRecipe(new ItemStack(planksDeadwood, 4), new Object[] {
            "X  ", "   ", "   ", Character.valueOf('X'), deadwood
         });
        ModLoader.AddRecipe(new ItemStack(planksDeadwood, 4), new Object[] {
            "  X", "   ", "   ", Character.valueOf('X'), deadwood
         });
        ModLoader.AddRecipe(new ItemStack(planksDeadwood, 4), new Object[] {
            "   ", "X  ", "   ", Character.valueOf('X'), deadwood
         });
        ModLoader.AddRecipe(new ItemStack(planksDeadwood, 4), new Object[] {
            "   ", " X ", "   ", Character.valueOf('X'), deadwood
         });
        ModLoader.AddRecipe(new ItemStack(planksDeadwood, 4), new Object[] {
            "   ", "  X", "   ", Character.valueOf('X'), deadwood
         });
        ModLoader.AddRecipe(new ItemStack(planksDeadwood, 4), new Object[] {
            "   ", "   ", "X  ", Character.valueOf('X'), deadwood
         });
        ModLoader.AddRecipe(new ItemStack(planksDeadwood, 4), new Object[] {
            "   ", "   ", " X ", Character.valueOf('X'), deadwood
         });
        ModLoader.AddRecipe(new ItemStack(planksDeadwood, 4), new Object[] {
            "   ", "   ", "  X", Character.valueOf('X'), deadwood
         });
        ModLoader.AddRecipe(new ItemStack(planksDeadwood, 4), new Object[] {
            " X ", "   ", "   ", Character.valueOf('X'), deadwood
         });
        
        ModLoader.AddRecipe(new ItemStack(pickaxeDeadwood, 1), new Object[] {
            "XXX", " Y ", " Y ", Character.valueOf('X'), planksDeadwood, Character.valueOf('Y'), stickDeadwood
         });
        ModLoader.AddRecipe(new ItemStack(axeDeadwood, 1), new Object[] {
            "XX ", "XY ", " Y ", Character.valueOf('X'), planksDeadwood, Character.valueOf('Y'), stickDeadwood
         });
        ModLoader.AddRecipe(new ItemStack(shovelDeadwood, 1), new Object[] {
            " X ", " Y ", " Y ", Character.valueOf('X'), planksDeadwood, Character.valueOf('Y'), stickDeadwood
         });
        ModLoader.AddRecipe(new ItemStack(swordDeadwood, 1), new Object[] {
            " X ", " X ", " Y ", Character.valueOf('X'), planksDeadwood, Character.valueOf('Y'), stickDeadwood
         });
        
        ModLoader.AddRecipe(new ItemStack(pickaxeCoffinrock, 1), new Object[] {
            "XXX", " Y ", " Y ", Character.valueOf('X'), oreCoffinrock, Character.valueOf('Y'), stickDeadwood
         });
        ModLoader.AddRecipe(new ItemStack(axeCoffinrock, 1), new Object[] {
            "XX ", "XY ", " Y ", Character.valueOf('X'), oreCoffinrock, Character.valueOf('Y'), stickDeadwood
         });
        ModLoader.AddRecipe(new ItemStack(shovelCoffinrock, 1), new Object[] {
            " X ", " Y ", " Y ", Character.valueOf('X'), oreCoffinrock, Character.valueOf('Y'), stickDeadwood
         });
        ModLoader.AddRecipe(new ItemStack(swordCoffinrock, 1), new Object[] {
            " X ", " X ", " Y ", Character.valueOf('X'), oreCoffinrock, Character.valueOf('Y'), stickDeadwood
         });
        
        ModLoader.AddRecipe(new ItemStack(pickaxeVulcan, 1), new Object[] {
            "XXX", " Y ", " Y ", Character.valueOf('X'), ingotVulcan, Character.valueOf('Y'), stickDeadwood
         });
        ModLoader.AddRecipe(new ItemStack(axeVulcan, 1), new Object[] {
            "XX ", "XY ", " Y ", Character.valueOf('X'), ingotVulcan, Character.valueOf('Y'), stickDeadwood
         });
        ModLoader.AddRecipe(new ItemStack(shovelVulcan, 1), new Object[] {
            " X ", " Y ", " Y ", Character.valueOf('X'), ingotVulcan, Character.valueOf('Y'), stickDeadwood
         });
        ModLoader.AddRecipe(new ItemStack(swordVulcan, 1), new Object[] {
            " X ", " X ", " Y ", Character.valueOf('X'), ingotVulcan, Character.valueOf('Y'), stickDeadwood
         });
        
        ModLoader.AddRecipe(new ItemStack(pickaxeDemonicus, 1), new Object[] {
            "XXX", " Y ", " Y ", Character.valueOf('X'), gemDemonicus, Character.valueOf('Y'), stickDeadwood
         });
        ModLoader.AddRecipe(new ItemStack(axeDemonicus, 1), new Object[] {
            "XX ", "XY ", " Y ", Character.valueOf('X'), gemDemonicus, Character.valueOf('Y'), stickDeadwood
         });
        ModLoader.AddRecipe(new ItemStack(shovelDemonicus, 1), new Object[] {
            " X ", " Y ", " Y ", Character.valueOf('X'), gemDemonicus, Character.valueOf('Y'), stickDeadwood
         });
        ModLoader.AddRecipe(new ItemStack(swordDemonicus, 1), new Object[] {
            " X ", " X ", " Y ", Character.valueOf('X'), gemDemonicus, Character.valueOf('Y'), stickDeadwood
         });
        
        ModLoader.AddSmelting(oreVulcan.blockID, new ItemStack(ingotVulcan, 1));
	}

}
