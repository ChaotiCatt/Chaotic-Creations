// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelgadgetnuke extends EntityModel<Entity> {
	private final ModelRenderer body;

	public Modelgadgetnuke() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(6, 9).addBox(1.0F, -0.5F, 0.7F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 9).addBox(-2.0F, -0.5F, 0.7F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 3).addBox(-0.5F, 1.0F, 0.7F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-0.5F, -2.0F, 0.7F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(4, 9).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
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
		this.body.rotateAngleZ = f2;
	}
}