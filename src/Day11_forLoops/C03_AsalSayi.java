package Day11_forLoops;

public class C03_AsalSayi {

    public static void main(String[] args) {

        // input olarak verilen bir tamsayinin
        // asal sayi olup olmadigini yazdirin

        int input=13;

        String sonuc="sayi asal ";


        for (int i = 2; i <input ; i++) {
            if(input%i==0){

            sonuc="sayi asal sayi degildir ";
                break;
            // Java, bir loop'un icerisinde "break" gorurse
            // o loop'u bitirir
        }

        }
        System.out.println(sonuc);

    }
}
