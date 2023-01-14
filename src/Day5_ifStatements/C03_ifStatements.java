package Day5_ifStatements;

import java.util.Scanner;

public class C03_ifStatements {

    public static void main(String[] args) {
        /*
           if cumlelerinde sart parantezinden sonra body kullanmazsak
           ilk ;'e kadar olan kismi body olarak kabul eder
           yani sadece 1 satir kodu body olarak kabul eder
         */

         /*
        Soru 3- Kullanicidan bir sayi alin,
        sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Eger if body'si icin yazilacak kod 1 satirdan fazlaysa
        MUtlaka { } kullanilmalidir
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz ");
        int sayi = scan.nextInt();

        if(sayi%3==0)
            System.out.println("uc ile bolunebilen sayi");

        if(sayi%5==0)
            System.out.println("bes ile bolunebilen sayi");


    }
}
