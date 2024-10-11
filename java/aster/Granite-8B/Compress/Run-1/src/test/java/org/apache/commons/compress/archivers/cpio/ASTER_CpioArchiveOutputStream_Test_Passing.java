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
public class Aster_CpioArchiveOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutArchiveEntryWithFormatNew_EEih0() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioArchiveEntry.FORMAT_NEW);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutArchiveEntryWithFormatNewCrc_UmPd1() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioArchiveEntry.FORMAT_NEW_CRC);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutArchiveEntryWithFormatOldAscii_NAex2() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioArchiveEntry.FORMAT_OLD_ASCII);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutArchiveEntryWithFormatOldBinary_CyaK3() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioArchiveEntry.FORMAT_OLD_BINARY);
    }
}