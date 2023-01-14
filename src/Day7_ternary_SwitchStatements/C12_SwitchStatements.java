package Day7_ternary_SwitchStatements;

public class C12_SwitchStatements {

    public static void main(String[] args) {

        //- Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istediginizi alin
        // ve girilen harfin karsiligini yazdirin
       // I : International S : Software T : Testing Q : Qualifications B: Board

       char harf='I';

       switch (harf){

           case 'I':
           case 'i':
               System.out.println("Internatinal");
               break;

           case 'S':
           case 's':
               System.out.println("Software");
               break;

           case 'T':
           case 't':
               System.out.println("Tester");
               break;
           case 'Q':
           case 'q':
               System.out.println("Qualifications");
               break;
           case 'B':
           case 'b':
               System.out.println("Board");
               break;

           default:
               System.out.println("hatali giris");



       }



    }
}
