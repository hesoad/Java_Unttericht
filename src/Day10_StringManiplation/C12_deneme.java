package Day10_StringManiplation;



public class C12_deneme {

    public static void main(String[] args) {
        //Soru 1 : Kullanicidan bir cumle alin
        //- cumlede ev geciyorsa, "home home sweet home" yazdirin
        //- cumlede is geciyorsa, "calismak guzeldir"
        //- ikisini de iceriyorsa "Hem ev lazim hem is"
        //- hicbirini icermiyorsa "cok calisman lazim" yazdirin

        String str = ("insan mutlaka hem evde  hem is yerinde calismalai");

        String calisilacakStr=str.toLowerCase();

        if (calisilacakStr.contains("ev") && calisilacakStr.contains ("is")){
            System.out.println(" hem ev hem de is lazim");
        }else if (calisilacakStr.contains("ev")){
            System.out.println("home home sweet home");
        }else if(calisilacakStr.contains("is ")){
            System.out.println( "calismak guzeldir");
        }else{
            System.out.println("cok calisman lazim");
        }



    }
}
