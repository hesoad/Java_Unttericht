package Day7_ternary_SwitchStatements;

public class C03_Ternary {

    public static void main(String[] args) {

        // input olarak verilen sayiyi kontrol edip
        // sayi cift ise "cift sayi"
        // degilse "tek sayi" yazdirin
        int input= 55 ;
        // if else ile yapalim

        if(input %2==0){
            System.out.println("bu sayi cift ");
        } else{
            System.out.println("bu sayi tektir");
        }

        // ternary ile yapalim

        System.out.println(input%2==0 ? "bu cift sayi" :"tek sayi " );



    }
}
