package Day34_Map_NestedMap;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMap {
    public static void main(String[] args) {
          /*
        Asagidaki body'yi map olarak olusturun
        {
            "firstname" : "Ahmet",
            "lastname" : “Bulut",
            "totalprice" : 500,
            "depositpaid" : false,
            "bookingdates" : {
                   "checkin" : "2021-06-01",
                   "checkout" : "2021-06-10"
                      },
            "additionalneeds" : "wi-fi" }
         */
        Map<String,String>bookingDatesMap=new HashMap<>();
        bookingDatesMap.put("checkin","2021-06-01");
        bookingDatesMap.put("checkout","2021-06-10");

        Map<String, Object> bookingMap=new HashMap<>();
        bookingMap.put("firstname" , "Ahmet");
        bookingMap.put("lastname" , "Bulut");
        bookingMap.put("totalprice" , 500);
        bookingMap.put("deposited" , false);
        bookingMap.put("bookingdatets",bookingDatesMap);
        bookingMap.put("additionalneeds" , "wi-fi");

        System.out.println(bookingMap);

           /*
        {
        firstname=Ahmet,
        additionalneeds=wi-fi,
        bookingdates={
                checkin=2021-06-01,
                checkout=2021-06-10},
        totalprice=500,
        depositpaid=false,
        lastname=Bulut}
         */

        // isim bilgisini yazdirin

        System.out.println(bookingMap.get("firstname"));// Ahmet

        // additionalneeds yazdirin
        System.out.println(bookingMap.get("additionalneeds" ));// wi-fi


        // check-in bilgisini yazdirin

        // booking map'indeki value data turu Object sectik
        // dolayisiyla bookingdates key'ine ait value'yu Object olarak bize getirir
        // ama biz onun map oldugunu biliyoruz
        // casting yapabiliriz

        System.out.println(((Map) bookingMap.get("bookingdatets")).get("checkin"));; // 2021-06-01
        // check-out tarihini yazdiralim

        System.out.println(((Map) bookingMap.get("bookingdatets")).get("checkout"));// 2021-06-10

    }
}
