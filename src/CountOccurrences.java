import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu mang: ");
        int Number = sc.nextInt();
        int Temp[] = new int[Number];
        for(int i = 0; i < Number; i++){
            System.out.print("Phần tử mảng thứ " + (i + 1) +":");
            Temp[i] = sc.nextInt();
        }
        System.out.println("Nhap vao phan tu can dem: ");
        int FindNumber = sc.nextInt();
        int Count = 0;
        for(int i = 0; i < Number; i++){
            if(Temp[i] == FindNumber){
                Count++;
            }
        }
        System.out.println("So lan xuat hien cua " +  FindNumber+ " trong mang: " + Count);
    }
}
