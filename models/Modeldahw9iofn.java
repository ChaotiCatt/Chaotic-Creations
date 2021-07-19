// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modeldahw9iofn extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer body;
	private final ModelRenderer upperBody;
	private final ModelRenderer leg0;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer tail;

	public Modeldahw9iofn() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(-1.0F, 13.5F, -7.0F);
		head.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(16, 14).addBox(-3.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(16, 14).addBox(1.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 10).addBox(-1.5F, -0.0156F, -5.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, 10.5F, 7.0F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.5708F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 55).addBox(-3.0F, 7.0F, -8.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.0F, 10.5F, 7.0F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.4835F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 55).addBox(-2.0F, 6.0F, -14.01F, 2.0F, 3.0F, 4.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 55).addBox(-3.0F, 6.0F, -12.01F, 4.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.0F, 10.5F, 7.0F);
		head.addChild(cube_r3);
		setRotationAngle(cube_r3, -1.1345F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 55).addBox(-4.0F, -1.0F, -14.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 55).addBox(2.0F, -1.0F, -16.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 55).addBox(-5.0F, -1.0F, -16.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 50).addBox(0.0F, 2.0F, -18.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 50).addBox(-3.0F, 2.0F, -18.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 50).addBox(-3.0F, -1.0F, -18.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 50).addBox(0.0F, -1.0F, -18.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 50).addBox(-3.0F, -1.0F, -17.5F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 55).addBox(-4.0F, -1.0F, -16.5F, 6.0F, 4.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 14.0F, 2.0F);
		setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
		body.setTextureOffset(18, 14).addBox(-4.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 55).addBox(-4.0F, -2.0F, 3.0F, 6.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 55).addBox(-5.0F, -2.0F, -2.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 55).addBox(2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);

		upperBody = new ModelRenderer(this);
		upperBody.setRotationPoint(-1.0F, 14.0F, 2.0F);
		setRotationAngle(upperBody, -1.5708F, 0.0F, 0.0F);
		upperBody.setTextureOffset(21, 0).addBox(-4.0F, 2.0F, -4.0F, 8.0F, 6.0F, 7.0F, 0.0F, false);
		upperBody.setTextureOffset(0, 55).addBox(-5.0F, 2.0F, -4.0F, 1.0F, 6.0F, 6.0F, 0.0F, false);
		upperBody.setTextureOffset(0, 55).addBox(4.0F, 2.0F, -4.0F, 1.0F, 6.0F, 6.0F, 0.0F, false);
		upperBody.setTextureOffset(0, 55).addBox(-4.0F, 2.0F, -5.0F, 8.0F, 6.0F, 1.0F, 0.0F, false);

		leg0 = new ModelRenderer(this);
		leg0.setRotationPoint(-2.5F, 16.0F, 7.0F);
		leg0.setTextureOffset(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(0.5F, 16.0F, 7.0F);
		leg1.setTextureOffset(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-2.5F, 16.0F, -4.0F);
		leg2.setTextureOffset(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(0.5F, 16.0F, -4.0F);
		leg3.setTextureOffset(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(-1.0F, 12.0F, 8.0F);
		setRotationAngle(tail, 0.9599F, 0.0F, 0.0F);
		tail.setTextureOffset(9, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		tail.setTextureOffset(38, 54).addBox(-1.0F, 1.0F, 1.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
		tail.setTextureOffset(38, 54).addBox(-2.0F, 1.0F, -1.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
		tail.setTextureOffset(38, 54).addBox(1.0F, 1.0F, -1.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		upperBody.render(matrixStack, buffer, packedLight, packedOverlay);
		leg0.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leg0.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}