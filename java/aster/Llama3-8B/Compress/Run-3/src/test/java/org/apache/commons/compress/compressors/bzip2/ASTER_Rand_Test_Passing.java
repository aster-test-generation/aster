/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.bzip2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Rand_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRNums_bcYq0() {
        int[] RNUMS = {1, 2, 3, 4, 5};
        assertEquals(1, Rand.rNums(0));
    }
}