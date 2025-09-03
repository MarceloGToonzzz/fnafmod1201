// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelBonnieSuit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bonniesuit"), "main");
	private final ModelPart Head;
	private final ModelPart Bonnie_Head;
	private final ModelPart EarR;
	private final ModelPart Top;
	private final ModelPart EarL;
	private final ModelPart Top2;
	private final ModelPart Jaw;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart RightHand;
	private final ModelPart LeftArm;
	private final ModelPart LeftHand;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart RightBoot;
	private final ModelPart LeftBoot;

	public ModelBonnieSuit(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Bonnie_Head = this.Head.getChild("Bonnie_Head");
		this.EarR = this.Bonnie_Head.getChild("EarR");
		this.Top = this.EarR.getChild("Top");
		this.EarL = this.Bonnie_Head.getChild("EarL");
		this.Top2 = this.EarL.getChild("Top2");
		this.Jaw = this.Bonnie_Head.getChild("Jaw");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.RightHand = this.RightArm.getChild("RightHand");
		this.LeftArm = root.getChild("LeftArm");
		this.LeftHand = this.LeftArm.getChild("LeftHand");
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

		PartDefinition Bonnie_Head = Head.addOrReplaceChild("Bonnie_Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(74, 11)
						.addBox(-5.0F, -4.0F, -4.0F, 10.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 24)
						.addBox(-3.0F, -3.0F, -6.1F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.15F)).texOffs(70, 39)
						.addBox(-1.0F, -3.5F, -6.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -0.3F, 0.0F));

		PartDefinition EarR = Bonnie_Head.addOrReplaceChild("EarR",
				CubeListBuilder.create().texOffs(30, 40)
						.addBox(-1.5F, -6.999F, -0.4982F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
						.addBox(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.15F, -6.5F, -1.3F, 0.0F, 0.1745F, -0.2618F));

		PartDefinition Top = EarR.addOrReplaceChild("Top", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.9F, -7.0F, 0.025F, -0.5236F, 0.0F, 0.0F));

		PartDefinition RightEar_r1 = Top.addOrReplaceChild("RightEar_r1",
				CubeListBuilder.create().texOffs(0, 39).addBox(-1.0F, -2.5F, 0.0F, 2.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9F, -0.3003F, -1.4699F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Top.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(30, 35).addBox(-3.4F, -45.2438F, -2.859F, 3.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 6.5389F, 40.2834F, 1.3526F, 0.0F, 0.0F));

		PartDefinition EarL = Bonnie_Head.addOrReplaceChild("EarL",
				CubeListBuilder.create().texOffs(38, 40)
						.addBox(-1.5431F, -6.9981F, -0.5431F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(0, 43).addBox(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.15F, -6.5F, -1.3F, 0.0F, -0.1745F, 0.2618F));

		PartDefinition Top2 = EarL.addOrReplaceChild("Top2",
				CubeListBuilder.create().texOffs(38, 35)
						.addBox(-1.5431F, -4.4981F, -0.5431F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(0, 39).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition Jaw = Bonnie_Head.addOrReplaceChild("Jaw",
				CubeListBuilder.create().texOffs(15, 29)
						.addBox(-4.5F, -0.25F, -2.6F, 9.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 10)
						.addBox(-3.5F, -0.25F, -5.6F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 39)
						.addBox(-2.5F, -1.25F, -4.6F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -0.7F, 0.1F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(32, 0)
						.addBox(-4.5F, 10.0F, -3.0F, 9.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-4.5F, 4.0F, -3.5F, 9.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-4.0F, 0.0F, -3.5F, 8.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(58, 51)
						.addBox(-2.4858F, 0.5F, -4.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.15F)).texOffs(54, 42)
						.addBox(-0.5F, 1.0F, -4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(58, 42)
						.addBox(-3.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(16, 61)
						.addBox(-3.0F, 4.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(62, 0)
						.addBox(-2.49F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition RightHand = RightArm.addOrReplaceChild("RightHand",
				CubeListBuilder.create().texOffs(44, 68)
						.addBox(-0.91F, 0.2F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(70, 56)
						.addBox(0.09F, 0.7F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.09F, 9.3F, -1.0F));

		PartDefinition HandL_r1 = RightHand.addOrReplaceChild("HandL_r1",
				CubeListBuilder.create().texOffs(12, 64).addBox(-2.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.8F, 1.4F, -1.3F, -0.6109F, 0.0F, 0.0F));

		PartDefinition HandR_r1 = RightHand.addOrReplaceChild("HandR_r1",
				CubeListBuilder.create().texOffs(24, 42)
						.addBox(-0.5F, -0.8F, 1.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(48, 26)
						.addBox(-0.5F, -0.8F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(48, 24)
						.addBox(-0.5F, -0.8F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.21F, 3.2F, 0.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(0, 55)
						.addBox(-0.99F, 4.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(58, 9)
						.addBox(-1.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(48, 61)
						.addBox(-0.5F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition LeftHand = LeftArm.addOrReplaceChild("LeftHand",
				CubeListBuilder.create().texOffs(62, 61).addBox(-0.9F, 0.2F, -2.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.31F, 9.3F, 0.0F, 3.1416F, 0.0F, -3.1416F));

		PartDefinition HandL_r2 = LeftHand
				.addOrReplaceChild("HandL_r2",
						CubeListBuilder.create().texOffs(12, 64).addBox(-2.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
								new CubeDeformation(0.2F)),
						PartPose.offsetAndRotation(1.8F, 1.4F, 2.3F, 0.6109F, 0.0F, 0.0F));

		PartDefinition HandL_r3 = LeftHand.addOrReplaceChild("HandL_r3",
				CubeListBuilder.create().texOffs(48, 24)
						.addBox(-0.7F, -0.8F, 0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(48, 26)
						.addBox(-0.7F, -0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(24, 42)
						.addBox(-0.7F, -0.8F, -1.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 3.2F, 0.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(54, 33)
						.addBox(-2.0F, 4.9F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(70, 18)
						.addBox(-1.5F, 3.5F, -3.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 51)
						.addBox(-2.0436F, -0.4F, -2.5019F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.1F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(40, 44)
						.addBox(-2.0F, -0.4F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(70, 22)
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
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}