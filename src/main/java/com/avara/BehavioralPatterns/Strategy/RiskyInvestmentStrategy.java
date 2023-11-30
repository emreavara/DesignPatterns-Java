package com.avara.BehavioralPatterns.Strategy;

public class RiskyInvestmentStrategy implements InvestmentStrategy{
  double min = 0.2;
  double max = 2.0;
  public double invest(double amount) {

    double riskCoefficient = RiskUtil.calculateRiskCoefficient(min, max);
    return amount*riskCoefficient;
  }
}
