package Day21_StaticKeyWord;

public class C3_PassByValue {
    public static void main(String[] args) {
        int sayi=20;
        System.out.println(sayi);
       // int sayi=30;
        // bier scope'da tanimlanan variablein yeniden tanimlanma imkan yoktur

       // String sayi ="Hasan ";
        // data turunun degistirerek yeniden tanimlamak da mumkun degildir
        // cunku kullanirken variable'in ismini yazdigimizda hangi sayi variable'ini kullanacagi mechul olur
        method1();
    }
    public static void method1(){
        method2(5);
        String s= "Hasan";
        System.out.println(s.toLowerCase());
    }
    public static void method2(int s){
        s=s*s;
        System.out.println(s);

    }

}
