package com.koda;

public class Category {
    private String categoryName;
    private int stock;

    public Category(String categoryName, int stock) {
        this.categoryName = categoryName;
        this.stock = stock;
    }

    public void addStock(int quantity) {
        if (quantity <= 0) {
            System.out.println("Gaboleh minus coy");
        }
        stock += quantity;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public int getStock() {
        return stock;
    }
}
