package Day21_StaticKeyWord;

import java.util.Arrays;

public class C05_PassByValueCokluElement {
    public static void main(String[] args) {

        int [] arr={3,6,9,1,7};
        //Bir method olusturp , arr'yi method'a yollayalim
        //Method'da arr'in elementleri uzerinde degisiklik yapalim ve arr'yi yazdiralim
        elementleriDegistir(arr);//[13, 6, 19, 1, 7]
        System.out.println(Arrays.toString(arr));//[13, 6, 19, 1, 7] hoca bunup.tesi anlatacak
    }
    public static void elementleriDegistir(int [] b){
        b[0]=13;
        b[2]=19;
        System.out.println(Arrays.toString(b));//[13, 6, 19, 1, 7]

    }
}
