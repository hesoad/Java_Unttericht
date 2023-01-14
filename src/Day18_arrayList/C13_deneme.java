package Day18_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C13_deneme {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.
        List<String>isimlerListesi=isimListesiOlustur();
        System.out.println(isimlerListesi);

    }
    public static List<String> isimListesiOlustur(){
       List <String> isimlistesi= new ArrayList<>();
        String girilenIsim="";
        Scanner scan =new Scanner(System.in);

        while (!girilenIsim.equalsIgnoreCase("q")){
            System.out.println("listeye eklemk icin bir isim giriniz. \nIslemi bitirmek icin q ya basiniz");
            girilenIsim= scan.nextLine();
            if (!girilenIsim.equalsIgnoreCase("q")){
                isimlistesi.add(girilenIsim);
            }
        }
        return isimlistesi;

    }
}
