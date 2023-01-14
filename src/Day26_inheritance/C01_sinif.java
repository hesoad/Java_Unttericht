package Day26_inheritance;
class okul{
    String okulIsmi="Yildiz Koleji";
    String telefon="1233430ß854";

}
public class C01_sinif extends okul {
    String sinif ="11_C";
    String telefon="89572358704302";

    C01_sinif(String telefon){
        System.out.println(telefon);//scope in icinde arar ve yazar
        System.out.println(this.telefon);//this burada class ismine gider direk
        System.out.println(super.telefon);// direk parents a gider

        System.out.println(okulIsmi);
        System.out.println(this.okulIsmi);
        System.out.println(super.okulIsmi);//

        System.out.println(sinif);//scope in icinde arar ve yazar
        System.out.println(this.sinif);//this burada class ismine gider direk
        // System.out.println(super.sinif);
        // Java'da parent'da bulamadigini gidip child'a sorayim OLMAZ
        // parent class'da aranan sinif degeri olmadigindan CTE verir

    }

    public static void main(String[] args) {
        C01_sinif obj= new C01_sinif("44555564879");
    }


}
