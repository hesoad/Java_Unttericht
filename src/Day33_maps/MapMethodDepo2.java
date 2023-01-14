package Day33_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapMethodDepo2 {

    public static Map<Integer, String> ogrenciMapOlustur() {
        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-k-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-10-H-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-H-MF");


        return ogrenciMap;
    }

    public static void sinifListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif) {
        // verilen siniftaki ogrencilerin no, isim, soyisim, bolumlerini
        // bir liste olarak yazdiran bir method olusturun

        System.out.println("No Isim Soyisim bolum");
        System.out.println("===================================");

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();
        for (Map.Entry<Integer,String> eachEntry:entrySeti) {
            // 1- entry'den value'yu alalim
            String entryValue=eachEntry.getValue();

            // 2- bu value'yu parcalayalim ve bir array'e store edelim

            String[] valueArr=entryValue.split("-");

            // sinif bilgisini kontrol edip
            // istenen sinif ile ayni ise, istenen bilgileri yazdiralim

            if(valueArr[2].equalsIgnoreCase(sinif)){
                System.out.println(eachEntry.getKey()+ " "+
                                           valueArr[0]+" "+
                                           valueArr[1]+" "+
                                           valueArr[4]);
            }


        }

    }

    public static void bolumListesiOlusturma(Map<Integer, String> ogrenciMaP, String bolum) {
        // verilen bolumdeki ogrencilerin
        // No, isim soyisim ve siniflarini yazdiran
        // bir method olusturun


        System.out.println("No  Isim SoyIsim  sinif ");
        System.out.println("==========================");

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMaP.entrySet();

        for (Map.Entry<Integer,String>eachEntry:entrySeti) {
            String entryValue=eachEntry.getValue();

            String [] entryValueArr=entryValue.split("-");

            if (entryValueArr[4].equalsIgnoreCase(bolum)){

                System.out.println(eachEntry.getKey()+" "+
                                   entryValueArr[0]+" "+
                                   entryValueArr[1]+" "+
                                   entryValueArr[2] );

            }
            
        }


    }

    public static Map<Integer, String> soyIsimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {
        // soyisimleri buyuk harf yapalim
        // 1- entrySet olusturalim

     Set<Map.Entry<Integer,String>>entrySeti=ogrenciMap.entrySet();
        // 2- foreach loop ile her bir entry'yi elden gecirip, soyisimleri buyuk harf yapalim
        for (Map.Entry<Integer,String>eachentry:entrySeti) {
            // 3- entry'den value'yu alalim

            String entryvalue = eachentry.getValue();
            // 4- soyisim bilgisine ulasip degistirebilmek icin parcala

            String[] entryValueArr= entryvalue.split("-");

            // 5- Soyisimi buyuk harf yapalim
            entryValueArr[1]=entryValueArr[1].toUpperCase();
            // 6- degisikligi yaptiktan sonra yeniden birlestirmeleri yapip
            //    map'i update etmeliyiz

            // 7- setValue() kullanarak value'yu yeni haline update edelim

            eachentry.setValue(entryValueArr[0]+"-"+
                    entryValueArr[1]+"-"+
                    entryValueArr[2]+"-"+
                    entryValueArr[3]+"-"+
                    entryValueArr[4]);



        }
    return ogrenciMap;

    }

    public static void tumListeYazdir(Map<Integer, String> ogrenciMap) {
        Set<Map.Entry<Integer,String>> ogrenciEntrySet=ogrenciMap.entrySet();
        System.out.println("No   Ogrenci Bilgileri");
        System.out.println("======================");

        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySet
        ) {
            System.out.println(eachEntry);
        }
    }

    public static Map<Integer, String> siniflariArtir(Map<Integer, String> ogrenciMap) {
        // map'de istedigimiz degisikligi yaptiktan sonra
        // map'i update etmenin en kolay yolu setEntry()
        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eachEntry : entrySeti) {// 101=Ali-Can-11-H-MF
            String entryValue=eachEntry.getValue();// Ali-Can-11-H-MF


        String[]  entryValueArr=entryValue.split("-");// [Ali, CAN, 11, H, MF]

            int sinifInt= Integer.parseInt(entryValueArr[2]);

            if (sinifInt==12){
                entryValueArr[2]="Mezun";
            }else{
                entryValueArr[2]=sinifInt+1+"";
            }
            // sinif bilgisini guncelledik
            // bu guncellemeyi map'e islememiz lazim
            eachEntry.setValue(entryValueArr[0]+ "-"+
                               entryValueArr[1]+ "-"+
                               entryValueArr[2]+ "-"+
                               entryValueArr[3]+ "-"+
                               entryValueArr[4]);
            
        }
        return ogrenciMap;

    }

    public static void sinifSiraliListeYazdir(Map<Integer, String> ogrenciMap) {
        // 101=Ali-Can-11-H-MF
        // 11 H Ali Can 101

        // tum ogrenci listesini
        // sinif sube isim soyisim no seklinde
        // dogal sirali olarak
        // Yazdiran bir method olusturun
        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();
        Set<String> siraliOgrenciSeti= new TreeSet<>();
        for (Map.Entry<Integer, String> eachEntry : entrySeti) {
            String entryValue=eachEntry.getValue();// Ali-Can-11-H-MF
            String[]entryValueArr= entryValue.split("-");// [Ali, Can, 11, H, MF]
    // Entry'den istenen bilgileri alip yeni bir String olusturacagiz
            // ve bu String'leri sirali olarak yazdiracagiz

            String istenenFormattakiBilgi=entryValueArr[2]+ " "+
                    entryValueArr[3]+" "+
                    entryValueArr[0]+" "+
                    entryValueArr[1]+" "+
                    eachEntry.getKey();


            istenenFormattakiBilgi = entryValueArr[2] + " " +
                    entryValueArr[3] + " " +
                    entryValueArr[0] + " " +
                    entryValueArr[1] + " " +
                    eachEntry.getKey();

            siraliOgrenciSeti.add(istenenFormattakiBilgi);
        }

        System.out.println("sinif sube isim soyisim no");
        System.out.println("==========================");

        for (String each : siraliOgrenciSeti) {
            System.out.println(each);
        }

    }

    public static void isimSoyisimSiraliListeYazdir(Map<Integer, String> ogrenciMap) {
        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();
        Set<String>isimSoyisimSiraliSet=new TreeSet<>();
        // tum ogrenci listesini isim soyisim no sinif sube bolum
        for (Map.Entry<Integer, String> eachEntry : entrySeti) {

            String value= eachEntry.getValue();
            String []valueArr=value.split("-");// [Ali, Can, 11, H, MF]

            String istenenFormattakiBilgi=valueArr[0]+" "+
                    valueArr[1]+" "+
                   eachEntry.getKey()+" "+
                    valueArr[2]+" "+
                    valueArr[3]+" "+
                    valueArr[4];

            isimSoyisimSiraliSet.add(istenenFormattakiBilgi);




        }
        // sirali set'i yazdiralim
        System.out.println("isim soyisim no sinif sube bolum");
        System.out.println("================================");

        for (String each : isimSoyisimSiraliSet) {
            System.out.println(each);

        }


    }
}




