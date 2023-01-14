package Day14_doWhileLoop;

import java.util.Scanner;

public class C08_deneme {
    public static void main(String[] args) {
        // kullanicidan istedigi kadar sayi alin ve toplayin
        // kullanici deger olarak 0'a basarsa islemi bitirin

        int girilenSayi=9;
        int toplama=0;
        int   sayac=0;
        Scanner scan=new Scanner(System.in);

        while (girilenSayi!=0){
            System.out.println("toplamak icin lutfen bir say giriniz");
            girilenSayi= scan.nextInt();
            toplama+=girilenSayi;
           sayac++;
        }
        System.out.println("sayi "+ sayac+" kez girildi,"+"girilen sayilarin toplamai="+ toplama);
    }
}
