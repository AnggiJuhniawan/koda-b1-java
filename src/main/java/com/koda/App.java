package com.koda;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // Product product1 = new Product();

        // product1.productCode = "PC001";
        // product1.name = "Keyboard";
        // product1.price = 350000;
        // product1.stock = 10;

        // Product product2 = new Product();
        // product2.productCode = "PC002";
        // product2.name = "Mouse";
        // product2.price = 250000;
        // product2.stock = 15;

        // Category kateg = new Category();
        // kateg.id = "C001";
        // kateg.nama = "Makanan";

        // Object buat Constructor
        // Product product1 = new Product(
        // "PC001", "Keyboard", 350000, 10);

        // product1.addStock(5);
        // product1.showInfo();
        // System.out.println(kateg.nama);
        // System.out.println(product1.name);
        // System.out.println();
        // System.out.println(product2.name);
        // System.out.println(product2.price);

        // Gabungan Class
        // Product product1 = new Product("Mouse", "Elektronik");
        // product1.showProductInfo();
        // End Gabungan Class

        // Depedency Injection
        // Category categoryElektrik = new Category("Electric", 10);
        // Category pakaian = new Category("Pakaian Pria", 5);

        // Product product1 = new Product("Laptop MacBook Pro M10", categoryElektrik);
        // Product product2 = new Product("Kemeja", pakaian);
        // Product product3 = new Product("Mouse", categoryElektrik);

        // product1.showProductInfo();
        // System.out.println("============================");
        // product2.showProductInfo();
        // System.out.println("============================");
        // product3.showProductInfo();
        // pakaian.addStock(10);
        // System.out.println("Stok: " + pakaian.getStock());
        // pakaian.addStock(-10);
        // System.out.println("Stok: " + pakaian.getStock());

        // Inheritence
        PhysicalProduct product = new PhysicalProduct("P001", "Keyboard", 350000, 10);

        DigitalProduct ebook = new DigitalProduct("DIG001", "E-book", 10000);

        product.showInfo();
        product.addStock(5);
        System.out.println();
        ebook.showInfo();
    }
}
