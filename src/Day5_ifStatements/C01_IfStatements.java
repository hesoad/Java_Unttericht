package Day5_ifStatements;


import java.util.Scanner;

public class C01_IfStatements {

    public static void main(String[] args) {

        // Ogrenciden notunu rakam olarak alip harf olarak yazdirin
        // 0- 49,999 DD
        // 50-64,999 CC
        // 65-84,999 BB
        // 85-100 AA

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu girin");

        double not = scan.nextDouble();

        if(0<=not  &&  not<50){
            System.out.println("Notunuz DD, Maalesef kaldiniz");

        }
        if(50<=not  &&  not<65){
            System.out.println("Notunuz CC, Tebrikler gectiniz.");
        }

        if(65<=not  &&  not<85){
            System.out.println("Notunuz BB, Kutlarim cok iyiysiniz");
        }

        if(85<=not  &&  not<100){
            System.out.println("Notunuz AA, En iyisi sizsiniz");



        }




    }







}
