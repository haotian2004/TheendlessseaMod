package com.du_yi_wu_er.theendlessseamod.Item;

import com.du_yi_wu_er.theendlessseamod.tab.Tabtheendlessseamod;
import net.minecraft.item.Item;

public class Itemwandunbreakableport extends Item {

    public Itemwandunbreakableport(String name) {
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setMaxStackSize(8);
        this.setCreativeTab(Tabtheendlessseamod.tabtheendlessseamod);

    }
}
