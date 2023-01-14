package Day14_doWhileLoop;

public class C10_deneme {

    public static void main(String[] args) {
        // verilen baslangic ve bitis karakterleri dahil
        // aradaki tum karakterleri yazdirin


        char baslangic='b';
        char bitis ='z';



        do {
            System.out.print( baslangic+" ");
            baslangic= (char)(baslangic+1);


        }while (baslangic<=bitis);




    }
}
