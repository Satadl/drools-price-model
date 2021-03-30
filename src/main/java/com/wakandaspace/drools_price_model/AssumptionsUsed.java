package com.wakandaspace.drools_price_model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AssumptionsUsed implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("item")
	private java.lang.String item;
	@org.kie.api.definition.type.Label("coverage")
	private java.lang.String coverage;
	@org.kie.api.definition.type.Label("factor")
	private double factor;

	public AssumptionsUsed() {
	}

	public java.lang.String getItem() {
		return this.item;
	}

	public void setItem(java.lang.String item) {
		this.item = item;
	}

	public java.lang.String getCoverage() {
		return this.coverage;
	}

	public void setCoverage(java.lang.String coverage) {
		this.coverage = coverage;
	}

	public double getFactor() {
		return this.factor;
	}

	public void setFactor(double factor) {
		this.factor = factor;
	}

	public AssumptionsUsed(java.lang.String item, java.lang.String coverage,
			double factor) {
		this.item = item;
		this.coverage = coverage;
		this.factor = factor;
	}

}