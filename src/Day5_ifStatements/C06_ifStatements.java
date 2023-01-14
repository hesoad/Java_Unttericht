package Day5_ifStatements;

import java.util.Scanner;

public class C06_ifStatements {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen ucgenin kenarlarini giriniz ");
        double dbl1= scan.nextDouble();
        double dbl2= scan.nextDouble();
        double dbl3= scan.nextDouble();

        if (     dbl1==dbl2 && dbl1!=dbl3 ||
                 dbl1==dbl3 && dbl1!=dbl2 ||
                 dbl2==dbl3 && dbl2!=dbl3 ){
            System.out.println("ikizkenar ucgen");

        } else{
            System.out.println("ikizkenar ucgen degil");

        }
}
}