package Day10_StringManiplation;

public class C05_soru {

        /*: Kullanicidan bir cumle alin
        - cumlede ev geciyorsa, "home home sweet home" yazdirin
                - cumlede is geciyorsa, "calismak guzeldir"
                - ikisini de iceriyorsa "Hem ev lazim hem is"
                - hicbirini icermiyorsa "cok calisman lazim" yazdirin

         */

    public static void main(String[] args) {

        String str=" Evden calisiyorum, ise gitmeye gerek yok";

        String calisilackStr= str.toLowerCase();

        if(calisilackStr.contains("ev")&& calisilackStr.contains(" is")){
            System.out.println("Hem ev lazim hem is");
        } else if (calisilackStr.contains(" is")){
            System.out.println("calismak guzeldir");
        } else if (calisilackStr.contains("ev")){
            System.out.println("home home sweet home ");
        }





    }
}
