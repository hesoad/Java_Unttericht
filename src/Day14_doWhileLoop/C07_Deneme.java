package Day14_doWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class C07_Deneme {
    public static void main(String[] args) {

          /*
    random olarak 1 ile 100 arasinda bir sayi olusturun
    kullanicidan bu sayiyi bilmesini isteyin
    kullanici her deger girdiginde
    tuttugumuz sayi ile karsilastirip tahminini buyult/kucult diyelim
    kullanici tuttugumuz sayiyi bildiginde
    tahmin sayisini ve

    - 3 veya daha az tahminde bildiyse "Vaowww"
    - 4-8 tahminde bildiyse "Aferin"
    - daha fazla tahminde bildiyse "basarisiz"
    yazdirin
 */

        Random rnd= new Random(100);
        int tutulanSayi = rnd.nextInt(100);
        int tahmin=0;
        int sayac= 1;

        Scanner scan= new Scanner(System.in);

        while (tahmin!=tutulanSayi){
            System.out.println( " lutfen bir tahmin giriniz");
            tahmin= scan.nextInt();

            if(tahmin==tutulanSayi){
                System.out.println(sayac+ "  tahmin ile tutulan sayiyi buldunuz");
                if(sayac<=3){
                    System.out.println("vaoww");
                }else if(sayac<=8){
                    System.out.println("Aferin");
                }else{
                    System.out.println("basarsiz");
                }
                break;
            }else if(tahmin<tutulanSayi){
                System.out.println("sayiyi buyut");
                sayac++;
            }else{
                System.out.println("sayiyi kucult");
                sayac++;
            }

        }




    }






}
