package Day17_Arrays;

import java.util.Arrays;

public class C03_StringSplitMethodu {
    public static void main(String[] args) {

        String str= "Java her gecen gun guzellesiyor";
        // str'da kac kelime var ?
        // split method'u istedigimiz String'i, istedigimiz ayirac kullanarak
        // parcalara ayirmamiza imkan verir

     String[] spaceSplitStr=str.split(" ");

        System.out.println(Arrays.toString(spaceSplitStr));//[Java, her, gecen, gun, guzellesiyor]

        System.out.println("Verilen cumledeki kelime sayisi: "+ spaceSplitStr.length);//Verilen cumledeki kelime sayisi: 5

        String[] str3=str.split("e");

        System.out.println(Arrays.toString(str3));//[Java h, r g, c, n gun guz, ll, siyor]

        String[] str4=str.split("gun");

        System.out.println(Arrays.toString(str4));//[Java her gecen ,  guzellesiyor]

        String[] str5=str.split("");

        System.out.println(Arrays.toString(str5));//[J, a, v, a,  , h, e, r,  , g, e, c, e, n,  , g, u, n,  , g, u, z, e, l, l, e, s, i, y, o, r]


    }
}
