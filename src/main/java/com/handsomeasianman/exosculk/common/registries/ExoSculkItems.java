package com.handsomeasianman.exosculk.common.registries;

import com.handsomeasianman.exosculk.common.ExoSculk;
import com.handsomeasianman.exosculk.common.item.ExoSculkTiers;
import com.handsomeasianman.exosculk.common.item.exotech.ExoTechAxe;
import com.handsomeasianman.exosculk.common.item.exotech.ExoTechShovel;
import com.handsomeasianman.exosculk.common.item.exotech.ExotechSword;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ExoSculkItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExoSculk.MOD_ID);

    public static final RegistryObject<Item> BIOLOGICAL_VOID_MATTER = ITEMS.register("biological_void_matter",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SCULK_SWORD = ITEMS.register("sculk_sword", () -> new SwordItem(ExoSculkTiers.SCULK,4,-2.4F,new Item.Properties()));
    public static final RegistryObject<Item> SCULK_SHOVEL = ITEMS.register("sculk_shovel", () -> new ShovelItem(ExoSculkTiers.SCULK,1.5F,-3.0F,new Item.Properties()));
    public static final RegistryObject<Item> SCULK_PICKAXE = ITEMS.register("sculk_pickaxe", () -> new PickaxeItem(ExoSculkTiers.SCULK,1,-2.8F,new Item.Properties()));
    public static final RegistryObject<Item> SCULK_AXE = ITEMS.register("sculk_axe", () -> new AxeItem(ExoSculkTiers.SCULK,6.0F,-3.0F,new Item.Properties()));
    public static final RegistryObject<Item> SCULK_HOE = ITEMS.register("sculk_hoe", () -> new HoeItem(ExoSculkTiers.SCULK,-5,0.0F,new Item.Properties()));
    public static final RegistryObject<Item> EXOSCULK_SWORD = ITEMS.register("exosculk_sword", () -> new ExotechSword(ExoSculkTiers.EXOSCULK,6,-2.4F,new Item.Properties()));
    public static final RegistryObject<Item> EXOSCULK_SHOVEL = ITEMS.register("exosculk_shovel", () -> new ExoTechShovel(ExoSculkTiers.EXOSCULK,0.0F,-3.0F,new Item.Properties()));
    public static final RegistryObject<Item> EXOSCULK_PICKAXE = ITEMS.register("exosculk_pickaxe", () -> new PickaxeItem(ExoSculkTiers.EXOSCULK,-2,-2.8F,new Item.Properties()));
    public static final RegistryObject<Item> EXOSCULK_AXE = ITEMS.register("exosculk_axe", () -> new ExoTechAxe(ExoSculkTiers.EXOSCULK,9.0F,-3.0F,new Item.Properties()));
    public static final RegistryObject<Item> EXOSCULK_HOE = ITEMS.register("exosculk_hoe", () -> new HoeItem(ExoSculkTiers.EXOSCULK,-8,0.0F,new Item.Properties()));
    public static final RegistryObject<Item> EXOTECH_SWORD = ITEMS.register("exotech_sword", () -> new ExotechSword(ExoSculkTiers.EXOTECH,10,-2.4F,new Item.Properties()));
    public static final RegistryObject<Item> EXOTECH_SHOVEL = ITEMS.register("exotech_shovel", () -> new ExoTechShovel(ExoSculkTiers.EXOTECH,0.0F,-3.0F,new Item.Properties()));
    public static final RegistryObject<Item> EXOTECH_PICKAXE = ITEMS.register("exotech_pickaxe", () -> new PickaxeItem(ExoSculkTiers.EXOTECH,-5,-2.8F,new Item.Properties()));
    public static final RegistryObject<Item> EXOTECH_AXE = ITEMS.register("exotech_axe", () -> new ExoTechAxe(ExoSculkTiers.EXOTECH,15.0F,-3.0F,new Item.Properties()));
    public static final RegistryObject<Item> EXOTECH_HOE = ITEMS.register("exotech_hoe", () -> new HoeItem(ExoSculkTiers.EXOTECH,-15,0.0F,new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
