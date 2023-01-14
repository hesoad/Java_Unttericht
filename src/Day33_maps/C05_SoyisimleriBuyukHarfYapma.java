package Day33_maps;


import Day32_Sets_Maps.MapMethodDepo;

import java.util.Map;

public class C05_SoyisimleriBuyukHarfYapma {

    public static void main(String[] args) {
        // Map’deki soyisimleri buyuk harfe ceviren bir method olusturun

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap= MapMethodDepo.soyisimleriBuyukHarfYap(ogrenciMap);

        MapMethodDepo.tumListeYazdir(ogrenciMap);

        // 11.siniflari yazdir

        MapMethodDepo.sinifListesiYazdirma(ogrenciMap,"11");
    }
}

