/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ByteUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromLittleEndian_GvDB0() {
    byte[] bytes = new byte[] { 0x12, 0x34, 0x56, 0x78 };
    long result = ByteUtils.fromLittleEndian(bytes, 0, 4);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromLittleEndian_withOffset_KTvl1() {
    byte[] bytes = new byte[] { 0x00, 0x12, 0x34, 0x56, 0x78 };
    long result = ByteUtils.fromLittleEndian(bytes, 1, 4);
    assertEquals(2018915346L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToLittleEndian_CIDa0() {
    byte[] b = new byte[8];
    ByteUtils.toLittleEndian(b, 0x1234567890abcdefL, 0, 8);
    assertArrayEquals(new byte[]{(byte) 0xef, (byte) 0xcd, (byte) 0xab, (byte) 0x90, (byte) 0x78, (byte) 0x56, (byte) 0x34, (byte) 0x12}, b);
}
}