package net.p3anutbu77er.thefall.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.p3anutbu77er.thefall.TheFall;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.text.Text;
import net.p3anutbu77er.thefall.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup THE_FALL_MOD = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheFall.MOD_ID, "the_fall_mod"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.the_fall_mod"))
                    .icon(() -> new ItemStack(ModItems.GOLD_COIN)).entries((displayContext, entries) -> {
                        entries.add(ModItems.GOLD_COIN);
                        entries.add(ModItems.SILVER_COIN);

                        entries.add(ModBlocks.TEST_BLOCK);

                    }).build());


    public static void registerItemGroups() {

    }

}
