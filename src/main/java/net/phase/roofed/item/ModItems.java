package net.phase.roofed.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.phase.roofed.Roofed;

public class ModItems {
    public static final Item RIFT_SHARD = registerItem("rift_shard", new Item(new Item.Settings()));
    public static final Item RIFT_SHARD_FRAGMENT = registerItem("rift_shard_fragment", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Roofed.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Roofed.LOGGER.info("Registering Mod Items for " + Roofed.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RIFT_SHARD);
            entries.add(RIFT_SHARD_FRAGMENT);
        });
    }
}