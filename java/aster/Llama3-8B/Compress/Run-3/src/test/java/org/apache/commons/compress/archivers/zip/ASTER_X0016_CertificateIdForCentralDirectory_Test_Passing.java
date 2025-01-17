/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.zip.ZipException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_X0016_CertificateIdForCentralDirectory_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromCentralDirectoryDataLengthLessThan4_lbdb1() throws ZipException {
        X0016_CertificateIdForCentralDirectory obj = new X0016_CertificateIdForCentralDirectory();
        byte[] data = new byte[] {(byte) 0x01};
        int offset = 0;
        int length = 1;
        try {
            obj.parseFromCentralDirectoryData(data, offset, length);
            assert false;
        } catch (ZipException e) {
            assertEquals("CertificateIdForCentralDirectory: length must be at least 4", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRecordCount_dJnK0() {
        X0016_CertificateIdForCentralDirectory obj = new X0016_CertificateIdForCentralDirectory();
        int result = obj.getRecordCount();
        assertEquals(0, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRecordCount_QkQE0_xIrY1() {
    X0016_CertificateIdForCentralDirectory obj = new X0016_CertificateIdForCentralDirectory();
    int recordCount = obj.getRecordCount();
    assertEquals(0, recordCount);
}
}