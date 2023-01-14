package Day10_StringManiplation;

public class C10_forLoop {

    public static void main(String[] args) {
        // input olarak verilen sayidan baslayip
        // 7'ser 7'ser artirarak input olarak verilen bitis sayisina kadar
        // - tum sayilari
        // - kac adet sayi oldugunu
        // - ve bu sayilarin toplaminin kac oldugunu yazdirin
        int inputBas = 3;
        int inputBit = 156;
        int sayac = 0;
        int toplam=0;

        for (int i = inputBas; i <=inputBit; i+=7) {
            System.out.print(i+" ");
            sayac++;
            toplam+=i;

            
        }

        System.out.println(" ");

        System.out.println("toplam  "+sayac+" adetsayi var \nBu sayıalrin toplamı : "+toplam);







    }
}
