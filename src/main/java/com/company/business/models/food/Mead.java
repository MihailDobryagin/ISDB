package com.company.business.models.food;

public class Mead extends FoodType {
  private String sortName;
  private int alcohol;

  public Mead(Integer id, String name, Integer price, int hp, int mana, int stamina, String sortName, int alcohol) {
    super(id, name, price, hp, mana, stamina);
    this.sortName = sortName;
    this.alcohol = alcohol;
  }

  public String getSortName() {
    return sortName;
  }

  public void setSortName(String sortName) {
    this.sortName = sortName;
  }

  public int getAlcohol() {
    return alcohol;
  }

  public void setAlcohol(int alcohol) {
    this.alcohol = alcohol;
  }
}
