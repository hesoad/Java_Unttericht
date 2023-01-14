package Day17_Arrays;

import java.util.Arrays;

public class C04_MultiDimensionalArrays {
    public static void main(String[] args) {

        int[][] arr={{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};

        System.out.println(arr.length);//5 element var

        System.out.println(arr[2].length);// Arrayin 2. indeksteki elmentin icinde bulunan elemnt sayisi 4 dur

        System.out.println(arr[2][0]);// arrayin ikinci indeksinde bulunan erayin icinde bulunan 0 indeksteki elementi 6 dir

        System.out.println(arr[3]);//[I@48140564
         // Multi dimensional array ile calisirken dikkat etmemiz gereken en onemli konu
         // yazdigimiz kodun bir array mi yoksa yazdirabilecegimiz bir element mi döndürdüğüdür

        System.out.println(Arrays.toString(arr[3]));//[2] bu sonucu bulmak icin Arrays.tostring yapmaliyiz yoksa bulamaz.
                                                     // elemnt degil icteki cunku o bir array
                                                     // ic arraydeki elemani yazmak istersek ;

        System.out.println(arr[3][0]);// 2 elementini bu sekilde buluruz . ilk durumda 3.siradaki arrayi buluyoruz.


    }
}
