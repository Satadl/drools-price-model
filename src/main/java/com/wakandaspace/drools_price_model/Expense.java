package com.wakandaspace.drools_price_model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Expense implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "lossRatioTarget")
	private java.lang.Double lossRatioTarget;

	public Expense() {
	}

	public java.lang.Double getLossRatioTarget() {
		return this.lossRatioTarget;
	}

	public void setLossRatioTarget(java.lang.Double lossRatioTarget) {
		this.lossRatioTarget = lossRatioTarget;
	}

	public Expense(java.lang.Double lossRatioTarget) {
		this.lossRatioTarget = lossRatioTarget;
	}

}