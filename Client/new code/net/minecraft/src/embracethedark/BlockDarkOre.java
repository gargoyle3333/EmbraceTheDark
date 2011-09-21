
package net.minecraft.src.embracethedark;

//makes git work
import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.Material;
import net.minecraft.src.mod_EmbraceTheDark;

// Referenced classes of package net.minecraft.src:
//            Block, Material, Item

public class BlockDarkOre extends Block
{

    public BlockDarkOre(int i, int j)
    {
        super(i, j, Material.rock);
    }

	public int idDropped(int i, Random random)
    {
        if(blockID == mod_EmbraceTheDark.oreCoffinrock.blockID)
        {
            return mod_EmbraceTheDark.blockCoffinrock.blockIndexInTexture;
        }
        if(blockID == mod_EmbraceTheDark.oreDemonicus.blockID)
        {
            return mod_EmbraceTheDark.gemDemonicus.getIconFromDamage(0);
        }
        else
        {
            return blockID;
        }
    }

}
