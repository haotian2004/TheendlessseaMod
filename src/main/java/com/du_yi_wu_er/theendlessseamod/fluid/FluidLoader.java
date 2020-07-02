package com.du_yi_wu_er.theendlessseamod.fluid;

import com.du_yi_wu_er.theendlessseamod.TheEndlessSeaMod;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidLoader {
    //Fluid 实例化
    public static Fluid mercury = new Fluidmercury("mercury",new ResourceLocation(TheEndlessSeaMod.MODID + ":fluids/mercury_still"),new ResourceLocation(TheEndlessSeaMod.MODID + "fluids/mercury_flow"),new ResourceLocation(TheEndlessSeaMod.MODID + "fluids/mercury_overlay"));

    //Fluid 注册
    public static void Fluidfluid(){
        registerfluid(mercury);
    }

    public static void registerfluid(Fluid fluid){
        FluidRegistry.registerFluid(fluid);
        FluidRegistry.addBucketForFluid(fluid);
    }

}
