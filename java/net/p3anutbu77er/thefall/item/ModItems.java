package net.p3anutbu77er.thefall.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.p3anutbu77er.thefall.TheFall;
import net.p3anutbu77er.thefall.block.ModBlocks;

public class ModItems {
    public static final Item GOLD_COIN = registerItem("gold_coin",
            new Item(new FabricItemSettings()));
    public static final Item SILVER_COIN = registerItem("silver_coin",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TheFall.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(GOLD_COIN);
        entries.add(SILVER_COIN);

        entries.add(ModBlocks.TEST_BLOCK);
    }

    public static void registerModItems() {
        TheFall.LOGGER.info("Registering Mod Items for" + TheFall.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}
