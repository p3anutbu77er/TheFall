package net.p3anutbu77er.thefall;

import net.fabricmc.api.ModInitializer;

import net.p3anutbu77er.thefall.block.ModBlocks;
import net.p3anutbu77er.thefall.entity.ModEntities;
import net.p3anutbu77er.thefall.item.ModItemGroup;
import net.p3anutbu77er.thefall.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheFall implements ModInitializer {
	public static final String MOD_ID = "thefall";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModEntities.registerModEntities();

	}
}