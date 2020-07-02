package com.du_yi_wu_er.theendlessseamod.Item;

import com.du_yi_wu_er.theendlessseamod.Block.BlockLoader;
import com.du_yi_wu_er.theendlessseamod.tab.Tabtheendlessseamod;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;

public class ItemMercury extends ItemBucket {

    public ItemMercury(String name) {
        super(BlockLoader.mercury);
        this.setContainerItem(Items.BUCKET);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(Tabtheendlessseamod.tabtheendlessseamod);
    }
}
