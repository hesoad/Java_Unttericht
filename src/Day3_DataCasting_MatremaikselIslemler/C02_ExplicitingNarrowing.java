package Day3_DataCasting_MatremaikselIslemler;

public class C02_ExplicitingNarrowing {

    public static void main(String[] args) {

 /*
           Eger genis kapasiteli bir data turunden dar kapasiteli bir data turune
           casting yapmak isterseniz
           Java bunu otomatik olarak gerceklestirmez, sizden sorumluluk almanizi bekler
           islemin gerceklesmesi icin cast yapmak istediginiz degerin onunde
           (donusturmek istedimiz data turu) yazilmalidir

           Explicit narrowing yapildiginda data kayiplari
           veya datanin beklenmedik bir sonuca donusmesi mumkundur
         */

        double dbl= 23.5;

        int sayi1 = (int)dbl;

        System.out.println(sayi1);// 23

        byte byt= (byte) sayi1;

        System.out.println(sayi1);// 23

        sayi1=130;
        byt=(byte)sayi1;// int daha kapsamli oldugu icin otomatik atama yapmaz, bizden mudahale ister

        System.out.println("int 130un byte hali:" + byt);//  -126

        sayi1=256;
        byt=(byte)sayi1;

        System.out.println("int 256 in byte hali :"+byt);
// int daha kapsamli oldugu icin otomatik atama yapmaz,
// bizden mudahale ister

        sayi1=13000;
byt=(byte)sayi1;
        System.out.println(" int 1300 in byte hali:"+byt);
        sayi1=306;
        byt= (byte)sayi1;

        System.out.println(" sayi 306 in byte hali: " + byt);

        sayi1=345;
        byt= (byte)sayi1;

        System.out.println("sayi 345 in byte hali:"+byt);

    }
}
