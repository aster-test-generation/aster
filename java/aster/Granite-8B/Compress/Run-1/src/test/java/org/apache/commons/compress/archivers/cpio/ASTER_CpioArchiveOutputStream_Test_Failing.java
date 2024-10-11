/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.cpio;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CpioArchiveOutputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinish_caqE0() throws IOException {
        CpioArchiveOutputStream cpioArchiveOutputStream = new CpioArchiveOutputStream(null, (short) 0, 0, null);
        cpioArchiveOutputStream.finish();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinish2_xKau1() throws IOException {
        CpioArchiveOutputStream cpioArchiveOutputStream = new CpioArchiveOutputStream(null, (short) 0, 0);
        cpioArchiveOutputStream.finish();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinish3_GhJQ2() throws IOException {
        CpioArchiveOutputStream cpioArchiveOutputStream = new CpioArchiveOutputStream(null, (short) 0);
        cpioArchiveOutputStream.finish();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinish4_HCXZ3() throws IOException {
        CpioArchiveOutputStream cpioArchiveOutputStream = new CpioArchiveOutputStream(null);
        cpioArchiveOutputStream.finish();
    }
}