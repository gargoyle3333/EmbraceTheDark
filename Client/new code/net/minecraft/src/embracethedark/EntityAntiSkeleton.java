package net.minecraft.src.embracethedark;
//makes git work
import net.minecraft.src.Entity;
import net.minecraft.src.EntityArrow;
import net.minecraft.src.EntityMob;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MathHelper;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.World;

public class EntityAntiSkeleton extends EntityMob {

	public EntityAntiSkeleton(World world) {
		super(world);
		texture = "/DarkMobs/AntiSkeleton.png";
	}
	
	 protected String getLivingSound()
	    {
	        return "mob.skeleton";
	    }

	    protected String getHurtSound()
	    {
	        return "mob.skeletonhurt";
	    }

	    protected String getDeathSound()
	    {
	        return "mob.skeletonhurt";
	    }
	    
	    protected void attackEntity(Entity entity, float f)
	    {
	        if(f < 10F)
	        {
	            double d = entity.posX - posX;
	            double d1 = entity.posZ - posZ;
	            if(attackTime == 0)
	            {
	                EntityArrow entityarrow = new EntityArrow(worldObj, this, 0); // Had an error
	                entityarrow.posY += 1.3999999761581421D;
	                double d2 = (entity.posY + (double)entity.getEyeHeight()) - 0.20000000298023224D - entityarrow.posY;
	                float f1 = MathHelper.sqrt_double(d * d + d1 * d1) * 0.2F;
	                worldObj.playSoundAtEntity(this, "random.bow", 1.0F, 1.0F / (rand.nextFloat() * 0.4F + 0.8F));
	                worldObj.entityJoinedWorld(entityarrow);
	                entityarrow.setArrowHeading(d, d2 + (double)f1, d1, 0.6F, 12F);
	                attackTime = 30;
	            }
	            rotationYaw = (float)((Math.atan2(d1, d) * 180D) / 3.1415927410125732D) - 90F;
	            hasAttacked = true;
	        }
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
	        return Item.arrow.shiftedIndex;
	    }

	    protected void dropFewItems()
	    {
	        int i = rand.nextInt(3);
	        for(int j = 0; j < i; j++)
	        {
	            dropItem(Item.arrow.shiftedIndex, 1);
	        }

	        i = rand.nextInt(3);
	        for(int k = 0; k < i; k++)
	        {
	            dropItem(Item.bone.shiftedIndex, 1);
	        }

	    }

	    public ItemStack getHeldItem()
	    {
	        return defaultHeldItem;
	    }

	    private static final ItemStack defaultHeldItem;

	    static 
	    {
	        defaultHeldItem = new ItemStack(Item.bow, 1);
	    }

}
