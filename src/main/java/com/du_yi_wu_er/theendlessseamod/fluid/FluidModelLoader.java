package com.du_yi_wu_er.theendlessseamod.fluid;

import com.du_yi_wu_er.theendlessseamod.Block.BlockLoader;
import com.du_yi_wu_er.theendlessseamod.TheEndlessSeaMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class FluidModelLoader {

    public static void registerCustomMeshesAndStates(){

        ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(BlockLoader.Mercury), new ItemMeshDefinition() {
            @Override
            public ModelResourceLocation getModelLocation(ItemStack Stack) {
                return new ModelResourceLocation(TheEndlessSeaMod.MODID + ":mercury","fluid");
            }
        });

        ModelLoader.setCustomStateMapper(BlockLoader.Mercury, new StateMapperBase() {
            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
                return new ModelResourceLocation(TheEndlessSeaMod.MODID + ":mercury","fluid");
            }
        });

    }

}
