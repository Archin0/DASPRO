import java.util.Scanner;
public class TugasC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan angka anda : ");
        int bilangan = scan.nextInt();
        System.out.print("Masukkan bilangan kelipatan yang ingin dikecualikan (1-9) : ");
        int kelipatan = scan.nextInt();

        System.out.print("----------------------------------------------------------------\n");
        for (int i = 1; i < bilangan; i++) {
            if (i % kelipatan == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println("\nProgram berhenti.");
        scan.close();
    }
}
