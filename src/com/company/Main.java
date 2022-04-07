package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int b, choice, size;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\nNhập các lựa chọn sau:" + "\nNhập 1 để xóa các số từ mảng." +
                    "\nNhập 2 để xóa số qua vị trí trong mảng.");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Nhập kích cỡ của mảng: ");
                size = input.nextInt();
                int a[] = new int[size];
                while (size >= 0) {
                    for (int i = 0; i < size; i++) {
                        System.out.println("nhập các phần tử trong mảng: ");
                        a[i] = input.nextInt();
                    }
                    break;
                }
                System.out.println("các giá trị đang có trong mảng: ");
                for (int i = 0; i < size - 1; i++) {
                    System.out.print(a[i] + ", ");
                }
                System.out.print(a[a.length - 1] + ".");
                System.out.println("\nNhập số cần xóa: ");
                int number;
                number = input.nextInt();
                int c[] = new int[size - 1];
                int j = 0;
                for (int i = 0; i < size; i++) {
                    if (a[i] != number) {
                        c[j] = a[i];
                        j++;
                    }
                }
                size = j;
                System.out.println(size);
                System.out.println("Mảng hiện tại: ");
                for (int i = 0; i < size; i++) {
                    System.out.print(c[i] + " ");
                }
            }
            if (choice == 2){
                System.out.println("Nhập kích cỡ của mảng: ");
                size = input.nextInt();
                int a[] = new int[size];
                while (size >= 0) {
                    for (int i = 0; i < size; i++) {
                        System.out.println("nhập các phần tử trong mảng: ");
                        a[i] = input.nextInt();
                    }
                    break;
                }
                System.out.println("các giá trị đang có trong mảng: ");
                for (int i = 0; i < size - 1; i++) {
                    System.out.print(a[i] + ", ");
                }
                System.out.print(a[a.length - 1] + ".");
                System.out.println("\nNhập vị trí cần xóa trong mảng: ");
                int position;
                position = input.nextInt(size);
                for (int i = position;i<size-1;i++){
                    a[i] = a[i+1];
                    position++;
                }
                size = size-1;
                System.out.println("Mảng hiện tại: ");
                for (int i = 0; i < size; i++) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
}
