package net.mcreator.chaoticcreations.entity.renderer;

@OnlyIn(Dist.CLIENT)
public class CorruptedRenderer {

	public static class ModelRegisterHandler {

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(CorruptedEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelCorrupted(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("chaotic_creations:textures/corrupted.png");
					}
				};
			});

		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports

	public static class ModelCorrupted extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer rightArm;
		private final ModelRenderer leftArm;
		private final ModelRenderer rightLeg;
		private final ModelRenderer leftLeg;

		public ModelCorrupted() {
			textureWidth = 64;
			textureHeight = 32;

			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -28.0F, -4.0F, 8.0F, 8.0F, 8.0F, -0.5F, false);
			head.setTextureOffset(0, 16).addBox(-4.0F, -26.0F, -4.0F, 8.0F, 8.0F, 8.0F, -0.5F, false);

			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -14.0F, 0.0F);
			body.setTextureOffset(32, 16).addBox(-4.0F, -4.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

			rightArm = new ModelRenderer(this);
			rightArm.setRotationPoint(-3.0F, -12.0F, 0.0F);
			rightArm.setTextureOffset(56, 0).addBox(-3.0F, -6.0F, -1.0F, 2.0F, 30.0F, 2.0F, 0.0F, false);

			leftArm = new ModelRenderer(this);
			leftArm.setRotationPoint(5.0F, -12.0F, 0.0F);
			leftArm.setTextureOffset(56, 0).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 30.0F, 2.0F, 0.0F, true);

			rightLeg = new ModelRenderer(this);
			rightLeg.setRotationPoint(-2.0F, -2.0F, 0.0F);
			rightLeg.setTextureOffset(56, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 30.0F, 2.0F, 0.0F, false);

			leftLeg = new ModelRenderer(this);
			leftLeg.setRotationPoint(2.0F, -2.0F, 0.0F);
			leftLeg.setTextureOffset(56, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 30.0F, 2.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.rightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}

}
