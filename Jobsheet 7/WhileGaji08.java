import java.util.Scanner;

public class WhileGaji08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jumlahKaryawan, jlhJamLembur;
        double gajiLembur=0, totGajiLembur=0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan : ");
        jumlahKaryawan = scan.nextInt();

        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Staf");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = scan.next();
            System.out.print("Masukkan jumlah jam lembur : ");
            jlhJamLembur = scan.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jlhJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("staf")) {
                gajiLembur = jlhJamLembur * 75000;
            } else {
                System.out.println("Jabatan Invalid!");
                i--;
            }

            totGajiLembur += gajiLembur;
        }
        System.out.println("Total gaji lembur : " + totGajiLembur);
    }
}
