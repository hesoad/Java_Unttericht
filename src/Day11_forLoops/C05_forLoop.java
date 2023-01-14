package Day11_forLoops;

import java.util.Scanner;

public class C05_forLoop {

    public static void main(String[] args) {

        //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
       // dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
       // baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen baslangic ve bitis degeri olarak iki pozitif sayi giriniz ");
        
         int baslangic = scan.nextInt();
         
         int bitis = scan.nextInt();
        int toplam=0;
         
         if(bitis<baslangic){
             System.out.println("baslangic degeri bitis degerinden kucuk olmali ");
        }else{


             for (int i = baslangic; i <=bitis ; i++) {

                 toplam += i; // tum sayilari sirasi ile toplam'a ekledik
             }
             System.out.println(baslangic + " ile " + bitis + " arasindaki sayilarin toplami : " + toplam);
         }


            
        
         
        
    }
}
