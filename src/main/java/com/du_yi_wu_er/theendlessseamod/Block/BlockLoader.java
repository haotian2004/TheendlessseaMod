package com.du_yi_wu_er.theendlessseamod.Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockLoader {
    //Block 实例化
    //public static Block (block name) = new Block class("name",Material.ROCK);
    public static Block falsegrass = new Blockfalsegrass("falsegrass",Material.ROCK);

    //Block 注册
    public static void Blockblock() {
        //ForgeRegistries.BLOCKS.register((block name));
        ForgeRegistries.BLOCKS.register(falsegrass);
    }
}
