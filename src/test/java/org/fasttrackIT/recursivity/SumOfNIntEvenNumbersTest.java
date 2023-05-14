package org.fasttrackIT.recursivity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.fasttrackIT.recursivity.SumOfNIntEvenNumbers.sumOfEvenNumbers;
public class SumOfNIntEvenNumbersTest {
     @Test
        public void methodReturnSumOfEven() {
            //given
            int n = 5;
            //when
            int sum = sumOfEvenNumbers(n);
            //then
            Assertions.assertThat(sum).isEqualTo(30);
        }
    }


