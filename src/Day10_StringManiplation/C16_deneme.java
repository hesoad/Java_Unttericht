package Day10_StringManiplation;

import java.util.Scanner;

public class C16_deneme {
    public static <string> void main(String[] args) {

        //Kullanicidan isim ve soyismini ayri ayri alin.
        // - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        // - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        // harflerle yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen isminizi  giriniz");
        String isim= scan.nextLine();
        System.out.println("Lutfen Soyadinizi giriniz");
        String soyadi= scan.nextLine();
        isim=isim.toLowerCase();
        soyadi=soyadi.toLowerCase();

        if(isim.length()>soyadi.length()){
            System.out.println((isim.substring(0,1).toUpperCase() + isim.substring(1) + " "+soyadi.substring(0,1).toUpperCase()+soyadi.substring(1)));
        } else if(soyadi.length()>isim.length()){

            System.out.println(isim.substring(0,1).toUpperCase() + isim.substring(1) + " " +soyadi);

        }else{
            System.out.println("isim ve soyadi ayni uzunlukta");
        }

        





    }
}
