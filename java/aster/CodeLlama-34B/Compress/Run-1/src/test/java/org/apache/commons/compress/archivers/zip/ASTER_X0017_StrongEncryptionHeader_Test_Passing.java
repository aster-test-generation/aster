/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.zip.ZipException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_X0017_StrongEncryptionHeader_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRecordCount_ttQS0() {
        X0017_StrongEncryptionHeader header = new X0017_StrongEncryptionHeader();
        long expected =0;
        long actual = header.getRecordCount();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryDataWithInvalidData_cuLb4() {
    X0017_StrongEncryptionHeader header = new X0017_StrongEncryptionHeader();
    byte[] data = new byte[10];
    int offset = 0;
    int length = 10;
    try {
        header.parseFromCentralDirectoryData(data, offset, length);
        fail("Exception should be thrown");
    } catch (ZipException e) {
    }
}
}