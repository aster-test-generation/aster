/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CountingInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountWithReadValueEqualToMinusOne_tVzu0() {
        CountingInputStream countingInputStream = new CountingInputStream(null);
        countingInputStream.count(-1);
        assertEquals(0, countingInputStream.getBytesRead());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountWithReadValueEqualToZero_pFGX1() {
        CountingInputStream countingInputStream = new CountingInputStream(null);
        countingInputStream.count(0);
        assertEquals(0, countingInputStream.getBytesRead());
    }
}