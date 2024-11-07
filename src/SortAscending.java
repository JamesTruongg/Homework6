import java.sql.SQLOutput;
import java.util.Scanner;

public class SortAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao phan tu mang: ");
        int Number = sc.nextInt();
        int[] arr = new int[Number];
        for (int i = 0; i < Number; i++) {
            System.out.println("Nhap vao phan tu thu " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < Number - 1; i++) {
            for (int j = 0; j < Number - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Mang sau khi sap xep tang dan:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
