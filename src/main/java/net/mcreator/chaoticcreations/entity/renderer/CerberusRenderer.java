package net.mcreator.chaoticcreations.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.chaoticcreations.entity.CerberusEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CerberusRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(CerberusEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcerberus(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("chaotic_creations:textures/wolf.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelcerberus extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer body_rotation;
		private final ModelRenderer mane;
		private final ModelRenderer mane_rotation3;
		private final ModelRenderer mane_rotation;
		private final ModelRenderer mane_rotation2;
		private final ModelRenderer leg1;
		private final ModelRenderer leg2;
		private final ModelRenderer leg3;
		private final ModelRenderer leg4;
		private final ModelRenderer tail;
		private final ModelRenderer head2;
		private final ModelRenderer head3;
		public Modelcerberus() {
			textureWidth = 64;
			textureHeight = 32;
			head = new ModelRenderer(this);
			head.setRotationPoint(1.0F, 13.5F, -7.0F);
			setRotationAngle(head, 0.0436F, 0.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(16, 14).addBox(0.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(16, 14).addBox(-4.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 10).addBox(-2.5F, -0.02F, -5.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 14.0F, 2.0F);
			body_rotation = new ModelRenderer(this);
			body_rotation.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(body_rotation);
			setRotationAngle(body_rotation, 1.5708F, 0.0F, 0.0F);
			body_rotation.setTextureOffset(18, 14).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);
			mane = new ModelRenderer(this);
			mane.setRotationPoint(1.0F, 14.0F, 2.0F);
			mane_rotation3 = new ModelRenderer(this);
			mane_rotation3.setRotationPoint(-4.0F, 2.5F, -1.5F);
			mane.addChild(mane_rotation3);
			setRotationAngle(mane_rotation3, 1.5708F, 0.48F, -0.0436F);
			mane_rotation3.setTextureOffset(21, 0).addBox(-3.8798F, -5.0031F, -0.6309F, 8.0F, 6.0F, 7.0F, 0.0F, false);
			mane_rotation = new ModelRenderer(this);
			mane_rotation.setRotationPoint(-1.0F, 2.5F, -2.5F);
			mane.addChild(mane_rotation);
			setRotationAngle(mane_rotation, 1.5708F, 0.0F, 0.0F);
			mane_rotation.setTextureOffset(21, 0).addBox(-4.0F, -5.5F, -0.5F, 8.0F, 6.0F, 7.0F, 0.0F, false);
			mane_rotation2 = new ModelRenderer(this);
			mane_rotation2.setRotationPoint(2.0F, 2.5F, -2.5F);
			mane.addChild(mane_rotation2);
			setRotationAngle(mane_rotation2, 1.5708F, -0.48F, 0.0F);
			mane_rotation2.setTextureOffset(21, 0).addBox(-3.4351F, -5.1913F, -0.5F, 8.0F, 6.0F, 7.0F, 0.0F, false);
			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(2.5F, 16.0F, 7.0F);
			leg1.setTextureOffset(0, 18).addBox(-5.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(-0.5F, 16.0F, 7.0F);
			leg2.setTextureOffset(0, 18).addBox(1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			leg3 = new ModelRenderer(this);
			leg3.setRotationPoint(2.5F, 16.0F, -4.0F);
			leg3.setTextureOffset(0, 18).addBox(-5.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			leg4 = new ModelRenderer(this);
			leg4.setRotationPoint(-0.5F, 16.0F, -4.0F);
			leg4.setTextureOffset(0, 18).addBox(1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(1.0F, 12.0F, 10.0F);
			tail.setTextureOffset(9, 18).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			head2 = new ModelRenderer(this);
			head2.setRotationPoint(-5.0F, 13.5F, -3.0F);
			setRotationAngle(head2, 0.0F, 0.3491F, 0.0F);
			head2.setTextureOffset(0, 0).addBox(-2.9938F, -3.0F, -3.7066F, 6.0F, 6.0F, 4.0F, 0.0F, false);
			head2.setTextureOffset(16, 14).addBox(-2.9938F, -5.0F, -1.7066F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head2.setTextureOffset(16, 14).addBox(1.0062F, -5.0F, -1.7066F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head2.setTextureOffset(0, 10).addBox(-1.4938F, -0.02F, -6.7066F, 3.0F, 3.0F, 4.0F, 0.0F, false);
			head3 = new ModelRenderer(this);
			head3.setRotationPoint(5.0F, 13.5F, -4.0F);
			setRotationAngle(head3, 0.0F, -0.3491F, 0.0F);
			head3.setTextureOffset(0, 0).addBox(-2.4825F, -3.0F, -4.7362F, 6.0F, 6.0F, 4.0F, 0.0F, false);
			head3.setTextureOffset(16, 14).addBox(-2.4825F, -5.0F, -2.7362F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head3.setTextureOffset(16, 14).addBox(1.5175F, -5.0F, -2.7362F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head3.setTextureOffset(0, 10).addBox(-0.9825F, -0.02F, -7.7362F, 3.0F, 3.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			mane.render(matrixStack, buffer, packedLight, packedOverlay);
			leg1.render(matrixStack, buffer, packedLight, packedOverlay);
			leg2.render(matrixStack, buffer, packedLight, packedOverlay);
			leg3.render(matrixStack, buffer, packedLight, packedOverlay);
			leg4.render(matrixStack, buffer, packedLight, packedOverlay);
			tail.render(matrixStack, buffer, packedLight, packedOverlay);
			head2.render(matrixStack, buffer, packedLight, packedOverlay);
			head3.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leg4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.head2.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head2.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.head3.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head3.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}
}
