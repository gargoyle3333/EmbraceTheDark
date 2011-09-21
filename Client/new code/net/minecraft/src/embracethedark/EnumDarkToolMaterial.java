package net.minecraft.src.embracethedark;
//makes git work
public enum EnumDarkToolMaterial{

    DEADWOOD("DEADWOOD", 0, 0, 59, 2.0F, 0),
    COFFINROCK("COFFINROCK", 1, 1, 131, 4F, 1),
    VULCAN("VULCAN", 2, 2, 250, 6F, 2),
    DEMONICUS("DEMONICUS", 3, 3, 1561, 8F, 3);

    
    private EnumDarkToolMaterial(String s, int i, int j, int k, float f, int l)
    {
        harvestLevel = j;
        maxUses = k;
        efficiencyOnProperMaterial = f;
        damageVsEntity = l;
    }

    public int getMaxUses()
    {
        return maxUses;
    }

    public float getEfficiencyOnProperMaterial()
    {
        return efficiencyOnProperMaterial;
    }

    public int getDamageVsEntity()
    {
        return damageVsEntity;
    }

    public int getHarvestLevel()
    {
        return harvestLevel;
    }
    
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiencyOnProperMaterial;
    private final int damageVsEntity;
    private static final EnumDarkToolMaterial allToolMaterials[]; /* synthetic field */

    static 
    {
        allToolMaterials = (new EnumDarkToolMaterial[] {
            DEADWOOD, COFFINROCK, VULCAN, DEMONICUS
        });
    }
}
