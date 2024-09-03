package net.p3anutbu77er.thefall.entity.client;

import net.minecraft.thefall.TheFall;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.util.Identifier;
import net.p3anutbu77er.thefall.entity.custom.AgronomistDwarfEntity;
import net.p3anutbu77er.thefall.entity.layer.ModModelLayers;


public class AgronomistDwarfRenderer extends LivingEntityRenderer<AgronomistDwarfEntity, AgronomistDwarfModel<AgronomistDwarfEntity>> {


    public AgronomistDwarfRenderer(EntityRendererFactory.Context ctx, AgronomistDwarfModel model, float shadowRadius) {
        super(ctx, new AgronomistDwarfModel<>(ctx.getPart(ModModelLayers.AGRONOMISTDWARF)), 0.6f);
    }

    @Override
    public Identifier getTexture(AgronomistDwarfEntity entity) {
        return null;
    }
}


