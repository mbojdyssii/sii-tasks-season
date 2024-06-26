package org.example.siitaskseason;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SeasonServiceTest {


    private final SeasonService seasonService = new SeasonService();

    /*
    W seasonService znajduje się metoda sprawdzająca, czy aktualnie jest zima.
    Niestety test, który sprawdza, czy ta metoda działą poprawnie przechodzi poprawnie tylko wtedy,
    kiedy rzeczywiscie aktualnie jest zima.

    Popraw tę metodę tak, żeby test przechodził prawidłowo niezależnie od aktualnej daty.
    Przykładowy epoch time w sekundach, kiedy jest zima: 1705744125
    */

    @Test
    void checkIfItIsWinter() {
        // given

        // when
        boolean result = seasonService.isWinter();

        // then
        Assertions.assertTrue(result);
    }
}
