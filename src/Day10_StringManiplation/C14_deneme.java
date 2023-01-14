package Day10_StringManiplation;

public class C14_deneme {

    public static void main(String[] args) {
        //Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        // sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
        // input : java1 ogRe2@nMek3 #ne +Gu=zel
        // output : Java ogrenmek ne guzel.


        String input="java1 ogRe2@nMek3 #ne +Gu=zel";

        input=input.replaceAll("\\d","");

        System.out.println(input);

        input=input.replaceAll("\\s","1");
        System.out.println(input);

        input=input.replaceAll("\\W","");
        System.out.println(input);

        input=input.replaceAll("\\d"," ");

        System.out.println(input);

        input=input.toLowerCase();

        System.out.println(input);

        input =input.replace('j','J');
        System.out.println(input);




    }
}
