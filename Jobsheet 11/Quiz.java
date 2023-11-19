import java.util.Scanner;
import java.util.Random;
public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        char menu = 'y';
        do {
            int number = random.nextInt(10)+1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10) : ");
                int answer = sc.nextInt();
                sc.nextLine();
                success = (answer == number);

                if (answer == number){
                    System.out.println("Tebakan anda benar!");
                } else if (answer > number) {
                    System.out.println("Angka anda lebih besar dari jawaban");
                } else {
                    System.out.println("Angka anda lebih kecil dari jawaban");
                }
            } while (!success);
            System.out.print("Apakah anda ingin mengulang permainan (y/n)?");
            menu = sc.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'y');

        sc.close();
    }
}

