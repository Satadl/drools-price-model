package com.wakandaspace.drools_price_model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Tariff implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "benefit")
	private java.lang.String benefit;
	@org.kie.api.definition.type.Label(value = "tier1")
	private double tier1;
	@org.kie.api.definition.type.Label(value = "tier2")
	private double tier2;
	@org.kie.api.definition.type.Label(value = "tier3")
	private double tier3;
	@org.kie.api.definition.type.Label(value = "tier4")
	private double tier4;
	@org.kie.api.definition.type.Label(value = "utilisation")
	private double utilisation;

	public Tariff() {
	}

	public java.lang.String getBenefit() {
		return this.benefit;
	}

	public void setBenefit(java.lang.String benefit) {
		this.benefit = benefit;
	}

	public double getTier1() {
		return this.tier1;
	}

	public void setTier1(double tier1) {
		this.tier1 = tier1;
	}

	public double getTier2() {
		return this.tier2;
	}

	public void setTier2(double tier2) {
		this.tier2 = tier2;
	}

	public double getTier3() {
		return this.tier3;
	}

	public void setTier3(double tier3) {
		this.tier3 = tier3;
	}

	public double getTier4() {
		return this.tier4;
	}

	public void setTier4(double tier4) {
		this.tier4 = tier4;
	}

	public double getUtilisation() {
		return this.utilisation;
	}

	public void setUtilisation(double utilisation) {
		this.utilisation = utilisation;
	}

	public Tariff(java.lang.String benefit, double tier1, double tier2,
			double tier3, double tier4, double utilisation) {
		this.benefit = benefit;
		this.tier1 = tier1;
		this.tier2 = tier2;
		this.tier3 = tier3;
		this.tier4 = tier4;
		this.utilisation = utilisation;
	}

}