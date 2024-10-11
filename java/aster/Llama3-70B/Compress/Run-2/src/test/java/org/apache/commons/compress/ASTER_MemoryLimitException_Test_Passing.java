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
public void testGetMemoryLimitInKb_pRit0() {
    MemoryLimitException exception = new MemoryLimitException(1024, 512);
    assertEquals(512, exception.getMemoryLimitInKb());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMemoryNeededInKb_wXKw0() {
    MemoryLimitException exception = new MemoryLimitException(1024, 512);
    assertEquals(1024, exception.getMemoryNeededInKb());
}
}