package com.wakandaspace.drools_price_model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class plan implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label(value = "hospitalTier")
	private java.lang.String hospitalTier;
	@org.kie.api.definition.type.Label(value = "benefitLimits")
	private double benefitLimits;

	public plan() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getHospitalTier() {
		return this.hospitalTier;
	}

	public void setHospitalTier(java.lang.String hospitalTier) {
		this.hospitalTier = hospitalTier;
	}

	public double getBenefitLimits() {
		return this.benefitLimits;
	}

	public void setBenefitLimits(double benefitLimits) {
		this.benefitLimits = benefitLimits;
	}

	public plan(java.lang.String name, java.lang.String hospitalTier,
			double benefitLimits) {
		this.name = name;
		this.hospitalTier = hospitalTier;
		this.benefitLimits = benefitLimits;
	}

}