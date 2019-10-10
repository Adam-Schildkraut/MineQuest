package com.eclipsestudios.minequest.world.blocks;

import com.eclipsestudios.minequest.world.ItemStack;

public class BlockCobblestone extends Block {

    public BlockCobblestone() {

    }

    @Override
    public int getTexture(int i) {
        return 2;
    }

    @Override
    public ItemStack getDrop() {
        return new ItemStack(cobblestone, 1);
    }
}
