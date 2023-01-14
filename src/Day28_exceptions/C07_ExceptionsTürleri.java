package Day28_exceptions;

public class C07_ExceptionsTürleri {
    public static void main(String[] args) {
        String str="234";
       // STR A sayisal olarak 5 ekleyin ve yazdirin
        System.out.println(Integer.parseInt(str)+5);

        //eger str icinde sayi olmayan bir karakter olursa NumberformatException olur


        Object sayiObj =str;
        Integer sayInt= (Integer)sayiObj;
        System.out.println(sayInt);// ClassCastExceptions

    }

}
