package com.assessment.service;

import com.assessment.model.Product;

public interface OrderProcessingRule {
  Product convertInputToType(String[] input);
}

