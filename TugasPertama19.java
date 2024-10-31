import java.util.Scanner;
public class TugasPertama19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jumlahNilai, total, nilaiTertinggi, nilaiTerendah;
        double rataRata;
    
        System.out.print("Masukkan jumlah nilai mahasiswa : ");
        jumlahNilai = sc.nextInt();

        int[] nilaiMahasiswa = new int[jumlahNilai];

        System.out.println("masukkan nilai Mahasiswa : ");
        for (int i = 0; i< jumlahNilai; i++){
            System.out.println("nilai mahasiswa ke-" + (i) + " : ");
            nilaiMahasiswa[i] = sc.nextInt();
        }
        System.out.println(" nilai yang sudah ada : ");
        for (int nilai : nilaiMahasiswa){
            System.out.println(nilai + " ");
        }
        System.out.println();

        total = 0;
        for (int nilai : nilaiMahasiswa) {
            total += nilai;
        }
        rataRata = (double) total / jumlahNilai;
        System.out.println(" rata Ratanya adalah : " + rataRata);

        nilaiTertinggi = nilaiMahasiswa[0];
        nilaiTerendah = nilaiMahasiswa[0];

        for (int nilai : nilaiMahasiswa) {
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTertinggi) {
                nilaiTerendah = nilai;
            }
        }

        System.out.println(" Nilai tertinggi adalah: " + nilaiTertinggi);
        System.out.println(" Nilai Terendah adalah: " + nilaiTerendah);
    }
}