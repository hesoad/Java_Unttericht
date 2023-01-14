package Day6_ifElseifStatements;

import java.util.Scanner;

public class C07_IfElseStatements {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urun adetini giriniz");
         int urunadedi= scan.nextInt();

        System.out.println("lutfen ürunun fiyatini giriniz");
        double urunfiiyati = scan.nextDouble();

        System.out.println("Musteri kartiniz var mi? \n Evet : Hayir: ");
        char kartvarmi = scan.next().charAt(0);

        if(kartvarmi=='e' && urunadedi>=10 ){
            System.out.println("% 20 indirimli urun fiyat:" + urunfiiyati*urunadedi* 0.8);
        }
        else if(kartvarmi=='e'&& urunadedi<10){
            System.out.println("%15 li urun indirimli fiyati: " + urunfiiyati*urunadedi*0.85);
        } else if(kartvarmi=='h'&& urunadedi>=10){
            System.out.println("%15 li urun indirimli fiyati: " + urunfiiyati*urunadedi*0.85);}

        else if(kartvarmi=='h'&& urunadedi<10){
            System.out.println("%10 li urun indirimli fiyati:" + urunfiiyati*urunadedi*0.9);} else{
            System.out.println("hatali bilgi ");
        }






    }
}
