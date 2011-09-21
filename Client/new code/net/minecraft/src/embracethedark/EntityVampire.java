package net.minecraft.src.embracethedark;
//makes git work
import net.minecraft.src.EntityMob;
import net.minecraft.src.World;

public class EntityVampire extends EntityMob{

	    public EntityVampire(World world)
	    {
	        super(world);
	        texture = "/DarkMobs/Vampire.png";
	        moveSpeed = 0.8F;
	        attackStrength = 6;
	    }

	    protected String getLivingSound()
	    {
	        return "mob.zombie";
	    }

	    protected String getHurtSound()
	    {
	        return "mob.zombiehurt";
	    }

	    protected String getDeathSound()
	    {
	        return "mob.zombiedeath";
	    }

}
