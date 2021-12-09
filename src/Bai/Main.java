package Bai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng sản phẩm");

        int size = scanner.nextInt();

        QuanLiSp[] products = new QuanLiSp[size];
        for (int i = 0; i < products.length; i++) {
            products[i] = inputProduct(scanner);
        }

//        displayProduct(products);

    }

    public static QuanLiSp inputProduct(Scanner scanner) {
        System.out.println("Nhập id: ");
        double id = scanner.nextDouble();
        System.out.println("Nhập tên sản phẩm");
        System.out.println();
        String name = scanner.nextLine();
        System.out.println("Nhập giá");
        double price = scanner.nextDouble();
        System.out.println("Nhập Loại");
        String type = scanner.nextLine();
        System.out.println("Nhập loại tiền");
        double money = scanner.nextDouble();
         return new  QuanLiSp(id,name,price,type,money);
    }
//    public static void
}
