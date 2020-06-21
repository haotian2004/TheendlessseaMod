package com.du_yi_wu_er.theendlessseamod.Item;

import com.du_yi_wu_er.theendlessseamod.tab.Tabtheendlessseamod;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;

import java.util.Set;

public class Toolfalsepickaxe extends ItemTool {

    private static final Item.ToolMaterial FALSE_AXE = EnumHelper.addToolMaterial("false_pickaxe",1,6666,3.0F,2.0F,15);
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[]{Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});

    public Toolfalsepickaxe(String name){
        super(FALSE_AXE,EFFECTIVE_ON);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(Tabtheendlessseamod.tabtheendlessseamod);
    }

}
