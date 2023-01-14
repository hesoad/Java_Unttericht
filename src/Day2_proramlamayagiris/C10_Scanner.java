package Day2_proramlamayagiris;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {

         /*
        Soru 2- Kullanicidan bir double, bir de int sayi alip
        bunlarin toplamini ve carpimini yazdirin.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen ondalik bir sayi giriniz");

        double dbl= scan.nextDouble();

        System.out.println("lutfen bir tam sayi giriniz");

        int sayi = scan.nextInt();

        System.out.println("\nsayilarin toplam="+ (dbl+sayi) +
             "\nsayilarin carpimi=" + (dbl*sayi)  );


    }
}
