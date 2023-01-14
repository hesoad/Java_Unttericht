package Day23_dateTime_varargs;

public class C05_Varargs {
    public static void main(String[] args) {
        topla(5,8);// Iki sayinin toplami= 13
        topla(5,7,3);// uc sayinin toplami = 15



    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println(" uc sayinin toplami = "+ (sayi1+sayi2+sayi3));
    }

    private static void topla(int sayi1, int sayi2) {


        System.out.println(" Iki sayinin toplami= "+ (sayi1+sayi2));
    }
}
