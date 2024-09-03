package net.p3anutbu77er.thefall.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.p3anutbu77er.thefall.entity.animations.ModAnimations;
import net.p3anutbu77er.thefall.entity.custom.AgronomistDwarfEntity;

public class AgronomistDwarfModel<T extends AgronomistDwarfEntity> extends SinglePartEntityModel<T> {
    private final ModelPart agronomistdwarf;
    private final ModelPart body;
    private final ModelPart head;
    private final ModelPart hat;
    private final ModelPart leftleg;
    private final ModelPart leftfoot;
    private final ModelPart rightleg;
    private final ModelPart rightfoot;
    private final ModelPart rightarm;
    private final ModelPart righthand;
    private final ModelPart leftarm;
    private final ModelPart lefthand;
    public AgronomistDwarfModel(ModelPart agronomistdwarf) {
        this.agronomistdwarf = root.getChild("agronomistdwarf");
        this.body = root.getChild("body");
        this.head = root.getChild("head");
        this.hat = root.getChild("hat");
        this.leftleg = root.getChild("leftleg");
        this.leftfoot = root.getChild("leftfoot");
        this.rightleg = root.getChild("rightleg");
        this.rightfoot = root.getChild("rightfoot");
        this.rightarm = root.getChild("rightarm");
        this.righthand = root.getChild("righthand");
        this.leftarm = root.getChild("leftarm");
        this.lefthand = root.getChild("lefthand");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(17, 16).cuboid(-3.0F, -6.0F, -1.5F, 6.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 18.0F, -0.5F));

        ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 9).cuboid(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 12.0F, -0.5F));

        ModelPartData hat = head.addChild("hat", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -2.0F, -3.0F, 6.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -4.0F, 0.0F));

        ModelPartData leftleg = modelPartData.addChild("leftleg", ModelPartBuilder.create().uv(0, 25).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.5F, 18.0F, -0.5F));

        ModelPartData leftfoot = leftleg.addChild("leftfoot", ModelPartBuilder.create().uv(20, 9).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 3.0F, 0.0F));

        ModelPartData rightleg = modelPartData.addChild("rightleg", ModelPartBuilder.create().uv(18, 0).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.5F, 18.0F, -0.5F));

        ModelPartData rightfoot = rightleg.addChild("rightfoot", ModelPartBuilder.create().uv(0, 19).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 3.0F, 0.0F));

        ModelPartData rightarm = modelPartData.addChild("rightarm", ModelPartBuilder.create().uv(26, 25).cuboid(-2.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, 13.0F, -0.5F));

        ModelPartData righthand = rightarm.addChild("righthand", ModelPartBuilder.create().uv(18, 25).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 2.0F, 0.0F));

        ModelPartData leftarm = modelPartData.addChild("leftarm", ModelPartBuilder.create().uv(28, 4).cuboid(0.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, 13.0F, -0.5F));

        ModelPartData lefthand = leftarm.addChild("lefthand", ModelPartBuilder.create().uv(10, 23).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 2.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(AgronomistDwarfEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.animateMovement(ModAnimations.AGRONOMISTDWARF_WALK);
        this.updateAnimation(entity.idleAnimationState, ModAnimations.AGRONOMISTDWARF_IDLE, ageInTicks, 1f);

    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        head.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        leftleg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        rightleg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        rightarm.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        leftarm.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return agronomistdwarf;
    }
}
