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
public void testCalculateChecksum_moFY0() {
    byte[] buffer = new byte[1024];
    for (int i = 0; i < 1024; i++) {
        buffer[i] = (byte) i;
    }
    int result = DumpArchiveUtil.calculateChecksum(buffer);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCalculateChecksum_EmptyBuffer_UYWO1() {
    byte[] buffer = new byte[0];
    int result = DumpArchiveUtil.calculateChecksum(buffer);
    assertEquals(DumpArchiveConstants.CHECKSUM, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIno_opxE0() {
    byte[] buffer = new byte[24]; // assuming 24 bytes is enough for the method
    buffer[20] = (byte) 0x12;
    buffer[21] = (byte) 0x34;
    buffer[22] = (byte) 0x56;
    buffer[23] = (byte) 0x78;
    int result = DumpArchiveUtil.getIno(buffer);
    assertEquals(0x12345678, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert16_ceBz0() {
    byte[] buffer = new byte[] {0x12, 0x34, 0x56, 0x78};
    int offset = 1;
    int result = DumpArchiveUtil.convert16(buffer, offset);
    assertEquals(0x3456, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert32_KtpU0() {
    byte[] buffer = new byte[5];
    buffer[0] = (byte) 0x12;
    buffer[1] = (byte) 0x34;
    buffer[2] = (byte) 0x56;
    buffer[3] = (byte) 0x78;
    assertEquals(0x12345678, DumpArchiveUtil.convert32(buffer, 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyNullBuffer_zrZH0() {
    byte[] buffer = null;
    assertFalse(DumpArchiveUtil.verify(buffer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyInvalidMagic_ybob1() {
    byte[] buffer = new byte[32];
    buffer[24] = 0x01;
    buffer[25] = 0x02;
    buffer[26] = 0x03;
    buffer[27] = 0x04;
    assertFalse(DumpArchiveUtil.verify(buffer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyInvalidChecksum_uXXs2() {
    byte[] buffer = new byte[32];
    buffer[24] = (byte) 0x93;
    buffer[25] = (byte) 0x5c;
    buffer[26] = (byte) 0x48;
    buffer[27] = (byte) 0x12;
    buffer[28] = 0x01;
    buffer[29] = 0x02;
    buffer[30] = 0x03;
    buffer[31] = 0x04;
    assertFalse(DumpArchiveUtil.verify(buffer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyValidBuffer_uAeb3() {
    byte[] buffer = new byte[32];
    buffer[24] = (byte) 0x93;
    buffer[25] = (byte) 0x5c;
    buffer[26] = (byte) 0x48;
    buffer[27] = (byte) 0x12;
    buffer[28] = (byte) 0x01;
    buffer[29] = (byte) 0x02;
    buffer[30] = (byte) 0x03;
    buffer[31] = (byte) 0x04;
    assertTrue(DumpArchiveUtil.verify(buffer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert64_Uczh0_RlKp0() {
    byte[] buffer = new byte[10];
    buffer[0] = (byte) 0x12;
    buffer[1] = (byte) 0x34;
    buffer[2] = (byte) 0x56;
    buffer[3] = (byte) 0x78;
    buffer[4] = (byte) 0x90;
    buffer[5] = (byte) 0x12;
    buffer[6] = (byte) 0x34;
    buffer[7] = (byte) 0x56;
    buffer[8] = (byte) 0x78;
    buffer[9] = (byte) 0x90;
    long result = DumpArchiveUtil.convert64(buffer, 0);
    assertEquals(0x1234567890123456L, result);
}
}