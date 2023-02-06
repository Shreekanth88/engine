package com.assessment;

import com.assessment.service.CalculateTotalOrderValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PromotionEngine {

    public static void main(String[] args) {
        System.out.println("Application started");
        CalculateTotalOrderValue calculateTotalOrderValue = new CalculateTotalOrderValue();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SKUA Quantity");
        int skuAQ = sc.nextInt();
        System.out.println("Enter SKUB Quantity");
        int skuBQ = sc.nextInt();
        System.out.println("Enter SKUC Quantity");
        int skuCQ = sc.nextInt();
        System.out.println("Enter SKUD Quantity");
        int skuDQ = sc.nextInt();
        List<Integer> cartItems = new ArrayList<>();
        cartItems.add(skuAQ);
        cartItems.add(skuBQ);
        cartItems.add(skuCQ);
        cartItems.add(skuDQ);
        int totalPrice = calculateTotalOrderValue.totalCost(cartItems);
        System.out.println("totalCost:" + totalPrice);
    }
}
