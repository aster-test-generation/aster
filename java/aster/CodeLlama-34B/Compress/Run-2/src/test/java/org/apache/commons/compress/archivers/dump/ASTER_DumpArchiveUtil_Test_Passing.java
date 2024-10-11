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
public void testConvert64_1_pklh0() {
    byte[] buffer = new byte[8];
    int offset = 0;
    long expected = 0;
    long actual = DumpArchiveUtil.convert64(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIno_BckK0() {
    byte[] buffer = new byte[24];
    int ino = DumpArchiveUtil.getIno(buffer);
    assertEquals(0, ino);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInoWithNonZeroValue_NgSs1() {
    byte[] buffer = new byte[24];
    buffer[20] = 1;
    int ino = DumpArchiveUtil.getIno(buffer);
    assertEquals(1, ino);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInoWithMaxValue_qRJr2() {
    byte[] buffer = new byte[24];
    buffer[20] = (byte) 0xFF;
    int ino = DumpArchiveUtil.getIno(buffer);
    assertEquals(255, ino);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInoWithMinValue_nQkU3() {
    byte[] buffer = new byte[24];
    buffer[20] = (byte) 0x00;
    int ino = DumpArchiveUtil.getIno(buffer);
    assertEquals(0, ino);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert16_AhUz0() {
    byte[] buffer = new byte[2];
    int offset = 0;
    int result = DumpArchiveUtil.convert16(buffer, offset);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerify_nullBuffer_WmAv0() {
    byte[] buffer = null;
    assertFalse(DumpArchiveUtil.verify(buffer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerify_invalidMagic_VPFQ1() {
    byte[] buffer = new byte[32];
    buffer[24] = (byte) 0x12;
    buffer[25] = (byte) 0x34;
    buffer[26] = (byte) 0x56;
    buffer[27] = (byte) 0x78;
    assertFalse(DumpArchiveUtil.verify(buffer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerify_invalidChecksum_cOfq2() {
    byte[] buffer = new byte[32];
    buffer[24] = (byte) 0x12;
    buffer[25] = (byte) 0x34;
    buffer[26] = (byte) 0x56;
    buffer[27] = (byte) 0x78;
    buffer[28] = (byte) 0x90;
    buffer[29] = (byte) 0xAB;
    buffer[30] = (byte) 0xCD;
    buffer[31] = (byte) 0xEF;
    assertFalse(DumpArchiveUtil.verify(buffer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCalculateChecksum_ValidInput_fNUS0_fid1() {
    byte[] buffer = new byte[1024];
    for (int i = 0; i < 256; i++) {
        buffer[4 * i] = (byte) (i + 1);
    }
    int expectedChecksum = DumpArchiveConstants.CHECKSUM - (256 * 256 - 1);
    int actualChecksum = DumpArchiveUtil.calculateChecksum(buffer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInoWithNegativeValue_QMVg4_fid1() {
    byte[] buffer = new byte[24];
    buffer[20] = (byte) 0x80;
    int ino = DumpArchiveUtil.getIno(buffer);
    assertEquals(128, ino);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInoWithNullBuffer_gbEa6_fid1() {
    byte[] buffer = null;
    try {
        DumpArchiveUtil.getIno(buffer);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    assertNull(e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert32_1_JhtY0_fid1() {
    byte[] buffer = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 0;
    int expected = 0x01020304;
    int actual = DumpArchiveUtil.convert32(buffer, offset);
}
}