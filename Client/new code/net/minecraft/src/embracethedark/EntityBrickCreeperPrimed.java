package net.minecraft.src.embracethedark;

import net.minecraft.src.EntityTNTPrimed;
import net.minecraft.src.MathHelper;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.World;
//makes git work
public class EntityBrickCreeperPrimed extends EntityTNTPrimed{


    public EntityBrickCreeperPrimed(World world)
    {
        super(world);
        fuse = 0;
        preventEntitySpawning = true;
        setSize(0.98F, 0.98F);
        yOffset = height / 2.0F;
    }

    public EntityBrickCreeperPrimed(World world, double d, double d1, double d2)
    {
        this(world);
        setPosition(d, d1, d2);
        float f = (float)(Math.random() * 3.1415927410125732D * 2D);
        motionX = -MathHelper.sin((f * 3.141593F) / 180F) * 0.02F;
        motionY = 0.20000000298023224D;
        motionZ = -MathHelper.cos((f * 3.141593F) / 180F) * 0.02F;
        fuse = 80;
        prevPosX = d;
        prevPosY = d1;
        prevPosZ = d2;
    }

    protected void entityInit()
    {
    }

    protected boolean canTriggerWalking()
    {
        return false;
    }

    public boolean canBeCollidedWith()
    {
        return !isDead;
    }

    public void onUpdate()
    {
        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;
        motionY -= 0.039999999105930328D;
        moveEntity(motionX, motionY, motionZ);
        motionX *= 0.98000001907348633D;
        motionY *= 0.98000001907348633D;
        motionZ *= 0.98000001907348633D;
        if(onGround)
        {
            motionX *= 0.69999998807907104D;
            motionZ *= 0.69999998807907104D;
            motionY *= -0.5D;
        }
        if(fuse-- <= 0)
        {
            if(!worldObj.multiplayerWorld)
            {
                setEntityDead();
                explode();
            } else
            {
                setEntityDead();
            }
        } else
        {
            worldObj.spawnParticle("smoke", posX, posY + 0.5D, posZ, 0.0D, 0.0D, 0.0D);
        }
    }

    private void explode()
    {
        float f = 8F;
        worldObj.createExplosion(null, posX, posY, posZ, f);
    }

    protected void writeEntityToNBT(NBTTagCompound nbttagcompound)
    {
        nbttagcompound.setByte("Fuse", (byte)fuse);
    }

    protected void readEntityFromNBT(NBTTagCompound nbttagcompound)
    {
        fuse = nbttagcompound.getByte("Fuse");
    }

    public float getShadowSize()
    {
        return 0.0F;
    }

    public int fuse;
}
