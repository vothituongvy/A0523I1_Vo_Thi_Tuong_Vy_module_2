package ss8_mvc.repository;

import ss8_mvc.model.Product;

public interface IProductRepository {
    Product[] getListProduct();
    void addProduct(Product product);
    void deleteProductById(int id);

    void updateProductById(int id);

    void findProductByName(String findName);
}
