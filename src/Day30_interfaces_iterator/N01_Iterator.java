package Day30_interfaces_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class N01_Iterator {
    public static void main(String[] args) {
        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);
        System.out.println(sayilar);
        // index yapsisi kullanmadan tum elementleri 3 artirin
        for (Integer each:sayilar) {
            each=each+3;
            System.out.print(each+ " ");
            // iterator'da geri donus yok
            // iterator nereye gittiyse orada kalir, geri donemez
            // tum listeyi loop ile yeniden yazdirmak icin yeniden bir itr olusturmali veya
            // iterator'a yeni deger atamaliyiz



        }
        System.out.println("");
        System.out.println(sayilar);
    //   index kullanmadan tüm  elementleri yazin
        //
        Iterator itr = sayilar.iterator();
        System.out.println(itr.next());//5
        System.out.println(itr.next());//23
        System.out.println(itr.next());//2
        System.out.println(itr.next());//9
        System.out.println(itr.next());//11
        //tek tek yapmayip bir loop ile yapalim

        System.out.println(itr.hasNext());//False

        /*iteratorda geri dönus yok iteratora nerye gitti ise orada kalir , geri donmez.

         */
        itr=sayilar.iterator();
        System.out.println(itr.hasNext());

        while (itr.hasNext()){
            System.out.print(itr.next()+ " ");
        }

        // iteratori kullanarak listedeki 5 den buyuk sailari silin.

        itr=sayilar.iterator();

        // listedeki tum elementleri iterator kullanarak sondan basa dogru yazdirin

        // bir ustteki loop ile sona gittigimiz icin iterator suan en sonda
        // yani olmasini istedigimiz yerde


        while (itr.hasNext()){
            Integer sayi=(Integer) itr.next();
            if(sayi>5){
                itr.remove();
            }
        }
        System.out.println("");
        System.out.println(sayilar);
    }
}
