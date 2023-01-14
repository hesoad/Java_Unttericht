package Day2_proramlamayagiris;

import java.util.Scanner;

public class C11_degerDegistirme {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
        //degerlerini degistirin(swap)

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen ikinci tam sayi giriniz");
        int sayi2= scan.nextByte();

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;

        System.out.println(sayi1);
        System.out.println(sayi2);

    }
}
