package com.avara.behavioral.strategy;

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
