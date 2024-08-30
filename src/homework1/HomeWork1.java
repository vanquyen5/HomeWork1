package HomeWork1;

import java.util.Scanner;

public class HomeWork1 {

    public static float[] importData(float[] arrays, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri thu " + (i + 1) + " :");
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
    }

    public static void printData(float[] arrays, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arrays[i] + " ");
        }
        System.out.println();
    }

    public static float findMax2(float[] arrays, int n) {
        float Max1, Max2;
        if (arrays[0] > arrays[1]) {
            Max1 = arrays[0];
            Max2 = arrays[1];
        } else {
            Max1 = arrays[1];
            Max2 = arrays[0];
        }
        for (int i = 2; i < n; i++) {
            if (arrays[i] >= Max1) {
                Max2 = Max1;
                Max1 = arrays[i];
            } else if (arrays[i] > Max2) {
                Max2 = arrays[i];
            }
        }
        return Max2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu co trong mang: ");
        int n = scanner.nextInt();
        float[] arrays = new float[n];
        HomeWork1.importData(arrays, n);
        System.out.print("Cac phan tu co trong mang la: ");
        HomeWork1.printData(arrays, n);
        float a = HomeWork1.findMax2(arrays, n);
        System.out.println("Phan tu lon thu 2 trong mang la: "+a);
    }
}

