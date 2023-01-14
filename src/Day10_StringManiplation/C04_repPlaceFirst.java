package Day10_StringManiplation;

public class C04_repPlaceFirst {
    public static void main(String[] args) {

        String str= "Java heyecandir";
        // eger tum a'lari degil de sadece ilk a'yi degistirmek isterseniz

       str= str.replaceFirst("a","A");

        System.out.println(str);//JAva heyecandir

        // ilk harf veya rakami * yap

        System.out.println(str.replaceFirst("\\w", "*"));

    }
}
