package com.wakandaspace.drools_price_model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BenefitUtil implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	public BenefitUtil() {
	}
	public static java.util.List<com.wakandaspace.drools_price_model.Benefit> getRedBerylBenefits = new java.util.ArrayList<com.wakandaspace.drools_price_model.Benefit>() {
		{
			add(new Benefit("Basic outpatient and in-patient Treatment",
					"Covered", "GENERAL CONSULTATION"));
			add(new Benefit("Ostetrician", "Covered", "SPECIALIST CONSULTATION"));
			add(new Benefit("Dialysis and all related care", "1 session",
					"RENAL CARE"));

		}
	};
}