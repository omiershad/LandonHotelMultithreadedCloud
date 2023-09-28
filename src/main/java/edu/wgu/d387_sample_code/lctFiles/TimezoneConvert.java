package edu.wgu.d387_sample_code.lctFiles;


import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@CrossOrigin(origins = "http://localhost:4200")
public class TimezoneConvert {


    public static String getTimeZone() {


        ZonedDateTime currentTime = ZonedDateTime.now();


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        ZonedDateTime estTime = currentTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime mstTime = currentTime.withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime utcTime = currentTime.withZoneSameInstant(ZoneId.of("UTC"));

        String stringEt = estTime.format(dateTimeFormatter);
        String stringMst = mstTime.format(dateTimeFormatter);
        String stringUtc = utcTime.format(dateTimeFormatter);

        return stringEt + " ET, " +  stringMst + " MT, "  + stringUtc + " UTC";
    }
}
