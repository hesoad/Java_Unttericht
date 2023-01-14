package Day16_Arrays;

import java.util.Arrays;

public class C03_soru {
    public static void main(String[] args) {
        // Verilen bir int array'deki tum elementeleri 5 artirinin

        int[] arr={2,4,6,8};


        for (int i = 0; i <arr.length ; i++) {

            arr[i]+=5;

        }
        System.out.println(Arrays.toString(arr));//[7, 9, 11, 13]
    }
}
