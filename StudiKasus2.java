import java.util.Scanner;
public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumenYangDiupload, peringkatJuara, statusPendanaanPkm;

        System.out.print("Masukkan nama Mahasiswa: ");
        namaMahasiswa = input.nextLine();
        System.out.print("Masukkan Jenis Kegiatan (BELMAWA, BAKORMA, Mandiri, PKM, atau Lainnya): ");
        jenisKegiatan = input.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = input.nextInt();
            System.out.print("Peringkat juara : ");
            peringkat = input.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen >= 4) {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang "
                            + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
            }

    }
}