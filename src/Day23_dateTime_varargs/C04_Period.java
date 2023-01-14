package Day23_dateTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {
        LocalDate dogumTarihi=LocalDate.of(1980,01,12);
        LocalDate bugun=LocalDate.now();

        Period yas =Period.between(dogumTarihi,bugun);
        System.out.println(yas);//P42Y11M8D
        System.out.println(yas.getYears());
        LocalDate baslangic=LocalDate.of(2000,10,10);
        LocalDate bitis =LocalDate.of(2004,05,27);
        Period sure =Period.between(baslangic,bitis);

        System.out.println(sure);//P3Y7M17D
        System.out.println(sure.getMonths());//7 ay

    }
}
