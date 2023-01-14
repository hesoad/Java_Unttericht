package Day1_programlamayagiris;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {


    /*Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

     */

    Scanner scan = new Scanner(System.in);

        System.out.println("lutfen sayiyi giriniz ");
        int sayi1= scan.nextInt();
        System.out.println("lutfen sayi2 i giriniz");
        int sayi2= scan.nextInt();

        int temp;
        // 1. adim sayi2 yi temp eatayalim

        temp=sayi2;

        // 2.adim sayi1 degerini sayi2 atayalim

        sayi2=sayi1;

        //tempdeki degeri sayi1 e atayalim

        sayi1=temp;
        System.out.println("sayilarin yerlerini degistirtim"
        + "sayi1 in yeni degeri:" + sayi1
        + "sayi2 nin yeni degeri ");
    }

}
