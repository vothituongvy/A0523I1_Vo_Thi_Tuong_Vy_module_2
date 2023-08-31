package ss8_mvc.service.impl;

import ss8_mvc.model.Product;
import ss8_mvc.repository.IProductRepository;
import ss8_mvc.repository.impl.ProductRepository;
import ss8_mvc.service.IProductService;

import java.util.Scanner;

public class ProductService implements IProductService {

    private IProductRepository productRepository = new ProductRepository();
    @Override
    public void display() {
        Product[] products = productRepository.getListProduct();
        for (int i=0; i<products.length;i++){
            if (products[i]!=null){
                System.out.println((1+i) + "." + products[i]);
            }

        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập giá");
        int price = scanner.nextInt();
        System.out.println("nhập loại");
        String type = scanner.nextLine();
        Product product = new Product(id,name,price,type);
        productRepository.addProduct(product);

    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id mã hàng cần xoá");
        int deleteId = Integer.parseInt(scanner.nextLine());
        productRepository.deleteProductById(deleteId);
    }

    @Override
    public void update() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id mã hàng cần sửa");
        int updateId = Integer.parseInt(scanner.nextLine());
        productRepository.updateProductById(updateId);
    }

    @Override
    public void findName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên cần tìm kiếm");
        String findName = scanner.nextLine();
        productRepository.findProductByName(findName);
    }
}
