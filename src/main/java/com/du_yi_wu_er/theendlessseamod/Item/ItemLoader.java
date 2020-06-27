package com.du_yi_wu_er.theendlessseamod.Item;

import com.du_yi_wu_er.theendlessseamod.Block.BlockLoader;
import com.du_yi_wu_er.theendlessseamod.Item.Tool.*;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader {
    //Item 实例化
    // static Item (Item name) = new Item class("name");
    public static Item theendlessseaii = new Itemtheendlessseaii("theendlessseaii");
    public static Item storagefocus = new Itemstoragefocus("storagefocus");
    public static Item wandunbreakable_port = new Itemwandunbreakableport("wandunbreakable_port");
    public static Item wandunbreakable_stick = new Itemwandunbreakablestick("wandunbreakable_stick");
    public static Item false_sword = new Toolfalsesword("false_sword");
    public static Item false_axe = new Toolfalseaxe("false_axe");
    public static Item false_pickaxe = new Toolfalsepickaxe("false_pickaxe");
    public static Item false_shovel = new Toolfalseshovel("false_shovel");
    public static Item false_hoe = new Toolfalsehoe("false_hoe");

    //block 物品方块注册
    public static void Blockitem(){
        //registeritemblock(BlockLoader.Block name);
        registeritemblock(BlockLoader.falsegrass);
    }

    public static void registeritemblock(Block block) {
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    public static void Itemitem() {
        //ForgeRegistries.ITEMS.register(Item name);
        ForgeRegistries.ITEMS.register(theendlessseaii);
        ForgeRegistries.ITEMS.register(storagefocus);
        ForgeRegistries.ITEMS.register(wandunbreakable_port);
        ForgeRegistries.ITEMS.register(wandunbreakable_stick);
        ForgeRegistries.ITEMS.register(false_sword);
        ForgeRegistries.ITEMS.register(false_axe);
        ForgeRegistries.ITEMS.register(false_pickaxe);
        ForgeRegistries.ITEMS.register(false_shovel);
        ForgeRegistries.ITEMS.register(false_hoe);
    }

    //Block 物品材质加载
    @SideOnly(Side.CLIENT)
    public static void BlockitemregisterRenders() {
        //regsiterRender(Item.getItemFromBlock(BlockLoader.材质名);
        regsiterRender(Item.getItemFromBlock(BlockLoader.falsegrass));
    }

    //Item 物品材质加载
    @SideOnly(Side.CLIENT)
    public static void ItemitemregisterRenders() {
        //regsiterRender(物品材质名);
        regsiterRender(theendlessseaii);
        regsiterRender(storagefocus);
        regsiterRender(wandunbreakable_port);
        regsiterRender(wandunbreakable_stick);
        regsiterRender(false_sword);
        regsiterRender(false_axe);
        regsiterRender(false_pickaxe);
        regsiterRender(false_shovel);
        regsiterRender(false_hoe);
    }

    @SideOnly(Side.CLIENT)
    private static void regsiterRender(Item item) {
        ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0,model);
    }
}
