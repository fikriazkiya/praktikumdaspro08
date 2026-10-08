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

        //BELMAWA, BAKORMA, MANDIRI YANG INI (BIAR GAK BINGUNG)
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah dokumen : ");
            jumlahDokumenYangDiupload = input.nextInt();
            System.out.print("Peringkat juara : ");
            peringkatJuara = input.nextInt();

            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                if (jumlahDokumenYangDiupload >= 4) {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang "
                            + (4 - jumlahDokumenYangDiupload) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
            }

        //PKM YANG INI (BEN GA BINGUNGGGG)
        }else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Masukkan jumlah dokumen yang diupload: ");
            System.out.print("Masukkan status pendanaan PKM (1 untuk didanai, 0 untuk tidak didanai): ");
            statusPendanaanPkm = input.nextInt();

            if (statusPendanaanPkm == 1) {
                System.out.println("Selamat " + namaMahasiswa + ", Anda memenuhi syarat untuk mendapatkan penghargaan!");
            } else {
                System.out.println("Maaf " + namaMahasiswa + ", Anda tidak memenuhi syarat untuk mendapatkan penghargaan.");
            }
        } 
        input.close();
    }
}