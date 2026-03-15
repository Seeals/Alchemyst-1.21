package net.seale.alchemyst.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.seale.alchemyst.block.ModBlocks;

import java.util.function.Supplier;

import static net.seale.alchemyst.AlchemystMod.MOD_ID;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final Supplier<CreativeModeTab> ALCHEMYST_TAB = CREATVE_MODE_TAB.register("alchemyst_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetab.alchemyst.alchemyst_tab"))
                    .icon(() -> new ItemStack(ModItems.NEUTRAL_EXTRACT.get()))
                    //add items to custom creative mode tab
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.NEUTRAL_EXTRACT.get());
                        output.accept(ModItems.RAW_PHOSPHORITE.get());
                        output.accept(ModItems.PHOSPHORUS.get());

                        output.accept(ModBlocks.PHOSPHORITE.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATVE_MODE_TAB.register(eventBus);
    }
}
