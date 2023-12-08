package databaseB1.service;


import databaseB1.entities.Products;

import java.util.Map;

public class ProductService {





    public void viewProduct(Map<Integer, Products> productMap){
        for (Products product : productMap.values()) {
            printProductInfo(product);
        }
    }
    private void printProductInfo(Products product) {
        System.out.print("ID: " + product.getId());
        System.out.print(" || Tên: " + product.getName());
        System.out.print(" || Giá: " + product.getPrice());
        System.out.print(" || Số lượng: " + product.getQuantity());

    }
}
