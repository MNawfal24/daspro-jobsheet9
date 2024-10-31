import java.util.Scanner;
public class TugasKedua19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlPesanan;
        double totalBiaya = 0.0;

            System.out.println("Masukkan jumlah menu yang ingin dipesan:");
            jmlPesanan = sc.nextInt();
            sc.nextLine(); 

            String[] namaPesanan = new String[jmlPesanan];
            double[] harga = new double[jmlPesanan];

      
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + ": ");
            harga[i] = sc.nextDouble();
            sc.nextLine(); 
        }
        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.printf("%d. %s - Rp%.2f\n", (i + 1), namaPesanan[i], harga[i]); // Indeks mulai dari 1
            totalBiaya += harga[i];
        }
        System.out.printf("\nTotal biaya: Rp%.2f\n", totalBiaya);
        sc.close();
    }
}