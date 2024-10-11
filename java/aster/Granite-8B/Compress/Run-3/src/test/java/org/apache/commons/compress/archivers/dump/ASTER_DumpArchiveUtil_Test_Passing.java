/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.dump;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DumpArchiveUtil_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCalculateChecksum_VEFG0() {
        byte[] buffer = new byte[100];
        int expectedChecksum = 0;
        for (int i = 0; i < 256; i++) {
            expectedChecksum += DumpArchiveUtil.convert32(buffer, 4 * i);
        }
        int actualChecksum = DumpArchiveUtil.calculateChecksum(buffer);
        assertEquals(expectedChecksum - (actualChecksum - DumpArchiveUtil.convert32(buffer, 28)), actualChecksum);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCalculateChecksumWithEmptyBuffer_Rvuo1() {
        byte[] buffer = new byte[0];
        int expectedChecksum = 0;
        for (int i = 0; i < 256; i++) {
            expectedChecksum += DumpArchiveUtil.convert32(buffer, 4 * i);
        }
        int actualChecksum = DumpArchiveUtil.calculateChecksum(buffer);
        assertEquals(expectedChecksum - (actualChecksum - DumpArchiveUtil.convert32(buffer, 28)), actualChecksum);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testConvert64_ytqf0() {
        byte[] buffer = new byte[10];
        buffer[0] = 0;
        buffer[1] = 0;
        buffer[2] = 0;
        buffer[3] = 0;
        buffer[4] = 0;
        buffer[5] = 0;
        buffer[6] = 0;
        buffer[7] = 1;
        long result = DumpArchiveUtil.convert64(buffer, 0);
        assertEquals(1L, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetIno_Jxce0() {
		byte[] buffer = new byte[4];
		buffer[0] = 0;
		buffer[1] = 0;
		buffer[2] = 0;
		buffer[3] = 1;
		int expectedIno = 1;
		int actualIno = DumpArchiveUtil.getIno(buffer);
		assertEquals(expectedIno, actualIno);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvert16_rWtd0() {
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
    public void testConvert32_ggIr0() {
        byte[] buffer = new byte[4];
        buffer[0] = 0;
        buffer[1] = 0;
        buffer[2] = 0;
        buffer[3] = 1;
        int result = DumpArchiveUtil.convert32(buffer, 0);
        assertEquals(1, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVerifyBufferNull_MJvj0() {
        byte[] buffer = null;
        boolean result = DumpArchiveUtil.verify(buffer);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVerifyMagicMismatch_qhYP1() {
        byte[] buffer = new byte[32];
        int magic = 0;
        buffer[24] = (byte) (magic & 0xFF);
        buffer[25] = (byte) ((magic >> 8) & 0xFF);
        buffer[26] = (byte) ((magic >> 16) & 0xFF);
        buffer[27] = (byte) ((magic >> 24) & 0xFF);
        boolean result = DumpArchiveUtil.verify(buffer);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVerifyChecksumMismatch_cFOs2() {
        byte[] buffer = new byte[32];
        int checksum = 0;
        buffer[28] = (byte) (checksum & 0xFF);
        buffer[29] = (byte) ((checksum >> 8) & 0xFF);
        buffer[30] = (byte) ((checksum >> 16) & 0xFF);
        buffer[31] = (byte) ((checksum >> 24) & 0xFF);
        boolean result = DumpArchiveUtil.verify(buffer);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVerifyValidBuffer_DvqS3_pTNk0() {
        byte[] buffer = new byte[32];
        int magic = DumpArchiveConstants.NFS_MAGIC;
        buffer[24] = (byte) (magic & 0xFF);
        buffer[25] = (byte) ((magic >> 8) & 0xFF);
        buffer[26] = (byte) ((magic >> 16) & 0xFF);
        buffer[27] = (byte) ((magic >> 24) & 0xFF);
        int checksum = DumpArchiveUtil.calculateChecksum(buffer);
        buffer[28] = (byte) (checksum & 0xFF);
        buffer[29] = (byte) ((checksum >> 8) & 0xFF);
        buffer[30] = (byte) ((checksum >> 16) & 0xFF);
        buffer[31] = (byte) ((checksum >> 24) & 0xFF);
        boolean result = DumpArchiveUtil.verify(buffer);
        assertTrue(result);
    }
}