package Day13_methodOverLoadin_wWhileLoop;

public class C18_deneme {
    public static void main(String[] args) {
        // cift sayilarin toplamini while dongusu ile yazdirin



        int i= 0;
        int toplama=0;


        while (i<=10){
            if(i%2==0){
                toplama+=i;
            }
            i++;

        }
        System.out.println("cift sayilarin toplami: "+ toplama);




    }
}
