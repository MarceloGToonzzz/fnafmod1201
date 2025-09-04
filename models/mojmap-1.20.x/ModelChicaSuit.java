// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelChicaSuit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "chicasuit"), "main");
	private final ModelPart Head;
	private final ModelPart Chica_Head;
	private final ModelPart Jaw;
	private final ModelPart MainJaw;
	private final ModelPart Folder;
	private final ModelPart bone14;
	private final ModelPart bone12;
	private final ModelPart bone13;
	private final ModelPart bone2;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart RightHand;
	private final ModelPart LeftArm;
	private final ModelPart LeftHand;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart RightBoot;
	private final ModelPart LeftBoot;

	public ModelChicaSuit(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Chica_Head = this.Head.getChild("Chica_Head");
		this.Jaw = this.Chica_Head.getChild("Jaw");
		this.MainJaw = this.Jaw.getChild("MainJaw");
		this.Folder = this.Chica_Head.getChild("Folder");
		this.bone14 = this.Folder.getChild("bone14");
		this.bone12 = this.Folder.getChild("bone12");
		this.bone13 = this.bone12.getChild("bone13");
		this.bone2 = this.bone13.getChild("bone2");
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

		PartDefinition Chica_Head = Head.addOrReplaceChild("Chica_Head",
				CubeListBuilder.create().texOffs(34, 117)
						.addBox(-4.0F, -13.2F, -4.0F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(0, 114)
						.addBox(-4.5F, -10.0F, -4.0F, 9.0F, 6.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(0, 3)
						.addBox(-2.0F, -7.0F, -7.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -8.0F, -6.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.7F, 0.0F));

		PartDefinition Head_r1 = Chica_Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(15, 28).addBox(-4.0F, -1.9F, 0.3F, 8.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.4312F, -5.6113F, -0.8727F, 0.0F, 0.0F));

		PartDefinition Jaw = Chica_Head.addOrReplaceChild("Jaw", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.55F, -1.3F));

		PartDefinition MainJaw = Jaw.addOrReplaceChild("MainJaw", CubeListBuilder.create().texOffs(18, 3).addBox(-2.1F,
				-6.3F, -1.5F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.15F, -4.2F));

		PartDefinition Folder = Chica_Head.addOrReplaceChild("Folder", CubeListBuilder.create(),
				PartPose.offset(0.0F, 28.0F, -1.0F));

		PartDefinition bone14 = Folder.addOrReplaceChild("bone14", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.0F, -40.5743F, -1.0001F, 0.0F, 2.0944F, 0.0F));

		PartDefinition bone12 = Folder.addOrReplaceChild("bone12", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.0F, -40.5743F, -1.0001F, 0.0F, -2.0944F, 0.0F));

		PartDefinition bone13 = bone12.addOrReplaceChild("bone13", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.0944F, 0.0F));

		PartDefinition bone2 = bone13.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 3.5743F, 1.5001F));

		PartDefinition cube_r1 = bone2.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 64).addBox(-1.5F, -1.0F, -4.0F, 3.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -4.0F, 0.0F, 2.7489F, 1.0472F, 3.1416F));

		PartDefinition cube_r2 = bone2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 64).addBox(-1.5F, -1.0F, -4.0F, 3.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -4.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 64).addBox(-1.5F, -1.0F, -4.0F, 3.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -4.0F, 0.0F, 2.7489F, -1.0472F, 3.1416F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(32, 0)
						.addBox(-4.5F, 10.0F, -3.0F, 9.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-4.5F, 4.0F, -3.5F, 9.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-4.0F, 0.0F, -3.5F, 8.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(2, 42)
						.addBox(-4.0F, -0.125F, -3.7F, 8.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
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

		PartDefinition RightBoot = partdefinition.addOrReplaceChild("RightBoot", CubeListBuilder.create()
				.texOffs(34, 54).addBox(-2.0F, 10.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition FootR_r1 = RightBoot.addOrReplaceChild("FootR_r1",
				CubeListBuilder.create().texOffs(32, 68).addBox(-1.7F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(0.1068F, 11.003F, -1.4608F, 0.0F, 0.3927F, 0.0F));

		PartDefinition FootR_r2 = RightBoot.addOrReplaceChild("FootR_r2",
				CubeListBuilder.create().texOffs(62, 67).addBox(-0.3F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(-0.1068F, 11.003F, -1.4608F, 0.0F, -0.3927F, 0.0F));

		PartDefinition LeftBoot = partdefinition.addOrReplaceChild("LeftBoot", CubeListBuilder.create().texOffs(52, 54)
				.addBox(-2.0F, 10.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
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