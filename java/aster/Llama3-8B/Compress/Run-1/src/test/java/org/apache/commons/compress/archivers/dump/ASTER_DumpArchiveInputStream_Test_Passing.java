/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.dump;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DumpArchiveInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchesShortLength_rhbG0() {
        byte[] buffer = new byte[DumpArchiveConstants.TP_SIZE];
        int length = 20;
        assertFalse(DumpArchiveInputStream.matches(buffer, length));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchesLengthLessThan32_XHUp3() {
        byte[] buffer = new byte[DumpArchiveConstants.TP_SIZE];
        int length = 30;
        assertFalse(DumpArchiveInputStream.matches(buffer, length));
    }
}