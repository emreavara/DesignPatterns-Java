package com.avara.behavioral.strategy;

public class StrategyMain {

  public static void main(String[] args) {

    Investor riskyInvestor = new Investor();
    riskyInvestor.setInvestmentStrategy(new RiskyInvestmentStrategy());


    Investor moderateInvestor = new Investor();
    moderateInvestor.setInvestmentStrategy(new ModerateInvestmentStrategy());

    Investor stableInvestor = new Investor();
    stableInvestor.setInvestmentStrategy(new StableInvestmentStrategy());


    for (int cycle = 0; cycle < 10; cycle++){
      riskyInvestor.investMoney();
      moderateInvestor.investMoney();
      stableInvestor.investMoney();
    }


    System.out.println("Risky Investor    : " + riskyInvestor.getInvestmentBudget());
    System.out.println("Moderate Investor : " + moderateInvestor.getInvestmentBudget());
    System.out.println("Stable Investor   : " + stableInvestor.getInvestmentBudget());

  }

}
