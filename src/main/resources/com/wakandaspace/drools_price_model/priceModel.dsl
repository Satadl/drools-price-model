#Calculation of PMPM
[when] There is a benefit = benefit: Benefit();
[when] There is a plan = plan: Plan();
[then] Set the cost of the benefit in calculationResult = benefit.setCalculationResult(benefit.getCalculationResult() * getCost(benefit.getName(), plan.getHospitalTier()));
[then] Calculate the PMPM in calculationResult = benefit.setCalculationResult(benefit.getCalculationResult() * (getUtilisationPerBenefit(benefit.getName())/ 12000));

#Calculation of final factor
[when] There is a benefitGroup = benefitGroup: BenefitGroup();
[then] Set the cost of the benefit per enrolle in calculationResult = benefit.setCalculationResult(benefit.getCalculationResult()* getCostFactorPerLimit(plan.getBenefitLimitPerEnrolle()));
[then] Calculate the finalfactor in calculationResult = benefit.setCalculationResult(benefit.getCalculationResult() *getAllFactorPerLimit(benefitGroup.getLimit()));

#Calculation of final factor with quarter and selection factor
[then] Set calculationResult with the quarter factor = benefit.setCalculationResult(benefit.getCalculationResult()* search("Coverage From", benefitGroup.getCoverageFrom()));
[then] Set calculationResult with the selection factor = benefit.setCalculationResult(benefit.getCalculationResult() * search(benefitGroup.getName(), benefit.getValue()));

#Calculation of the individual premium result
    #individualPremiumResult =  ((Total FinalFactor * factor(preauthorization)) /lossRatioTarget)*12
[when] The sum of finalfactor of each benefit = sumFinalFactor :  Double() from accumulate (Benefit(benefit == benefit, calculationR : calculationResult), sum(calculationR));
[then] Calculate the individual premium result = plan.setIndividualPremiumResult((sumFinalFactor * search("Pre Authorization",plan.getPreAuthorizationRequired()))/getRatio(plan.getName());
#[then] Calculate the individual premium result = plan.setIndividualPremiumResult(((sumFinalFactor * search("Pre Authorization",plan.getPreAuthorizationRequired()))/getRatio(plan.getName()))*12);