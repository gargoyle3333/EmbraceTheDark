package net.minecraft.src.embracethedark;
//makes git work
import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.Material;

public class BrickMob extends Block {

	public BrickMob(int i, int j) {
		super(i, j, Material.wood);
	}
	
	public int idDropped (int i, Random random) {
		return blockID;
	}
	
	public int quantityDropped( Random random ){
		return 1;
	}

}
