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
public class Aster_ByteUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFromLittleEndian2_wRJM1() {
		byte[] bytes = {0, 0, 0, 0, 0, 0, 1, 0};
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFromLittleEndian3_HdtV2() {
		byte[] bytes = {0, 0, 0, 0, 1, 0, 0, 0};
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFromLittleEndian4_ytlN3() {
		byte[] bytes = {0, 0, 0, 1, 0, 0, 0, 0};
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFromLittleEndian5_Vinb4() {
		byte[] bytes = {0, 0, 1, 0, 0, 0, 0, 0};
		assertEquals(65536,ByteUtils.fromLittleEndian(bytes));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFromLittleEndian6_qumv5() {
		byte[] bytes = {0, 1, 0, 0, 0, 0, 0, 0};
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFromLittleEndian_XjVl1_tChU0_3() throws IOException {
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
    assertEquals(0x0100, result);}
}