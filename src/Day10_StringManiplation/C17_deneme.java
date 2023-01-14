package Day10_StringManiplation;

import java.util.Scanner;

public class C17_deneme {
    public static void main(String[] args) {

        // Kullanicidan  bir String alin, String’in uzunlugu cift sayi ise tam ortasina:)
        // ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
        //yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");

        String str= scan.nextLine();

       if(str.length()%2==0){

           System.out.println(str.substring(0,str.length()/2)+":)"+str.substring(str.length()/2+1));
       }else{
           System.out.println(str.replace(str.substring(str.length()/2,str.length()/2+1),":("));
       }









    }
}
