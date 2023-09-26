import java.util.Scanner;
public class PemilihanPercobaan208 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        System.out.print("Nilai UAS   : ");
        float uas = input08.nextFloat();
        System.out.print("Nilai UTS   : ");
        float uts = input08.nextFloat();
        System.out.print("Nilai Kuis  : ");
        float kuis = input08.nextFloat();
        System.out.print("Nilai Tugas : ");
        float tugas = input08.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak Remidi";
        System.out.println("Nilai akhir anda : " + total + " sehingga " + message);

        if (total > 100) {
            System.out.println("Error! Mohon berikan input yang benar!");
        } else if (total > 80) {
            System.out.println("Nilai : A, setara 4 dengan kualifikasi Sangat Baik");
        } else if (total > 73) {
            System.out.println("Nilai : B+, setara 3,5 dengan kualifikasi Lebih dari Baik");
        } else if (total > 65) {
            System.out.println("Nilai : B, setara 3 dengan kualifikasi Baik");
        } else if (total > 60) {
            System.out.println("Nilai : C+, setara 2,5 dengan kualifikasi Lebih dari Cukup");
        } else if (total > 50) {
            System.out.println("Nilai : C, setara 2 dengan kualifikasi Cukup");
        } else if (total > 39) {
            System.out.println("Nilai : D, setara 1 dengan kualifikasi Kurang");
        } else {
            System.out.println("Nilai : E, setara 0 dengan kualifikasi Gagal");
        }
        input08.close();
    }
}
