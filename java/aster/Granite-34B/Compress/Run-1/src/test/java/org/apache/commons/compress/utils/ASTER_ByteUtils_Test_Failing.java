/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ByteUtils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void fromLittleEndianTest1_QMXK1_VZDt0() throws IOException {
    byte[] bytes = {0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08};
    long result =ByteUtils.fromLittleEndian(bytes);
    assertEquals(0x0102030405060708L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromLittleEndian_XjVl1_tChU0_1() throws IOException {
    byte[] bytes = {0x12, 0x34, 0x56, 0x78};
    long result =ByteUtils.fromLittleEndian(bytes);
    bytes = new byte[8];
    for (int i = 0; i < 8; i++) {
        bytes[i] = (byte) i;
    }
    result =ByteUtils.fromLittleEndian(bytes);
    bytes = new byte[2];
    for (int i = 0; i < 2; i++) {
        bytes[i] = (byte) i;
    }
    result =ByteUtils.fromLittleEndian(bytes);
    assertEquals(0x78563412, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromLittleEndian_XjVl1_tChU0_2() throws IOException {
    byte[] bytes = {0x12, 0x34, 0x56, 0x78};
    long result =ByteUtils.fromLittleEndian(bytes);
    bytes = new byte[8];
    for (int i = 0; i < 8; i++) {
        bytes[i] = (byte) i;
    }
    result =ByteUtils.fromLittleEndian(bytes);
    bytes = new byte[2];
    for (int i = 0; i < 2; i++) {
        bytes[i] = (byte) i;
    }
    result =ByteUtils.fromLittleEndian(bytes);
    assertEquals(0x7856341207060504L, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFromLittleEndian_bABu0() {
		byte[] bytes = {0, 0, 0, 0, 0, 0, 0, 1};
		assertEquals(1,ByteUtils.fromLittleEndian(bytes));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFromLittleEndian2_wRJM1_fid2() {
		byte[] bytes = {0, 0, 0, 0, 0, 0, 1, 0};
		assertEquals(256,ByteUtils.fromLittleEndian(bytes));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFromLittleEndian3_HdtV2_fid2() {
		byte[] bytes = {0, 0, 0, 0, 1, 0, 0, 0};
		assertEquals(16777216,ByteUtils.fromLittleEndian(bytes));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFromLittleEndian4_ytlN3_fid2() {
		byte[] bytes = {0, 0, 0, 1, 0, 0, 0, 0};
		assertEquals(167772160,ByteUtils.fromLittleEndian(bytes));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFromLittleEndian5_Vinb4_fid2() {
		byte[] bytes = {0, 0, 1, 0, 0, 0, 0, 0};
		assertEquals(1677721600,ByteUtils.fromLittleEndian(bytes));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFromLittleEndian6_qumv5_fid2() {
		byte[] bytes = {0, 1, 0, 0, 0, 0, 0, 0};
		assertEquals(16777216000L,ByteUtils.fromLittleEndian(bytes));
	}
}