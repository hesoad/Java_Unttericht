package Day32_Sets_Maps;

import java.util.Map;

public class C08_SubeListesiOlusturma {
    public static void main(String[] args) {

        //Verilen sinif ve sube isim ile sinif listesini dondurenn method olusturun

        Map<Integer,String>ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.sinifLisitesiYazdirma(ogrenciMap,"11","H");
    }
}
