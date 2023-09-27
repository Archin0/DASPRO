import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        System.out.println("***** SELAMAT DATANG DI TUTORIAL GAME SLASHSHOT *****");
        System.out.print("Masukkan jarak musuh dengan karakter anda (m) : ");
        int jarakMusuh = input08.nextInt();

        if (jarakMusuh > 5) {
            System.out.println("Gunakan RANGED WEAPON (BOW&ARROW, CROSSBOW, JAVELIN, GUN)");
        } else {
            System.out.println("Gunakan MELEE WEAPON (SWORDS, KNIFE, DAGGER, AXE, CLUB, HAMMER, KATANA, SPEAR, MACE)");
        }
        input08.close();
    }
}
