package net.natureprairies.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.natureprairies.NaturesPrairies;

public class ModItems {
    public static final Item SLATE = registerItem("slate", new Item(new FabricItemSettings()));

    public static final Item CERAMIC_BLEND_LUMP = registerItem("ceramic_blend_lump", new Item(new FabricItemSettings()));

    public static final Item CERAMIC_LUMP = registerItem("ceramic_lump", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(NaturesPrairies.MODID, name), item);
    }

    public static void registerModItems() {
        NaturesPrairies.LOGGER.info("Registering Mod Items for " + NaturesPrairies.MODID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}