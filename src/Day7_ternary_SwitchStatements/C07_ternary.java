package Day7_ternary_SwitchStatements;

public class C07_ternary {
    public static void main(String[] args) {
        //Kullanicidan bir tamsayi alin.
        // Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani
        // yazdirin
        // Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden
        // uygun olani yazdiri

        int sayi1= 99;

       // System.out.println(sayi1>0 ? "sayi pozotif " : "sayi pozitif degil" );

        System.out.println(sayi1>0
                ?
                sayi1%2==0 ?  "cift sayi" : " Tek sayi "
                :
               sayi1<= -100 && sayi1>=-999 ? "sayi uc basamakli" : "sayi uc basamakli degil " );


    }
}
