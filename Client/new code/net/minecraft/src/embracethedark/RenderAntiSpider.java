package net.minecraft.src.embracethedark;
//makes git work
import net.minecraft.src.RenderLiving;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;

public class RenderAntiSpider extends RenderLiving{
	
	public RenderAntiSpider()
    {
        super(new ModelAntiSpider(), 1.0F);
        setRenderPassModel(new ModelAntiSpider());
    }

}
