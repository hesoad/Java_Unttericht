package Day18_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C14_deneme {
    public static void main(String[] args) {

        // Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip,
        // kalan kismini list olarak bize donduren bir method olusturun


        List<String> isimler= C10_Sorular.isimListesiOlustur();

        System.out.println(" Istenmeyen harflerin oldugu isimler silindi.\nkalan isimler "
                                                           +istenmeyenIsimleriSil(isimler));



    }
    public static List<String> istenmeyenIsimleriSil(List<String> isimler){

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen isim listesini icermek icin bir harf giriniz");
        String istenmeyenHarf= scan.next().substring(0,1);
        List<String>yeniIsimListesi= new ArrayList<>();

        for (int i = 0; i <isimler.size(); i++) {
            if(!isimler.get(i).contains(istenmeyenHarf)){
                yeniIsimListesi.add(isimler.get(i));
            }

        }
        return yeniIsimListesi;
    }
}
