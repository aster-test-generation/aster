/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.cpio;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CpioUtil_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFileType_S_IFMT_eROw7() {
    long mode = CpioConstants.S_IFMT;
    long fileType = CpioUtil.fileType(mode);
    assertEquals(CpioConstants.S_IFMT, fileType);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testByteArray2long_evenLength_bOrr0_fid2() {
    byte[] number = new byte[] {0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08};
    boolean swapHalfWord = false;
    long expected = 0x0102030405060708L;
    long actual = CpioUtil.byteArray2long(number, swapHalfWord);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testByteArray2long_null_Jdkd3_fid2() {
    byte[] number = null;
    boolean swapHalfWord = false;
    long expected = 0L;
    long actual = 0L;
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLong2ByteArray_3_JVgY2_fid2() {
    long number = 1234567890L;
    int length = 4;
    boolean swapHalfWord = false;
    byte[] expected = new byte[] { 0x12, 0x34, 0x56, 0x78 };
    byte[] actual = CpioUtil.long2byteArray(number, length, swapHalfWord);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLong2ByteArray_4_ygwj3_fid2() {
    long number = 1234567890L;
    int length = 4;
    boolean swapHalfWord = true;
    byte[] expected = new byte[] { 0x78, 0x56, 0x34, 0x12 };
    byte[] actual = CpioUtil.long2byteArray(number, length, swapHalfWord);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLong2ByteArray_6_UJRS5_fid2() {
    long number = 1234567890L;
    int length = 2;
    boolean swapHalfWord = true;
    byte[] expected = new byte[] { 0x34, 0x12 };
    byte[] actual = CpioUtil.long2byteArray(number, length, swapHalfWord);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLong2ByteArray_2_SQxW1_dXfa0_fid2() {
    long number = 1234567890L;
    int length = 8;
    boolean swapHalfWord = true;
    byte[] expected = new byte[] { (byte) 0x90, (byte) 0x78, (byte) 0x56, (byte) 0x34, (byte) 0x12 };
    byte[] actual = CpioUtil.long2byteArray(number, length, swapHalfWord);
}
}