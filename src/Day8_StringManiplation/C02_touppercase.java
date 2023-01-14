package Day8_StringManiplation;

import java.util.Locale;

public class C02_touppercase {

    public static void main(String[] args) {

        String str ="JAVA CANDIR";

        System.out.println(str.toLowerCase());// java candir

        str= str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);

        str= "sevgi insanI hayata baglar";
        str = str.toUpperCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);//SEVGİ İNSANİ HAYATA BAGLAR



    }
}
