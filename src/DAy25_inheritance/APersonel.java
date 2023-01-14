package DAy25_inheritance;

public class APersonel {
    public String isim= "Isim atanmadi";
    public String soyisim="Soyisim atanmadi";
    public String telefon="Telefon atanmadi";

    protected void maas(){
        System.out.println("Hastanemizde uygulanan asgari ucret : " + 1700 );
    }

    public void ozelSigorta(){
        System.out.println("Tum personelin ozel saglik sigortasi yaptirilir");
    }

    private void privateMethod(){
        System.out.println("private method calisti");
    }


}
