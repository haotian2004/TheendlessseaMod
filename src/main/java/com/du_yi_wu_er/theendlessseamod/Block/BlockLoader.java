package com.du_yi_wu_er.theendlessseamod.Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockLoader {
    //Block 实例化
    //public static Block (block name) = new Block+(block name)(Material.ROCK).setRegistryName("block name");
    public static Block falsegrass = new Blockfalsegrass(Material.ROCK).setRegistryName("falsegrass");

    //Block 注册
    public static void Blockblock() {
        //ForgeRegistries.BLOCKS.register((block name));
        ForgeRegistries.BLOCKS.register(falsegrass);
    }
}
