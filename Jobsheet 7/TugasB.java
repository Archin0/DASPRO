import java.util.Scanner;

public class TugasB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlah = 0;
    
        // Membuat perulangan mundur dari 25 hingga 1 (FOR)
        // for (int i = 25; i >= 1; i--) {
        //      jumlah += i;
        // }


        // Membuat perulangan mundur dari 25 hingga 1 (WHILE)
        System.out.print("Masukkan angka anda : ");
        int bilangan = scan.nextInt();
        
        int i = 1;

        while (i <= bilangan) {
            jumlah += i;
            i++;
        }
        
        i--;
        System.out.printf("Hasil penjumlahan deret bilangan %d sampai dengan 1 adalah : %d", i, jumlah);
        scan.close();
    }
    
}
