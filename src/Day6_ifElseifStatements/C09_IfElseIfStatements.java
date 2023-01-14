package Day6_ifElseifStatements;

import java.util.Scanner;

public class C09_IfElseIfStatements {
    // Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
    // kullaniciya musteri karti olup olmadigini sorun.
    // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
    // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen urun adedini giriniz");
        int urunAdedi= scan.nextInt();

        System.out.println("Lutfen urunun liste fiyatini giriniz ");
        double urununfiyati= scan.nextDouble();

        System.out.println("Musteri kartiniz var mi? \nE: Evet    H: Hayir");
        char kartVarMi= scan.next().charAt(0);


        if(kartVarMi=='E'||kartVarMi=='e'){
            if(urunAdedi<10){
                System.out.println("Musteri kartiniza uygulanan %15 lik indirim sonucu odemeniz gereken miktar:" +urunAdedi*urununfiyati*0.85);
            }
            else if(urunAdedi>=10){
                System.out.println("Musteri kartiniza uygulanan %20 lik indirim sonucu odemeniz gereken miktar :" +urunAdedi*urununfiyati*0.80);
            }

        }

        else if(kartVarMi=='h'|| kartVarMi=='H'){
            if(urunAdedi<=0){
                System.out.println("gecersiz bir islem ");
            }

            else if(urunAdedi>=10){
                System.out.println("Musteri kartini bulunmadigindan %15 lik indirimi ile urunlerinizin fiyati:" + urunAdedi*urununfiyati*0.85);
            }
            else if(urunAdedi<10){
                System.out.println("Musteri kartiniz bulunmadigindan %10 lik indirimi ile urunlerinizin fiyati:" +urunAdedi*urununfiyati*0.90);

            }

        }
        else{
            System.out.println("hatali bir islem ");
        }






    }


}
