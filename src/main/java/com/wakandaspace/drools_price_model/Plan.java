package com.wakandaspace.drools_price_model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Plan implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "benefitLimitPerEnrolle")
	private double benefitLimitPerEnrolle;
	@org.kie.api.definition.type.Label(value = "hospitalTier")
	private java.lang.String hospitalTier;
	@org.kie.api.definition.type.Label(value = "individualPremiumResult")
	private double individualPremiumResult;
	@org.kie.api.definition.type.Label(value = "name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label(value = "preAuthorizationRequired")
	private boolean preAuthorizationRequired;

	public Plan() {
	}

	public double getBenefitLimitPerEnrolle() {
		return this.benefitLimitPerEnrolle;
	}

	public void setBenefitLimitPerEnrolle(double benefitLimitPerEnrolle) {
		this.benefitLimitPerEnrolle = benefitLimitPerEnrolle;
	}

	public java.lang.String getHospitalTier() {
		return this.hospitalTier;
	}

	public void setHospitalTier(java.lang.String hospitalTier) {
		this.hospitalTier = hospitalTier;
	}

	public double getIndividualPremiumResult() {
		return this.individualPremiumResult;
	}

	public void setIndividualPremiumResult(double individualPremiumResult) {
		this.individualPremiumResult = individualPremiumResult;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public boolean isPreAuthorizationRequired() {
		return this.preAuthorizationRequired;
	}

	public void setPreAuthorizationRequired(boolean preAuthorizationRequired) {
		this.preAuthorizationRequired = preAuthorizationRequired;
	}

	public Plan(double benefitLimitPerEnrolle, java.lang.String hospitalTier,
			double individualPremiumResult, java.lang.String name,
			boolean preAuthorizationRequired) {
		this.benefitLimitPerEnrolle = benefitLimitPerEnrolle;
		this.hospitalTier = hospitalTier;
		this.individualPremiumResult = individualPremiumResult;
		this.name = name;
		this.preAuthorizationRequired = preAuthorizationRequired;
	}

}