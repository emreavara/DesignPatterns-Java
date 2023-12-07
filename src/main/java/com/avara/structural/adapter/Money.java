package com.avara.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Money {
  private String name;
  private double conversionRate; // let's say respective to gold for all

}
