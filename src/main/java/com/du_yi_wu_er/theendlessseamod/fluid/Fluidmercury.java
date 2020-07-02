package com.du_yi_wu_er.theendlessseamod.fluid;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class Fluidmercury extends Fluid {

    public Fluidmercury(String name,ResourceLocation still,ResourceLocation flow,ResourceLocation overlay){
        super(name,still,flow,overlay);
        this.setUnlocalizedName(name);
    }

}
