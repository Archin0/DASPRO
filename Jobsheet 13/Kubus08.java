import java.util.Scanner;
public class Kubus08 {
    static int vol(int s){
        int vol = s * s * s;
        return vol;
    }

    static int lPer(int s){
        int lPer = 6 * s * s;
        return lPer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Panjang kubus : ");
        int s = scanner.nextInt();

        System.out.println("Volume kubus tersebut adalah : " + vol(s));
        System.out.println("Luas permukaan kubus tersebut adalah : " + lPer(s));
        scanner.close();
    }
}

