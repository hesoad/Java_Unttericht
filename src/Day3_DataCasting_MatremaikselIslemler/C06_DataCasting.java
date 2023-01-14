package Day3_DataCasting_MatremaikselIslemler;

import java.util.Scanner;

public class C06_DataCasting {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan bir double, bir  tamsayi alin,
        // double sayiyi tam sayiya bolun
        // ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println( "lutfen bir ondalik sayi giriniz");

        double sayiDbl= scan.nextDouble();

        System.out.println("lutfen bir tam sayi giriniz");
        int sayiInt= scan.nextInt();

        System.out.println((double) (sayiDbl/sayiInt));






    }
}
