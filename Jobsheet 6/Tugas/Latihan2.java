import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        int jumlah;
        int diskon;
        String jenis;
        
        System.out.print("Jenis buku (kamus/novel) : ");
        jenis = input08.nextLine();
        System.out.print("Berapa jumlah yang dibeli : ");
        jumlah = input08.nextInt();

        // *Tanpa menggunakan operator LOGIKA
        // if (jenis.equalsIgnoreCase("kamus")) {
        //     if (jumlah > 2) {
        //         diskon = 12;
        //     } else {
        //         diskon = 10;
        //     }
        // } else if (jenis.equalsIgnoreCase("novel")) {
        //     if (jumlah > 3) {
        //         diskon = 9;
        //     } else {
        //         diskon = 8;
        //     }
        // } else {
        //     if (jumlah > 3) {
        //         diskon = 5;
        //     } else {
        //         diskon = 0;
        //     }
        // }
        
        // **Dengan menggunakan operator LOGIKA
        if ((jenis.equalsIgnoreCase("kamus")) && (jumlah > 2)) {
            diskon = 10 + 2;
        } else if ((jenis.equalsIgnoreCase("kamus")) && (jumlah <= 2)) {
            diskon = 10;
        } else if ((jenis.equalsIgnoreCase("novel")) && (jumlah > 3)) {
            diskon = 7 + 2;
        } else if ((jenis.equalsIgnoreCase("novel")) && (jumlah <= 3)) {
            diskon = 7 + 1;
        } else {
            if (jumlah > 3) {
                diskon = 5;
            } else {
                diskon = 0;
            }
        }

        System.out.println("Jumlah diskon : " + diskon + "%");
        input08.close();
    }
}
