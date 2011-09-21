package net.minecraft.src.embracethedark;
//makes git work
import java.util.Iterator;
import java.util.List;

import net.minecraft.src.Entity;
import net.minecraft.src.EntityAnimal;
import net.minecraft.src.Item;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.World;

public class EntityHellHound extends EntityAnimal {

	public EntityHellHound(World world)
    {
        super(world);
        texture = "/DarkMobs/hellHound.png";
        setSize(1.0F, 1.0F);
        moveSpeed = 1.1F;
        health = 8;
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
	        return "mob.wolf.growl";
	    }

	    protected String getHurtSound()
	    {
	        return "mob.wolf.hurt";
	    }

	    protected String getDeathSound()
	    {
	        return "mob.wolf.death";
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
