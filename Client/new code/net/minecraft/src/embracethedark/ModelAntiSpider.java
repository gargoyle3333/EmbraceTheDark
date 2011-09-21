package net.minecraft.src.embracethedark;
//makes git work
import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelAntiSpider extends ModelBase {
	
	public ModelAntiSpider()
    {
        float f = 0.0F;
        int i = 15;
        antiSpiderHead = new ModelRenderer(this, 32, 4);
        antiSpiderHead.addBox(-4F, -4F, -8F, 8, 8, 8, f);
        antiSpiderHead.setRotationPoint(0.0F, 0 + i, -3F);
        antiSpiderNeck = new ModelRenderer(this, 0, 0);
        antiSpiderNeck.addBox(-3F, -3F, -3F, 6, 6, 6, f);
        antiSpiderNeck.setRotationPoint(0.0F, i, 0.0F);
        antiSpiderBody = new ModelRenderer(this, 0, 12);
        antiSpiderBody.addBox(-5F, -4F, -6F, 10, 8, 12, f);
        antiSpiderBody.setRotationPoint(0.0F, 0 + i, 9F);
        antiSpiderLeg1 = new ModelRenderer(this, 18, 0);
        antiSpiderLeg1.addBox(-15F, -1F, -1F, 16, 2, 2, f);
        antiSpiderLeg1.setRotationPoint(-4F, 0 + i, 2.0F);
        antiSpiderLeg2 = new ModelRenderer(this, 18, 0);
        antiSpiderLeg2.addBox(-1F, -1F, -1F, 16, 2, 2, f);
        antiSpiderLeg2.setRotationPoint(4F, 0 + i, 2.0F);
        antiSpiderLeg3 = new ModelRenderer(this, 18, 0);
        antiSpiderLeg3.addBox(-15F, -1F, -1F, 16, 2, 2, f);
        antiSpiderLeg3.setRotationPoint(-4F, 0 + i, 1.0F);
        antiSpiderLeg4 = new ModelRenderer(this, 18, 0);
        antiSpiderLeg4.addBox(-1F, -1F, -1F, 16, 2, 2, f);
        antiSpiderLeg4.setRotationPoint(4F, 0 + i, 1.0F);
        antiSpiderLeg5 = new ModelRenderer(this, 18, 0);
        antiSpiderLeg5.addBox(-15F, -1F, -1F, 16, 2, 2, f);
        antiSpiderLeg5.setRotationPoint(-4F, 0 + i, 0.0F);
        antiSpiderLeg6 = new ModelRenderer(this, 18, 0);
        antiSpiderLeg6.addBox(-1F, -1F, -1F, 16, 2, 2, f);
        antiSpiderLeg6.setRotationPoint(4F, 0 + i, 0.0F);
        antiSpiderLeg7 = new ModelRenderer(this, 18, 0);
        antiSpiderLeg7.addBox(-15F, -1F, -1F, 16, 2, 2, f);
        antiSpiderLeg7.setRotationPoint(-4F, 0 + i, -1F);
        antiSpiderLeg8 = new ModelRenderer(this, 18, 0);
        antiSpiderLeg8.addBox(-1F, -1F, -1F, 16, 2, 2, f);
        antiSpiderLeg8.setRotationPoint(4F, 0 + i, -1F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        setRotationAngles(f, f1, f2, f3, f4, f5);
        antiSpiderHead.render(f5);
        antiSpiderNeck.render(f5);
        antiSpiderBody.render(f5);
        antiSpiderLeg1.render(f5);
        antiSpiderLeg2.render(f5);
        antiSpiderLeg3.render(f5);
        antiSpiderLeg4.render(f5);
        antiSpiderLeg5.render(f5);
        antiSpiderLeg6.render(f5);
        antiSpiderLeg7.render(f5);
        antiSpiderLeg8.render(f5);
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
        antiSpiderHead.rotateAngleY = f3 / 57.29578F;
        antiSpiderHead.rotateAngleX = f4 / 57.29578F;
        float f6 = 0.7853982F;
        antiSpiderLeg1.rotateAngleZ = -f6;
        antiSpiderLeg2.rotateAngleZ = f6;
        antiSpiderLeg3.rotateAngleZ = -f6 * 0.74F;
        antiSpiderLeg4.rotateAngleZ = f6 * 0.74F;
        antiSpiderLeg5.rotateAngleZ = -f6 * 0.74F;
        antiSpiderLeg6.rotateAngleZ = f6 * 0.74F;
        antiSpiderLeg7.rotateAngleZ = -f6;
        antiSpiderLeg8.rotateAngleZ = f6;
        float f7 = -0F;
        float f8 = 0.3926991F;
        antiSpiderLeg1.rotateAngleY = f8 * 2.0F + f7;
        antiSpiderLeg2.rotateAngleY = -f8 * 2.0F - f7;
        antiSpiderLeg3.rotateAngleY = f8 * 1.0F + f7;
        antiSpiderLeg4.rotateAngleY = -f8 * 1.0F - f7;
        antiSpiderLeg5.rotateAngleY = -f8 * 1.0F + f7;
        antiSpiderLeg6.rotateAngleY = f8 * 1.0F - f7;
        antiSpiderLeg7.rotateAngleY = -f8 * 2.0F + f7;
        antiSpiderLeg8.rotateAngleY = f8 * 2.0F - f7;
        float f9 = -(MathHelper.cos(f * 0.6662F * 2.0F + 0.0F) * 0.4F) * f1;
        float f10 = -(MathHelper.cos(f * 0.6662F * 2.0F + 3.141593F) * 0.4F) * f1;
        float f11 = -(MathHelper.cos(f * 0.6662F * 2.0F + 1.570796F) * 0.4F) * f1;
        float f12 = -(MathHelper.cos(f * 0.6662F * 2.0F + 4.712389F) * 0.4F) * f1;
        float f13 = Math.abs(MathHelper.sin(f * 0.6662F + 0.0F) * 0.4F) * f1;
        float f14 = Math.abs(MathHelper.sin(f * 0.6662F + 3.141593F) * 0.4F) * f1;
        float f15 = Math.abs(MathHelper.sin(f * 0.6662F + 1.570796F) * 0.4F) * f1;
        float f16 = Math.abs(MathHelper.sin(f * 0.6662F + 4.712389F) * 0.4F) * f1;
        antiSpiderLeg1.rotateAngleY += f9;
        antiSpiderLeg2.rotateAngleY += -f9;
        antiSpiderLeg3.rotateAngleY += f10;
        antiSpiderLeg4.rotateAngleY += -f10;
        antiSpiderLeg5.rotateAngleY += f11;
        antiSpiderLeg6.rotateAngleY += -f11;
        antiSpiderLeg7.rotateAngleY += f12;
        antiSpiderLeg8.rotateAngleY += -f12;
        antiSpiderLeg1.rotateAngleZ += f13;
        antiSpiderLeg2.rotateAngleZ += -f13;
        antiSpiderLeg3.rotateAngleZ += f14;
        antiSpiderLeg4.rotateAngleZ += -f14;
        antiSpiderLeg5.rotateAngleZ += f15;
        antiSpiderLeg6.rotateAngleZ += -f15;
        antiSpiderLeg7.rotateAngleZ += f16;
        antiSpiderLeg8.rotateAngleZ += -f16;
    }

    public ModelRenderer antiSpiderHead;
    public ModelRenderer antiSpiderNeck;
    public ModelRenderer antiSpiderBody;
    public ModelRenderer antiSpiderLeg1;
    public ModelRenderer antiSpiderLeg2;
    public ModelRenderer antiSpiderLeg3;
    public ModelRenderer antiSpiderLeg4;
    public ModelRenderer antiSpiderLeg5;
    public ModelRenderer antiSpiderLeg6;
    public ModelRenderer antiSpiderLeg7;
    public ModelRenderer antiSpiderLeg8;
}
