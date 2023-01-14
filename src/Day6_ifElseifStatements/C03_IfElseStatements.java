package Day6_ifElseifStatements;

import java.util.Scanner;

public class C03_IfElseStatements {

    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karekter giriniz ");
        char girilenKarakter = scan.next().charAt(0);

        if(girilenKarakter>='A'&& girilenKarakter<'Z'){
            System.out.println("girilen karekter  buyuk harfdir ");}
        else{ System.out.println("girilen karekter buyuk  harf degildir ");}



    }
}
