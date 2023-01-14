package Day19_array_List_ForEachLoop;

import java.util.Arrays;

public class C06_deneme {
    public static void main(String[] args) {
        //Soru 1- Verilen bir array’de tekrar eden elementler icin,
        // mukerrer olanlari silip, tum elemanlardan  sadece 1 tane yapip
        // eski array’e yeni halini atayip yazdirin.

        String cumle="Java ogrenmek cok guzel";
        String harf= "e";
        String[]cumleArr=cumle.split("");
        System.out.println(Arrays.toString(cumleArr));//[J, a, v, a,  , o, g, r, e, n, m, e, k,  , c, o, k,  , g, u, z, e, l]
       int sayac=0;
        for (String eachHarf:cumleArr
             ) {
            if(eachHarf.equals(harf)){
                sayac++;
            }
        }
   if(sayac==0){
       System.out.println("Harf cumlede kullanilmamis");
   }else {
       System.out.println(harf+ ", cumlede " + sayac+ " defa kullanilmis");
   }
    }
}
