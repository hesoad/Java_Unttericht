package Day10_StringManiplation;

public class C13_deneme {
    public static void main(String[] args) {

        //Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //input1 : “15.30 €” , input2 : “11.40 €”
        //output : 36.70



        String str1= "15.30 euro";

        String str2 = "11.40 euro";



        str1=str1.replace('.','0');
        str2=str2.replace('.','0');

        str1=str1.replaceAll("\\D","");
        str2=str2.replaceAll("\\D","");

        str1=str1.replaceFirst("0", ".");

        str2=str2.replaceFirst("0", ".");

        double str3= Double.parseDouble(str1);
        double str4 = Double.parseDouble(str2);

        double sonuc= str3+str4;

        System.out.println(sonuc);










    }
}
