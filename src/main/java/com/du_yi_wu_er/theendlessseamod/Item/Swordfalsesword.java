package com.du_yi_wu_er.theendlessseamod.Item;

import com.du_yi_wu_er.theendlessseamod.tab.Tabtheendlessseamod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class Swordfalsesword extends ItemSword {

    private static final Item.ToolMaterial FALSE_SWORD = EnumHelper.addToolMaterial("false_sword",1,6666,3.0F,4.0F,15);

    public Swordfalsesword(String name) {
        super(FALSE_SWORD);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(Tabtheendlessseamod.tabtheendlessseamod);
    }
}
