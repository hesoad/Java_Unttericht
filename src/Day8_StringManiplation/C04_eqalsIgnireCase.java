package Day8_StringManiplation;

public class C04_eqalsIgnireCase {

    public static void main(String[] args) {
        String str1= "Pazar";
        String str2= "PAZAR";
        String str3= "pazar";
        String str4= "PaZaR";

        System.out.println(str2 == str1);//false
        System.out.println(str3 == str1);//false
        System.out.println(str4 == str1);//false

        /*
          Eger iki metni KARSILASTIRIRKEN buyuk harf-kucuk harf
          duyarliligi (case sensitive)
          onemsiz ise o zaman
          equalsIgnoreCase() kullanilir
         */

        System.out.println(str1.equalsIgnoreCase(str2));//treu
        System.out.println(str1.equalsIgnoreCase(str3));//treu
        System.out.println(str1.equalsIgnoreCase(str4));//treu


    }
}
