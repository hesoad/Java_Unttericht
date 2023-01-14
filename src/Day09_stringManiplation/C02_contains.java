package Day09_stringManiplation;

public class C02_contains {

    public static void main(String[] args) {

        String str= "Java ogren, mutlu ol";

        // str mutlu iceriyor mu ?

        System.out.println(str.contains("mutlu")); //true

        // charSequence : char dizisi

        System.out.println(str.contains("j"));//false

        // contains method'u kactane olduguna degil,

        // sadece var olup olmadigana bakar

        System.out.println(str.contains("Java") && str.contains("mutlu")); //true


    }
}
