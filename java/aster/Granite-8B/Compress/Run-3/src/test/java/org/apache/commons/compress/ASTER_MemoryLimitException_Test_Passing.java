/**
 * Generated by Aster
 */
package org.apache.commons.compress;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MemoryLimitException_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMemoryLimitInKb_wSzH0() {
        MemoryLimitException memoryLimitException = new MemoryLimitException(100, 200);
        int result = memoryLimitException.getMemoryLimitInKb();
        assertEquals(200, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMemoryLimitInKbWithException_hXHr1() {
        MemoryLimitException memoryLimitException = new MemoryLimitException(100, 200, new Exception());
        int result = memoryLimitException.getMemoryLimitInKb();
        assertEquals(200, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMemoryNeededInKb_WDQK0() {
        MemoryLimitException memoryLimitException = new MemoryLimitException(1024L, 2048);
        assertEquals(1024L, memoryLimitException.getMemoryNeededInKb());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMemoryNeededInKbWithException_byhV1() {
        MemoryLimitException memoryLimitException = new MemoryLimitException(1024L, 2048, new Exception());
        assertEquals(1024L, memoryLimitException.getMemoryNeededInKb());
    }
}