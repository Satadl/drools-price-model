
[when] There is a benefit = benefit: Benefit();
[when] There is a plan = plan: Plan();
[then] get the cost of the benefit = cost: double getCost(benefit.getName(), plan.getHospitalTier()); 
[then] get the use of the benefit = utilisation: double getUtilisationPerBenefit(benefit.getName());
[then] set the value of PMPM in calculationResult = benefit.setCalculationResult((utilisation/ 12000) * cost);
#TarriffUtil()
