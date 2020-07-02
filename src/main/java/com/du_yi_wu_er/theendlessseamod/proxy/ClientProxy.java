package com.du_yi_wu_er.theendlessseamod.proxy;

import com.du_yi_wu_er.theendlessseamod.Item.ItemRenderLoader;
import com.du_yi_wu_er.theendlessseamod.fluid.FluidModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
        new ItemRenderLoader();
        FluidModelLoader.registerCustomMeshesAndStates();
    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
    }

}
