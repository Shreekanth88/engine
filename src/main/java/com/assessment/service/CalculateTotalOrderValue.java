package com.assessment.service;

import java.util.List;

public interface CalculateTotalOrderValue {

  int totalCost(List<Integer> cartItems);

  int calculateSKUACost(int skuAQuantity, int totalPrice);

  int calculateSkuBCost(int skuBQuantity, int totalPrice);

  int calculateSKUCAndSKUDCombo(int skuCQuantity, int skuDQuantity, int totalPrice);
}
