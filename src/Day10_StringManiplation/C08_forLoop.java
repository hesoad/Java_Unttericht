package Day10_StringManiplation;

public class C08_forLoop {

    public static void main(String[] args) {

        // 1 ile 100 ARasinda sayialri yanyana yazdirin
        //yazdirma islemi bittiginde
        // "tum bu sayilarin toplami = " deyip sayialrin toplamini yazdirin

        int sayilarintoplami =0;
        for (int i = 1; i <=100; i++) {
            System.out.print(i+ " ");
           // sayilarintoplami= sayilarintoplami+i;
            sayilarintoplami+=i;

        }
        System.out.println("");

        System.out.println(" ");
        System.out.println("tum bu sayilarin toplami = "+sayilarintoplami);


    }
}
