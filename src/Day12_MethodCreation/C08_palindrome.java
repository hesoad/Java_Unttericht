package Day12_MethodCreation;

public class C08_palindrome {
    public static void main(String[] args) {

        String str = "ey edip adanada pide ye";

       String tersStr= C07_Terscevirme.metniTerseCevir(str);

        if(str.equals(tersStr)){
            System.out.println("verilen metin palindrome ");

        }else{
            System.out.println("verilen metin palindrome degil ");
        }


    }
}
