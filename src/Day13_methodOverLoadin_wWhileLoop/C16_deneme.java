package Day13_methodOverLoadin_wWhileLoop;

public class C16_deneme {
    public static void main(String[] args) {

        // birden 10'akadar olan cift sayilarin toplamini yazin

        int sayi=10;

        int toplama=0;

        for (int i = 1; i <=sayi ; i++)

            if(i%2==0){

                toplama+=i;

            }
        System.out.println("cift sayilarin toplami:  "+ toplama);
    }
}
