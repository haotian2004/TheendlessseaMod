package com.du_yi_wu_er.theendlessseamod.proxy;

import com.du_yi_wu_er.theendlessseamod.Block.BlockLoader;
import com.du_yi_wu_er.theendlessseamod.Item.ItemLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit (FMLPreInitializationEvent event)
    {
        ItemLoader.Blockitem();
        ItemLoader.Itemitem();
        BlockLoader.Blockblock();
    }

    public void init (FMLInitializationEvent event)
    {

    }

    public void postInit (FMLPostInitializationEvent event)
    {

    }
}
