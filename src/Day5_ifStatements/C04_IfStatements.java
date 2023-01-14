package Day5_ifStatements;

import java.util.Scanner;

public class C04_IfStatements {

    public static void main(String[] args) {

        /*
        Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
                NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
                Kullanici o veya O yazdiginda output Ocak olsun.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir ayin ilk harfini giriniz");

        char ilkKarakter= scan.next().charAt(0);
        if(ilkKarakter== 'o' || ilkKarakter =='O'){
            System.out.println("Ocak");
        }
        if(ilkKarakter== 's' || ilkKarakter =='S'){
            System.out.println("Subat");

        }


        if(ilkKarakter== 'm' || ilkKarakter =='M'){
            System.out.println("Mart ve mayis");
        }

        if(ilkKarakter== 'n' || ilkKarakter =='N'){
            System.out.println("Nisan");

        }

        if(ilkKarakter== 'h' || ilkKarakter =='H'){
            System.out.println("");
        }
        if(ilkKarakter== 't' || ilkKarakter =='T'){
            System.out.println("Temmuz");
        }

        if(ilkKarakter== 'a' || ilkKarakter =='A'){
            System.out.println("Agustus veya Aralik");
        }

        if(ilkKarakter== 'e' || ilkKarakter =='E'){
            System.out.println("Eylul ve Ekim ");
        }

        if(ilkKarakter== 'K' || ilkKarakter =='k'){
            System.out.println("kasim");

        }

    }
}
