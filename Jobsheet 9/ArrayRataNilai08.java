import java.util.Scanner;
public class ArrayRataNilai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] nilaiMhs = new int [10];
        int jlhLulus = 0, jlhTdkLulus = 0, jlhMhs;
        double totalLulus = 0, totalTdkLulus = 0;
        double rataLulus, rataTdkLulus;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jlhMhs = sc.nextInt();

        for (int i = 0; i < jlhMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }

        // for (int i = 0; i < jlhMhs; i++) {
        //     total += nilaiMhs[i];
        // }

        // Menambahkan output berupa jumlah mahasiswa yang lulus
        for (int i = 0; i < jlhMhs; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jlhLulus += 1;
            } else {
                totalTdkLulus += nilaiMhs[i];
                jlhTdkLulus += 1;
            }
        }
        sc.close();

        rataLulus = totalLulus/jlhLulus;
        rataTdkLulus = totalTdkLulus/jlhTdkLulus;
        System.out.println("Rata-rata nilai lulus = "+rataLulus);
        System.out.println("Rata-rata tidak lulus = "+rataTdkLulus);


        // System.out.println("Jumlah mahasiswa yang lulus : "+jlhLulus);
    }
}
