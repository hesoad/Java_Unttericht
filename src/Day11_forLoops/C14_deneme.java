package Day11_forLoops;

public class C14_deneme {
    public static void main(String[] args) {

       //Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin

        int input=5;
        int faktoryel=1;

        for (int i = 1; i <=input; i++) {

            faktoryel=faktoryel*i;



        }
        System.out.println("sonuc: "+ faktoryel);

    }
}
