import java.util.Scanner;
public class ArrayRataNilai19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Masukkan Jumlah Mahasiswa = ");
        int JmlMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int [JmlMahasiswa];
        double total=0, totallulus = 0, totalTdkLulus= 0, rata2lulus, rata2TdkLulus;
        int jmllulus = 0, JmlTidakLlulus = 0;

        for (int i = 0; i< nilaiMhs.length; i++){
            System.out.print(" Masukkan nilai Mahasiswa ke-" + i + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i< nilaiMhs.length; i++){
            total += nilaiMhs[i];
            if(nilaiMhs[i] > 70) {
                totallulus += nilaiMhs[i];
                jmllulus++;
            } else {
                JmlTidakLlulus += nilaiMhs[i];
                totalTdkLulus++;
            }
        }
       rata2lulus = (jmllulus > 0) ? totallulus / jmllulus : 0;
       rata2TdkLulus = (JmlTidakLlulus > 0)? totalTdkLulus / JmlTidakLlulus : 0;
       System.out.println(" Rata Rata Nilai lulus adalah = " + rata2lulus);
       System.out.println(" rata rata nilai tidak lulus adalah = " + rata2TdkLulus);

       sc.close();
    }
}