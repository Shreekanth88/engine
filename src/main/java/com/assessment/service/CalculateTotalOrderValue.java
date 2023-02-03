package com.assessment.service;

public class CalculateTotalOrderValue {
  public static final int SKUA_PRICE = 50;
  public static final int SKUA3_COMBO = 130;
  public static final int SKUB_PRICE = 30;
  public static final int SKUB2_COMBO = 45;
  public static final int SKUC_PRICE = 20;
  public static final int SKUD_PRICE = 15;
  public static final int SKUCD_COMBO = 30;

  public int totalCost(int skuAQuantity, int skuBQuantity, int skuCQuantity, int skuDQuantity) {
    int totalPrice = 0;
    totalPrice = calculateSKUACost(skuAQuantity, totalPrice);
    totalPrice = calculateSkuBCost(skuBQuantity, totalPrice);
    totalPrice = calculateSKUCAndSKUDCombo(skuCQuantity, skuDQuantity, totalPrice);
    return totalPrice;
  }

  private int calculateSKUACost(int skuAQuantity, int totalPrice) {
    if (skuAQuantity >= 3) {
        if (skuAQuantity ==3) {
          totalPrice = totalPrice + SKUA3_COMBO;
        } else {
          int quotient = skuAQuantity/3;
          int reminder = skuAQuantity%3;
          totalPrice = totalPrice + (quotient* SKUA3_COMBO +reminder* SKUA_PRICE);
        }
      return totalPrice;
    } else {
      return totalPrice + skuAQuantity * SKUA_PRICE;
    }
  }

  private int calculateSkuBCost(int skuBQuantity, int totalPrice) {
    if (skuBQuantity >= 2) {
      if (skuBQuantity ==2) {
        totalPrice = totalPrice + SKUB2_COMBO;
      } else {
        int quotient = skuBQuantity/2;
        int reminder = skuBQuantity%2;
        totalPrice = totalPrice + (quotient* SKUB2_COMBO +reminder* SKUB_PRICE);
      }
      return totalPrice;
    } else {
      return totalPrice + skuBQuantity * SKUB_PRICE;
    }
  }

  private int calculateSKUCAndSKUDCombo(int skuCQuantity, int skuDQuantity, int totalPrice) {
    if (skuCQuantity > skuDQuantity) {
      totalPrice = totalPrice + (skuDQuantity * SKUCD_COMBO);
      totalPrice = totalPrice + ((skuCQuantity-skuDQuantity) * SKUC_PRICE);
      return totalPrice;
    } else if (skuCQuantity < skuDQuantity) {
      totalPrice = totalPrice + (skuCQuantity * SKUCD_COMBO);
      totalPrice = totalPrice + ((skuDQuantity - skuCQuantity) * SKUD_PRICE);
      return totalPrice;
    } else {
      totalPrice = totalPrice + (skuCQuantity * SKUCD_COMBO);
      return totalPrice;
    }
  }
}
