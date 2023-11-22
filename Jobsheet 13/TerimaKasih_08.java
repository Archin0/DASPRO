public class TerimaKasih_08 {

    // --using function
    public static void UcapanTerimakasih(){
        System.out.println("Thank you bro.\n"+
        "You inspired me.");
    }

    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        UcapanTerimakasih();
        String ucapan = "Terima Kasih cuy. Panjang-panjang orang baik.";
        UcapanTambahan(ucapan);
        
        //--not using function
        // System.out.println("Thank you bro.\n"+
        // "You inspired me.");
    }
}

