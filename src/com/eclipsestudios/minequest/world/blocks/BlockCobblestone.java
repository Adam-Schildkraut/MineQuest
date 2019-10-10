package com.eclipsestudios.minequest.world.blocks;

import com.eclipsestudios.minequest.world.ItemStack;

public class BlockCobblestone extends Block {

    public BlockCobblestone() {

    }

    @Override
    public ItemStack getDrop() {
        return new ItemStack(cobblestone, 1);
    }

    @Override
    public int getTexture(int i) {
        return 1;
    }
}
