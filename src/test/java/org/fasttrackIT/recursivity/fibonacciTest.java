package org.fasttrackIT.recursivity;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class fibonacciTest {
    @Test
    public void testFiboMethod(){
        //given
        int n=6;
        //when
        fibonacci fiboo=new fibonacci();
        int rez=fiboo.fibo(n);
        //then
        Assertions.assertThat(rez).isEqualTo(8);
    }
}
