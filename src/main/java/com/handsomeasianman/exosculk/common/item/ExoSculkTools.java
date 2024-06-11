package com.handsomeasianman.exosculk.common.item;

import net.minecraft.world.item.*;


public class ExoSculkTools {
    public static class ExoTechHoe extends HoeItem {
        public ExoTechHoe(Properties pProperties) {
            super(ExosculkTiers.EXOSCULK, -8, 0.0F, pProperties);
        }
    }

    public static class ExoSculkPickaxe extends PickaxeItem {
        public ExoSculkPickaxe(Properties pProperties) {
            super(ExosculkTiers.EXOSCULK, -2, -2.8F, pProperties);
        }
    }

    public static class ExoSculkAxe extends AxeItem {
        public ExoSculkAxe(Properties pProperties) {
            super(ExosculkTiers.EXOSCULK, 9.0F, -3.0F, pProperties);
        }
    }

    public static class ExoSculkSword extends SwordItem {
        public ExoSculkSword(Properties pProperties) {
            super(ExosculkTiers.EXOSCULK, 6, -2.4F, pProperties);
        }
    }

    public static class ExoSculkShovel extends ShovelItem {
        public ExoSculkShovel(Properties pProperties) {
            super(ExosculkTiers.EXOSCULK, 0.0F, -3.0F, pProperties);
        }
    }
}
