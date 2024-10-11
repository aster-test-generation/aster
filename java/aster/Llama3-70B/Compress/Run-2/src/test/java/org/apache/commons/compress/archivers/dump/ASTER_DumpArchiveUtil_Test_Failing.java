/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.dump;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DumpArchiveUtil_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCalculateChecksum_jOXq0() {
    byte[] buffer = new byte[1024];
    for (int i = 0; i < 1024; i++) {
        buffer[i] = (byte) i;
    }
    int result = DumpArchiveUtil.calculateChecksum(buffer);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCalculateChecksum_EmptyBuffer_Uovu1() {
    byte[] buffer = new byte[0];
    int result = DumpArchiveUtil.calculateChecksum(buffer);
    assertEquals(DumpArchiveConstants.CHECKSUM, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert64_VSNR0() {
    byte[] buffer = new byte[10];
    buffer[0] = 1;
    buffer[1] = 2;
    buffer[2] = 3;
    buffer[3] = 4;
    buffer[4] = 5;
    buffer[5] = 6;
    buffer[6] = 7;
    buffer[7] = 8;
    long result = DumpArchiveUtil.convert64(buffer, 0);
    assertEquals(71777283108983008L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIno_iklw0() {
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
public void testConvert16_QYqR0() {
    byte[] buffer = new byte[] { 0x12, 0x34, 0x56, 0x78 };
    int offset = 1;
    int result = DumpArchiveUtil.convert16(buffer, offset);
    assertEquals(0x3456, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvert32_LhmM0() {
    byte[] buffer = new byte[5];
    buffer[0] = 1;
    buffer[1] = 2;
    buffer[2] = 3;
    buffer[3] = 4;
    int result = DumpArchiveUtil.convert32(buffer, 0);
    assertEquals(16909060, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyValidBuffer_HxSQ3() {
    byte[] buffer = new byte[32];
    buffer[24] = (byte) 0x93;
    buffer[25] = (byte) 0x5c;
    buffer[26] = (byte) 0x96;
    buffer[27] = (byte) 0x02;
    buffer[28] = (byte) 0x01;
    buffer[29] = (byte) 0x02;
    buffer[30] = (byte) 0x03;
    buffer[31] = (byte) 0x04;
    assertTrue(DumpArchiveUtil.verify(buffer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCalculateChecksum_jOXq0_fid1() {
    byte[] buffer = new byte[1024];
    for (int i =-1633687302; i < 1024; i++) {
        buffer[i] = (byte) i;
    }
    int result = DumpArchiveUtil.calculateChecksum(buffer);
    assertEquals(0, result);
}
}