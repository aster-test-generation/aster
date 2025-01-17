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
    public void test_getMemoryLimitInKb_memoryLimitInKbIs1024_tVPO0() throws Exception {
        MemoryLimitException memoryLimitException = new MemoryLimitException(1024, 1024);
        assertEquals(1024, memoryLimitException.getMemoryLimitInKb());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getMemoryLimitInKb_memoryLimitInKbIs2048_EAEV1() throws Exception {
        MemoryLimitException memoryLimitException = new MemoryLimitException(2048, 2048);
        assertEquals(2048, memoryLimitException.getMemoryLimitInKb());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getMemoryLimitInKb_memoryLimitInKbIs4096_WfsA2() throws Exception {
        MemoryLimitException memoryLimitException = new MemoryLimitException(4096, 4096);
        assertEquals(4096, memoryLimitException.getMemoryLimitInKb());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMemoryNeededInKbTest_kqYG0() throws Exception {
        MemoryLimitException memoryLimitException = new MemoryLimitException(1024, 2048);
        long memoryNeededInKb = memoryLimitException.getMemoryNeededInKb();
        assert memoryNeededInKb == 1024;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMemoryNeededInKbTestWithException_BoGU1() throws Exception {
        MemoryLimitException memoryLimitException = new MemoryLimitException(1024, 2048, new Exception());
        long memoryNeededInKb = memoryLimitException.getMemoryNeededInKb();
        assert memoryNeededInKb == 1024;
    }
}