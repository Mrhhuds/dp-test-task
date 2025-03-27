package com.example;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class InventoryManagement {

    public static List<Map<String, Object>> sortProducts(List<Map<String, Object>> products, String sortKey, boolean descending) {
        Comparator<Map<String, Object>> comparator = Comparator.comparing(product -> (Comparable) product.get(sortKey));
        if (descending) {
            comparator = comparator.reversed();
        }

        products.sort(comparator);
        return products;
    }
}