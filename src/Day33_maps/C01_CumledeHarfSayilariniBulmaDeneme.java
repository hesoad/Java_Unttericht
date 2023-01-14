package Day33_maps;

import java.util.Map;
import java.util.TreeMap;

public class C01_CumledeHarfSayilariniBulmaDeneme {
    public static void main(String[] args) {
        // verilen bir cumlede kullanilan her bir harfi
        // ve kacar kez kullanildigini yazdirin
        // Ornek : Java candir
        // output :  J=1, a=3, v=1, c=1, n=1, d=1, i=1, r=1

        String cumle= "Java Candir";

        // oncelikle bosluk ve noktalama isaretlerini yok edelim

        cumle=cumle.replaceAll("\\W","");

        String[] cumleArray=cumle.split("");

        Map<String,Integer>kullanimSayilariMap=new TreeMap<>();


        // her bir elementi ele alip
        // map'de key olarak yoksa value=1 olarak ekleriz
        // map'de key olarak varsa value 1 artirilmali
        for (int i = 0; i < cumleArray.length ; i++) {
            if(!kullanimSayilariMap.containsKey(cumleArray[i])){

                kullanimSayilariMap.put(cumleArray[i],1);

            }else{
                int eskivalue= kullanimSayilariMap.get(cumleArray[i]);
                kullanimSayilariMap.put(cumleArray[i],eskivalue+1);
            }

        }

        System.out.println(kullanimSayilariMap);

    }
}
