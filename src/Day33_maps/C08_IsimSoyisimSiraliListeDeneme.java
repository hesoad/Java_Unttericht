package Day33_maps;

import java.util.Map;

public class C08_IsimSoyisimSiraliListeDeneme {
    public static void main(String[] args) {
        // tum ogrenci listesini isim soyisim no sinif sube bolum
        // seklinde sirali olarak yazdiran bir method olusturun
        Map<Integer,String>ogrenciMap=MapMethodDepo2.ogrenciMapOlustur();

        MapMethodDepo2.isimSoyisimSiraliListeYazdir(ogrenciMap);

    }
}
