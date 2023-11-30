package com.avara.behavioral.strategy;

public class ModerateInvestmentStrategy implements InvestmentStrategy{
  double min = 0.7;
  double max = 1.2;
  public double invest(double amount) {
    double riskCoefficient = RiskUtil.calculateRiskCoefficient(min, max);
    return amount*riskCoefficient;
  }
}
