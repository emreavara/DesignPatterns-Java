package com.avara.cleancode.kiss;

import java.util.stream.IntStream;

public class NumberProcessorComplex {
  public static int calculateSum(int[] numbers) {
    return IntStream.of(numbers).sum();
  }

  public static void main(String[] args) {
    int[] nums = { 2, 4, 6, 8, 10 };
    int totalSum = calculateSum(nums);
    System.out.println("The sum of the numbers is: " + totalSum);
  }
}
