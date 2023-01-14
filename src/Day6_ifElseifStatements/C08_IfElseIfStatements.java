package Day6_ifElseifStatements;

import java.util.Scanner;

public class C08_IfElseIfStatements {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.


        /*
           eger degisken sayimiz birden fazla ise
           degiskenlerden birini oncelige alarak,
           ona gore bir if else yapisi kurulur
           ornegin bu soruda kadin/erken secimini ana degisken yapalim
         */


        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi giriniz \\nK : Kadin, E : Erkek");

        char cinsiyet = scan.next().charAt(0);

        System.out.println("Lutfen tam sayi olarak yasinizi girininiz ");

        int yas= scan.nextInt();


        if(cinsiyet=='k' || cinsiyet=='K'){
            if(yas>=90 || yas<18 ){
                System.out.println("gecersiz bilgi");
            }
            else if (yas>=60){
                System.out.println("emekli olabilirsiniz");
            }
            else if(yas<60){
                System.out.println("emekli olmak icin " + (60-yas)+ "yil daha calismalisiniz ");
            }
            else{
                System.out.println("hatali giris yaptiniz");
            }
        }

        if(cinsiyet=='e'||cinsiyet=='E'){
            if(yas>100||yas<18){
                System.out.println("gecersiz bir islem ");
            }
            else if(yas>=65){
                System.out.println("yasiniz kemale ermis; artik emekli olabilirsiniz");
            }

            else if (yas<65||yas>18){
                System.out.println("emekli olabilmeniz icin :"+ (65-yas)+" yil daha amelelik yapmalisiniz");
            }
            else{
                System.out.println("hatali bir islem var ;bir zahmet tekrar bak ");
            }
        }else{
            System.out.println("cinsiyet bilgisi yanlis olabilir ");
        }



    }
}
