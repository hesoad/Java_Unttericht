package Day5_ifStatements;

import java.util.Scanner;

public class C02_IfStatements {

    public static void main(String[] args) {

          /*
            Basit if cumleleri kodun geri kalanindan bagimsizdir
            sadece 1 sarta odaklanir
            o sart true ise if body calisir
            sart false ise if body calismaz( KOD CALISIR)
            birden fazla bagimsiz if cumlesi kullanilmissa
            her cumle birbirinden bagimsiz olacagindan
            bazi degerler icin tum if body'leri calisirken
            bazi degerler icin hic bir if body'si CALISMAYABILIR
         */

        // Kullanicidan bir sayi alip
        // pozitif ise "pozitif sayi",
        // 100 ile 999 arasinda ise(sinirlar dahil) "pozitif 3 basamakli sayi"
        // 3 ile bolunebiliyorsa "3'un kati"
        // birler basamagi 7 ise "Mukemmel"
        // seceneklerinden uygun olanlari yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lztfen bir sayi giriniz");
        // pozitif ise "pozitif sayi"

        int sayi = scan.nextInt();
        if(0<sayi ){
            System.out.println("bu pozititf bir sayi ");
        }
        // 100 ile 999 arasinda ise(sinirlar dahil) "pozitif 3 basamakli sayi"
        if(100<=sayi && sayi<=999 ){
            System.out.println("bu pozititf uc basamakli bir sayi  ");
        }
        // 3 ile bolunebiliyorsa "3'un kati"
        if(sayi%3==0 ){
            System.out.println("bu 3 in kati bir sayiyidir ");
        }
       // birler basamagi 7 ise "Mukemmel"
        if(sayi%10==7 || sayi%10==-7 ){
            System.out.println("bu sayi mukkemel");
        }

    }
}
