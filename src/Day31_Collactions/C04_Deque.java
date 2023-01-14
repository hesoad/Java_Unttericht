package Day31_Collactions;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {
    public static void main(String[] args) {
        // Deque double ended queue demektir-
        //Iki yönlü kuyruk

        Deque<String>harfler= new LinkedList<>();
        harfler.add("J");
        harfler.add("L");

        System.out.println(harfler);//[J, L]

        harfler.addFirst("B");
        System.out.println(harfler);//[B, J, L]

        harfler.addFirst("A");
        harfler.addLast("A");
        harfler.add("K");

        System.out.println(harfler);//[A, B, J, L, A, K]


        //Sona dogru A yi silin

        System.out.println(harfler.removeLastOccurrence("A"));// Treu
        System.out.println(harfler);//[A, B, J, L, K]


        System.out.println(harfler.removeLastOccurrence("T"));//false

        LinkedList<String>karakterler=new LinkedList<>();
        karakterler.push("A");
        karakterler.push("B");
        System.out.println(karakterler);//[B, A]
        System.out.println(karakterler.clone());//[B, A]

        LinkedList<String>kopyaKarakterler=(LinkedList<String>) karakterler.clone();

        System.out.println(kopyaKarakterler);//[B, A]


    }
}
