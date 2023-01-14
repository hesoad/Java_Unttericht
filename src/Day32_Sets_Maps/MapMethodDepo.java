package Day32_Sets_Maps;

import java.util.*;

public class MapMethodDepo {
    //Bize ogrenci map donduren method olusturun

    public static Map<Integer, String> ogrenciMapOlustur() {
        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-M");
        ogrenciMap.put(103, "Ali-Cem-11-k-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-10-H-MF");
        ogrenciMap.put(106, "Sevgi-Can-10-H-MF");


        return ogrenciMap;
    }


    public static boolean isimIleOgrenciArama(Map<Integer, String> ogrenciMap, String isim) {

        //1-Tum value'leri bir Collektion olarak kaydeedelim .
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-M, Ali-Cem-11-k-TM, Ayse-Can-10-H-MF, Sevgi-Cem-10-H-MF, Sevgi-Can-10-H-MF, Cemal-Han-12-M-MF]

        Collection<String> valuesCollection = ogrenciMap.values();

        //2-For each kullanarak her bir value'yu alalim . Ali-Can-11-H-MF,

        //3-, -yi kullanarak split yapalim. [Ali,Can,11,H,MF]

        //4-split yaptigimiz array'den isim bilgisini alalim. 0 . index

        //5-Eger value'dan aldigimiz isim aranan isim ile ayni ise treu dondurup, for each'i bitirelim.

        //6- for each bittiginde treu olmadiysa false dondurelim.

        for (String eachValue : valuesCollection) {
            String[] valueArr = eachValue.split("-");
            String valuedekiIsim = valueArr[0];

            if (valuedekiIsim.equalsIgnoreCase(isim)) {
                return true;
            }
        }

        return false;

    }

    public static void soyisimIleOgrenciListesiYazdirma(Map<Integer, String> ogrenciMap, String soyisim) {

        // 1- map'deki value'leri bir collection olarak kaydedelim
        //    [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF]
        Collection<String> ogrenciValueCollection = ogrenciMap.values();
        // listenin ilk satiri olarak basliklari yazdiralim
        System.out.println("Isim  Soyisim  Sinif Sube");

        // 2- for-each ile her bir value bilgisini ele alalim Ali-Can-11-H-MF
        // 3- value'yu - ile split yapip bir array elde edelim [Ali, Can, 11, H, MF]
        // 4- array'in 1.index'indeki soyisme bakip, aranan soyisim ile ayni ise
        //    isim, soyisim, sinif ve sube bilgilerini yazdiralim

        for (String eachValue : ogrenciValueCollection
        ) {
            String[] valueArr = eachValue.split("-");
            String valueSoyisim = valueArr[1];

            if (valueSoyisim.equalsIgnoreCase(soyisim)) {
                System.out.println(valueArr[0] + "  " +
                        valueArr[1] + "  " +
                        valueArr[2] + "  " +
                        valueArr[3]);
            }

        }


    }

    public static void sinifLisitesiYazdirma(Map<Integer, String> ogrenciMap, String sinif, String sube) {

        Collection<String> valuecollection = ogrenciMap.values();
        System.out.println("Isim " + " Soyisim");
        for (String eachValues : valuecollection) {
            String[] valuearr = eachValues.split("-");
            if (valuearr[2].equalsIgnoreCase(sinif) && valuearr[3].equalsIgnoreCase(sube)) {
                System.out.println(valuearr[0] + " " + valuearr[1]);
            }

        }
    }

    public static Map numaraIleSubeOlusturma(Map<Integer, String> ogrenciMap, int okulNo, String yeniSubeIsmi) {

        // 1- Okul numarasini biliyoruz direk ogrenci value ye ulasabiliriz
        String ogrencivalue = ogrenciMap.get(okulNo);//Ayse-Can-10-H-MF

        String[] valueArr = ogrencivalue.split("-");//Ayse,Can,10,H,MF

        //2- sube ismini ginceleyelim

        valueArr[3] = yeniSubeIsmi;//Ayse,Can,10,M,MF

        //3-arraydeki guncel bilgilerinu yeniden value formatinda bir string yapalim

        String yeniValue = valueArr[0] + "-" + valueArr[1] + "-" + valueArr[2] + "-" + valueArr[3] + "-" + valueArr[4];

        //4- ogrenci key ile yeni subeyi yapalim

        ogrenciMap.put(okulNo, yeniValue);


        return ogrenciMap;

    }

    public static void sinifListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif) {

        // verilen siniftaki ogrencilerin no, isim, soyisim, bolumlerini
        // bir liste olarak yazdiran bir method olusturun

        System.out.println("No isim soyisim bolum");
        System.out.println("=====================");

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eachEntry : entrySeti) { // 101=Ali-Can-11-H-MF

            // 1- entry'den value'yu alalim
            String entryValue = eachEntry.getValue(); // Ali-Can-11-H-MF

            // 2- bu value'yu parcalayalim ve bir array'e store edelim
            String[] valueArr = entryValue.split("-"); // [Ali, Can, 11, H, MF]

            // sinif bilgisini kontrol edip
            // istenen sinif ile ayni ise, istenen bilgileri yazdiralim

            if (valueArr[2].equalsIgnoreCase(sinif)) {
                System.out.println(eachEntry.getKey() + " " +
                        valueArr[0] + " " +
                        valueArr[1] + " " +
                        valueArr[4]);
            }
        }
    }

    public static void bolumListesiOlusturma(Map<Integer, String> ogrenciMap, String bolum) {
        // verilen bolumdeki ogrencilerin
        // No, isim soyisim ve siniflarini yazdiran
        // bir method olusturun

        System.out.println("No isim soyisim sinif");
        System.out.println("=====================");

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eachEntry : entrySeti
        ) {

            String entryValue = eachEntry.getValue();

            String[] entryValueArr = entryValue.split("-"); // [Ali, Can, 11, H, MF]

            if (entryValueArr[4].equalsIgnoreCase(bolum)) {

                System.out.println(eachEntry.getKey() + " " +
                        entryValueArr[0] + " " +
                        entryValueArr[1] + " " +
                        entryValueArr[2]);

            }


        }

    }

    public static Map<Integer, String> soyisimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {
        // soyisimleri buyuk harf yapalim
        // 1- entrySet olusturalim

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        // 2- foreach loop ile her bir entry'yi elden gecirip, soyisimleri buyuk harf yapalim

        for (Map.Entry<Integer, String> eachEntry : entrySeti) {

            // 3- entry'den value'yu alalim
            String entryValue = eachEntry.getValue(); // Ali-Can-11-H-MF
            // 4- soyisim bilgisine ulasip degistirebilmek icin parcala
            String[] entryValueArr = entryValue.split("-"); // [Ali, Can, 11, H, MF]
            // 5- Soyisimi buyuk harf yapalim

            entryValueArr[1] = entryValueArr[1].toUpperCase(); // // [Ali, CAN, 11, H, MF]

            // 6- degisikligi yaptiktan sonra yeniden birlestirmeleri yapip
            //    map'i update etmeliyiz

            // 7- setValue() kullanarak value'yu yeni haline update edelim

            eachEntry.setValue(entryValueArr[0] + "-" +
                    entryValueArr[1] + "-" +
                    entryValueArr[2] + "-" +
                    entryValueArr[3] + "-" +
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

        for (Map.Entry<Integer, String> eachEntry : entrySeti) { // 101=Ali-Can-11-H-MF

            String entryValue=eachEntry.getValue(); // Ali-Can-11-H-MF

            String[] entryValueArr = entryValue.split("-"); // [Ali, CAN, 11, H, MF]

            int sinifInt= Integer.parseInt(entryValueArr[2]);

            if (sinifInt==12){

                entryValueArr[2]="Mezun";
            }else{

                entryValueArr[2]=sinifInt+1+"";
            }

            // sinif bilgisini guncelledik
            // bu guncellemeyi map'e islememiz lazim

            eachEntry.setValue(entryValueArr[0]+"-"+
                    entryValueArr[1]+"-"+
                    entryValueArr[2]+"-"+
                    entryValueArr[3]+"-"+
                    entryValueArr[4]);

        }
        return ogrenciMap;
    }

    public static void sinifsiraliListeOlustur(Map<Integer, String> ogrenciMap) {

        Set<Map.Entry<Integer, String>> entryseti = ogrenciMap.entrySet();

    }

    public static void sinifSiraliListeYazdir(Map<Integer, String> ogrenciMap) {
        // 101=Ali-Can-11-H-MF
        // 11 H Ali Can 101

        // tum ogrenci listesini
        // sinif sube isim soyisim no seklinde
        // dogal sirali olarak
        // Yazdiran bir method olusturun

        Set<Map.Entry<Integer, String>> entrySeti= ogrenciMap.entrySet();
        Set<String> siraliOgrenciSeti= new TreeSet<>();

        for (Map.Entry<Integer, String> eachEntry : entrySeti) {

            String entryValue=eachEntry.getValue();

            String[] entryValueArr= entryValue.split("-"); // [Ali, Can, 11, H, MF]

            // Entry'den istenen bilgileri alip yeni bir String olusturacagiz
            // ve bu String'leri sirali olarak yazdiracagiz

            String istenenFormattakiBilgi= entryValueArr[2]+" "+
                    entryValueArr[3]+" "+
                    entryValueArr[0]+" "+
                    entryValueArr[1]+" "+
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

        // tum ogrenci listesini isim soyisim no sinif sube bolum

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();
        Set<String> isimSoyisimSiraliSet= new TreeSet<>();

        for (Map.Entry<Integer, String> eachEntry : entrySeti) {

            String value= eachEntry.getValue();

            String[] valueArr=value.split("-"); // [Ali, Can, 11, H, MF]

            String istenenFormattakiBilgi= valueArr[0]+" "+
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