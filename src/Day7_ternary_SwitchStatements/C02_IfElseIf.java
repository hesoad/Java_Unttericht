package Day7_ternary_SwitchStatements;

import java.util.Scanner;

public class C02_IfElseIf {
    public static void main(String[] args) {
    /* kullanicidan bir tamsayi alin
           sayi negatif ise "negatif sayi",
           sayi rakam ise "girilen sayi rakam"
           sayi 2 basamakli ise "girilen sayi 2 basamakli"
           sayi 2 basamaktan buyukse "buyuk sayi" yazdirin
         */


        Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen bir tamsayi giriniz ");
        int sayi1 = scan.nextInt();

        if(sayi1<0 ){
            System.out.println("negatif sayi : ");
        }

        else if(  sayi1<=9){
            System.out.println("girilen sayi rakam ");
        } else if(sayi1 <= 99){
            System.out.println("girilen sayi iki basamakli" );
        } else if (sayi1>100){
            System.out.println("buyuk sayi ");
        }


    }
}
