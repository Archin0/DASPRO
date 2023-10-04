import java.util.Scanner;
public class Pemilihan2Percobaan208 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        float sudut1, sudut2, sudut3, totalSudut;

        System.out.print("Masukkan besar sudut 1 : ");
        sudut1 = input08.nextFloat();
        System.out.print("Masukkan besar sudut 2 : ");
        sudut2 = input08.nextFloat();
        System.out.print("Masukkan besar sudut 3 : ");

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 ==90) || (sudut2 == 90) || (sudut3 ==90)) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } else {
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
            }
        } else {
            System.out.println("Bukan segitiga");
        }
        input08.close();
    }
}
