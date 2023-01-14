package Day14_doWhileLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C15_deneme {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir pozitif sayi isteyin,
        // sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true değilse false yazdırınız.
        //  Ornek :  input : 16, output: 4
        int arr[] = {2, 11, 0, 23, 7};

        Arrays.sort(arr);

        for(int i=4; i>=0; i--) {

            System.out.print(arr[i] + " ");

        }

    }
}
