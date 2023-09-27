import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "pwadmin";

        // Membaca input pengguna
        Scanner input08 = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String inputUsername = input08.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = input08.nextLine();

        // Memeriksa apakah input pengguna cocok dengan data yang disimpan
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login berhasil. Memasuki sistem.");
        } else {
            System.out.println("username dan password salah! Coba lagi.");
        }
        input08.close();
    }
     
}
