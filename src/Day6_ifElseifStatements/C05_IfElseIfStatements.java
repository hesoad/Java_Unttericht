package Day6_ifElseifStatements;

import java.util.Scanner;

public class C05_IfElseIfStatements {
    public static void main(String[] args) {



    //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
    // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
    // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
    // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
    Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz");
        char cinsiyet = scan.next().charAt(0);
        System.out.println("lutfen yasinizi giriniz ");

        int girilenYas = scan.nextInt();

        if((cinsiyet== 'k'|| cinsiyet=='K')&&girilenYas>=60 && girilenYas<=100 ){
            System.out.println("emekli olabilirsiiz");}

        else if((cinsiyet=='e'||cinsiyet=='E')&& girilenYas>=65 && girilenYas<100){
            System.out.println("Emekli olabilrisniz ");}

        else if((cinsiyet=='e'||girilenYas=='E')&& girilenYas<65 && girilenYas>=18) {
            System.out.println("emekli olmak icin " + (65 - girilenYas) + " yil calisman gerek");

        }else if((cinsiyet=='k'||girilenYas=='K')&& girilenYas<60 && girilenYas>=18){
                System.out.println("emekli olmak icin "+  (60-girilenYas)+" yil daha  calisman gerek ");

        }
        else{
            System.out.println("hatali bir islem yaptiniz");
        }
    }
}
