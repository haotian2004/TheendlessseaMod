package com.du_yi_wu_er.theendlessseamod.Block;

import com.du_yi_wu_er.theendlessseamod.Item.ItemLoader;
import com.du_yi_wu_er.theendlessseamod.tab.Tabtheendlessseamod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockInfusedClayBlock extends Block {

    public BlockInfusedClayBlock(String nama, Material minecraft) {
        super(minecraft.GROUND);
        this.setUnlocalizedName(nama);
        this.setRegistryName(nama);
        this.setHardness(0.5F);
        this.setSoundType(SoundType.GROUND);
        this.setCreativeTab(Tabtheendlessseamod.tabtheendlessseamod);
    }


    public Item getItemDropped(IBlockState state, Random quantity, int quantityDropped){
        return ItemLoader.infused_clay;
    }

    public int quantityDropped(Random quantity){
        return 7 + quantity.nextInt(3);
    }

}
