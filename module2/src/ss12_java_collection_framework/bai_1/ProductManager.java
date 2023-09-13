package ss12_java_collection_framework.bai_1;

import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProductById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                break;
            }
        }
    }

    public void updateProduct(int id, String names, int prices) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.get(i).setName(names);
                products.get(i).setPrice(prices);
                break;
            }
        }
    }

    public void removeProduct(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(products.get(i));
                break;
            }
        }
    }

    public void displayProduct() {
        for (Product product : products) {
            System.out.println(products);
        }
    }

    public void findProductByName(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) != null) {
                if (products.get(i).getName()==name) {
                    System.out.println(products.get(i));
                }
            }
        }
    }
    public void sortProductByPriceAscending(){
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
    }
    public void sortProductByPriceDescending(){
        products.sort((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
    }
}
