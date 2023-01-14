package Day7_ternary_SwitchStatements;

public class C04_ternary {
    public static void main(String[] args) {

        // Kullanicidan alinan deger
        // 100'den buyukse sayiyi 2 ile carpin
        // 100'e esit veya kucuk ise sayiya 10 ekleyin

        int input = 55;

        if (input>100 ){
           input*=2;
        }else{ input+=10;
            System.out.println(input);
        }

        input=55;


        System.out.println(input>100 ? (input*2) :input+10);



        







    }
}
