package Day09_stringManiplation;

public class C05_indexOf {
    public static void main(String[] args) {

        String str= "Java ile kodlama cok kolay";
        // str "cok" iceriyor mu

        System.out.println(str.contains("cok"));// true

        // kullanicidan aldigimiz cumleden  "cok" ile baslayan ilk kelimeyi yazdirin

        System.out.println(str.startsWith("cok"));//false

        System.out.println(str.indexOf('a')); // 1

        System.out.println(str.indexOf("v"));
        System.out.println(str.indexOf("cok"));
        System.out.println(str.indexOf("a", 5));// 13


        // 2.o'nun index'ini yazdirin
        // once ilk o'nun index'ini buluruz
        // sonra o index'den sonrasinda 2. o'yu aratiriz
        // Java ile kodlama cok kolay


        int ilkoIndex=str.indexOf("o");
        int ikincioindex= str.indexOf("o",ilkoIndex+1);

        System.out.println(ilkoIndex+" "+ ikincioindex);






    }
}
