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
public class ModelSparkySuit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_sparky_suit"), "main");
	public final ModelPart Head;
	public final ModelPart SparkyHead;
	public final ModelPart RightEyebrow;
	public final ModelPart LeftEyebrow;
	public final ModelPart Jaw;
	public final ModelPart Ears;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart RightHand;
	public final ModelPart LeftArm;
	public final ModelPart LeftHand;
	public final ModelPart RightLeg;
	public final ModelPart RightBoot;
	public final ModelPart LeftLeg;
	public final ModelPart LeftBoot;

	public ModelSparkySuit(ModelPart root) {
		this.Head = root.getChild("Head");
		this.SparkyHead = this.Head.getChild("SparkyHead");
		this.RightEyebrow = this.SparkyHead.getChild("RightEyebrow");
		this.LeftEyebrow = this.SparkyHead.getChild("LeftEyebrow");
		this.Jaw = this.SparkyHead.getChild("Jaw");
		this.Ears = this.SparkyHead.getChild("Ears");
		this.Body = this.Head.getChild("Body");
		this.RightArm = this.Head.getChild("RightArm");
		this.RightHand = this.RightArm.getChild("RightHand");
		this.LeftArm = this.Head.getChild("LeftArm");
		this.LeftHand = this.LeftArm.getChild("LeftHand");
		this.RightLeg = this.Head.getChild("RightLeg");
		this.RightBoot = this.Head.getChild("RightBoot");
		this.LeftLeg = root.getChild("LeftLeg");
		this.LeftBoot = this.LeftLeg.getChild("LeftBoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition SparkyHead = Head.addOrReplaceChild("SparkyHead",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -3.6F, -5.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(32, 17).addBox(-4.5F, 0.4F, -5.0F, 9.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 24)
						.addBox(-3.0F, 1.4F, -7.1F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.15F)).texOffs(70, 39).addBox(-1.0F, 0.9F, -7.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.6F, 1.0F));
		PartDefinition RightEyebrow = SparkyHead.addOrReplaceChild("RightEyebrow", CubeListBuilder.create(), PartPose.offset(-2.0F, -5.3968F, -4.4077F));
		PartDefinition Head_r1 = RightEyebrow.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(16, 42).addBox(-4.0F, -1.4F, 0.8F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 4.3657F, -2.2037F, -0.8727F, 0.0F, 0.0F));
		PartDefinition LeftEyebrow = SparkyHead.addOrReplaceChild("LeftEyebrow", CubeListBuilder.create(), PartPose.offset(2.0F, -5.3968F, -4.4077F));
		PartDefinition Head_r2 = LeftEyebrow.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(16, 43).addBox(0.0F, -1.4F, 0.8F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 4.3657F, -2.2037F, -0.8727F, 0.0F, 0.0F));
		PartDefinition Jaw = SparkyHead.addOrReplaceChild("Jaw",
				CubeListBuilder.create().texOffs(32, 9).addBox(-3.5F, 3.4913F, -7.7047F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(16, 39).addBox(-2.5F, 2.7413F, -6.7047F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.7F, 0.1F, 0.2618F, 0.0F, 0.0F));
		PartDefinition Ears = SparkyHead.addOrReplaceChild("Ears", CubeListBuilder.create().texOffs(8, 47).addBox(-5.0F, 1.3587F, 1.5F, 10.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.5587F, -2.5F));
		PartDefinition Head_r3 = Ears.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -1.0F, -3.5F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.75F, 3.1087F, 3.5F, 0.0F, 0.0F, -0.3054F));
		PartDefinition Head_r4 = Ears.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-0.5F, -1.0F, -3.5F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.75F, 3.1087F, 3.5F, 0.0F, 0.0F, 0.3054F));
		PartDefinition Body = Head.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(32, 0).addBox(-4.5F, 10.0F, -3.0F, 9.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(-4.5F, 4.0F, -3.5F, 9.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-4.0F, 0.0F, -3.5F, 8.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(30, 35).addBox(-2.4858F, 1.5F, -4.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.15F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightArm = Head.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(58, 42).addBox(-3.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(16, 61)
				.addBox(-3.0F, 4.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(62, 0).addBox(-2.49F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition RightHand = RightArm.addOrReplaceChild("RightHand",
				CubeListBuilder.create().texOffs(44, 68).addBox(-0.91F, 0.2F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(70, 56).addBox(0.09F, 0.7F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.09F, 9.3F, -1.0F));
		PartDefinition HandL_r1 = RightHand.addOrReplaceChild("HandL_r1", CubeListBuilder.create().texOffs(12, 64).addBox(-2.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.8F, 1.4F, -1.3F, -0.6109F, 0.0F, 0.0F));
		PartDefinition HandR_r1 = RightHand.addOrReplaceChild("HandR_r1", CubeListBuilder.create().texOffs(24, 42).addBox(-0.5F, -0.8F, 1.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(48, 26)
				.addBox(-0.5F, -0.8F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(48, 24).addBox(-0.5F, -0.8F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-0.21F, 3.2F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition LeftArm = Head.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 55).addBox(-0.99F, 4.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(58, 9)
				.addBox(-1.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(48, 61).addBox(-0.5F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition LeftHand = LeftArm.addOrReplaceChild("LeftHand", CubeListBuilder.create().texOffs(62, 61).addBox(-0.9F, 0.2F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.31F, 9.3F, 0.0F, 3.1416F, 0.0F, -3.1416F));
		PartDefinition HandL_r2 = LeftHand.addOrReplaceChild("HandL_r2", CubeListBuilder.create().texOffs(12, 64).addBox(-2.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.8F, 1.4F, 2.3F, 0.6109F, 0.0F, 0.0F));
		PartDefinition HandL_r3 = LeftHand.addOrReplaceChild("HandL_r3", CubeListBuilder.create().texOffs(48, 24).addBox(-0.7F, -0.8F, 0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(48, 26)
				.addBox(-0.7F, -0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(24, 42).addBox(-0.7F, -0.8F, -1.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, 3.2F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition RightLeg = Head.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(54, 33).addBox(-2.0F, 4.9F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(70, 18)
				.addBox(-1.5F, 3.5F, -3.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 51).addBox(-2.0436F, -0.4F, -2.5019F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.1F)), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition RightBoot = Head.addOrReplaceChild("RightBoot",
				CubeListBuilder.create().texOffs(0, 64).addBox(-1.0F, 10.002F, -6.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 54).addBox(-2.0F, 10.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition FootR_r1 = RightBoot.addOrReplaceChild("FootR_r1", CubeListBuilder.create().texOffs(32, 68).addBox(-1.7F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(0.1068F, 11.003F, -1.4608F, 0.0F, 0.3927F, 0.0F));
		PartDefinition FootR_r2 = RightBoot.addOrReplaceChild("FootR_r2", CubeListBuilder.create().texOffs(62, 67).addBox(-0.3F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(-0.1068F, 11.003F, -1.4608F, 0.0F, -0.3927F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(40, 44).addBox(-2.0F, -0.4F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(70, 22)
				.addBox(-1.5F, 3.5F, -3.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 24).addBox(-2.0F, 4.9F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition LeftBoot = LeftLeg.addOrReplaceChild("LeftBoot",
				CubeListBuilder.create().texOffs(52, 54).addBox(-2.0F, 10.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 70).addBox(-0.9F, 10.001F, -6.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LfootL_r1 = LeftBoot.addOrReplaceChild("LfootL_r1", CubeListBuilder.create().texOffs(12, 70).addBox(-1.5F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(0.0207F, 11.001F, -1.3848F, 0.0F, 0.3927F, 0.0F));
		PartDefinition LfootL_r2 = LeftBoot.addOrReplaceChild("LfootL_r2", CubeListBuilder.create().texOffs(58, 18).addBox(-0.3F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(-0.0081F, 11.001F, -1.4613F, 0.0F, -0.3927F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
