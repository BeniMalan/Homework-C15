package org.fasttrackIT.recursivity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.fasttrackIT.recursivity.SumOfDigits.main;


public class SumOfDigitsTest {
    @Test
    public void testMethod() {
        //given
        int n = 100;
        //when
        SumOfDigits sumOfDigits = new SumOfDigits();

        int rez = sumOfDigits.sum(n);
        //then
        Assertions.assertThat(rez).isEqualTo(1);
    }
}
