/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;
import java.util.zip.ZipException;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_X0017_StrongEncryptionHeader_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseFromLocalFileData_BvYE0() throws ZipException {
		byte[] data = new byte[10];
		int offset = 0;
		int length = 10;
		X0017_StrongEncryptionHeader strongEncryptionHeader = new X0017_StrongEncryptionHeader();
		strongEncryptionHeader.parseFromLocalFileData(data, offset, length);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseCentralDirectoryFormatWithInvalidData_OYJZ2() {
        X0017_StrongEncryptionHeader header = new X0017_StrongEncryptionHeader();
        byte[] data = new byte[12];
        int offset = 0;
        int length = 12;
        data[0] = -1;
        try {
            header.parseCentralDirectoryFormat(data, offset, length);
            fail("Exception should be thrown");
        } catch (ZipException e) {
            assertTrue(true);
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseFromLocalFileData_BvYE0_fid1() throws ZipException {
		byte[] data = new byte[4];
		int offset = 0;
		int length = 4;
		X0017_StrongEncryptionHeader strongEncryptionHeader = new X0017_StrongEncryptionHeader();
		strongEncryptionHeader.parseFromLocalFileData(data, offset, length);
	}
}