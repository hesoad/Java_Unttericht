package Day18_arrayList;

import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C15_deneme {
    public static void main(String[] args) {
       // Verilen pozitif bir n tamsayisini alarak,
        // bize ilk n tane tane Fibonacci sayisini bir list olarak donduren bir method olusturun.

    }

    public static List<Integer>fibonaciListesiOlustur(){

        Scanner scan= new Scanner(System.in);
        List<Integer> fibonaciList=new ArrayList<>();
        System.out.println("lutfen kactane fibonaci sayisi istediginizi giriniz");
        int n = scan.nextInt();

        if( n<1 ){
            System.out.println("gecersiz fibonaci sayisi ");
        }else if( n==1){
            fibonaciList.add(0);
            return fibonaciList;

        }else if (n==2){
            fibonaciList.add(0);
            fibonaciList.add(1);
            return fibonaciList;

        }
        return fibonaciList;



    }
}
