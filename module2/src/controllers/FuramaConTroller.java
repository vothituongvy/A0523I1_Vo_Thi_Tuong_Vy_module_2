package controllers;

import java.util.Scanner;

public class FuramaConTroller {
    public static void displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng :");
            System.out.println("1.Employee Management" +
                    "\n 2.Customer Management " +
                    "\n 3.Facility Management " +
                    "\n 4.Booking Management " +
                    "\n 5.Promotion Management" +
                    "\n 6.Exit"
            );
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Bạn đã chọn Employee Management");
                    displayEmployeeManagement();
                    break;
                case 2:
                    System.out.println("Bạn đã chọn Customer Management");
                    displayCustomerManagement();
                    break;
                case 3:
                    System.out.println("Bạn đã chọn Facility Management");
                    displayFacilityManagement();
                    break;
                case 4:
                    System.out.println("Bạn đã chọn Booking Management");
                    displayBookingManagement();
                    break;
                case 5:
                    System.out.println("Bạn đã chọn Promotion Management");
                    displayPromotionManagement();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }

    public static void displayEmployeeManagement() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng :");
            System.out.println("1.Display list employees" +
                    "\n 2.Add new employee" +
                    "\n 3.Edit employees" +
                    "\n 4.Return main menu"
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Code chức năng hiển thị danh sách employee");
                    break;
                case 2:
                    System.out.println("Code chức năng thêm mới employee");
                    break;
                case 3:
                    System.out.println("Code chức năng sửa employee");
                    break;
                default:
                    flag = false;
            }
        } while (flag);

    }
    public static void displayCustomerManagement() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng :");
            System.out.println("1.Display list customers" +
                    "\n 2.Add new customer" +
                    "\n 3.Edit customer" +
                    "\n 4.Return main menu"
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Code chức năng hiển thị danh sách customer");
                    break;
                case 2:
                    System.out.println("Code chức năng thêm mới customer");
                    break;
                case 3:
                    System.out.println("Code chức năng sửa customer");
                    break;
                default:
                    flag = false;
            }
        } while (flag);

    }
    public static void displayFacilityManagement() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng :");
            System.out.println("1.Display list facility" +
                    "\n 2.Add new facility" +
                    "\n 3.Display list facility maintenance" +
                    "\n 4.Return main menu"
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Code chức năng hiển thị danh sách facility");
                    break;
                case 2:
                    System.out.println("Code chức năng thêm mới facility");
                    break;
                case 3:
                    System.out.println("Code chức năng hiển thị danh sách facility maintenance");
                    break;
                default:
                    flag = false;
            }
        } while (flag);

    }
    public static void displayBookingManagement() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng :");
            System.out.println("1.Add new booking" +
                    "\n 2.Display list booking" +
                    "\n 3.Create new constracts" +
                    "\n 4.Display list contracts"+
                    "\n 5.Edit contracts"+
                    "\n 6.Return main menu"
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Code chức năng thêm mới booking ");
                    break;
                case 2:
                    System.out.println("Code chức năng hiển thị danh sách booking");
                    break;
                case 3:
                    System.out.println("Code chức năng tạo mới constracts");
                    break;
                case 4:
                    System.out.println("Code chức năng hiển thị danh sách contracts");
                    break;
                case 5:
                    System.out.println("Code chức năng sửa contracts");
                    break;
                default:
                    flag = false;
            }
        } while (flag);

    }
    public static void displayPromotionManagement() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng :");
            System.out.println("1.Display list customers use service" +
                    "\n 2.Display list customers get voucher" +
                    "\n 3.Return main menu"
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Code chức năng hiển thị danh sách customers use service");
                    break;
                case 2:
                    System.out.println("Code chức năng hiển thị danh sách customers get voucher");
                    break;
                default:
                    flag = false;
            }
        } while (flag);

    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}

