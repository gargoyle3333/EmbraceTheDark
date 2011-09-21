package net.minecraft.src.embracethedark;

import java.util.Random;
//some comment
import net.minecraft.src.Block;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import net.minecraft.src.mod_EmbraceTheDark;

public class BrickCreeper extends BrickMob {
    public BrickCreeper(int i, int j) {
		super(i, j);
	}

	public void onBlockAdded(World world, int i, int j, int k)
    {
        super.onBlockAdded(world, i, j, k);
        if(world.isBlockIndirectlyGettingPowered(i, j, k))
        {
            onBlockDestroyedByPlayer(world, i, j, k, 1);
            world.setBlockWithNotify(i, j, k, 0);
        }
    }

    public void onNeighborBlockChange(World world, int i, int j, int k, int l)
    {
        if(l > 0 && Block.blocksList[l].canProvidePower() && world.isBlockIndirectlyGettingPowered(i, j, k))
        {
            onBlockDestroyedByPlayer(world, i, j, k, 1);
            world.setBlockWithNotify(i, j, k, 0);
        }
    }

    public int quantityDropped(Random random)
    {
        return 0;
    }

    public void onBlockDestroyedByExplosion(World world, int i, int j, int k)
    {
        EntityBrickCreeperPrimed entitybrickcreeperprimed = new EntityBrickCreeperPrimed(world, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F);
        entitybrickcreeperprimed.fuse = world.rand.nextInt(entitybrickcreeperprimed.fuse / 4) + entitybrickcreeperprimed.fuse / 8;
        world.entityJoinedWorld(entitybrickcreeperprimed);
    }

    public void onBlockDestroyedByPlayer(World world, int i, int j, int k, int l)
    {
        if(world.multiplayerWorld)
        {
            return;
        }
        if((l & 1) == 0)
        {
            dropBlockAsItem_do(world, i, j, k, new ItemStack(mod_EmbraceTheDark.brickCreeper.blockID, 1, 0));
        } else
        {
            EntityBrickCreeperPrimed entitybrickcreeperprimed = new EntityBrickCreeperPrimed(world, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F);
            world.entityJoinedWorld(entitybrickcreeperprimed);
            world.playSoundAtEntity(entitybrickcreeperprimed, "random.fuse", 1.0F, 1.0F);
        }
    }

    public void onBlockClicked(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
        if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == mod_EmbraceTheDark.darkLighter.shiftedIndex)
        {
            world.setBlockMetadata(i, j, k, 1);
        }
        super.onBlockClicked(world, i, j, k, entityplayer);
    }

    public boolean blockActivated(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
        return super.blockActivated(world, i, j, k, entityplayer);
    }
}


