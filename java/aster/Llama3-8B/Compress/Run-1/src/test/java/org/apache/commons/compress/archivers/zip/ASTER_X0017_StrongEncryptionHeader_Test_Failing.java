/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.zip.ZipException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_X0017_StrongEncryptionHeader_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromCentralDirectoryData_IFKL0() {
        X0017_StrongEncryptionHeader strongEncryptionHeader = new X0017_StrongEncryptionHeader();
        byte[] data = new byte[10];
        int offset = 1;
        int length = 5;
        try {
            strongEncryptionHeader.parseFromCentralDirectoryData(data, offset, length);
        } catch (ZipException e) {
            assert false : "Expected parseFromCentralDirectoryData to not throw ZipException";
        }
    }
}