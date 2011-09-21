package net.minecraft.src.embracethedark;
//makes git work
import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

import org.lwjgl.opengl.GL11;

public class ModelHellHound extends ModelBase{
	 
	public ModelHellHound()
	    {
	        float f = 0.0F;
	        float f1 = 13.5F;
	        houndHeadMain = new ModelRenderer(this, 0, 0);
	        houndHeadMain.addBox(-3F, -3F, -2F, 6, 6, 4, f);
	        houndHeadMain.setRotationPoint(-1F, f1, -7F);
	        houndBody = new ModelRenderer(this, 18, 14);
	        houndBody.addBox(-4F, -2F, -3F, 6, 9, 6, f);
	        houndBody.setRotationPoint(0.0F, 14F, 2.0F);
	        houndMane = new ModelRenderer(this, 21, 0);
	        houndMane.addBox(-4F, -3F, -3F, 8, 6, 7, f);
	        houndMane.setRotationPoint(-1F, 14F, 2.0F);
	        houndLeg1 = new ModelRenderer(this, 0, 18);
	        houndLeg1.addBox(-1F, 0.0F, -1F, 2, 8, 2, f);
	        houndLeg1.setRotationPoint(-2.5F, 16F, 7F);
	        houndLeg2 = new ModelRenderer(this, 0, 18);
	        houndLeg2.addBox(-1F, 0.0F, -1F, 2, 8, 2, f);
	        houndLeg2.setRotationPoint(0.5F, 16F, 7F);
	        houndLeg3 = new ModelRenderer(this, 0, 18);
	        houndLeg3.addBox(-1F, 0.0F, -1F, 2, 8, 2, f);
	        houndLeg3.setRotationPoint(-2.5F, 16F, -4F);
	        houndLeg4 = new ModelRenderer(this, 0, 18);
	        houndLeg4.addBox(-1F, 0.0F, -1F, 2, 8, 2, f);
	        houndLeg4.setRotationPoint(0.5F, 16F, -4F);
	        houndTail = new ModelRenderer(this, 9, 18);
	        houndTail.addBox(-1F, 0.0F, -1F, 2, 8, 2, f);
	        houndTail.setRotationPoint(-1F, 12F, 8F);
	        houndRightEar = new ModelRenderer(this, 16, 14);
	        houndRightEar.addBox(-3F, -5F, 0.0F, 2, 2, 1, f);
	        houndRightEar.setRotationPoint(-1F, f1, -7F);
	        houndLeftEar = new ModelRenderer(this, 16, 14);
	        houndLeftEar.addBox(1.0F, -5F, 0.0F, 2, 2, 1, f);
	        houndLeftEar.setRotationPoint(-1F, f1, -7F);
	        houndSnout = new ModelRenderer(this, 0, 10);
	        houndSnout.addBox(-2F, 0.0F, -5F, 3, 3, 4, f);
	        houndSnout.setRotationPoint(-0.5F, f1, -7F);
	    }

	    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	    {
	        super.render(entity, f, f1, f2, f3, f4, f5);
	        setRotationAngles(f, f1, f2, f3, f4, f5);
	        houndHeadMain.renderWithRotation(f5);
	        houndBody.render(f5);
	        houndLeg1.render(f5);
	        houndLeg2.render(f5);
	        houndLeg3.render(f5);
	        houndLeg4.render(f5);
	        houndRightEar.renderWithRotation(f5);
	        houndLeftEar.renderWithRotation(f5);
	        houndSnout.renderWithRotation(f5);
	        houndTail.renderWithRotation(f5);
	        houndMane.render(f5);
	    }

	    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	    {
	        super.setRotationAngles(f, f1, f2, f3, f4, f5);
	        houndHeadMain.rotateAngleX = f4 / 57.29578F;
	        houndHeadMain.rotateAngleY = f3 / 57.29578F;
	        houndRightEar.rotateAngleY = houndHeadMain.rotateAngleY;
	        houndRightEar.rotateAngleX = houndHeadMain.rotateAngleX;
	        houndLeftEar.rotateAngleY = houndHeadMain.rotateAngleY;
	        houndLeftEar.rotateAngleX = houndHeadMain.rotateAngleX;
	        houndSnout.rotateAngleY = houndHeadMain.rotateAngleY;
	        houndSnout.rotateAngleX = houndHeadMain.rotateAngleX;
	        houndTail.rotateAngleX = f2;
	    }

	    public ModelRenderer houndHeadMain;
	    public ModelRenderer houndBody;
	    public ModelRenderer houndLeg1;
	    public ModelRenderer houndLeg2;
	    public ModelRenderer houndLeg3;
	    public ModelRenderer houndLeg4;
	    ModelRenderer houndRightEar;
	    ModelRenderer houndLeftEar;
	    ModelRenderer houndSnout;
	    ModelRenderer houndTail;
	    ModelRenderer houndMane;
}
