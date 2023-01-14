package Day13_methodOverLoadin_wWhileLoop;

public class C22_deneme {
    public static void main(String[] args) {

        //iki basmakli sayilardan 7 ile bolunebilenleri yazdirin


        for (int i = 10; i <100 ; i++) {
            if (i%7==0){
                System.out.print(" :"+ i);
            }

        }
        System.out.println("");

        int sayi =10;

        while (sayi< 100){

            System.out.println(sayi+ " ");
        }
        sayi++;
    }
}
