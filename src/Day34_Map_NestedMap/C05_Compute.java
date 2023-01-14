package Day34_Map_NestedMap;

import java.util.Map;
import java.util.TreeMap;

public class C05_Compute {
    public static void main(String[] args) {

        Map<String,Integer>harfSayilariMap=new TreeMap<>();

        harfSayilariMap.put("A",10);
        harfSayilariMap.put("C",15);
        harfSayilariMap.put("D",3);
        harfSayilariMap.put("K",5);

        System.out.println(harfSayilariMap);//{A=10, C=15, D=3, k=5}

        //A nin kullanim miktarini 20 yapin

        harfSayilariMap.put("A",20);

        //C'nin kullanim miktarini iki katina cikar.

        harfSayilariMap.put("C",harfSayilariMap.get("C")*2);

        System.out.println(harfSayilariMap);//{A=20, C=30, D=3, k=5}

        // D'nin miktarini 5 artiralim.

        harfSayilariMap.compute("D",(k,v)->v+5);

        System.out.println(harfSayilariMap);//{A=20, C=30, D=8, k=5}

        //eger map de  T varsa kullanim miktarini 3 eksiltin


        try {
            harfSayilariMap.compute("T",(k,v)->v-3);
            System.out.println(harfSayilariMap);
            //Exception in thread "main" java.lang.NullPointerException
        } catch (Exception e){
            System.out.println("hata");
        }

        // K harfi varsa kullanimini 2 azaltin

        harfSayilariMap.computeIfPresent("K",(k,v)->v-2);

        System.out.println(harfSayilariMap);//{A=20, C=30, D=8, K=3}

        //T harfi yoksa kullanim miktarini 3 ekleyin

        harfSayilariMap.computeIfAbsent("T",v->3);

        System.out.println(harfSayilariMap);//{A=20, C=30, D=8, K=3, T=3}




    }
}
