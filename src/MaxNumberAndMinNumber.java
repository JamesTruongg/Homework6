import java.util.Scanner;

public class MaxNumberAndMinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu mang: ");
        int Number = sc.nextInt();
        int[] Temp = new int[Number];

        for (int i = 0; i < Number; i++) {
            System.out.print("Nhap vao phan tu thu " + (i +1 )+" :");

            Temp[i] = sc.nextInt();
        }
        int Max = Temp[0];        // Số lớn nhất trong mảng
        for(int i = 0; i < Number; i++){
            if(Temp[i] > Max){
                Max = Temp[i];
            }
        }
        int Min = Temp[0];        // Số bé nhất  trong mảng
        for(int i = 0; i < Number; i++){
            if(Temp[i] < Min){
                Min = Temp[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng: " + Max + " , " + " Số bé nhất trong mảng: " + Min);
    }
}
