package net.p3anutbu77er.thefall.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.p3anutbu77er.thefall.entity.ModEntities;
import net.p3anutbu77er.thefall.entity.custom.AgronomistDwarfEntity;

public class ModRegistries {
    public static void registerModStuffs() {

        registerAttributes();

    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.AGRONOMISTDWARF, AgronomistDwarfEntity.createAgronomistDwarfAttributes());
    }

}
