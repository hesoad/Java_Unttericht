package Day2_proramlamayagiris;

public class C04_NamingConvention {

    public static void main(String[] args) {

        String str= "java ogrenmek cok zevkli";

        System.out.println(str);

        int sinifMevcudu3_$ = 23;


        int SAYI= 24;
        int sayi= 34;
        int Sayi= 44;

        System.out.println(str.toLowerCase());

        System.out.println(sayi* sayi);

        System.out.println(sayi+sinifMevcudu3_$ + " " + str);
        /*
           variable ismi olarak buyuk yada kucuk harf yazmaniza java karismaz
           ancak naming convention soyledir
           variable isimleri kucuk harfle baslar ve devam eder
           ancak birden fazla kelime kullanilacaksa
           sonraki kelimelerin ilk harfleri buyuk harf olur
           buna CamelCase denir
         */




    }
}
