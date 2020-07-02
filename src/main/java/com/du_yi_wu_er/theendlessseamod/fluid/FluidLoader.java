package com.du_yi_wu_er.theendlessseamod.fluid;

import com.du_yi_wu_er.theendlessseamod.Block.BlockLoader;
import com.du_yi_wu_er.theendlessseamod.TheEndlessSeaMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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

    //Fluid材质 注册
    @SideOnly(Side.CLIENT)
    public static void registerRenders() {

        registerFluidRender((BlockFluidBase) BlockLoader.mercury,"fluid_mercury");
    }

    @SideOnly(Side.CLIENT)
    public static void registerFluidRender(BlockFluidBase blockFluid,String blockStateName) {

        final String location = TheEndlessSeaMod.MODID+":"+blockStateName;
        final Item itemFluid = Item.getItemFromBlock(blockFluid);

        ModelLoader.setCustomMeshDefinition(itemFluid, new ItemMeshDefinition() {

            @Override
            public ModelResourceLocation getModelLocation(ItemStack stack)
            {
                return new ModelResourceLocation(location, "fluid");
            }

        });

        ModelLoader.setCustomStateMapper(blockFluid,new StateMapperBase() {

            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state)
            {
                return new ModelResourceLocation(location,"fluid");
            }

        });
    }
}
