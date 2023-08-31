package ss8_mvc.controller;

import ss8_mvc.service.IProductService;
import ss8_mvc.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void displayMenu() {
        IProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng :");
            System.out.println("1.Display" +
                    "\n 2.Add" +
                    "\n 3.Edit" +
                    "\n 4.Delete" +
                    "\n 5.Find Name" +
                    "\n 6.Exit"
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Code chức năng hiển thị");
                    productService.display();
                    break;
                case 2:
                    System.out.println("Code chức năng thêm mới");
                    productService.add();
                    break;
                case 3:
                    System.out.println("Code chức năng sửa");
                    productService.update();
                    break;
                case 4:
                    System.out.println("Code chức năng xoá");
                    productService.delete();
                    break;
                case 5:
                    System.out.println("Code chức năng tìm kiếm theo tên");
                    productService.findName();
                    break;
                default:
                    flag = false;
            }
        } while (flag);

    }
}
