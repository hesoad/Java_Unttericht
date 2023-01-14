package Day33_maps;

import java.util.Map;

public class C05_SoyisimleriBuyukHarfYapmaDeneme {
    public static void main(String[] args) {

        Map<Integer,String>ogrenciMap=MapMethodDepo2.ogrenciMapOlustur();

        ogrenciMap=MapMethodDepo2.soyIsimleriBuyukHarfYap(ogrenciMap);


        MapMethodDepo2.tumListeYazdir(ogrenciMap);

        // 11.siniflari yazdir

        MapMethodDepo2.sinifListesiYazdirma(ogrenciMap,"11");
    }
}
