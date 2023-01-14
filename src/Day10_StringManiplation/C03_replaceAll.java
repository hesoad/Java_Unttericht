package Day10_StringManiplation;

public class C03_replaceAll {
    public static void main(String[] args) {

        String str= "J5a1va 56Guz,z6el-d5i111r";

        System.out.println(str.replace("1", "")
                .replace("5", "")
                .replace("6", ""));

        str="Ja1va 56guz,zel-d0ir8";
       /* replace() zaten istenen degisikligi verilen ozellige uyan tum degerler icin yapar
           eger genellemeyi butun sayilari, butun space'leri, butun ozel karakterleri
           gibi genisletmek istersek replace() yerine replaceAll() kullaniriz
           Java bu genellemeleri yazabilmemiz icin regex(regular expressions) tanimlamistir
           \\d : butun digit'ler
        */
        str=str.replaceAll("\\d", "");



        System.out.println(str);//Java guz,zel-dir


        // ozel karakterlerden de kurtulun
        // space de ozel karakter oldugundan bu durumda space'in yok olmamasi icin
        // once space yerine metinde olmayan bir deger atayalim

       str=str.replace(" ", "5");

      str=  str.replaceAll("\\W", "");//Java5guz,zel-dir

        str= str.replace("5"," ");
        System.out.println(str);//Java5guz,zel-dir

        // buradaki harf sayisini bulun
        String input3="Ali Can, Merve Star, Mark Tom";

        input3= input3.replaceAll("\\W","");

        System.out.println(input3);

        System.out.println(input3.length());//22


    }
}
