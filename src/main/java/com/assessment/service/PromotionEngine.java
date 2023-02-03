package com.assessment.service;

import java.util.Scanner;

public class PromotionEngine {

    public static void main(String[] args) {
        System.out.println("Application started");
        CalculateTotalOrderValue calculateCost = new CalculateTotalOrderValue();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SKUA Quantity");
        int skuAQ = sc.nextInt();
        System.out.println("Enter SKUB Quantity");
        int skuBQ = sc.nextInt();
        System.out.println("Enter SKUC Quantity");
        int skuCQ = sc.nextInt();
        System.out.println("Enter SKUD Quantity");
        int skuDQ = sc.nextInt();
        int totalPrice = calculateCost.totalCost(skuAQ, skuBQ, skuCQ, skuDQ);
        System.out.println("totalCost:" + totalPrice);
    }
}
