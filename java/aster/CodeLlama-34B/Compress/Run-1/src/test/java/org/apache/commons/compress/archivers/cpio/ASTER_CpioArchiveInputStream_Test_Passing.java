/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.cpio;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CpioArchiveInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_emptySignature_qSkU0() {
    byte[] signature = new byte[0];
    int length = 0;
    assertFalse(CpioArchiveInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_invalidSignature_UOTL1() {
    byte[] signature = new byte[] { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
    int length = 6;
    assertFalse(CpioArchiveInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_validSignature_differentOrder_2_ftGL4() {
    byte[] signature = new byte[] { 0x30, 0x37, 0x30, 0x37, 0x30, 0x37 };
    int length = 6;
    assertTrue(CpioArchiveInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextEntryWithValidDataAndBlockSize_iFJM5() throws IOException {
    byte[] data = new byte[1024];
    data[0] = (byte) 0x30;
    data[1] = (byte) 0x31;
    data[2] = (byte) 0x32;
    data[3] = (byte) 0x33;
    data[4] = (byte) 0x34;
    data[5] = (byte) 0x35;
    data[6] = (byte) 0x36;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_validSignature_differentOrder_vbEK3_iCCl0() {
    byte[] signature = new byte[] { (byte) 0xc7, (byte) 0x71, (byte) 0x37, (byte) 0x30, (byte) 0x37, (byte) 0x30 };
    int length = 6;
    assertTrue(CpioArchiveInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_validSignature_differentOrder_3_bswy5_fid1() {
    byte[] signature = new byte[] { 0x37, 0x30, 0x37, 0x30, 0x37, 0x30 };
    int length = 6;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_validSignature_differentOrder_4_AojW6_fid1() {
    byte[] signature = new byte[] { 0x30, 0x37, 0x37, 0x30, 0x37, 0x30 };
    int length = 6;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_validSignature_differentOrder_6_bmvq8_fid1() {
    byte[] signature = new byte[] { 0x30, 0x37, 0x37, 0x30, 0x37, 0x30 };
    int length = 6;
    assertFalse(CpioArchiveInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_validSignature_differentOrder_7_zboN9_fid1() {
    byte[] signature = new byte[] { 0x37, 0x30, 0x37, 0x30, 0x37, 0x30 };
    int length = 6;
    assertFalse(CpioArchiveInputStream.matches(signature, length));
}
}