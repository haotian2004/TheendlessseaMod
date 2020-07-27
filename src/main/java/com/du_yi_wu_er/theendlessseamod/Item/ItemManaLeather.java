package com.du_yi_wu_er.theendlessseamod.Item;

import com.du_yi_wu_er.theendlessseamod.tab.Tabtheendlessseamod;
import net.minecraft.item.Item;

public class ItemManaLeather extends Item {
    public ItemManaLeather(String name) {
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setMaxStackSize(64);
        this.setCreativeTab(Tabtheendlessseamod.tabtheendlessseamod);
    }
}
