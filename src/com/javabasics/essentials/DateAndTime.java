package com.javabasics.essentials;

import java.time.*;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(now); // 指定地點
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);
        //ZoneId.getAvailableZoneIds().forEach(System.out::println);

        System.out.println(now1.getDayOfWeek());



//        ZonedDateTime now = ZonedDateTime.now();
//        LocalDateTime now1 = LocalDateTime.now();
//        LocalDate now2 = LocalDate.now();
//        LocalTime now3 = LocalTime.now();
//        System.out.println(now);
//        System.out.println(now1);
//        System.out.println(now2);
//        System.out.println(now3);
    }
}
