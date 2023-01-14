package Day10_StringManiplation;

public class C02_replace {

    public static void main(String[] args) {
        String str= "java ogren ,kebap ye";

        System.out.println(str.replace('a', 'A'));//jAvA ogren ,kebAp ye
        System.out.println(str.replace(" ", ""));//javaogren,kebapye

        System.out.println(str.replace("java", "yazilim")); //yazilim ogren ,kebap ye

        String telefon= "1234566789";

        System.out.println(telefon.replace('3', '7'));//12745  66789

        System.out.println(telefon.replace('6', '7'));//1234577789

        // asagidaki arama sonucunun 10 binden fazla oldugunu test edin

        String sonuc= "1-16 of over 100,000 results for \"apple\"";

        int indexOver= sonuc.indexOf("over");

        int indexResults= sonuc.indexOf("results");

        String sonucSayisiStr= sonuc.substring(indexOver +5,indexResults-1);

        System.out.println(sonucSayisiStr);//100,000

        sonucSayisiStr =sonucSayisiStr.replace(",","");

        System.out.println(sonucSayisiStr);//100000


       int sonucSayisiint = Integer.parseInt(sonucSayisiStr);


       if(sonucSayisiint>100000){
           System.out.println("arama sonucu testi PASSED");
       } else{
           System.out.println("Arama test sonucu FAILED");
       }


    }
}
