package Day24_StringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();

        //kapasitesi 16 olan bos bir string yapar

        System.out.println(sb1);
        System.out.println(sb1.capacity());//16

        StringBuilder sb2=new StringBuilder(11);
        System.out.println(sb2);
        System.out.println(sb2.capacity());//11

        StringBuilder sb3= new StringBuilder("Java candir");
        System.out.println(sb3);
        System.out.println(sb3.capacity());//27(11+16)

        sb2.append("Java");
        System.out.println(sb2);//Java
        System.out.println(sb2.capacity());//11

        sb2.append(" Candir");
        System.out.println(sb2); // Java Candir
        System.out.println(sb2.capacity());//11

        sb2.append(".");
        System.out.println(sb2);// Java Candir.
        System.out.println(sb2.capacity());//24= 2*11+2

        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        sb2.trimToSize();
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());






    }
}
