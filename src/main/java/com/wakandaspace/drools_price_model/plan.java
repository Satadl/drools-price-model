package com.wakandaspace.drools_price_model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class plan implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label("hospitalTier")
	private java.lang.String hospitalTier;
	@org.kie.api.definition.type.Label("preAuthorizationRequired")
	private boolean preAuthorizationRequired;

	@org.kie.api.definition.type.Label("benefitLimitPerEnrolle")
	private double benefitLimitPerEnrolle;

	@org.kie.api.definition.type.Label(value = "individualPremiumResult")
	private java.lang.Double individualPremiumResult;

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

	public boolean isPreAuthorizationRequired() {
		return this.preAuthorizationRequired;
	}

	public void setPreAuthorizationRequired(boolean preAuthorizationRequired) {
		this.preAuthorizationRequired = preAuthorizationRequired;
	}

	public plan(
			java.lang.String name,
			java.lang.String hospitalTier,
			double benefitLimits,
			boolean preAuthorizationRequired,
			java.util.List<com.wakandaspace.drools_price_model.BenefitCategory> benefitCategories) {
		this.name = name;
		this.hospitalTier = hospitalTier;
		this.benefitLimits = benefitLimits;
		this.preAuthorizationRequired = preAuthorizationRequired;
		this.benefitCategories = benefitCategories;
	}

	public double getBenefitLimitPerEnrolle() {
		return this.benefitLimitPerEnrolle;
	}

	public void setBenefitLimitPerEnrolle(double benefitLimitPerEnrolle) {
		this.benefitLimitPerEnrolle = benefitLimitPerEnrolle;
	}

	public java.lang.Double getIndividualPremiumResult() {
		return this.individualPremiumResult;
	}

	public void setIndividualPremiumResult(
			java.lang.Double individualPremiumResult) {
		this.individualPremiumResult = individualPremiumResult;
	}

	public plan(java.lang.String name, java.lang.String hospitalTier,
			boolean preAuthorizationRequired, double benefitLimitPerEnrolle,
			java.lang.Double individualPremiumResult) {
		this.name = name;
		this.hospitalTier = hospitalTier;
		this.preAuthorizationRequired = preAuthorizationRequired;
		this.benefitLimitPerEnrolle = benefitLimitPerEnrolle;
		this.individualPremiumResult = individualPremiumResult;
	}

}