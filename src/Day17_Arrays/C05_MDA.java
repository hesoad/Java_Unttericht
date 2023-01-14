package Day17_Arrays;

public class C05_MDA {
    public static void main(String[] args) {

        int[][] arr={{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};

        // verilen 2 katli MDA'deki tum sayilarin toplamini yazdiran bir method olusturun

        tumSayilariTopla(arr);//Array'deki tum sayilarin toplami : 54

      int[][] arr1={{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5},{2,3,4}};

      tumSayilariTopla(arr1);//Array'deki tum sayilarin toplami : 63


    }


    public static void tumSayilariTopla(int[][] arr){


        int toplama=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length;j++) {

                toplama+=arr[i][j];

            }
        }

        System.out.println("Array'deki tum sayilarin toplami : " + toplama );





    }
}
