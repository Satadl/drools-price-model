package com.wakandaspace.drools_price_model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Benefit implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label(value = "value")
	private java.lang.String value;
	@org.kie.api.definition.type.Label(value = "benefit_group")
	private java.lang.String benefit_group;

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

	public java.lang.String getBenefit_group() {
		return this.benefit_group;
	}

	public void setBenefit_group(java.lang.String benefit_group) {
		this.benefit_group = benefit_group;
	}

	public Benefit(java.lang.String name, java.lang.String value,
			java.lang.String benefit_group) {
		this.name = name;
		this.value = value;
		this.benefit_group = benefit_group;
	}

}