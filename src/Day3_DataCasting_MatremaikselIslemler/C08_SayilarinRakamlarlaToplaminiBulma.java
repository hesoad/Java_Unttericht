package Day3_DataCasting_MatremaikselIslemler;

import java.util.Scanner;

public class C08_SayilarinRakamlarlaToplaminiBulma {

    public static void main(String[] args) {
        // Kullanicidan 4 basamakli pozitif bir tamsayi alin
        // sayinin rakamlar toplamini bulun

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen 4 rakamli tam bir sayi giriniz");
        int girilenSayi= scan.nextInt();

        // soru icin lazim olacak variable'lari hazirlayalim
         int birlerbasamagi=0;

         int rakamlarToplami=0;

        // sirasiyla her bir basamagi elde edip
        // rakamlar toplamiona ekleyelim

        birlerbasamagi=girilenSayi%10; // 7
        rakamlarToplami= rakamlarToplami+birlerbasamagi; // 0+7= 7
        girilenSayi=girilenSayi/10; // 245
        birlerbasamagi=girilenSayi%10; // 5
        rakamlarToplami=rakamlarToplami+birlerbasamagi; // 7 + 5 =12
        girilenSayi=girilenSayi/10; // 24
        birlerbasamagi= girilenSayi%10; // 4
        rakamlarToplami=rakamlarToplami+birlerbasamagi; // 12 + 4 =16
        girilenSayi=girilenSayi/10; // 2
        birlerbasamagi=girilenSayi%10; // 2
        rakamlarToplami=rakamlarToplami+birlerbasamagi; // 16 + 2 = 18
        girilenSayi = girilenSayi/10; // 0


        System.out.println("girilen sayinin rakamlar toplami :" + rakamlarToplami);


    }
}
