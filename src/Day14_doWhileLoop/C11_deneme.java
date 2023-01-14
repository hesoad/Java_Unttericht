package Day14_doWhileLoop;

public class C11_deneme {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir pozitif sayi isteyin,
        // sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true değilse false yazdırınız.
        //  Ornek :  input : 16, output: 4
        int input= 144;
        int karekok=1;
        boolean sonuc= false;



        while (karekok*karekok<=input){

            if(karekok*karekok==input){
                System.out.println("girilen sayinin karekoku: "+ karekok);
                sonuc=true;
                break;

            }else{
                karekok++;
            }
        }
        System.out.println(sonuc);


        System.out.println("");

        // do while loop ile yapalim
        input=144;
        karekok=1;
        sonuc=false;

        do {
            if (karekok*karekok==input){
                System.out.println(" girilen sayinyin karekoku=" +karekok);
                sonuc= true;
                break;

            }else{
                karekok++;
            }



        }while (karekok*karekok<=input);
        System.out.println(sonuc);



    }
}
