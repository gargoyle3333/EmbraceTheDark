
package net.minecraft.src.embracethedark;
//Comment

import java.util.Random;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.BlockTorch;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.Vec3D;
import net.minecraft.src.World;

// Referenced classes of package net.minecraft.src:
//            BlockTorch, World, Block, AxisAlignedBB, 
//            Vec3D, MovingObjectPosition

public class BlockIlluminator extends BlockTorch
{

    protected BlockIlluminator(int j, int k)
    {
        super(j, k);
        setTickOnLoad(true);
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int j, int k, int l)
    {
        return null;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public int getRenderType()
    {
        return 2;
    }

    private boolean h(World world, int j, int k, int l)
    {
        return world.isBlockNormalCube(j, k, l) || world.getBlockId(j, k, l) == Block.fence.blockID;
    }

    public boolean canPlaceBlockAt(World world, int j, int k, int l)
    {
        if(world.isBlockNormalCube(j - 1, k, l))
        {
            return true;
        }
        if(world.isBlockNormalCube(j + 1, k, l))
        {
            return true;
        }
        if(world.isBlockNormalCube(j, k, l - 1))
        {
            return true;
        }
        if(world.isBlockNormalCube(j, k, l + 1))
        {
            return true;
        } else
        {
            return h(world, j, k - 1, l);
        }
    }

    public void onBlockPlaced(World world, int j, int k, int l, int i1)
    {
        int j1 = world.getBlockMetadata(j, k, l);
        if(i1 == 1 && h(world, j, k - 1, l))
        {
            j1 = 5;
        }
        if(i1 == 2 && world.isBlockNormalCube(j, k, l + 1))
        {
            j1 = 4;
        }
        if(i1 == 3 && world.isBlockNormalCube(j, k, l - 1))
        {
            j1 = 3;
        }
        if(i1 == 4 && world.isBlockNormalCube(j + 1, k, l))
        {
            j1 = 2;
        }
        if(i1 == 5 && world.isBlockNormalCube(j - 1, k, l))
        {
            j1 = 1;
        }
        world.setBlockMetadataWithNotify(j, k, l, j1);
    }

    public void updateTick(World world, int j, int k, int l, Random random)
    {
        super.updateTick(world, j, k, l, random);
        if(world.getBlockMetadata(j, k, l) == 0)
        {
            onBlockAdded(world, j, k, l);
        }
    }

    public void onBlockAdded(World world, int j, int k, int l)
    {
        if(world.isBlockNormalCube(j - 1, k, l))
        {
            world.setBlockMetadataWithNotify(j, k, l, 1);
        } else
        if(world.isBlockNormalCube(j + 1, k, l))
        {
            world.setBlockMetadataWithNotify(j, k, l, 2);
        } else
        if(world.isBlockNormalCube(j, k, l - 1))
        {
            world.setBlockMetadataWithNotify(j, k, l, 3);
        } else
        if(world.isBlockNormalCube(j, k, l + 1))
        {
            world.setBlockMetadataWithNotify(j, k, l, 4);
        } else
        if(h(world, j, k - 1, l))
        {
            world.setBlockMetadataWithNotify(j, k, l, 5);
        }
        i(world, j, k, l);
    }

    public void onNeighborBlockChange(World world, int j, int k, int l, int i1)
    {
        if(i(world, j, k, l))
        {
            int j1 = world.getBlockMetadata(j, k, l);
            boolean flag = false;
            if(!world.isBlockNormalCube(j - 1, k, l) && j1 == 1)
            {
                flag = true;
            }
            if(!world.isBlockNormalCube(j + 1, k, l) && j1 == 2)
            {
                flag = true;
            }
            if(!world.isBlockNormalCube(j, k, l - 1) && j1 == 3)
            {
                flag = true;
            }
            if(!world.isBlockNormalCube(j, k, l + 1) && j1 == 4)
            {
                flag = true;
            }
            if(!h(world, j, k - 1, l) && j1 == 5)
            {
                flag = true;
            }
            if(flag)
            {
                dropBlockAsItem(world, j, k, l, world.getBlockMetadata(j, k, l));
                world.setBlockWithNotify(j, k, l, 0);
            }
        }
    }

    private boolean i(World world, int j, int k, int l)
    {
        if(!canPlaceBlockAt(world, j, k, l))
        {
            dropBlockAsItem(world, j, k, l, world.getBlockMetadata(j, k, l));
            world.setBlockWithNotify(j, k, l, 0);
            return false;
        } else
        {
            return true;
        }
    }

    public MovingObjectPosition collisionRayTrace(World world, int j, int k, int l, Vec3D vec3d, Vec3D vec3d1)
    {
        int i1 = world.getBlockMetadata(j, k, l) & 7;
        float f = 0.15F;
        if(i1 == 1)
        {
            setBlockBounds(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
        } else
        if(i1 == 2)
        {
            setBlockBounds(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
        } else
        if(i1 == 3)
        {
            setBlockBounds(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
        } else
        if(i1 == 4)
        {
            setBlockBounds(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
        } else
        {
            float f1 = 0.1F;
            setBlockBounds(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, 0.6F, 0.5F + f1);
        }
        return super.collisionRayTrace(world, j, k, l, vec3d, vec3d1);
    }

    public void randomDisplayTick(World world, int j, int k, int l, Random random)
    {
        int i1 = world.getBlockMetadata(j, k, l);
        double d = (float)j + 0.5F;
        double d1 = (float)k + 0.7F;
        double d2 = (float)l + 0.5F;
        double d3 = 0.2199999988079071D;
        double d4 = 0.27000001072883606D;
        if(i1 == 1)
        {
            world.spawnParticle("smoke", d - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
            world.spawnParticle("flame", d - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
        } else
        if(i1 == 2)
        {
            world.spawnParticle("smoke", d + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
            world.spawnParticle("flame", d + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
        } else
        if(i1 == 3)
        {
            world.spawnParticle("smoke", d, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D);
            world.spawnParticle("flame", d, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D);
        } else
        if(i1 == 4)
        {
            world.spawnParticle("smoke", d, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
            world.spawnParticle("flame", d, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
        } else
        {
            world.spawnParticle("smoke", d, d1, d2, 0.0D, 0.0D, 0.0D);
            world.spawnParticle("flame", d, d1, d2, 0.0D, 0.0D, 0.0D);
        }
    }
    
    public int idDropped(int i, Random random)
    {
        return Block.torchRedstoneActive.blockID;
    }
    
    public boolean canProvidePower()
    {
        return false;
    }
    
}
