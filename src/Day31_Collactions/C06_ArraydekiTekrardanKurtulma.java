package Day31_Collactions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_ArraydekiTekrardanKurtulma {
    public static void main(String[] args) {

        // verilen bir arraydeki tekrar eden elementleri
        // sadece bir kere yazarak array i kisaltan kod yazin

        int [] array={1,2,4,4,5,6,5,6,7,6,4,2,1,3,6};
        Set<Integer>arrSet= new HashSet<>();

        //array deki tum elementleri , set e ekleyelim
        for (int sayi:array) {
            arrSet.add(sayi);

        }
        System.out.println(arrSet);//[1, 2, 3, 4, 5, 6, 7]

        //set'deki element sayisina esit bir array e olusturup
        //set'deki elementleri oraya tasiyalim
        array=new int[arrSet.size()];//[0,0,0,0,0,0]

        int index=0;

        for (int each :arrSet) {
            array[index]=each;
            index++;

        }
        System.out.println("Array'in son  hali : "+Arrays.toString(array));//Array'in son  hali : [1, 2, 3, 4, 5, 6, 7]
    }
}
