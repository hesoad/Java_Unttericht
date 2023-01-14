package Day13_methodOverLoadin_wWhileLoop;

import Day12_MethodCreation.C03_AsalSayi;
import Day12_MethodCreation.C07_Terscevirme;
import Day12_MethodCreation.C09_FibonacciSerisi;

public class  C01_MethodCall {
    public static void main(String[] args) {


        // ilk 15 fibonaci sayisini yazdirin

        C09_FibonacciSerisi.fibonaccidenSayiYazdir(15);//0 1 1 2 3 5 8 13 21 34 55 89 144 233 377

        // asagida verilen cumlenin tersini yazin

        String str= " bir kere yaparim yan gelir yatarim,";//,miratay rileg nay mirapay erek rib
        System.out.println(C07_Terscevirme.metniTerseCevir(str));

        //Asagida verileb cumlenin palindromie olup olmadigini yazin.
         str="java Candir";
         String tersStr=str;

         tersStr= C07_Terscevirme.metniTerseCevir(str);

         if( tersStr.equals(str)){
             System.out.println("girilen cumle palindomidir ");
         }else{
             System.out.println("girilen cumle palindon degildir ");
         }

         //asagida verilen sayi asal sayi olupolmadigini yazdirin

        int sayi=13;

        System.out.println(C03_AsalSayi.asalSayiMi(13));


    }
}

