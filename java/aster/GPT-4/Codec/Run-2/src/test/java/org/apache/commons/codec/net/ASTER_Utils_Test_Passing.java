/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Utils_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigitForValue10_mPfT0() {
        int input = 10;
        char expected = 'A';
        char result = Utils.hexDigit(input);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit_ValidHexadecimal_faIB0_qsac0() {
        assertEquals('A', Utils.hexDigit(10));
    }
}