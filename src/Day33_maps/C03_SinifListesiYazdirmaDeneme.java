package Day33_maps;

import java.util.Map;

public class C03_SinifListesiYazdirmaDeneme {
    public static void main(String[] args) {
        // verilen siniftaki ogrencilerin no, isim, soyisim, bolumlerini
        // bir liste olarak yazdiran bir method olusturun
        Map<Integer,String>ogrenciMap=MapMethodDepo2.ogrenciMapOlustur();
        MapMethodDepo2.sinifListesiYazdirma(ogrenciMap,"10");
        MapMethodDepo2.sinifListesiYazdirma(ogrenciMap,"11");
        //101=Ali-Can-11-H-MF
    }
}
