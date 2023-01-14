package Day14_doWhileLoop;

import java.util.Scanner;

public class C09_deneme {
    public static void main(String[] args) {
        // kullanicidan istedigi kadar sayi alin ve toplayin
        // kullanici deger olarak 0'a basarsa islemi bitirin

        int girilenSayi=0;
        int toplam=0;
        int   sayac=0;
        Scanner scan=new Scanner(System.in);

       do {
           System.out.println("lutfen bir sayi giriniz");
           girilenSayi= scan.nextInt();
           toplam=toplam+girilenSayi;
           sayac++;

       }while (girilenSayi!=0);

        System.out.println("sayi " + sayac + " kez girildi, "+ " girilen sayilarin toplami="+ toplam);
    }
}
