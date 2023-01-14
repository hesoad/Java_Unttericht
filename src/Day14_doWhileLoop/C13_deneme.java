package Day14_doWhileLoop;

import java.util.Scanner;

public class C13_deneme {
    public static void main(String[] args) {
        // kullanicidan istedigi kadar sayi alin ve toplayin
        // kullanici deger olarak 0'a basarsa islemi bitirin

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz ");
        int num= scan.nextInt();
        int sum=0;


        while (num!=0){
            sum=sum+num;
            System.out.println("lutfen yeni bir sayi giriniz ");
            num= scan.nextInt();

        }

        System.out.println("Sayilarin toplami "+  sum);

    }
}
