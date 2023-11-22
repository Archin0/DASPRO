import java.util.Scanner;

public class UcapanTerimaKasih_08 {
    
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+" for being the best.\n"+
        "You inspired me.");
    }

    public static void UcapanTambahan(String ucapan){
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
        String ucapan = "Panjang-panjang orang baik.";
        UcapanTambahan(ucapan);
    }
}
