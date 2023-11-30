package com.avara.BehavioralPatterns.Strategy;

import java.util.Random;

public class RiskUtil {
  public static double calculateRiskCoefficient(double min, double max) {
    Random random = new Random();
    double riskCoefficient = min + (max - min) * random.nextDouble();
    return riskCoefficient;
  }

}
