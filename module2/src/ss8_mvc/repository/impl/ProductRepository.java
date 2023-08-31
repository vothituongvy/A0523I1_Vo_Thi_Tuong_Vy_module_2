package ss8_mvc.repository.impl;

import ss8_mvc.model.Product;
import ss8_mvc.repository.IProductRepository;

import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    private static Product[] products = new Product[20];

    static {
        products[0] = new Product(1, "ABC", 3000, "Sách");
        products[1] = new Product(2, "Táo", 4000, "Trái cây");
        products[2] = new Product(3, "Bút bi", 5000, "Bút");
    }

    @Override
    public Product[] getListProduct() {
        return products;
    }

    @Override
    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }

    }

    @Override
    public void deleteProductById(int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                products[i] = null;
                break;
            }
        }

    }

    Scanner sc = new Scanner(System.in);

    public void updateProductById(int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                System.out.println("nhập tên sản phẩm sửa lại");
                String updateName = sc.nextLine();
                products[i].setName(updateName);
                System.out.println("nhập gia sản phẩm sửa lại");
                int updatePrice = Integer.parseInt(sc.nextLine());
                products[i].setPrice(updatePrice);
                System.out.println("nhập loại sản phẩm sửa lại");
                String updateType = sc.nextLine();
                products[i].setType(updateType);
                break;
            }
        }
    }

    public void findProductByName(String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                if (products[i].getName().equals(name)) {
                    System.out.println(products[i]);
                }
            }
        }
    }
}
