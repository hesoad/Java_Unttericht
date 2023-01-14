package Day7_ternary_SwitchStatements;

public class C08_SwitchStatements {

    public static void main(String[] args) {

        // Kullanicidan 2 sayi alin
        // ve kullaniciya istedigi islemi sorun
        // +, - , * , / isaretlerinden hangisini girerse
        // 2 sayi icin o islemi yapin
        // bu isaretlerden birini girmezse
        // "yanlis islem tercihi" yazdirin

        int sayi1 = 20;
        int sayi2 = 10;

        char islem ='+';
        // if else ile yapalim

        if(islem=='+'){
            System.out.println("sayialrin Toplami:"+ (sayi1+sayi2));
        } else if (islem=='-'){

            System.out.println("Sayilarin farki:"+ (sayi1-sayi2));
        } else if(islem=='*'){

            System.out.println("sayialrin Carpimi:" +sayi1*sayi2);

        } else if(islem=='/'){

            System.out.println("Sayilarin bolumu:" + sayi1/sayi2);
        } else{

            System.out.println("yanlis islem tercihi ");
        }
         // Switch statement ile yapalim

        System.out.println("===============");


        switch (islem){


            case '+':
                System.out.println("sayialrin Toplami:"+ (sayi1+sayi2));
                break;
            case '-' :
                System.out.println("sayilarin farki:"+ (sayi1-sayi2));
                break;
            case '*':
                System.out.println("sayilarin Carpimi:"+ sayi1*sayi2);
                break;

            case '/':
                System.out.println("sayilarin Bölümü:"+ sayi1/sayi2);
                break;

            default:
                System.out.println("hatali islem ");



}





    }
}
