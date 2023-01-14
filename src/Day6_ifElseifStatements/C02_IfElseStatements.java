package Day6_ifElseifStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char karek = scan.next().charAt(0);

        if(karek> 'a'&& karek<'z'){
            System.out.println((char)(karek-32) );
        } else {
            System.out.println(karek);
        }
    }
}
