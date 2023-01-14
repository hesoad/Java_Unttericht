package Day11_forLoops;

import java.util.Scanner;

public class C12_deneme {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
        //dahil) 7 ila bolunebilen sayilari yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen pozitif  bir sayi giriniz");

        int girilenSayi= scan.nextInt();

        for (int i = 1; i<=girilenSayi; i++) {

            if(i%7==0){

                System.out.print(i+ " ");
            }

        }
        System.out.println("");

    }
}
