package com.du_yi_wu_er.theendlessseamod.Item.Processors.Quartzs;

import com.du_yi_wu_er.theendlessseamod.tab.Tabtheendlessseamod;
import net.minecraft.item.Item;

public class ItemPrintedQuartzProcessor extends Item {
    public ItemPrintedQuartzProcessor(String name) {
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setMaxStackSize(64);
        this.setCreativeTab(Tabtheendlessseamod.tabtheendlessseamod);
    }
}
