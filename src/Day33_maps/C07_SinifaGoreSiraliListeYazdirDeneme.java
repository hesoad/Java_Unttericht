package Day33_maps;

import java.util.Map;

public class C07_SinifaGoreSiraliListeYazdirDeneme {
    public static void main(String[] args) {
        // tum ogrenci listesini
        // sinif sube isim soyisim no seklinde
        // dogal sirali olarak
        // Yazdiran bir method olusturun

        Map<Integer,String>ogrenciMap=MapMethodDepo2.ogrenciMapOlustur();
        MapMethodDepo2.sinifSiraliListeYazdir(ogrenciMap);


    }
}
