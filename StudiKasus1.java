import java.util.Scanner;
public class StudiKasus1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurangBayar;
        
        System.out.print("Masukkan jumlah cup yang dibeli: ");  
        jumlahCup = input.nextInt();
        System.out.print("Masukkan jumlah uang yang dibayarkan: ");
        uangBayar = input.nextInt();

        totalHarga = hargaPerCup * jumlahCup;
        diskon = 0;

        if (totalHarga > 100000) {
            diskon = totalHarga * 10 / 100;
        }
        totalBayar = totalHarga - diskon;

        System.out.println("Total harga          : Rp " + totalHarga);
        System.out.println("Diskon               : Rp " + diskon);
        System.out.println("Total bayar          : Rp " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian            : Rp " + kembalian);
        } else {
            kurangBayar = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurangBayar);
        }

        input.close();
    }
}
