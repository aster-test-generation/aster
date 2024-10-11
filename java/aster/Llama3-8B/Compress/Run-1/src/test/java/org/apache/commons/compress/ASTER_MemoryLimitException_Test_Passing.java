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
public void testGetMemoryLimitInKb_drrL0() {
    MemoryLimitException memoryLimitException = new MemoryLimitException(10, 100);
    int memoryLimit = memoryLimitException.getMemoryLimitInKb();
    assertEquals(100, memoryLimit);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMemoryNeededInKb_pJXC0() {
    MemoryLimitException memoryLimitException = new MemoryLimitException(100, 200);
    long memoryNeededInKb = memoryLimitException.getMemoryNeededInKb();
    assertEquals(100, memoryNeededInKb);
}
}