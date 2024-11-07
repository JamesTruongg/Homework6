import java.util.Scanner;

public class SumAndAvegare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu mang: ");
        int Number = sc.nextInt();
        int[] Temp = new int[Number];

        int Sum = 0;
        for (int i = 0; i < Number; i++) {
            System.out.print("Nhap vao phan tu thu " + (i +1 )+" :");
            Temp[i] = sc.nextInt();
            Sum += Temp[i];
        }

        double Average = (double) Sum / Number;
        System.out.println("Tong mang = " + Sum);
        System.out.println("Trung binh cong mang: " + Average);

    }
}
