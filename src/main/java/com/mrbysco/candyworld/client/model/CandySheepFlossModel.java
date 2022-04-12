package com.mrbysco.candyworld.client.model;

import com.mrbysco.candyworld.entity.CandySheepEntity;
import net.minecraft.client.renderer.entity.model.QuadrupedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class CandySheepFlossModel<T extends CandySheepEntity> extends QuadrupedModel<T> {
	private float headRotationAngleX;

	public CandySheepFlossModel() {
		super(12, 0.0F, false, 8.0F, 4.0F, 2.0F, 2.0F, 24);
		this.head = new ModelRenderer(this, 0, 0);
		this.head.addBox(-3.0F, -4.0F, -3.85F, 6, 6, 6, 1.2F);
		this.head.setPos(0.0F, 6.0F, -8.0F);
		this.body = new ModelRenderer(this, 28, 8);
		this.body.addBox(-4.0F, -9.0F, -9.0F, 8, 16, 6, 2.4F);
		this.body.setPos(0.0F, 5.0F, 2.0F);
		this.leg0 = new ModelRenderer(this, 0, 16);
		this.leg0.addBox(-2.0F, 2.0F, -2.0F, 4, 6, 4, 0.8F);
		this.leg0.setPos(-3.0F, 12.0F, 7.0F);
		this.leg1 = new ModelRenderer(this, 0, 16);
		this.leg1.addBox(-2.0F, 2.0F, -2.0F, 4, 6, 4, 0.8F);
		this.leg1.setPos(3.0F, 12.0F, 7.0F);
		this.leg2 = new ModelRenderer(this, 0, 16);
		this.leg2.addBox(-2.0F, 2.0F, -2.0F, 4, 6, 4, 0.8F);
		this.leg2.setPos(-3.0F, 12.0F, -5.0F);
		this.leg3 = new ModelRenderer(this, 0, 16);
		this.leg3.addBox(-2.0F, 2.0F, -2.0F, 4, 6, 4, 0.8F);
		this.leg3.setPos(3.0F, 12.0F, -5.0F);
	}

	@Override
	public void prepareMobModel(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
		super.prepareMobModel(entityIn, limbSwing, limbSwingAmount, partialTick);
		this.head.y = 6.0F + entityIn.getHeadRotationPointY(partialTick) * 9.0F;
		this.headRotationAngleX = entityIn.getHeadRotationAngleX(partialTick);
	}

	@Override
	public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		super.setupAnim(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		this.head.xRot = this.headRotationAngleX;
	}
}