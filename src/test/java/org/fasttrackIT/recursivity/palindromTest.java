package org.fasttrackIT.recursivity;

import org.assertj.core.api.Assertions;
import org.fasttrackIT.recursivity.palindrom;
import org.junit.jupiter.api.Test;


public class palindromTest {
    @Test
    public void methodTest() {
        //given
        String str = "ana";
        //when
        palindrom palindrom=new palindrom();
        String rez =palindrom.reverseString(str);
        //then
        Assertions.assertThat(rez).isEqualTo("ana");

    }
}
