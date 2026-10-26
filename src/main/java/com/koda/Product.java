package com.koda;

public abstract class Product {
    // Menggabungkan 2 Class
    // private String productName;
    // private Category productCategory;

    // // Constructor Product
    // public Product(String productName, String categoryName) {
    // this.productName = productName;
    // this.productCategory = new Category(categoryName);
    // }

    // private class Category {
    // private String categoryName;

    // public Category(String categoryName) {
    // this.categoryName = categoryName;
    // }

    // public String getCategoryName() {
    // return categoryName;
    // }

    // }

    // public void showProductInfo() {
    // System.out.println("Product: " + productName);
    // System.out.println("Category: " + productCategory.getCategoryName());
    // }
    // End Gabungan Class

    // public Category test;
    private String productCode;
    private String name;
    private int price;
    private int stock;

    // // Constructor
    public Product(String productCode, String name, int price, int stock) {
        this.productCode = productCode;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void showInfo() {
        System.out.println("Product Code: " + productCode);
        System.out.println("Name : " + name);
        System.out.println("Price : Rp. " + price);
        System.out.println("Stock : " + stock);

    }

    public void addStock(int quantity) {
        stock += quantity;
    }

    // Depedency Injection / Depedency Constructor
    // private String productName;
    // private Category productCategory;

    // public Product(String productName, Category productCategory) {
    // this.productName = productName;
    // this.productCategory = productCategory;
    // }

    // public void showProductInfo() {
    // System.out.println("Product: " + productName);
    // System.out.println("Category: " + productCategory.getCategoryName());
    // }
}
