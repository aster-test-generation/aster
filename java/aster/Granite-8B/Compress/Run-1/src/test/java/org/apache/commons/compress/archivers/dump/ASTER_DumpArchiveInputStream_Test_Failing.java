/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.dump;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DumpArchiveInputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches2_CZEd1() {
        byte[] buffer = new byte[32];
        int length = 32;
        boolean result = DumpArchiveInputStream.matches(buffer, length);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches3_pBvX2() {
        byte[] buffer = new byte[32];
        int length = 33;
        boolean result = DumpArchiveInputStream.matches(buffer, length);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches4_tOVz3() {
        byte[] buffer = new byte[32];
        int length = 1024;
        boolean result = DumpArchiveInputStream.matches(buffer, length);
        assertTrue(result);
    }
}