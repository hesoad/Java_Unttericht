package Day16_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        // verilen bir String array'in tum elementlerini yazdirin

        String[] isimler={"Huseyin","Yusuf","Mehmet","Akile","Said" };//[Huseyin, Yusuf, Mehmet, Akile, Said]
        System.out.println(Arrays.toString(isimler));

        for (int i = 0; i <isimler.length ; i++) {
            System.out.print(isimler[i]+ " ");//Huseyin Yusuf Mehmet Akile Said

        }
    }
}
