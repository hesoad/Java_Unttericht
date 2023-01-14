package Day5_ifStatements;

import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {
       /* Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        “Eskenar ucgen” yazdirin

        */

        Scanner scan= new Scanner(System.in);
        System.out.println("\n lutfen ucgenin uckenarini girin:");

        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if(kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("Eskenar Ucgen");
        }else{
            System.out.println(" eskenar ucgen degil");
        }






    }
}
