package Day24_StringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="Hava";

        System.out.println(sb1==sb2);//false
        System.out.println(sb1.equals(sb2));//false
        // StringBuilder metin esitligini sorgulamamk icin equals() kullanmaz

        System.out.println(sb1.compareTo(sb2));//0
        StringBuilder sb3= new StringBuilder("Hava");

        System.out.println(sb1.compareTo(sb3));//2, karsilastiridgi iki kelime arasinda farklilik varsa
                                               // iki kelimedeki ilk farkli harflerin birbirne uzakligini ifade eder

        sb3= new StringBuilder("Tava");
        System.out.println(sb3.compareTo(sb3));

        sb3= new StringBuilder("Javax");
        System.out.println(sb1.compareTo(sb3));//-1
        // System.out.println(sb1==str); // data turleri farkli CTE verir
        System.out.println(sb1.equals(str)); // false
        // System.out.println(sb1.compareTo(str));
        // compareTo SB'lar arasinda calisir, farkli data turu kabul etmez

    }
}
