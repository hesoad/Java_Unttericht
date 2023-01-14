package Day27_Overriding;

public class CAvciKuslar extends BKuslar{

    protected void hareket( ){
        System.out.println("ucarlar");
    }
    protected void beslenme( ) {
        System.out.println(" et yerler");
    }
    protected void pence( ) {
        System.out.println("pencelidir");
    }
    protected void gaga( ) {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {
        CAvciKuslar krt1=new CAvciKuslar();

        krt1.hareket();//C ucarlar
        krt1.beslenme();//C et yerler
        krt1.pence();//C pencelidir
        krt1.gaga();//C sivri gagali
        krt1.kanat();//B kanatlilardir
        krt1.solunum();//B akcigerle nefes alirla
        krt1.cogalma();//B yumurtayla cogalirlar
        krt1.omur();//A yasar ve olurler



        BKuslar krt2 =new CAvciKuslar();

        krt2.hareket();//C ucarlar
        krt2.beslenme();//C et yerler
        //krt2.pence();//C BKuslar veya parent classda yok,CTE veriri.
        krt2.gaga();//C sivri gagali
        krt2.kanat();//B kanatlilardir
        krt2.solunum();//B akcigerle nefes alirla
        krt2.cogalma();//B yumurtayla cogalirlar
        krt2.omur();//A yasar ve olurler

        AHayvanlar krt3=new CAvciKuslar();
        krt3.hareket();//C ucarlar
        krt3.beslenme();//C et yerler
        //krt3.pence();//AHayvanlar classindan yok CTE veriyor. child e bakmaz
       // krt3.gaga();//AHayvanlar classindan yok CTE veriyor. child e bakmaz
       // krt3.kanat();//AHayvanlar classindan yok CTE veriyor. child e bakmaz
        krt3.solunum();//B akcigerle nefes alirla
        krt3.cogalma();//B yumurtayla cogalirlar
        krt3.omur();//A yasar ve olurler


    }
}
