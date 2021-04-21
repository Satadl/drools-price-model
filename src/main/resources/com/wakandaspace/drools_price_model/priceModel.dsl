#Calculation of PMPM
    #[when] There is a benefitGroup = benefitGroup: BenefitGroup();
[when] There is a benefit = benefit: Benefit();
[when] There is a plan = plan: Plan();
[then] Set the cost of the benefit in calculationResult = benefit.setCalculationResult(benefit.getCalculationResult() * getCost(benefit.getName(), plan.getHospitalTier()));
[then] Calculate the cost with the utilisation per 1000 = benefit.setCalculationResult(benefit.getCalculationResult() * (getUtilisationPerBenefit(benefit.getName())/ 12000));

#Calculation of final factor
[then] Calculate the cost factor for limit with PMPM and set it in calculationResult = benefit.setCalculationResult(benefit.getCalculationResult()* getCostFactorPerLimit(plan.getBenefitLimitPerEnrolle()));
[then] Set calculationResult with the cost factor = benefit.setCalculationResult(benefit.getCalculationResult() *getAllFactorPerLimit(benefit.getBenefit_group().getLimit()));

#Calculation of final factor with quarter and selection factor
[then] Set calculationResult with the quarter factor = benefit.setCalculationResult(benefit.getCalculationResult()* search("Coverage From", benefit.getBenefit_group().getCoverageFrom()));
[then] Set calculationResult with the selection factor = benefit.setCalculationResult(benefit.getCalculationResult() * search(benefit.getBenefit_group().getName(), benefit.getValue()));

#Calculation of the individual premium result
    #individualPremiumResult =  ((Total FinalFactor * factor(preauthorization)) /lossRatioTarget)*12
[when] Calculate The sum of finalfactor of each benefit = sumFinalFactor :  Double() from accumulate (Benefit(benefit == benefit, calculationR : calculationResult), sum(calculationR));
[when] There is a Expense  = expense: Expense();
[then] Calculate the individual premium result = plan.setIndividualPremiumResult(((sumFinalFactor * search("Pre Authorization",plan.getPreAuthorizationRequired()))/expense.getLossRatioTarget())*12);

#[then] Calculate the individual premium result = plan.setIndividualPremiumResult(((sumFinalFactor * search("Pre Authorization",plan.getPreAuthorizationRequired()))/getRatio(plan.getName()))*12);