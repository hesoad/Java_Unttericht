package Day24_StringBuilder;

public class den {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5 + 7 + "Java" + 4 + 5);

        String isim="Mesut";

        sb.append(isim, 2, 4);

        sb.delete(4, 6);

        System.out.println(sb);
    }
}
