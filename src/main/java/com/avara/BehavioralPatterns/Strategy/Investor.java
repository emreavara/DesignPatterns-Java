package com.avara.BehavioralPatterns.Strategy;

import lombok.Getter;

public class Investor {

  private InvestmentStrategy investmentStrategy;

  @Getter
  private double investmentBudget = 1000;

  public void setInvestmentStrategy(InvestmentStrategy investmentStrategy) {
    this.investmentStrategy = investmentStrategy;
  }

  public Investor investMoney() {
    investmentBudget =  investmentStrategy.invest(investmentBudget);
    return this;
  }

}
