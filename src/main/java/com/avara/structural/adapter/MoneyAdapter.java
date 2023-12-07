package com.avara.structural.adapter;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MoneyAdapter {

  public static double convert(double amount, Money source, Money target) {
    return calculateConvertedAmount(amount, source.getConversionRate(), target.getConversionRate());
  }

  private static double calculateConvertedAmount(double amount, double sourceRate, double targetRate) {
    return (amount*sourceRate)/targetRate;
  }

}
