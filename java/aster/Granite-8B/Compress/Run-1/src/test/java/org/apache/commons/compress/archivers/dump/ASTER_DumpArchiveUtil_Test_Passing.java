/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.dump;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DumpArchiveUtil_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetIno_FDKh0() {
		byte[] buffer = new byte[32];
		int expectedIno = 0;
		for (int i = 0; i < 4; i++) {
			buffer[i] = (byte) (expectedIno >>> (24 - 8 * i));
		}
		int actualIno = DumpArchiveUtil.getIno(buffer);
		assertEquals(expectedIno, actualIno);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testConvert16_JEkf0() {
		byte[] buffer = new byte[4];
		buffer[0] = 0;
		buffer[1] = 1;
		buffer[2] = 2;
		buffer[3] = 3;
		int result = DumpArchiveUtil.convert16(buffer, 0);
		assertEquals(256, result);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVerifyWithNullBuffer_AhSK0() {
        byte[] buffer = null;
        boolean result = DumpArchiveUtil.verify(buffer);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVerifyWithInvalidMagicNumber_HnxO1() {
        byte[] buffer = new byte[32];
        int magic = 0; // Invalid magic number
        buffer[24] = (byte) (magic & 0xFF);
        buffer[25] = (byte) ((magic >> 8) & 0xFF);
        buffer[26] = (byte) ((magic >> 16) & 0xFF);
        buffer[27] = (byte) ((magic >> 24) & 0xFF);
        boolean result = DumpArchiveUtil.verify(buffer);
        assertFalse(result);
    }
}