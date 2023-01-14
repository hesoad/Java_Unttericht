package Day3_DataCasting_MatremaikselIslemler;

import java.util.Scanner;

public class C09_DataCasting {
    public static void main(String[] args) {
        // kullanicidan 2 tamsayi alin
        // 1.tamsayiyi 2.ye bolup sonucu ondalik olarak yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen birbirine bolmek icin iki Tamsayi girin");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        System.out.println("sayilarin bolme sonucu:"  + sayi1/(double)sayi2);

        System.out.println('a'-32);
// kullanicidan bir char alip
        // ascii table'dan kullanicinin girdigi char'in sonrasindaki
        // 3 karakteri yazdirin
        // ornek input : a output : b,c,d

        Scanner scan2= new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz: ");

        char girilenKarakter= scan.next().charAt(0);

        System.out.println((char)(girilenKarakter+1) +","+
                          (char)(girilenKarakter+2) +"," +
                          (char)(girilenKarakter+3)+",");

    }
}
