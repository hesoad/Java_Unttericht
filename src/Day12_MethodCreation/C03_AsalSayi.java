package Day12_MethodCreation;

public class C03_AsalSayi {

    public static void main(String[] args) {

        // verilen bir sayinin asal olup olmadigini true / false olarak donduren
        // bir method olusturun
        // asalSayiMi method'u boolean bir sonuc dondurdugunden
        // bu method'u calistirdigimizda
        // ya direk yazdirmaliyiz

        System.out.println(asalSayiMi(65));
        System.out.println(asalSayiMi(17));

        // veya method call'un getirecegi sonucu atamak icin bir variable olusturabilirim


    }
    public static boolean asalSayiMi(int input){
        boolean asalSayiMi=true;
        for (int i = 2 ; i <input ; i++) {
            if(input%i==0){
                asalSayiMi=false;
                break;
            }

        }
        return  asalSayiMi;
    }


}
