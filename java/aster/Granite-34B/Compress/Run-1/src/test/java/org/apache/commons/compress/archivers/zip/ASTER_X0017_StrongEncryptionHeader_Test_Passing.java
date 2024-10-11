/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.zip.ZipException;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_X0017_StrongEncryptionHeader_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getRecordCount_Dkzx0() {
        X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader = new X0017_StrongEncryptionHeader();
        long recordCount = x0017_StrongEncryptionHeader.getRecordCount();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getRecordCount_with_branch_coverage_dSAc1() {
        X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader = new X0017_StrongEncryptionHeader();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFileFormat_tc5_hlhp4_fid1() throws ZipException {
    X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader = new X0017_StrongEncryptionHeader();
    byte[] data = new byte[10];
    int offset = 10;
    int length = 10;
    try {
        x0017_StrongEncryptionHeader.parseFileFormat(data, offset, length);
        fail("Expected ArrayIndexOutOfBoundsException");
    } catch (ArrayIndexOutOfBoundsException e) {
        // Expected exception
    }
}
}