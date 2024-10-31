public class SearchNilai19 {

    public static void main(String[] args) {
         int jmlelemen = 0, key, hasil;
        
         System.out.println(" Masukkan jumlah array = ");
         jmlelemen = sc.nextInt();

            int[] arrNilai = new int [jmlelemen];

        for (int i = 0 ; i < jmlelemen; i++) {
            System.out.print("elemen ke-" + i + " = ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.println(" masukkan nilai yang ingin di cari = " );
        key = sc.nextInt();

        hasil = -1;

        for (int i = 0; i<arrNilai.length; i++){
            if (key == arrNilai[i]){
                hasil = i;
                break;
            }
        }
        if (hasil != -1){
            System.out.println(" Nilai" + key + " ditemukan di indeks ke-" + hasil);

        }else {
            System.out.println("nilai" + hey + "tidak ditemukan");
        }

        sc.close();
    }
}