package com.avara.cleancode.dry;

public class DateFormatterRepeated {
  public static String formatDateForDisplay_US(String date) {
    String[] parts = date.split("-");
    return parts[1] + "/" + parts[2] + "/" + parts[0];
  }

  public static String formatDateForDisplay_EU(String date) {
    String[] parts = date.split("-");
    return parts[2] + "/" + parts[1] + "/" + parts[0];
  }

  public static void main(String[] args) {
    String date = "2023-12-18";

    String usFormattedDate = formatDateForDisplay_US(date);
    System.out.println("US Formatted Date: " + usFormattedDate);

    String euFormattedDate = formatDateForDisplay_EU(date);
    System.out.println("EU Formatted Date: " + euFormattedDate);
  }
}
