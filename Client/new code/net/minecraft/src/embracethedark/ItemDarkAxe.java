// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 
//makes git work
package net.minecraft.src.embracethedark;

import net.minecraft.src.Block;


// Referenced classes of package net.minecraft.src:
//            ItemTool, Block, EnumToolMaterial

public class ItemDarkAxe extends ItemDarkTool
{

    public ItemDarkAxe(int i, EnumDarkToolMaterial enumdarktoolmaterial)
    {
        super(i, 3, enumdarktoolmaterial, blocksEffectiveAgainst);
    }

    private static Block blocksEffectiveAgainst[];

    static 
    {
        blocksEffectiveAgainst = (new Block[] {
            Block.planks, Block.bookShelf, Block.wood, Block.chest
        });
    }
}
