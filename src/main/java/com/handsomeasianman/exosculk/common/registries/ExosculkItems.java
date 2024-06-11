package com.handsomeasianman.exosculk.common.registries;

import com.handsomeasianman.exosculk.common.Exosculk;
import com.handsomeasianman.exosculk.common.item.ExosculkTiers;
import com.handsomeasianman.exosculk.common.item.ExoSculkTools;
import com.handsomeasianman.exosculk.common.item.ExoTechTools;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ExosculkItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Exosculk.MOD_ID);

    public static final RegistryObject<Item> BIOLOGICAL_VOID_MATTER = ITEMS.register("biological_void_matter", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SCULK_SWORD = ITEMS.register("sculk_sword", () -> new SwordItem(ExosculkTiers.SCULK,4,-2.4F,new Item.Properties()));
    public static final RegistryObject<Item> SCULK_SHOVEL = ITEMS.register("sculk_shovel", () -> new ShovelItem(ExosculkTiers.SCULK,1.5F,-3.0F,new Item.Properties()));
    public static final RegistryObject<Item> SCULK_PICKAXE = ITEMS.register("sculk_pickaxe", () -> new PickaxeItem(ExosculkTiers.SCULK,1,-2.8F,new Item.Properties()));
    public static final RegistryObject<Item> SCULK_AXE = ITEMS.register("sculk_axe", () -> new AxeItem(ExosculkTiers.SCULK,6.0F,-3.0F,new Item.Properties()));
    public static final RegistryObject<Item> SCULK_HOE = ITEMS.register("sculk_hoe", () -> new HoeItem(ExosculkTiers.SCULK,-5,0.0F,new Item.Properties()));
    public static final RegistryObject<Item> EXOSCULK_SWORD = ITEMS.register("exosculk_sword", () -> new ExoSculkTools.ExoSculkSword(new Item.Properties()));
    public static final RegistryObject<Item> EXOSCULK_SHOVEL = ITEMS.register("exosculk_shovel", () -> new ExoSculkTools.ExoSculkShovel(new Item.Properties()));
    public static final RegistryObject<Item> EXOSCULK_PICKAXE = ITEMS.register("exosculk_pickaxe", () -> new ExoSculkTools.ExoSculkPickaxe(new Item.Properties()));
    public static final RegistryObject<Item> EXOSCULK_AXE = ITEMS.register("exosculk_axe", () -> new ExoSculkTools.ExoSculkAxe(new Item.Properties()));
    public static final RegistryObject<Item> EXOSCULK_HOE = ITEMS.register("exosculk_hoe", () -> new ExoSculkTools.ExoTechHoe(new Item.Properties()));
    public static final RegistryObject<Item> EXOTECH_SWORD = ITEMS.register("exotech_sword", () -> new ExoTechTools.ExoTechSword(new Item.Properties()));
    public static final RegistryObject<Item> EXOTECH_SHOVEL = ITEMS.register("exotech_shovel", () -> new ExoTechTools.ExoTechShovel(new Item.Properties()));
    public static final RegistryObject<Item> EXOTECH_PICKAXE = ITEMS.register("exotech_pickaxe", () -> new ExoTechTools.ExoTechPickaxe(new Item.Properties()));
    public static final RegistryObject<Item> EXOTECH_AXE = ITEMS.register("exotech_axe", () -> new ExoTechTools.ExoTechAxe(new Item.Properties()));
    public static final RegistryObject<Item> EXOTECH_HOE = ITEMS.register("exotech_hoe", () -> new ExoTechTools.ExoTechHoe(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
