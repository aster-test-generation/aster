/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.zip.ZipException;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_X0017_StrongEncryptionHeader_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_QFCk0() throws ZipException {
    X0017_StrongEncryptionHeader strongEncryptionHeader = new X0017_StrongEncryptionHeader();
    byte[] data = new byte[10]; // Replace with actual data
    int offset = 0;
    int length = data.length;
    strongEncryptionHeader.parseFromLocalFileData(data, offset, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseCentralDirectoryFormatWithInvalidData_nRkl2() {
		byte[] data = new byte[11];
		X0017_StrongEncryptionHeader header = new X0017_StrongEncryptionHeader();
		try {
			header.parseCentralDirectoryFormat(data, 0, data.length);
		} catch (ZipException e) {
			assertTrue(e.getMessage().contains("minimal"));
		}
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_QFCk0_fid1() throws ZipException {
    X0017_StrongEncryptionHeader strongEncryptionHeader = new X0017_StrongEncryptionHeader();
    byte[] data = new byte[4]; // Replace with actual data
    int offset = 0;
    int length = data.length;
    strongEncryptionHeader.parseFromLocalFileData(data, offset, length);
}
}