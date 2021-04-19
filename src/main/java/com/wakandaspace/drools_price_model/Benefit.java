package com.wakandaspace.drools_price_model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Benefit implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label("value")
	private java.lang.String value;
	@org.kie.api.definition.type.Label("benefit_group")
	private BenefitGroup benefit_group;

	@org.kie.api.definition.type.Label("calculationResult")
	private double calculationResult = 1.0;

	public Benefit() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getValue() {
		return this.value;
	}

	public void setValue(java.lang.String value) {
		this.value = value;
	}

	public double getCalculationResult() {
		return this.calculationResult;
	}

	public void setCalculationResult(double calculationResult) {
		this.calculationResult = calculationResult;
	}

	public Benefit(java.lang.String name, java.lang.String value,
			java.lang.String benefit_group) {
		this.name = name;
		this.value = value;
		this.benefit_group = benefit_group;
		this.calculationResult = 1.0;
	}

	public Benefit(java.lang.String name, java.lang.String value,
			java.lang.String benefit_group, double calculationResult) {
		this.name = name;
		this.value = value;
		this.benefit_group = benefit_group;
		this.calculationResult = 1.0;
	}

	public com.wakandaspace.drools_price_model.BenefitGroup getBenefit_group() {
		return this.benefit_group;
	}

	public void setBenefit_group(
			com.wakandaspace.drools_price_model.BenefitGroup benefit_group) {
		this.benefit_group = benefit_group;
	}

	public Benefit(java.lang.String name, java.lang.String value,
			com.wakandaspace.drools_price_model.BenefitGroup benefit_group,
			double calculationResult) {
		this.name = name;
		this.value = value;
		this.benefit_group = benefit_group;
		this.calculationResult = calculationResult;
	}

}