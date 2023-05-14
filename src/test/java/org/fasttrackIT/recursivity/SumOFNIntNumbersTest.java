package org.fasttrackIT.recursivity;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.fasttrackIT.recursivity.SumOFNIntNumbers;

import static org.fasttrackIT.recursivity.SumOFNIntNumbers.sumOfNnumbers;


public class SumOFNIntNumbersTest {
    @Test
    public void methodReturnSum() {
        //given
        int n = 2;
        //when
        int sum = sumOfNnumbers(n);
        //then
        Assertions.assertThat(sum).isEqualTo(3);
    }
}
