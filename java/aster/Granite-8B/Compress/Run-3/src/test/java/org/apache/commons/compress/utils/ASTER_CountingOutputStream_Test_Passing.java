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
public class Aster_CountingOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesWritten_LGuF0() throws Exception {
        CountingOutputStream cos = new CountingOutputStream(System.out);
        long bytesWritten = cos.getBytesWritten();
        assertEquals(0, bytesWritten);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCount_TIOo0() throws Exception {
        CountingOutputStream cos = new CountingOutputStream(System.out);
        cos.count(10L);
        assertEquals(10L, cos.getBytesWritten());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCountWithNegativeValue_IOSd1() throws Exception {
        CountingOutputStream cos = new CountingOutputStream(System.out);
        cos.count(-1L);
        assertEquals(0L, cos.getBytesWritten());
    }
}