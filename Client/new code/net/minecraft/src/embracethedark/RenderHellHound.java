package net.minecraft.src.embracethedark;
//makes git work
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.ModelBase;
import net.minecraft.src.RenderLiving;

public class RenderHellHound extends RenderLiving {
	 
	public RenderHellHound(ModelBase modelbase, float f)
	    {
	        super(modelbase, f);
	    }

	    public void renderHellHound(EntityHellHound entityHellHound, double d, double d1, double d2, 
	            float f, float f1)
	    {
	        super.doRenderLiving(entityHellHound, d, d1, d2, f, f1);
	    }

	    protected void func_25006_b(EntityHellHound entityHellHound, float f)
	    {
	    }

	    protected void preRenderCallback(EntityLiving entityliving, float f)
	    {
	        func_25006_b((EntityHellHound)entityliving, f);
	    }

	    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
	            float f, float f1)
	    {
	        renderHellHound((EntityHellHound)entityliving, d, d1, d2, f, f1);
	    }

	    public void doRender(Entity entity, double d, double d1, double d2, 
	            float f, float f1)
	    {
	        renderHellHound((EntityHellHound)entity, d, d1, d2, f, f1);
	    }
}
