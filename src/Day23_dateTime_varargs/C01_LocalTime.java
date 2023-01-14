package Day23_dateTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {
        LocalTime zaman=LocalTime.now();
        System.out.println(zaman);//10:15:22.865359500
        System.out.println(zaman.getMinute());//15
        System.out.println(zaman.withSecond(0).withNano(0));//10:18
        System.out.println(zaman.withSecond(1).withNano(1));//10:21:01.000000001
        System.out.println(zaman.plusHours(100).plusMinutes(250));//18:32:42.706637700
        // bir for loop ile 1'den 10000'e kadar olan sayilari yanyana yazdirin
        // bu islem icin gecen zamani bulun
        LocalTime basZamani=LocalTime.now();
        System.out.println("baslangic "+basZamani);
        for (int i = 1; i <=10000 ; i++) {
            System.out.print(i+" ");
        }
        LocalTime bitZamani=LocalTime.now();
        System.out.println("");
        System.out.println("bitis "+bitZamani);
        System.out.println("Islem suresi : " +
                (bitZamani.getNano()-basZamani.getNano())
                +" nano saniye");

        /*
            Olusturdugumuz time veya date guncel zamani veya tarihi tutmaya devam eden bir sayac degil
            olusturdugumuz satirdaki zamani veya tarih'i sistemden alip kaydeden bir variable'dir

            ilerleyen satirlarda guncel zaman veya tarihe ihtiyacimiz oldugunda
            yeni bir time veya date objesi olusturup
            o andaki degeri alabiliriz.
         */


    }
}
