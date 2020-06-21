package com.du_yi_wu_er.theendlessseamod.tab;

import com.du_yi_wu_er.theendlessseamod.Item.ItemLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Tabtheendlessseamod extends CreativeTabs {

    public static final Tabtheendlessseamod tabtheendlessseamod = new Tabtheendlessseamod();

    public Tabtheendlessseamod() { super("theendlessseamod");}

    @SideOnly(Side.CLIENT)
    public ItemStack getTabIconItem() {return new ItemStack(ItemLoader.theendlessseaii);}
}
