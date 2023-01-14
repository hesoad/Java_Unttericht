package Day5_ifStatements;

import java.util.Scanner;

public class C07_ifStatements {
    public static void main(String[] args) {

        /* Kullanicidan bir harf aliniz.

        girilen karekter kucuk harf ise onu buyuk harf olarak yazdirin,

        yoksa girilen harfi yazdirin

         */


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
         char girilenKarekter = scan.next().charAt(0);

         if(girilenKarekter>='a'&& girilenKarekter<='z'){
             System.out.println(Character.toUpperCase(girilenKarekter));
         } else{
             System.out.println(girilenKarekter);
         }
    }
}
