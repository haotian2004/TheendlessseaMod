package com.du_yi_wu_er.theendlessseamod.Item.Tool;

import com.du_yi_wu_er.theendlessseamod.tab.Tabtheendlessseamod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

import javax.annotation.Nullable;
import java.util.List;

public class Toolfalsehoe extends ItemHoe {

    private static final Item.ToolMaterial FALSE_HOE = EnumHelper.addToolMaterial("false_hoe",1,6666,3.0F,0.5F,10);

    public Toolfalsehoe(String name){
        super(FALSE_HOE);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(Tabtheendlessseamod.tabtheendlessseamod);
    }

    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> list) {
        if (isInCreativeTab(tab)) {
            ItemStack istack = new ItemStack(this);
            istack.addEnchantment(Enchantments.UNBREAKING, 1);
            list.add(istack);
        }
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        if(flagIn.isAdvanced()){
            tooltip.add(I18n.format(this.getUnlocalizedName()+".1."+"tooltip"));
        }
    }
}
