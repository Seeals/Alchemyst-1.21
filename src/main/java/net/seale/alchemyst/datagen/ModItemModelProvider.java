package net.seale.alchemyst.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.seale.alchemyst.AlchemystMod;
import net.seale.alchemyst.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AlchemystMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.NEUTRAL_EXTRACT.get());
        basicItem(ModItems.RAW_PHOSPHORITE.get());
        basicItem(ModItems.PHOSPHORUS.get());


    }
}
