/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SkipShieldingInputStream_Test_Passing {
    private static final int SKIP_BUFFER_SIZE = 1024;
    private static final byte[] SKIP_BUFFER = new byte[SKIP_BUFFER_SIZE];
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkipWithNegativeValue_xkYL0() throws IOException {
        SkipShieldingInputStream in = new SkipShieldingInputStream(null);
        assertEquals(0, in.skip(-1));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkipWithZeroValue_nynI1() throws IOException {
        SkipShieldingInputStream in = new SkipShieldingInputStream(null);
        assertEquals(0, in.skip(0));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkipWithValueSmallerThanBufferSize_VLta2() throws IOException {
        SkipShieldingInputStream in = new SkipShieldingInputStream(null);
        assertEquals(5, in.skip(5));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkipWithValueGreaterThanBufferSize_ouVl3() throws IOException {
        SkipShieldingInputStream in = new SkipShieldingInputStream(null);
        assertEquals(1024, in.skip(1025));
    }
}