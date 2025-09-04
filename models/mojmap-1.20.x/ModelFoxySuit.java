// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelFoxySuit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "foxysuit"), "main");
	private final ModelPart Head;
	private final ModelPart Head2;
	private final ModelPart Jaw;
	private final ModelPart bone;
	private final ModelPart Mask;
	private final ModelPart Eyepatch;
	private final ModelPart Ears;
	private final ModelPart EarR;
	private final ModelPart EarL;
	private final ModelPart LeftArm;
	private final ModelPart LeftHand;
	private final ModelPart RightArm;
	private final ModelPart RightHand;
	private final ModelPart Body;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart RightBoot;
	private final ModelPart LeftBoot;

	public ModelFoxySuit(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Head2 = this.Head.getChild("Head2");
		this.Jaw = this.Head2.getChild("Jaw");
		this.bone = this.Jaw.getChild("bone");
		this.Mask = this.Head2.getChild("Mask");
		this.Eyepatch = this.Mask.getChild("Eyepatch");
		this.Ears = this.Head2.getChild("Ears");
		this.EarR = this.Ears.getChild("EarR");
		this.EarL = this.Ears.getChild("EarL");
		this.LeftArm = root.getChild("LeftArm");
		this.LeftHand = this.LeftArm.getChild("LeftHand");
		this.RightArm = root.getChild("RightArm");
		this.RightHand = this.RightArm.getChild("RightHand");
		this.Body = root.getChild("Body");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightBoot = root.getChild("RightBoot");
		this.LeftBoot = root.getChild("LeftBoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head2 = Head.addOrReplaceChild("Head2",
				CubeListBuilder.create().texOffs(38, 25)
						.addBox(-1.0F, -2.95F, -1.3F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 0)
						.addBox(0.6F, -6.25F, -3.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.95F, 0.0F));

		PartDefinition Jaw = Head2.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(18, 36).addBox(-2.0F,
				-0.298F, -7.6374F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.95F, -0.9F));

		PartDefinition bone = Jaw.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 45)
						.addBox(-2.5F, -2.75F, 1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-2.5F, -0.75F, -6.0F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.452F, -2.1374F));

		PartDefinition Mask = Head2.addOrReplaceChild("Mask",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -2.8F, -3.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(74, 14)
						.addBox(-6.0F, 2.2F, -3.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 45)
						.addBox(-1.5F, -4.8F, 0.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 15)
						.addBox(-2.5F, 2.2F, -6.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 20)
						.addBox(-1.5F, 2.2F, -8.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 1.2F, -8.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 30)
						.addBox(-1.5F, 4.2F, -7.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -6.45F, -1.0F));

		PartDefinition cube_r1 = Mask.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(16, 7).addBox(-4.5F, -2.1F, 0.1F, 8.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.2688F, -4.6113F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Mask
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(15, 45).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -3.8F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Eyepatch = Mask.addOrReplaceChild("Eyepatch", CubeListBuilder.create().texOffs(13, 20).addBox(
				-3.0F, -1.0F, 0.0F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.2F, -3.15F));

		PartDefinition Ears = Head2.addOrReplaceChild("Ears", CubeListBuilder.create(),
				PartPose.offset(0.0F, -7.0184F, -1.275F));

		PartDefinition EarR = Ears.addOrReplaceChild("EarR",
				CubeListBuilder.create().texOffs(0, 15).addBox(-1.5741F, -6.505F, -0.7582F, 3.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5259F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6109F));

		PartDefinition EarL = Ears.addOrReplaceChild("EarL",
				CubeListBuilder.create().texOffs(8, 15).addBox(-1.3899F, -6.5117F, -0.499F, 3.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5259F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(0, 55)
						.addBox(-0.99F, 5.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(58, 9)
						.addBox(-1.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(48, 61)
						.addBox(-0.5F, -2.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition LeftHand = LeftArm.addOrReplaceChild("LeftHand",
				CubeListBuilder.create().texOffs(62, 61).addBox(-0.9F, 0.2F, -2.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.31F, 10.3F, 0.0F, 3.1416F, 0.0F, -3.1416F));

		PartDefinition HandL_r1 = LeftHand
				.addOrReplaceChild("HandL_r1",
						CubeListBuilder.create().texOffs(12, 64).addBox(-2.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
								new CubeDeformation(0.2F)),
						PartPose.offsetAndRotation(1.8F, 1.4F, 2.3F, 0.6109F, 0.0F, 0.0F));

		PartDefinition HandL_r2 = LeftHand.addOrReplaceChild("HandL_r2",
				CubeListBuilder.create().texOffs(48, 24)
						.addBox(-0.7F, -0.8F, 0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(48, 26)
						.addBox(-0.7F, -0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(48, 24)
						.addBox(-0.7F, -0.8F, -1.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 3.2F, 0.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(58, 42)
						.addBox(-3.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(16, 61)
						.addBox(-3.0F, 5.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(62, 0)
						.addBox(-2.49F, -2.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition RightHand = RightArm.addOrReplaceChild("RightHand", CubeListBuilder.create(),
				PartPose.offset(-1.09F, 10.3F, -1.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(33, 4)
						.addBox(-4.0F, 9.4F, -2.5F, 8.0F, 3.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(0, 21)
						.addBox(-4.0F, 0.0F, -2.5F, 8.0F, 9.0F, 5.0F, new CubeDeformation(0.1F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(54, 33)
						.addBox(-2.0F, 4.9F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(70, 18)
						.addBox(-1.5F, 3.5F, -3.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(17, 52)
						.addBox(-2.0436F, -0.4F, -2.0019F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(41, 45)
						.addBox(-2.0F, -0.4F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(70, 22)
						.addBox(-1.5F, 3.5F, -3.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 24)
						.addBox(-2.0F, 4.9F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition RightBoot = partdefinition.addOrReplaceChild("RightBoot",
				CubeListBuilder.create().texOffs(0, 64)
						.addBox(-1.0F, 10.002F, -6.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 54)
						.addBox(-2.0F, 10.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition FootR_r1 = RightBoot.addOrReplaceChild("FootR_r1",
				CubeListBuilder.create().texOffs(32, 68).addBox(-1.7F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(0.1068F, 11.003F, -1.4608F, 0.0F, 0.3927F, 0.0F));

		PartDefinition FootR_r2 = RightBoot.addOrReplaceChild("FootR_r2",
				CubeListBuilder.create().texOffs(62, 67).addBox(-0.3F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(-0.1068F, 11.003F, -1.4608F, 0.0F, -0.3927F, 0.0F));

		PartDefinition LeftBoot = partdefinition.addOrReplaceChild("LeftBoot",
				CubeListBuilder.create().texOffs(52, 54)
						.addBox(-2.0F, 10.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 70)
						.addBox(-0.9F, 10.001F, -6.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition LfootL_r1 = LeftBoot.addOrReplaceChild("LfootL_r1",
				CubeListBuilder.create().texOffs(12, 70).addBox(-1.5F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(0.0207F, 11.001F, -1.3848F, 0.0F, 0.3927F, 0.0F));

		PartDefinition LfootL_r2 = LeftBoot.addOrReplaceChild("LfootL_r2",
				CubeListBuilder.create().texOffs(58, 18).addBox(-0.3F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(-0.0081F, 11.001F, -1.4613F, 0.0F, -0.3927F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}