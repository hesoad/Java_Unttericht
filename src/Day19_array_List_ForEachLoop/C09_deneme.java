package Day19_array_List_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_deneme {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alip,
        // o tamsayiyi tam bolebilen tum pozitif tamsayilari
        // bir liste olarak bize donduren bir method olusturun.
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bolenlerini listelemek icin pozitif bir tam sayi giriniz ");
        int girilenSayi= scan.nextInt();
        if(girilenSayi<=0){
            System.out.println("gecersiz sayi ");
        }else{
           List<Integer>tambolenlerListesi= tamBolenlerListesiOlustur(girilenSayi);
            System.out.println(tambolenlerListesi);
               
        }

    }
    public static List<Integer>tamBolenlerListesiOlustur(int girilenSayi){
        List<Integer> tambolenlerlistesi= new ArrayList<>();
        for (int i = 1; i <girilenSayi; i++) {
            if(girilenSayi%i==0){
                tambolenlerlistesi.add(i);
            }

        }
        return tambolenlerlistesi ;
    }
}
