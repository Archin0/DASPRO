import java.util.Scanner;
public class Tugas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        int angka;

        System.out.print("Masukkan salah satu angka 1-12 : ");
        angka = sc.nextInt();
       
        // Tanpa Perulangan ketika salah.
        // if (angka > 12) {
        //     System.out.println("Input yang anda masukkan salah!");
        // } else if (angka > 0) {
        //     System.out.println(bulan[angka-1]);
        // } else {
        //     System.out.println("Input yang anda masukkan salah!");
        // }
        
        do {
            System.out.println("Input anda salah! Silahkan coba lagi.");
            System.out.print("Masukkan salah satu angka 1-12 : ");
            angka = sc.nextInt();
        } while (angka > 12 || angka < 1);

        System.out.println("Bulan "+bulan[angka-1]);
        sc.close();

    }
}
