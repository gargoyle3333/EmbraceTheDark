package net.minecraft.src.embracethedark;
//makes git work
import net.minecraft.src.Block;

public class ItemDarkSpade extends ItemDarkTool
{

 public ItemDarkSpade(int i, EnumDarkToolMaterial enumdarktoolmaterial)
 {
     super(i, 1, enumdarktoolmaterial, blocksEffectiveAgainst);
 }

 public boolean canHarvestBlock(Block block)
 {
     if(block == Block.snow)
     {
         return true;
     }
     return block == Block.blockSnow;
 }

 private static Block blocksEffectiveAgainst[];

 static 
 {
     blocksEffectiveAgainst = (new Block[] {
         Block.grass, Block.dirt, Block.sand, Block.gravel, Block.snow, Block.blockSnow, Block.blockClay, Block.tilledField
     });
 }
}
