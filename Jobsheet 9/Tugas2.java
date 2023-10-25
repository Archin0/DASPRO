import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[60];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan elemen ke-"+(i+1)+" : ");
            array[i] = sc. nextInt();
        }

        // Print array
        // for (int i = 0; i < array.length; i++) {
        //     System.out.println("Elemen ke-"+(i+1)+" : "+array[i]);
        // }
    }
}
