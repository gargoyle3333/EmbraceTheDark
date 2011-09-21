package net.minecraft.src.embracethedark;
//makes git work
import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.Teleporter;
import net.minecraft.src.World;
import net.minecraft.src.mod_EmbraceTheDark;

public class TeleporterDark extends Teleporter{
	
	 public TeleporterDark() {
	        brickZom = mod_EmbraceTheDark.brickZom.blockID;
	        portal = mod_EmbraceTheDark.darkPortal.blockID;
	        //core = mod_MoonDimension.m;
			Random random1 = null;
	    }
	 
	 //public static int travel = -1;
	 
	// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
	// Jad home page: http://www.kpdus.com/jad.html
	// Decompiler options: packimports(3) braces deadcode 

	    private boolean findPortal(World world, Entity entity)
	    {
	        char c = '\200';
	        double d = -1D;
	        int i = 0;
	        int j = 0;
	        int k = 0;
	        int l = MathHelper.floor_double(entity.posX);
	        int i1 = MathHelper.floor_double(entity.posZ);
	        for(int j1 = l - c; j1 <= l + c; j1++)
	        {
	            double d4 = ((double)j1 + 0.5D) - entity.posX;
	            for(int k1 = i1 - c; k1 <= i1 + c; k1++)
	            {
	                double d6 = ((double)k1 + 0.5D) - entity.posZ;
	                for(int l1 = 127; l1 >= 0; l1--)
	                {
	                    if(world.getBlockId(j1, l1, k1) != portal)
	                    {
	                        continue;
	                    }
	                    for(; world.getBlockId(j1, l1 - 1, k1) == portal; l1--) { }
	                    double d1 = ((double)l1 + 0.5D) - entity.posY;
	                    double d7 = d4 * d4 + d1 * d1 + d6 * d6;
	                    if(d < 0.0D || d7 < d)
	                    {
	                        d = d7;
	                        i = j1;
	                        j = l1;
	                        k = k1;
	                    }
	                }

	            }

	        }

	        if(d >= 0.0D)
	        {
	            double d3 = (double)i + 0.5D;
	            double d5 = (double)j + 0.5D;
	            double d2 = (double)k + 0.5D;
	            if(world.getBlockId(i - 1, j, k) == portal)
	            {
	                d3 -= 0.5D;
	            }
	            if(world.getBlockId(i + 1, j, k) == portal)
	            {
	                d3 += 0.5D;
	            }
	            if(world.getBlockId(i, j, k - 1) == portal)
	            {
	                d2 -= 0.5D;
	            }
	            if(world.getBlockId(i, j, k + 1) == portal)
	            {
	                d2 += 0.5D;
	            }
	            entity.setLocationAndAngles(d3, d5, d2, entity.rotationYaw, 0.0F);
	            entity.motionX = entity.motionY = entity.motionZ = 0.0D;
	            return true;
	        } else
	        {
	            return false;
	        }
	    }

	    private boolean createPortalDo(World world, Entity entity)
	    {
	        byte byte0 = 16;
	        double d = -1D;
	        int i = MathHelper.floor_double(entity.posX);
	        int j = MathHelper.floor_double(entity.posY);
	        int k = MathHelper.floor_double(entity.posZ);
	        int l = i;
	        int i1 = j;
	        int j1 = k;
	        int k1 = 0;
	        int l1 = random1.nextInt(4);
	        for(int i2 = i - byte0; i2 <= i + byte0; i2++)
	        {
	            double d1 = ((double)i2 + 0.5D) - entity.posX;
	            for(int k2 = k - byte0; k2 <= k + byte0; k2++)
	            {
	                double d3 = ((double)k2 + 0.5D) - entity.posZ;
	                for(int k4 = 127; k4 >= 0; k4--)
	                {
	                    if(!world.isAirBlock(i2, k4, k2))
	                    {
	                        continue;
	                    }
	                    for(; k4 > 0 && world.isAirBlock(i2, k4 - 1, k2); k4--) { }
	label0:
	                    for(int j3 = l1; j3 < l1 + 4; j3++)
	                    {
	                        int l6 = j3 % 2;
	                        int k5 = 1 - l6;
	                        if(j3 % 4 >= 2)
	                        {
	                            l6 = -l6;
	                            k5 = -k5;
	                        }
	                        for(int j9 = 0; j9 < 3; j9++)
	                        {
	                            for(int i8 = 0; i8 < 4; i8++)
	                            {
	                                for(int i11 = -1; i11 < 4; i11++)
	                                {
	                                    int k10 = i2 + (i8 - 1) * l6 + j9 * k5;
	                                    int k11 = k4 + i11;
	                                    int i12 = (k2 + (i8 - 1) * k5) - j9 * l6;
	                                    if(i11 < 0 && !world.getBlockMaterial(k10, k11, i12).isSolid() || i11 >= 0 && !world.isAirBlock(k10, k11, i12))
	                                    {
	                                        break label0;
	                                    }
	                                }

	                            }

	                        }

	                        double d7 = ((double)k4 + 0.5D) - entity.posY;
	                        double d5 = d1 * d1 + d7 * d7 + d3 * d3;
	                        if(d < 0.0D || d5 < d)
	                        {
	                            d = d5;
	                            l = i2;
	                            i1 = k4;
	                            j1 = k2;
	                            k1 = j3 % 4;
	                        }
	                    }

	                }

	            }

	        }

	        if(d < 0.0D)
	        {
	            for(int j2 = i - byte0; j2 <= i + byte0; j2++)
	            {
	                double d2 = ((double)j2 + 0.5D) - entity.posX;
	                for(int l2 = k - byte0; l2 <= k + byte0; l2++)
	                {
	                    double d4 = ((double)l2 + 0.5D) - entity.posZ;
	                    for(int l4 = 127; l4 >= 0; l4--)
	                    {
	                        if(!world.isAirBlock(j2, l4, l2))
	                        {
	                            continue;
	                        }
	                        for(; world.isAirBlock(j2, l4 - 1, l2); l4--) { }
	label1:
	                        for(int k3 = l1; k3 < l1 + 2; k3++)
	                        {
	                            int i7 = k3 % 2;
	                            int l5 = 1 - i7;
	                            for(int k9 = 0; k9 < 4; k9++)
	                            {
	                                for(int j8 = -1; j8 < 4; j8++)
	                                {
	                                    int j11 = j2 + (k9 - 1) * i7;
	                                    int l10 = l4 + j8;
	                                    int l11 = l2 + (k9 - 1) * l5;
	                                    if(j8 < 0 && !world.getBlockMaterial(j11, l10, l11).isSolid() || j8 >= 0 && !world.isAirBlock(j11, l10, l11))
	                                    {
	                                        break label1;
	                                    }
	                                }

	                            }

	                            double d8 = ((double)l4 + 0.5D) - entity.posY;
	                            double d6 = d2 * d2 + d8 * d8 + d4 * d4;
	                            if(d < 0.0D || d6 < d)
	                            {
	                                d = d6;
	                                l = j2;
	                                i1 = l4;
	                                j1 = l2;
	                                k1 = k3 % 2;
	                            }
	                        }

	                    }

	                }

	            }

	        }
	        int j12 = l;
	        int k12 = i1;
	        int i3 = j1;
	        int l12 = k1 % 2;
	        int i13 = 1 - l12;
	        if(k1 % 4 >= 2)
	        {
	            l12 = -l12;
	            i13 = -i13;
	        }
	        if(d < 0.0D)
	        {
	            if(i1 < 70)
	            {
	                i1 = 70;
	            }
	            if(i1 > 118)
	            {
	                i1 = 118;
	            }
	            k12 = i1;
	            for(int i5 = -1; i5 <= 1; i5++)
	            {
	                for(int l3 = 1; l3 < 3; l3++)
	                {
	                    for(int j7 = -1; j7 < 3; j7++)
	                    {
	                        int i6 = j12 + (l3 - 1) * l12 + i5 * i13;
	                        int l9 = k12 + j7;
	                        int k8 = (i3 + (l3 - 1) * i13) - i5 * l12;
	                        boolean flag = j7 < 0;
	                        world.setBlockWithNotify(i6, l9, k8, flag ? mod_EmbraceTheDark.brickZom.blockID : 0);
	                    }

	                }

	            }

	        }
	        for(int j5 = 0; j5 < 4; j5++)
	        {
	            world.editingBlocks = true;
	            for(int i4 = 0; i4 < 4; i4++)
	            {
	                for(int k7 = -1; k7 < 4; k7++)
	                {
	                    int j6 = j12 + (i4 - 1) * l12;
	                    int i10 = k12 + k7;
	                    int l8 = i3 + (i4 - 1) * i13;
	                    boolean flag1 = i4 == 0 || i4 == 3 || k7 == -1 || k7 == 3;
	                    world.setBlockWithNotify(j6, i10, l8, flag1 ? mod_EmbraceTheDark.brickZom.blockID : Block.portal.blockID);
	                }

	            }

	            world.editingBlocks = false;
	            for(int j4 = 0; j4 < 4; j4++)
	            {
	                for(int l7 = -1; l7 < 4; l7++)
	                {
	                    int k6 = j12 + (j4 - 1) * l12;
	                    int j10 = k12 + l7;
	                    int i9 = i3 + (j4 - 1) * i13;
	                    world.notifyBlocksOfNeighborChange(k6, j10, i9, world.getBlockId(k6, j10, i9));
	                }

	            }

	        }

	        return true;
	    }

	 private int brickZom;
	 private int portal;
	 private Random random1;
}
