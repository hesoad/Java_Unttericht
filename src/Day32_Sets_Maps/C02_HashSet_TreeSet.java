package Day32_Sets_Maps;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C02_HashSet_TreeSet {
    public static void main(String[] args) {
        /*
        Bir hashset ve tree set olusturun .
        Bir loop ile iclerine rastgele 100000 ekleyin.
        islem surelerini karsilastrin
         */

        Random rnd =new Random();
        int sayi=0;
        Set<Integer>hashset=new HashSet<>();
        Set<Integer>treeSet=new TreeSet<>();
        Long hasBaslangic=System.currentTimeMillis();

        for (int i = 0; i <100000 ; i++) {
            sayi= rnd.nextInt(100000);
            hashset.add(sayi);
        }
        Long hasBitis=System.currentTimeMillis();

        Long treeBaslangic=System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {
            sayi= rnd.nextInt(100000);
            treeSet.add(sayi);

        }
        Long treeBitis=System.currentTimeMillis();

        System.out.println("Hashset sure= "+(hasBitis-hasBaslangic) );
        System.out.println("Hashset sure= "+(treeBitis-treeBaslangic) );

    }
}
