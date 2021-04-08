
[when] There is a benefit = benefit: Benefit()
[when] There is a plan = plan: Plan()
[then] get the price of the benefit = tarriff: TarriffUtil(getFactorsPerBenefit(benefit.name))
