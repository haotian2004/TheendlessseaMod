package com.du_yi_wu_er.theendlessseamod.Block;

import com.du_yi_wu_er.theendlessseamod.fluid.FluidLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockLoader {
    //Block 实例化
    //public static Block (block name) = new Block class("name",Material.ROCK);
    public static Block falsegrass = new Blockfalsegrass("falsegrass",Material.ROCK);

    //FluidBlock 实例化
    public static Block mercury = new Blockmercuryfluid("mercury_fluid",FluidLoader.mercury,Material.WATER);

    //Block 注册
    public static void Blockblock() {
        //ForgeRegistries.BLOCKS.register((block name));
        ForgeRegistries.BLOCKS.register(falsegrass);
        ForgeRegistries.BLOCKS.register(mercury);
    }
}
