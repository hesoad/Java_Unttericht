package DAy25_inheritance;

public class ECorolla extends DToyota {

    ECorolla(){
        super("gri");
        System.out.println("parametresiz corola construktori calsiti");
    }
    ECorolla(String param1){
        super("gri");
        System.out.println("String parametreli corolla construktor calisti");

    }

    String marka="Corolla";
    String uretimYeri="Turkiye ";

    public static void main(String[] args) {
        ECorolla cor1= new ECorolla("mavi");
    }

}
