package Day2_proramlamayagiris;

import java.util.Scanner;

public class C12_CemberCevresiVeAlani {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen camberin yari capini giriniz");
        double yaricap= scan.nextDouble();

        double cevre =1;
        double alan= 1;

        cevre=2*3.14*yaricap;
        alan =3.14*yaricap*yaricap;
        System.out.println("\nDairenin cevresi= "+ cevre+"\nDairenin alan ="+alan);



    }
}
