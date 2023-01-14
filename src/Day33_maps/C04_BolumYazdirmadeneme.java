package Day33_maps;

import java.util.Map;

public class C04_BolumYazdirmadeneme {
    public static void main(String[] args) {
        // verilen bolumdeki ogrencilerin
        // No, isim soyisim ve siniflarini yazdiran
        // bir method olusturun
        Map<Integer,String>ogrenciMaP=MapMethodDepo2.ogrenciMapOlustur();
        MapMethodDepo2.bolumListesiOlusturma(ogrenciMaP,"tm");
    }
}
