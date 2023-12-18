package com.avara.cleancode.dry;

public class DateFormatterDry {
  public static String formatDateForDisplay(String date, String format) {
    String[] parts = date.split("-");
    switch (format.toLowerCase()) {
      case "us":
        return parts[1] + "/" + parts[2] + "/" + parts[0];
      case "eu":
        return parts[2] + "/" + parts[1] + "/" + parts[0];
      default:
        throw new IllegalArgumentException("Unsupported format");
    }
  }

  public static void main(String[] args) {
    String date = "2023-12-18";

    String usFormattedDate = formatDateForDisplay(date, "us");
    System.out.println("US Formatted Date: " + usFormattedDate);

    String euFormattedDate = formatDateForDisplay(date, "eu");
    System.out.println("EU Formatted Date: " + euFormattedDate);
  }
}
