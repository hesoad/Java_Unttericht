package Day11_forLoops;

import java.util.Scanner;

public class C13_deneme {
    public static void main(String[] args) {

        //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
       // dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
       // baslangic degerinden kucuk olsa da program calissin

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen baslanic ve bitis degeri olan iki pozitif sayi giriniz");

        int baslangic= scan.nextInt();
        int bitis = scan.nextInt();

        int toplam= 0;

        for (int i = baslangic; i <=bitis ; i++) {
            toplam+=i;



        }
        System.out.print( "sayilarin toplami : " + toplam);
    }
}
