package com.assessment.service;

import com.assessment.dto.Product;

import java.util.Scanner;

public class BusinessRulesEngine {

    public static void main(String[] args) {
        //order Processing
        System.out.println("physical_product");
        System.out.println("book");
        System.out.println("membership");
        System.out.println("upgrade");
        System.out.println("video");
        System.out.println("other");
        System.out.println("Enter any Product type mentioned above separated by space");
        Scanner sc1 = new Scanner(System.in);
        String input = sc1.nextLine();
        String[] inputs = input.split(" ");
        OrderProcessingRule orderProcessingRule = new OrderProcessingRule();
        Product output = orderProcessingRule.convertInputToType(inputs);
        System.out.println("Operations : "+output.getOperations());
    }
}
