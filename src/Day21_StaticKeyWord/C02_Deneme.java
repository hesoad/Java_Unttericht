package Day21_StaticKeyWord;

public class C02_Deneme {
    public static void main(String[] args) {
         /*
        Java PassByValue kullanir
        Yani method'lar arasinda gonderilen variable'larin
        kendileri degil, value'lari diger method'a yollanir.
         */

        int fiyat=100;
        // fiyat uzerinden %10 indirim yapip, indirimli fiyati donduren bir method olusturun
        System.out.println(indirimYap10(fiyat));// 90
        System.out.println(indirimYap10(fiyat)); // 90
        System.out.println(indirimYap10(fiyat)); // 90
        System.out.println(indirimYap10(fiyat)); // 90
        System.out.println(fiyat);// 100
        // eger indirimli fiyatin kalici olarak fiyatimizi degistirmesini istersek
        // atama yapariz

    }
    public static int indirimYap10(int a){
        a=a * 90 /100 ;
        return a;

    }
}
