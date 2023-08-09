package ss2_vong_lap_trong_java;

import java.util.Scanner;

public class hien_thi_loai_hinh_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng:");
            System.out.println("1.Hình chữ nhật");
            System.out.println("2.Tam giac vuông");
            System.out.println("2.1Tam giac vuông góc vuông ở trên trái");
            System.out.println("2.2Tam giac vuôg góc vuông ở trên phải");
            System.out.println("2.3Tam giac vuôg góc vuông ở dưới trái");
            System.out.println("2.4Tam giac vuôg góc vuông ở dưới phải");
            System.out.println("3.In tam giac cân");
            System.out.println("4.Exit");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    //Hình chữ nhật
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    int choose2 = Integer.parseInt(sc.nextLine());
                    switch (choose2) {
                        //Tam giac vuông góc vuông ở trên trái
                        case 1:
                            for (int i = 0; i < 5; i++) {
                                for (int j = 5; j > i; j--) {
                                    System.out.print("*");
                                }
                                System.out.print("\n");
                            }
                            break;
                            //Tam giac vuôg góc vuông ở trên phải
                        case 2:
                            for (int i = 0; i < 5; i++) {
                                for (int j = 0; j < 5; j++) {
                                    if(j<i){
                                        System.out.print(" ");
                                    }else{
                                        System.out.print("*");
                                    }
                                }

                                System.out.println();
                            }
                            break;
                            //Tam giac vuôg góc vuông ở dưới trái
                        case 3:
                            for (int i = 0; i<5; i++) {
                                for (int j=0;j<i+1;j++){
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                            //Tam giac vuôg góc vuông ở dưới phải
                        case 4:
                            for (int i = 1; i <= 5; i++) {
                                for (int j = 1; j <= 5; j++) {
                                    if (j <= 5 - i) {
                                        System.out.print(" ");
                                    } else {
                                        System.out.print("*");
                                    }
                                }
                                System.out.println();
                            }
                            break;
                    }
                    break;
                    //In tam giac cân
                case 3:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5-i; j++) {
                            System.out.print(" ");
                        }
                        for (int k =1; k <= 2*i-1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                default:flag=false;
                    System.out.println("Bạn đã thoát khỏi chương trình");
            }
        } while (flag);
    }
}
