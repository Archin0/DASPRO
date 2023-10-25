import java.util.Scanner;
public class Tugas5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int[] bil = new int [8];
        double total=0;
        double rata2;

        for (int i = 0; i < bil.length; i++) {
            System.out.print("Masukkan bilangan ke-"+(i+1)+" : ");
            bil[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < bil.length; i++) {
            total += bil[i];
        }

        rata2 = total/bil.length;
        System.out.println("Rata-rata dari seluruh bilangan ialah "+rata2);
    }
}
