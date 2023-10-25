import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilai = new int [50];
        int jlhNilai, max, min, total=0, temp=0;
        double rata2;

        // Input banyaknya elemen 
        System.out.print("Masukkan jumlah mahasiswa : ");
        jlhNilai = sc.nextInt();

        // Input nilai tiap elemen
        for (int i = 0; i < jlhNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilai[i] = sc.nextInt();
        }

        // Mencari nilai tertinggi
        for (int i=0; i < jlhNilai; i++) {
            for (int j=1; j < jlhNilai-i; j++) {
                if (nilai[j-1] > nilai[j]) {
                    //swap elemen
                    temp = nilai[j];
                    nilai[j] = nilai[j-1];
                    nilai[j-1] = temp;
                }
            }
        }
        System.out.print("Nilai tertinggi : ");
        for (int i = jlhNilai - 1; i < jlhNilai; i++) {
            System.out.println(nilai[i]);
        }

        // Mencari nilai terendah
        for (int i=0; i < jlhNilai; i++) {
            for (int j=1; j < jlhNilai-i; j++) {
                if (nilai[j-1] < nilai[j]) {
                    //swap elemen
                    temp = nilai[j];
                    nilai[j] = nilai[j-1];
                    nilai[j-1] = temp;
                }
            }
        }
        System.out.print("Nilai terendah : ");
        for (int i = jlhNilai - 1; i < jlhNilai; i++) {
            System.out.println(nilai[i]);
        }

        // Mencari nilai rata-rata
        for (int i = 0; i < jlhNilai; i++) {
            total += nilai[i];
        }
        
        rata2 = total/jlhNilai;
        System.out.println("Nilai rata-rata : "+rata2);

    }
}
