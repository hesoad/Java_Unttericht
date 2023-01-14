package Day3_DataCasting_MatremaikselIslemler;

import java.util.Scanner;

public class C03_DataCasting {

     public static void main(String[] args) {
        System.out.println(28/5);// 5

        System.out.println(29/3);// 9
        // Java bir bolme isleminde 2 int isleme giriyorsa
        // sonucu int olarak verir
         int sayi1=25;
         int sayi2=6;
         System.out.println(sayi1 / sayi2);// 4

         double dbl=6; // 4.166666666666667

         System.out.println(sayi1 / dbl);

         // kullanicidan 2 tamsayi alin
         // 1.tamsayiyi 2.ye bolup sonucu ondalik olarak yazdirin

        Scanner scan= new Scanner(System.in);
         System.out.println("Lutfen iki tam sayi giriniz" );
         int say3 = scan.nextInt();
         int sayi4= scan.nextInt();

         System.out.println("Bolme sonucu:"+ say3/(double)sayi4);


     }
    }

