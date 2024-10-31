import java.util.Scanner;

public class TugasKetiga19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String makananDiPingin;
        boolean ada;

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
                         "Kentang Goreng", "Teh Tarik", "Cappucino", 
                         "Chocolate Ice"};
        System.out.println(" Masukkan makanan yang ingin di beli : ");
        makananDiPingin = sc.nextLine();

         ada=false;
        for(String makanan : menu) {
            if (makanan.equalsIgnoreCase(makananDiPingin)){
                ada = true;
                break;
            }
        }
                
            if (ada) {
                System.out.println(makananDiPingin + " ada di dalam menu");
            }else{
                System.out.println(makananDiPingin + " tidak ada di dalam menu");
            }
        
            sc.close();
    } 
}