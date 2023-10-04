import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        System.out.print("Masukkan bil1 : ");
        int bil1 = input08.nextInt();
        System.out.print("Masukkan bil2 : ");
        int bil2 = input08.nextInt();
        System.out.print("Masukkan bil3 : ");
        int bil3 = input08.nextInt();

        if (bil1 > bil2) {
            if (bil2 > bil3) {
                System.out.println("Bilangan terbesar ialah " + bil1);
            } else if (bil3 > bil1){
                System.out.println("Bilangan terbesar ialah " + bil3);
            } else {
                System.out.println("Bilangan terbesar ialah " + bil1);
            }
        } else if (bil2 > bil1) {
            if (bil1 > bil3) {
                System.out.println("Bilangan terbesar ialah " + bil2);
            } else if (bil3 > bil2) {
                System.out.println("Bilangan terbesar ialah " + bil3);
            } else {
                System.out.println("Bilangan terbesar ialah " + bil2);
            }
        } else {
            System.out.println("Bilangan terbesar ialah " + bil3);
        }
        input08.close();
    }
}
