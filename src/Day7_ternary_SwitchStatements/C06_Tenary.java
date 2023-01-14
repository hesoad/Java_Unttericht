package Day7_ternary_SwitchStatements;

public class C06_Tenary {

    public static void main(String[] args) {
        // Kullanicidan notunu alin 50 veya daha buyukse "Sinifi Gectin",
         // 50’den kucukse "Maalesef kaldin" yazdirin.

        int input =54;
        System.out.println(input>=50 ? "sinifi gectin" : "maalesef kaldin");


       // Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
       // harf olarak yazdirin, yoksa girilen harfi yazdirin

        char karakter='a';

        System.out.println(karakter>='a'&& karakter<='z'?(char) (karakter-32 ) : karakter);

        // Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin


        input= -125;

        System.out.println(input>0? input : input*(-1));




    }
}
