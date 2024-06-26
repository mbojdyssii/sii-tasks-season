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

        // Zima trwa od 21 grudnia do 20 marca
        if (month == Month.DECEMBER.getValue() && day >= 21) {
            return true;
        } else if (month == Month.JANUARY.getValue() || month == Month.FEBRUARY.getValue()) {
            return true;
        } else return month == Month.MARCH.getValue() && day <= 20;
    }
}
