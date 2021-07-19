// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelserpentprojectile extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;

	public Modelserpentprojectile() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-1.5F, -3.0F, -1.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(10, 3).addBox(-1.5F, -3.0F, -5.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(0, 7).addBox(-1.5F, -2.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(0.5F, -2.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 1.0F, 2.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.48F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 7).addBox(-1.5F, -3.0F, -5.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}