/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BoundedInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesRemaining_Eyed0() throws Exception {
        BoundedInputStream bis = new BoundedInputStream(System.in, 100L);
        long remaining = bis.getBytesRemaining();
        assertTrue(remaining >= 0);
    }
}