package com.assessment.service;

import com.assessment.dto.Product;
import com.assessment.util.ProductTypes;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessingRule {
  public Product convertInputToType(String[] input) {
    List<ProductTypes> productTypes = new ArrayList<>();
    try {
      for (String inputProduct : input) {
        productTypes.add(Enum.valueOf(ProductTypes.class, inputProduct));
      }
    } catch (Exception e) {
      productTypes.add(ProductTypes.other);
    }
    Product product = new Product();
    List<String> opertaions = new ArrayList<>();
    for (ProductTypes productType : productTypes) {
      PhysicalProduct physicalProduct = new PhysicalProduct();
      switch (productType) {
        case physical_product:
          opertaions = physicalProduct.getSlip(opertaions);
          opertaions = physicalProduct.addCommission(opertaions);
          break;

        case book:
          opertaions = physicalProduct.addCommission(opertaions);
          opertaions = physicalProduct.duplicateSlip(opertaions);
          break;

        case membership:
          opertaions = physicalProduct.activateMembership(opertaions);
          opertaions = physicalProduct.emailMembership(opertaions);
          break;

        case upgrade:
          opertaions = physicalProduct.upgradeMembership(opertaions);
          opertaions = physicalProduct.emailMembership(opertaions);
          break;

        case video:
          opertaions = physicalProduct.video(opertaions);
          break;

        default:
          opertaions = physicalProduct.getSlip(opertaions);
      }
    }
    product.setOperations(opertaions);
    return product;
  }
}

