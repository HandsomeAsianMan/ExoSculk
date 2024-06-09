package com.handsomeasianman.exosculk.common.registries;

import com.handsomeasianman.exosculk.common.ExoSculk;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ExoSculkCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExoSculk.MOD_ID);

    public static final RegistryObject<CreativeModeTab> EXOSCULK_TAB = CREATIVE_MODE_TABS.register("exosculk_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ExoSculkItems.SCULK_SWORD.get()))
                    .title(Component.translatable("creativetab.exosculk_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ExoSculkItems.BIOLOGICAL_VOID_MATTER.get());

                        pOutput.accept(ExoSculkItems.SCULK_AXE.get());
                        pOutput.accept(ExoSculkItems.SCULK_PICKAXE.get());
                        pOutput.accept(ExoSculkItems.SCULK_SWORD.get());
                        pOutput.accept(ExoSculkItems.SCULK_SHOVEL.get());
                        pOutput.accept(ExoSculkItems.SCULK_HOE.get());
                        pOutput.accept(ExoSculkItems.EXOSCULK_AXE.get());
                        pOutput.accept(ExoSculkItems.EXOSCULK_PICKAXE.get());
                        pOutput.accept(ExoSculkItems.EXOSCULK_SWORD.get());
                        pOutput.accept(ExoSculkItems.EXOSCULK_SHOVEL.get());
                        pOutput.accept(ExoSculkItems.EXOSCULK_HOE.get());
                        pOutput.accept(ExoSculkItems.EXOTECH_AXE.get());
                        pOutput.accept(ExoSculkItems.EXOTECH_PICKAXE.get());
                        pOutput.accept(ExoSculkItems.EXOTECH_SWORD.get());
                        pOutput.accept(ExoSculkItems.EXOTECH_SHOVEL.get());
                        pOutput.accept(ExoSculkItems.EXOTECH_HOE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
