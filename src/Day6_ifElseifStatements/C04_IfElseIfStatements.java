package Day6_ifElseifStatements;

import java.util.Scanner;

public class C04_IfElseIfStatements {
    public static void main(String[] args) {
        // Ornek :
        // Ogrencinin notu 85 ve ustu ise AA,
        // (85 ve ustu  degilse) 65 ve ustu ise BB,
        // (65 ve ustu  de degilse) 50 ve ustu ise CC,
        // (geriye kalanlar) DD

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");

        double girilennot = scan.nextDouble();
        if   (girilennot>=85 ) {
            System.out.println("Notunuz AA, tebrikler ");
        }
        else if( girilennot>=65){
            System.out.println("Notunuz BB");
        } else if(girilennot>=50){
            System.out.println("notunuz CC sinifi gectiniz");
        }
        else {
            System.out.println("maalesef kaldiniz");
        }
    }
}
