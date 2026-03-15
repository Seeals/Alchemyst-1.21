package net.seale.alchemyst.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.seale.alchemyst.AlchemystMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AlchemystMod.MOD_ID);

    public static final DeferredItem<Item> NEUTRAL_EXTRACT = ITEMS.register("neutral_extract",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_PHOSPHORITE = ITEMS.register("raw_phosphorite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PHOSPHORUS = ITEMS.register("phosphorus",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
