package Day8_StringManiplation;

public class C05_chartAt {

    public static void main(String[] args) {

     String str= "Java guzeldir";// 13 tane karakter barindirir

        // java'da index 0'dan baslar
        // J==> 0.index, r==>12
        // charAt(index) ile istedigimiz index'deki char'a ulasabiliriz

        // ilk a'yi yazdiralim.

        System.out.println(str.charAt(0));

        // sondan 4.karakteri buyuk harf olarak yazdirin

        System.out.println(str.toUpperCase().charAt(13 - 7));

        // charAt() method'u bize char döndürdügü icin toUppercase() calismaz
        // String method'larini charAt() ile kullanmak isterseniz
        // charAt()'den once kullanmalisiniz
        //System.out.println(str.charAt(18));// StringIndexOutOfBoundsException
        // Eger index olarak karakter sayisi veya daha buyuk bir deger girersek
        // o index'i bulamayacagi icin hata verir


    }
}
