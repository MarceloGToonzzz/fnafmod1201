package net.mcreator.fnafmod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelMascot_Bonnie_Costume<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_mascot_bonnie_costume"), "main");
	public final ModelPart Head;
	public final ModelPart Left_Ear;
	public final ModelPart Left_Ear_Top;
	public final ModelPart Right_Ear;
	public final ModelPart Right_Ear_Top;
	public final ModelPart RightBoot;
	public final ModelPart LeftBoot;

	public ModelMascot_Bonnie_Costume(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Left_Ear = this.Head.getChild("Left_Ear");
		this.Left_Ear_Top = this.Left_Ear.getChild("Left_Ear_Top");
		this.Right_Ear = this.Head.getChild("Right_Ear");
		this.Right_Ear_Top = this.Right_Ear.getChild("Right_Ear_Top");
		this.RightBoot = root.getChild("RightBoot");
		this.LeftBoot = root.getChild("LeftBoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(79, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.2F)).texOffs(103, 48).addBox(-4.5F, -4.0F, -4.75F, 9.0F, 4.0F, 2.0F, new CubeDeformation(0.001F)).texOffs(103, 54)
						.addBox(-4.5F, -4.0F, -4.75F, 9.0F, 4.0F, 2.0F, new CubeDeformation(0.25F)).texOffs(79, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Head.addOrReplaceChild(
				"cube_r1", CubeListBuilder.create().texOffs(1, 1).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 5).mirror()
						.addBox(-0.75F, -0.25F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(1, 8).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, -5.0F, -3.5F, 0.0F, 0.2182F, 0.0F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(1, 8).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.15F)).texOffs(0, 5).addBox(-0.25F, -0.25F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 8)
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.15F)).texOffs(1, 1).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -5.0F, -3.5F, 0.0F, -0.2182F, 0.0F));
		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5F, -1.0F, -0.75F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2706F, -5.25F, -4.7204F, -0.5672F, -0.2182F, 0.0F));
		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-1.5F, -1.0F, -0.75F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.2706F, -5.25F, -4.7204F, -0.5672F, 0.2182F, 0.0F));
		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(86, 57).mirror().addBox(-5.0F, -2.2525F, 0.25F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.7267F, -2.75F, -5.0F, -0.1095F, -0.2107F, 0.2258F));
		PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(86, 57).mirror().addBox(-5.0F, -2.2525F, 0.25F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.7267F, -2.75F, -5.0F, -0.0596F, -0.2754F, -0.2707F));
		PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(86, 57).addBox(0.0F, -2.2525F, 0.25F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7267F, -2.75F, -5.0F, -0.1095F, 0.2107F, -0.2258F));
		PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(86, 57).addBox(0.0F, -2.2525F, 0.25F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7267F, -2.75F, -5.0F, -0.0596F, 0.2754F, 0.2707F));
		PartDefinition Left_Ear = Head.addOrReplaceChild("Left_Ear", CubeListBuilder.create().texOffs(1, 101).addBox(-1.5F, -5.0F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -8.0F, -0.5F));
		PartDefinition Left_Ear_Top = Left_Ear.addOrReplaceChild("Left_Ear_Top", CubeListBuilder.create().texOffs(9, 101).addBox(-1.5F, -6.0F, -0.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition Right_Ear = Head.addOrReplaceChild("Right_Ear", CubeListBuilder.create().texOffs(1, 101).mirror().addBox(-1.5F, -5.0F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -8.0F, -0.5F));
		PartDefinition Right_Ear_Top = Right_Ear.addOrReplaceChild("Right_Ear_Top", CubeListBuilder.create().texOffs(9, 101).mirror().addBox(-2.5F, -6.0F, -0.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition RightBoot = partdefinition.addOrReplaceChild("RightBoot",
				CubeListBuilder.create().texOffs(32, 25).addBox(-2.0F, 10.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(5, 73).addBox(-2.2F, 10.0F, -4.1F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftBoot = partdefinition.addOrReplaceChild("LeftBoot",
				CubeListBuilder.create().texOffs(40, 38).addBox(-2.0F, 10.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(5, 73).addBox(-2.0F, 10.0F, -4.1F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
