package net.loki.lokimod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.loki.lokimod.LokiMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COBALT_INGOT = registerItem("cobalt_ingot", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LokiMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LokiMod.LOGGER.info("Registering Mod Items for " + LokiMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(COBALT_INGOT);
        });
    }
}
