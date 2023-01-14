package Day13_methodOverLoadin_wWhileLoop;

public class C17_deneme {
    public static void main(String[] args) {


        // birden 10'akadar olan tek sayilarin toplamini yadiriniz

        int sayi= 10;

        int toplama=0;

        for (int i = 1; i <=sayi; i++)
            if(i%2==1){

                toplama+=i;
            }
        System.out.println("tek sayilarin toplami: "+ toplama);


    }
}
