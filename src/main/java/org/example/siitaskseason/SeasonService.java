package org.example.siitaskseason;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.Month;
import java.time.ZoneId;

@Service
public class SeasonService {

    public boolean isWinter() {
        int month = Instant.now().atZone(ZoneId.systemDefault()).getMonthValue();
        int day = Instant.now().atZone(ZoneId.systemDefault()).getDayOfMonth();

        // Winter lasts from December 21 to March 20.
        if (month == Month.DECEMBER.getValue() && day >= 21) {
            return true;
        } else if (month == Month.JANUARY.getValue() || month == Month.FEBRUARY.getValue()) {
            return true;
        } else return month == Month.MARCH.getValue() && day <= 20;
    }

    public boolean isSummer() {
        int month = Instant.now().atZone(ZoneId.systemDefault()).getMonthValue();
        int day = Instant.now().atZone(ZoneId.systemDefault()).getDayOfMonth();

        // Summer lasts from June 21 to September 20.
        if (month == Month.JUNE.getValue() && day >= 21) {
            return true;
        } else if (month == Month.JULY.getValue() || month == Month.AUGUST.getValue()) {
            return true;
        } else return month == Month.SEPTEMBER.getValue() && day <= 20;
    }
}
