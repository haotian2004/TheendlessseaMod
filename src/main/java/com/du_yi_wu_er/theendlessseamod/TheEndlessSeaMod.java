package com.du_yi_wu_er.theendlessseamod;

import com.du_yi_wu_er.theendlessseamod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = TheEndlessSeaMod.MODID, name = TheEndlessSeaMod.NAME, version = TheEndlessSeaMod.VERSION, acceptableRemoteVersions = TheEndlessSeaMod.acceptedMinecraftVersions)
public class TheEndlessSeaMod {

    public static final String MODID = "theendlessseamod";
    public static final String NAME = "The Endless Sea Mod";
    public static final String VERSION = "1.0.2";
    public static final String acceptedMinecraftVersions = "1.12.2";
    public static final Logger logger = LogManager.getLogger(MODID);

    @Mod.Instance(TheEndlessSeaMod.MODID)
    public static TheEndlessSeaMod instance;

    @SidedProxy(
            clientSide = "com.du_yi_wu_er.theendlessseamod.proxy.ClientProxy",
            serverSide = "com.du_yi_wu_er.theendlessseamod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit (FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init (FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }

}
