package Day33_maps;

import java.util.Map;

public class C06_SiniflariArtirmaDeneme {
    public static void main(String[] args) {

        // ogrenci map'indeki tum sinif degerlerini 1 artirin
        // 12.sinifta olan varsa sinif bilgisini Mezun yapin


        Map<Integer,String>ogrenciMap=MapMethodDepo2.ogrenciMapOlustur();
        ogrenciMap=MapMethodDepo2.siniflariArtir(ogrenciMap);
        MapMethodDepo2.tumListeYazdir(ogrenciMap);



    }
}
