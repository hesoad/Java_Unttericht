package Day16_Arrays;

import java.util.Arrays;

public class C12_Sort {
    public static void main(String[] args) {

        // Verilen bir Array'i Natural Order'a gore siralayip yazdirin


        String [] isimler= {"Ali","Veli","Cem","Kemal","Ahmet", "ayse"};

        System.out.println(Arrays.toString(isimler));//[Ali, Veli, Cem, Kemal]
        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler));//[Ali, Cem, Kemal, Veli]//[Ahmet, Ali, Cem, Kemal, Veli, ayse]
                                                              // ascee tablosuna gore kucuk harfler en sona yazar

        // Eger buyukten kucuge siralamak istersek , once sort kullanarak natural order'a gore siralar
        // sonra gecici bir array kullanarak siralamayi terse ceviririz







    }
}
