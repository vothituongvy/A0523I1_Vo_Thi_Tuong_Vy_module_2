package ss12_java_collection_framework.bai_1;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        productManager.addProduct(new Product(1, "Product 1", 10));
        productManager.addProduct(new Product(2, "Product 2", 9));
        productManager.addProduct(new Product(3, "Product 3", 11));

        productManager.displayProduct();
        productManager.updateProduct(1, "Product 1", 15);
        productManager.removeProduct(2);
        productManager.findProductByName("Product 1");
        System.out.println("Sắp xếp theo tăng dần");
        productManager.sortProductByPriceAscending();
        productManager.displayProduct();
        System.out.println("Sắp xếp theo giảm dần");
        productManager.sortProductByPriceDescending();
        productManager.displayProduct();
    }
}
