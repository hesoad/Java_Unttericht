package Day6_ifElseifStatements;

import java.util.Scanner;

public class C06_IfElseifStatements {
    public static void main(String[] args) {
        // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        // vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30 veya daha buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kilonuzu giriniz ");
        double kilo = scan.nextDouble();



        System.out.println("lutfen boy olcunuzu giriniz ");

        double boy = scan.nextDouble();


        double vke= kilo*10000/(boy * boy);
        System.out.println("vucut kitle endeksiniz "+ vke );

        if( vke>=30 ){
            System.out.println("obezsiniz");}
        else if(vke<30 && vke>25) {
            System.out.println("kilolusunuz");
        }
        else if(vke>20&& vke<25){
            System.out.println("normalsiniz");}

        else if(vke<=20){
            System.out.println("zayifsiniz");}

        else{
            System.out.println("anormalsiniz");
        }




    }
}
