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
					"covered", "", "", 0));
			add(new Benefit("Ostetrician", "covered", "unlimited", "", 0));
			add(new Benefit("Dialysis and all related care", "covered",
					"1 session", "", 0));

		}
	};

}