package Day14_doWhileLoop;

import java.util.Arrays;

public class C14_deneme {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar sayi alin ve toplayin
        // kullanici deger olarak 0'a basarsa islemi bitirin
        int arr[] = {3, 2, 3, 4, 4, 5,};

        int count = 0;

        for(int i=0; i<arr.length; i++) {

            if(arr[i]==3) {

                count++;

            }

        }

        System.out.println(count);
    }


}
