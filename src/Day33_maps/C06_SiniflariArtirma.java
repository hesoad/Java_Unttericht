package Day33_maps;

import Day32_Sets_Maps.MapMethodDepo;

import java.util.Map;

public class C06_SiniflariArtirma {

    public static void main(String[] args) {
        // ogrenci map'indeki tum sinif degerlerini 1 artirin
        // 12.sinifta olan varsa sinif bilgisini Mezun yapin

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap= MapMethodDepo.siniflariArtir(ogrenciMap);

        MapMethodDepo.tumListeYazdir(ogrenciMap);
    }
}
