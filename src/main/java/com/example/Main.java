package com.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Logger.logMessage("User logged in ", "INFO");
        Logger.logMessage("Failed login attempt ", "ERROR");


        List<Map<String, Object>> products = Arrays.asList(
            createProduct("Product A", 100, 5),
            createProduct("Product B", 200, 3),
            createProduct("Product C", 50, 10)
        );

        List<Map<String, Object>> sortedProducts = InventoryManagement.sortProducts(products, "price", true);

        sortedProducts.forEach(product -> System.out.println(product));
    }

    private static Map<String, Object> createProduct(String name, int price, int stock) {
        Map<String, Object> product = new HashMap<>();
        product.put("name", name);
        product.put("price", price);
        product.put("stock", stock);

        return product;
    }
}
