package org.example.siitaskseason;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SeasonServiceTest {


    private final SeasonService seasonService = new SeasonService();

    /*
    In seasonService, there is a method that checks whether it is currently winter/summer.
    Unfortunately, the test verifying this method only passes correctly when it is actually winter/summer.

    Fix this method so that the test passes correctly regardless of the current date.
    Example epoch time in seconds when it is winter: 1705744125.
    Example epoch time in seconds when it is summer: 1721035200.
    */

    @Test
    void checkIfItIsWinter() {
        // given

        // when
        boolean result = seasonService.isWinter();

        // then
        Assertions.assertTrue(result);
    }

    @Test
    void checkIfItIsSummer() {
        // given

        // when
        boolean result = seasonService.isSummer();

        // then
        Assertions.assertTrue(result);
    }
}
