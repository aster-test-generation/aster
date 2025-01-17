/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.zip.ZipException;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_X0017_StrongEncryptionHeader_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_PoiQ0() {
    X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader = new X0017_StrongEncryptionHeader();
    byte[] data = new byte[16];
    int offset = 0;
    int length = 16;
    try {
        x0017_StrongEncryptionHeader.parseCentralDirectoryFormat(data, offset, length);
    } catch (ZipException e) {
        assertTrue(true);
        return;
    }
    fail("Should throw ZipException");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_NsdA0_fid1() {
    X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader = new X0017_StrongEncryptionHeader();
    byte[] data = new byte[10];
    int offset = 0;
    int length = 10;
    try {
        x0017_StrongEncryptionHeader.parseFromCentralDirectoryData(data, offset, length);
    } catch (ZipException e) {
        Assertions.fail();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_PoiQ0_fid1() {
    X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader = new X0017_StrongEncryptionHeader();
    byte[] data = new byte[10];
    int offset = 0;
    int length = 10;
    try {
        x0017_StrongEncryptionHeader.parseFromLocalFileData(data, offset, length);
        assertTrue(true);
    } catch (ZipException e) {
        fail("Should not throw ZipException");
    }
}
}