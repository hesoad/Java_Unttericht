package Day13_methodOverLoadin_wWhileLoop;

public class C19_deneme {
    public static void main(String[] args) {

        int i=1;
        int toplama=0;

        while (i<=10){
            if(i%2==1){
                toplama+=i;
            }
            i++;
        }
        System.out.println("tek sayilarin toplami :"+ toplama);

    }
}
