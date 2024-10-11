/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.dump;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DumpArchiveUtil_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCalculateChecksum_ValidInput_fNUS0() {
    byte[] buffer = new byte[1024];
    for (int i = 0; i < 256; i++) {
        buffer[4 * i] = (byte) (i + 1);
    }
    int expectedChecksum = DumpArchiveConstants.CHECKSUM - (256 * 256 - 1);
    int actualChecksum = DumpArchiveUtil.calculateChecksum(buffer);
    assertEquals(expectedChecksum, actualChecksum);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCalculateChecksum_InvalidInput_WMMs1() {
    byte[] buffer = new byte[1024];
    for (int i = 0; i < 256; i++) {
        buffer[4 * i] = (byte) (i + 1);
    }
    buffer[28] = (byte) (256 * 256 - 1);
    int expectedChecksum = DumpArchiveConstants.CHECKSUM - (256 * 256 - 1);
    int actualChecksum = DumpArchiveUtil.calculateChecksum(buffer);
    assertEquals(expectedChecksum, actualChecksum);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert64_2_mJBz1() {
    byte[] buffer = new byte[8];
    int offset = 1;
    long expected = 1;
    long actual = DumpArchiveUtil.convert64(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert64_3_wmjx2() {
    byte[] buffer = new byte[8];
    int offset = 2;
    long expected = 2;
    long actual = DumpArchiveUtil.convert64(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert64_4_gqAA3() {
    byte[] buffer = new byte[8];
    int offset = 3;
    long expected = 3;
    long actual = DumpArchiveUtil.convert64(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert64_5_hnDJ4() {
    byte[] buffer = new byte[8];
    int offset = 4;
    long expected = 4;
    long actual = DumpArchiveUtil.convert64(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert64_6_Umoy5() {
    byte[] buffer = new byte[8];
    int offset = 5;
    long expected = 5;
    long actual = DumpArchiveUtil.convert64(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert64_7_Vatx6() {
    byte[] buffer = new byte[8];
    int offset = 6;
    long expected = 6;
    long actual = DumpArchiveUtil.convert64(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert64_8_sZBe7() {
    byte[] buffer = new byte[8];
    int offset = 7;
    long expected = 7;
    long actual = DumpArchiveUtil.convert64(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert64_9_myMU8() {
    byte[] buffer = new byte[8];
    int offset = 8;
    long expected = 8;
    long actual = DumpArchiveUtil.convert64(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert64_10_ZwQd9() {
    byte[] buffer = new byte[8];
    int offset = 9;
    long expected = 9;
    long actual = DumpArchiveUtil.convert64(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert64_11_DbMN10() {
    byte[] buffer = new byte[8];
    int offset = 10;
    long expected = 10;
    long actual = DumpArchiveUtil.convert64(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert64_12_wsEm11() {
    byte[] buffer = new byte[8];
    int offset = 11;
    long expected = 11;
    long actual = DumpArchiveUtil.convert64(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert64_13_HoNa12() {
    byte[] buffer = new byte[8];
    int offset = 12;
    long expected = 12;
    long actual = DumpArchiveUtil.convert64(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInoWithNegativeValue_QMVg4() {
    byte[] buffer = new byte[24];
    buffer[20] = (byte) 0x80;
    int ino = DumpArchiveUtil.getIno(buffer);
    assertEquals(-128, ino);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInoWithInvalidBuffer_dyub5() {
    byte[] buffer = new byte[23];
    try {
        DumpArchiveUtil.getIno(buffer);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Invalid buffer size", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInoWithNullBuffer_gbEa6() {
    byte[] buffer = null;
    try {
        DumpArchiveUtil.getIno(buffer);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
        assertEquals("Buffer cannot be null", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert16WithNonZeroOffset_hJce1() {
    byte[] buffer = new byte[2];
    int offset = 1;
    int result = DumpArchiveUtil.convert16(buffer, offset);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert16WithNegativeOffset_PlsK2() {
    byte[] buffer = new byte[2];
    int offset = -1;
    int result = DumpArchiveUtil.convert16(buffer, offset);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert16WithLargeOffset_czET3() {
    byte[] buffer = new byte[2];
    int offset = 1000;
    int result = DumpArchiveUtil.convert16(buffer, offset);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert16WithNullBuffer_ztnD4() {
    byte[] buffer = null;
    int offset = 0;
    int result = DumpArchiveUtil.convert16(buffer, offset);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert16WithEmptyBuffer_VlaE5() {
    byte[] buffer = new byte[0];
    int offset = 0;
    int result = DumpArchiveUtil.convert16(buffer, offset);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert16WithInvalidBuffer_CKdV6() {
    byte[] buffer = new byte[2];
    int offset = 0;
    buffer[0] = (byte) 0xFF;
    buffer[1] = (byte) 0xFF;
    int result = DumpArchiveUtil.convert16(buffer, offset);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert32_1_JhtY0() {
    byte[] buffer = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 0;
    int expected = 0x01020304;
    int actual = DumpArchiveUtil.convert32(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert32_2_GRvu1() {
    byte[] buffer = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 1;
    int expected = 0x02030401;
    int actual = DumpArchiveUtil.convert32(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert32_3_RtzI2() {
    byte[] buffer = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 2;
    int expected = 0x03040102;
    int actual = DumpArchiveUtil.convert32(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert32_4_fJWb3() {
    byte[] buffer = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 3;
    int expected = 0x04010203;
    int actual = DumpArchiveUtil.convert32(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert32_5_Tdwb4() {
    byte[] buffer = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 4;
    int expected = 0x01020304;
    int actual = DumpArchiveUtil.convert32(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert32_6_bIyQ5() {
    byte[] buffer = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 5;
    int expected = 0x02030401;
    int actual = DumpArchiveUtil.convert32(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert32_7_KXRP6() {
    byte[] buffer = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 6;
    int expected = 0x03040102;
    int actual = DumpArchiveUtil.convert32(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert32_8_OxuK7() {
    byte[] buffer = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 7;
    int expected = 0x04010203;
    int actual = DumpArchiveUtil.convert32(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert32_9_xPhQ8() {
    byte[] buffer = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 8;
    int expected = 0x01020304;
    int actual = DumpArchiveUtil.convert32(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert64_2_mJBz1_fid1() {
    byte[] buffer = new byte[8];
    int offset = 1;
    long expected = 0;
    long actual = DumpArchiveUtil.convert64(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert64_5_hnDJ4_fid1() {
    byte[] buffer = new byte[8];
    int offset = 4;
    long expected = 0;
    long actual = DumpArchiveUtil.convert64(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert64_7_Vatx6_fid1() {
    byte[] buffer = new byte[8];
    int offset = 6;
    long expected = 7;
    long actual = DumpArchiveUtil.convert64(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert64_9_myMU8_fid1() {
    byte[] buffer = new byte[8];
    int offset = 8;
    long expected = 0;
    long actual = DumpArchiveUtil.convert64(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert64_10_ZwQd9_fid1() {
    byte[] buffer = new byte[8];
    int offset = 9;
    long expected = 0;
    long actual = DumpArchiveUtil.convert64(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert64_12_wsEm11_fid1() {
    byte[] buffer = new byte[8];
    int offset = 11;
    long expected = 0;
    long actual = DumpArchiveUtil.convert64(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert64_13_HoNa12_fid1() {
    byte[] buffer = new byte[8];
    int offset = 12;
    long expected = 0;
    long actual = DumpArchiveUtil.convert64(buffer, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert16WithNullBuffer_ztnD4_fid1() {
    byte[] buffer = null;
    int offset = 0;
    int result = 0;
    assertEquals(result, DumpArchiveUtil.convert16(buffer, offset));
}
}