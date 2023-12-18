package com.avara.cleancode.kiss;

public class NumberProcessorSimple {
  public static int calculateSum(int[] numbers) {
    int sum = 0;
    for (int num : numbers) {
      sum += num;
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 4, 6, 8, 10 };
    int totalSum = calculateSum(nums);
    System.out.println("The sum of the numbers is: " + totalSum);
  }
}
