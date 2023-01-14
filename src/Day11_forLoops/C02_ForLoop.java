package Day11_forLoops;

public class C02_ForLoop {
    public static void main(String[] args) {
         // input olarak verilen bir Stringde
         // index'i tek sayi olanlari kucuk harfle
         // index'i cift sayi olanlari buyuk harfle yazdirin
          // ornek : Java  output: JaVa


        String input= "Java candir, selenyum heyecandir";

        for (int i = 0; i < input.length(); i++) {

            System.out.print(i%2==0? input.substring(i,i+1).toUpperCase(): input.substring(i,i+1).toLowerCase());

        }
    }
}
