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
public class Aster_X0017_StrongEncryptionHeader_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseFromLocalFileData_dXgB0() throws ZipException {
		X0017_StrongEncryptionHeader x0017 = new X0017_StrongEncryptionHeader();
		byte[] data = new byte[10];
		int offset = 0;
		int length = 10;
		x0017.parseFromLocalFileData(data, offset, length);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getRecordCount_vnnb0() {
        X0017_StrongEncryptionHeader header = new X0017_StrongEncryptionHeader();
        long recordCount = header.getRecordCount();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getRecordCount_with_branch_coverage_Xjkd1() {
        X0017_StrongEncryptionHeader header = new X0017_StrongEncryptionHeader();
    }
}