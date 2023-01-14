package Day31_Collactions;

import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList {
    public static void main(String[] args) {
        //List data türünde bir LinkedList olusturalim.

        List<String> harfler= new LinkedList<>();

        harfler.add("H");
        harfler.add("k");
        harfler.add("H");
        System.out.println(harfler);//[H, k, H]

        //1.indexe "M" ekleyelim

        harfler.add(1,"M");
        System.out.println(harfler);//[H, M, k, H]

        //2. indexdeki K yi L yapalim

        harfler.set(2,"L");
        System.out.println(harfler);//[H, M, L, H]

        List<String>karakterler=new LinkedList<>();
        karakterler.add("*");
        karakterler.add("#");
        karakterler.add("9");
        karakterler.add(2,"M");

        System.out.println(karakterler);//[*, #, M, 9]
        System.out.println(harfler.retainAll(karakterler));//Treu

        System.out.println(harfler);//M


        System.out.println(harfler.addAll(karakterler));//Treu

        System.out.println(harfler.removeAll(karakterler));//Treu
        System.out.println(harfler);//[]

        System.out.println(karakterler.subList(1, 3));//[#, M]
        System.out.println(karakterler);//[*, #, M, 9]
        System.out.println(karakterler.hashCode());//2210822

    }
}
