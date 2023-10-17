import java.util.Scanner;

public class TugasA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] namaMahasiswa = new String[30];
        char[] jenisKelamin = new char[30];
        int jumlahSiswa;

        System.out.print("Masukkan jumlah siswa : ");
        jumlahSiswa = input.nextInt();

        // Menggunakan perulangan untuk mengisi data mahasiswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + " : ");
            namaMahasiswa[i] = input.next();
            
            System.out.print("Masukkan jenis kelamin (P/L) mahasiswa ke-" + (i + 1) + " : ");
            jenisKelamin[i] = input.next().charAt(0);
        }

        System.out.println("-------------------------------------------");
        System.out.println("Daftar mahasiswa perempuan:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (jenisKelamin[i] == 'P' || jenisKelamin[i] == 'p') {
                System.out.println(namaMahasiswa[i]);
            }
        }
        input.close();
    }
}

