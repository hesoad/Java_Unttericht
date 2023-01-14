package Day32_Sets_Maps;

import java.util.Map;

public class C09_NumaraIleSubeGunceleme {
    public static void main(String[] args) {
        //Numarasi verilen ogrencinin sube ismini
        // veren sube yapan bir method olusturn
        Map<Integer,String>ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap= MapMethodDepo.numaraIleSubeOlusturma(ogrenciMap,104,"M");
        ogrenciMap= MapMethodDepo.numaraIleSubeOlusturma(ogrenciMap,101,"L");
        ogrenciMap= MapMethodDepo.numaraIleSubeOlusturma(ogrenciMap,102,"T");

        System.out.println(ogrenciMap);
    }
}
