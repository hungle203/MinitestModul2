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

        displayProduct(products);

    }

    public static QuanLiSp inputProduct(Scanner scanner) {
        System.out.println("Nhập id: ");
        double id = scanner.nextInt();
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập giá");
        double price = scanner.nextInt();
        System.out.println("Nhập Loại");
        String type = scanner.nextLine();

    }
}
