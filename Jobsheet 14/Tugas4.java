import java.util.Scanner;
public class Tugas4 {
    static int hitungPsgMarmut(int bulan){
        if(bulan == 1 || bulan == 2){
            return 1; 
        } else if(bulan < 1){
            return 0;
        } else {
            return hitungPsgMarmut(bulan - 2) + hitungPsgMarmut(bulan - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah bulan : ");
        int bulan = sc.nextInt();

        System.out.println("|Bulan|\t\t|Jumlah Produktif|\t|Jumlah Belum Produktif|\t|Total Pasangan|");

        for (int i = 0; i <= bulan; i++) {
            int total = hitungPsgMarmut(i);
            int jumlahPasangan = hitungPsgMarmut(i - 1);
            int blmProduktif = hitungPsgMarmut(i - 2);

            sc.close();  

            System.out.println(i + "\t\t\t" + blmProduktif + "\t\t\t" + jumlahPasangan + "\t\t\t\t" + total);
        }
    }
}