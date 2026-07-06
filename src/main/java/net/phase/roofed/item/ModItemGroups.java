package net.phase.roofed.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.phase.roofed.Roofed;
import net.phase.roofed.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup ROOFED_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Roofed.MOD_ID, "roofed_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RIFT_SHARD))
                    .displayName(Text.translatable("itemgroup.roofed.roofed_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RIFT_SHARD);
                        entries.add(ModItems.RIFT_SHARD_FRAGMENT);
                        entries.add(ModBlocks.RIFT_SHARD_BLOCK);
                        entries.add(ModBlocks.RIFT_ORE);

                    }).build());



    public static void registerItemGroups() {
        Roofed.LOGGER.info("Registering Item Groups for " + Roofed.MOD_ID);
    }
}
