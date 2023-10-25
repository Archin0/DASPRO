import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan elemen ke-"+(i+1)+" : ");
            array[i] = sc. nextInt();
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println("Elemen ke-"+(i+1)+" : "+array[i]);
        }
        sc.close();
    }
}
