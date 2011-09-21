package net.minecraft.src.embracethedark;
//makes git work
import net.minecraft.src.Entity;
import net.minecraft.src.EntityMob;
import net.minecraft.src.Item;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.World;

public class EntityAntiSpider extends EntityMob {
	
	public EntityAntiSpider(World world)
    {
        super(world);
        texture = "/DarkMobs/antiSpider.png";
        setSize(1.4F, 0.9F);
        moveSpeed = 0.8F;
    }

    public double getMountedYOffset()
    {
        return (double)height * 0.75D - 0.5D;
    }

    protected boolean canTriggerWalking()
    {
        return false;
    }

    protected Entity findPlayerToAttack()
    {
        float f = getEntityBrightness(1.0F);
        if(f < 0.5F)
        {
            double d = 16D;
            return worldObj.getClosestPlayerToEntity(this, d);
        } else
        {
            return null;
        }
    }

    protected String getLivingSound()
    {
        return "mob.spider";
    }

    protected String getHurtSound()
    {
        return "mob.spider";
    }

    protected String getDeathSound()
    {
        return "mob.spiderdeath";
    }

    protected void attackEntity(Entity entity, float f)
    {
        	super.attackEntity(entity, f);
    }

    public void writeEntityToNBT(NBTTagCompound nbttagcompound)
    {
        super.writeEntityToNBT(nbttagcompound);
    }

    public void readEntityFromNBT(NBTTagCompound nbttagcompound)
    {
        super.readEntityFromNBT(nbttagcompound);
    }

    protected int getDropItemId()
    {
        return Item.silk.shiftedIndex;
    }

    public boolean isOnLadder()
    {
        return isCollidedHorizontally;
    }

}
