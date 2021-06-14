package com.company;

import java.math.BigDecimal;

public class Country implements Comparable<Country>{
  private String name;
  private BigDecimal population;

  public Country(String name, BigDecimal pop){
    this.name=name;
    this.population=pop;
  }

  public BigDecimal getPopulation() {
    return population;
  }

  public String getName() {
    return name;
  }

  @Override
  public int compareTo(Country o) {
    return this.name.compareTo(o.getName());
  }

}
