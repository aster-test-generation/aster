/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.cpio;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CpioArchiveInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches1_FHFI0() {
    byte[] signature = new byte[6];
    signature[0] = (byte) 0x71;
    signature[1] = (byte) 0xc7;
    int length = 6;
    boolean result = CpioArchiveInputStream.matches(signature, length);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches2_SBvL1() {
    byte[] signature = new byte[6];
    signature[1] = (byte) 0x71;
    signature[0] = (byte) 0xc7;
    int length = 6;
    boolean result = CpioArchiveInputStream.matches(signature, length);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches3_cVsu2() {
    byte[] signature = new byte[6];
    signature[0] = (byte) 0x71;
    signature[1] = (byte) 0xc7;
    int length = 5;
    boolean result = CpioArchiveInputStream.matches(signature, length);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches4_RriJ3() {
    byte[] signature = new byte[6];
    signature[1] = (byte) 0x71;
    signature[0] = (byte) 0xc7;
    int length = 5;
    boolean result = CpioArchiveInputStream.matches(signature, length);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches5_qKhS4() {
    byte[] signature = new byte[6];
    signature[0] = (byte) 0x30;
    signature[1] = (byte) 0x37;
    signature[2] = (byte) 0x30;
    signature[3] = (byte) 0x37;
    signature[4] = (byte) 0x30;
    signature[5] = (byte) 0x31;
    int length = 6;
    boolean result = CpioArchiveInputStream.matches(signature, length);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches6_sGvX5() {
    byte[] signature = new byte[6];
    signature[0] = (byte) 0x30;
    signature[1] = (byte) 0x37;
    signature[2] = (byte) 0x30;
    signature[3] = (byte) 0x37;
    signature[4] = (byte) 0x30;
    signature[5] = (byte) 0x32;
    int length = 6;
    boolean result = CpioArchiveInputStream.matches(signature, length);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches7_ITOC6() {
    byte[] signature = new byte[6];
    signature[0] = (byte) 0x30;
    signature[1] = (byte) 0x37;
    signature[2] = (byte) 0x30;
    signature[3] = (byte) 0x37;
    signature[4] = (byte) 0x30;
    signature[5] = (byte) 0x37;
    int length = 6;
    boolean result = CpioArchiveInputStream.matches(signature, length);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches8_lMFi7() {
    byte[] signature = new byte[6];
    signature[0] = (byte) 0x30;
    signature[1] = (byte) 0x37;
    signature[2] = (byte) 0x30;
    signature[3] = (byte) 0x37;
    signature[4] = (byte) 0x30;
    signature[5] = (byte) 0x33;
    int length = 6;
    boolean result = CpioArchiveInputStream.matches(signature, length);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextEntryWithNoInputStream_TuBJ1() throws Exception {
        CpioArchiveInputStream in = new CpioArchiveInputStream(null);
        CpioArchiveEntry entry = in.getNextEntry();
        assertNull(entry);
    }
}