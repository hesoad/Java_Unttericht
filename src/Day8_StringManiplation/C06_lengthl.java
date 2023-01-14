package Day8_StringManiplation;

public class C06_lengthl {

    public static void main(String[] args) {


        String str= "Java her gecen gun daha da guzellesiyor, degil mi?";

        // sondan 3.karakteri yazdirin

        System.out.println(str.charAt(str.length()-3));

        System.out.println(str.charAt(str.length() - 8));

        System.out.println(str.toUpperCase().charAt(str.length() -7));



    }
}
