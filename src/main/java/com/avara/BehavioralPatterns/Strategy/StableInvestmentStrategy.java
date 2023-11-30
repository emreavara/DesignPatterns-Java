package com.avara.BehavioralPatterns.Strategy;

public class StableInvestmentStrategy implements InvestmentStrategy{
  double min = 0.95;
  double max = 1.1;

  public double invest(double amount) {
    var riskCoefficient = RiskUtil.calculateRiskCoefficient(min, max);
    return amount*riskCoefficient;
  }
}
