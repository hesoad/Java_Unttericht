package Day18_arrayList;

import java.util.Scanner;

public class C16_denemeFibonaci {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen bir sayi girin");
        int num= scanner.nextInt();
        int t1=0;
        int t2=1;
        System.out.print(num+ " sayisinin fibonaci sayilari:");
        for (int i = 1; i <=num; i++) {
            System.out.print(t1+ "+");
            int toplam= t1+t2;
            t1=t2;
            t2=toplam;

        }
    }
}
