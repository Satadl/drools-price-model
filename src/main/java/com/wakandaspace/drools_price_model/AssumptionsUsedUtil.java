package com.wakandaspace.drools_price_model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AssumptionsUsedUtil implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	public AssumptionsUsedUtil() {
	}

	public static java.util.List<com.wakandaspace.drools_price_model.AssumptionsUsed> getAssumptionsUsedList = new java.util.ArrayList<com.wakandaspace.drools_price_model.AssumptionsUsed>() {
		{
			add(new AssumptionsUsed("Renal", "1 Session", 0.79));
		}
	};

	public static double search(String item, String coverage) {
		for (AssumptionsUsed assumptionsUsed : getAssumptionsUsedList) {
			if (assumptionsUsed.getItem().compareToIgnoreCase(item) == 0
					&& assumptionsUsed.getCoverage().compareToIgnoreCase(
							coverage) == 0) {
				return assumptionsUsed.getFactor();
			}
		}
		return 1;
	}
}