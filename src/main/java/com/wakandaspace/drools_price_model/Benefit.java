package com.wakandaspace.drools_price_model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Benefit implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("benefitType")
	private java.lang.String benefitType;
	@org.kie.api.definition.type.Label("covered")
	private java.lang.Boolean covered;
	@org.kie.api.definition.type.Label("numberOfSessions")
	private int numberOfSessions;
	public Benefit() {
	}

	public java.lang.String getBenefitType() {
		return this.benefitType;
	}

	public void setBenefitType(java.lang.String benefitType) {
		this.benefitType = benefitType;
	}

	public java.lang.Boolean getCovered() {
		return this.covered;
	}

	public void setCovered(java.lang.Boolean covered) {
		this.covered = covered;
	}

	public int getNumberOfSessions() {
		return this.numberOfSessions;
	}

	public void setNumberOfSessions(int numberOfSessions) {
		this.numberOfSessions = numberOfSessions;
	}

	public Benefit(java.lang.String benefitType, java.lang.Boolean covered,
			int numberOfSessions) {
		this.benefitType = benefitType;
		this.covered = covered;
		this.numberOfSessions = numberOfSessions;
	}

}