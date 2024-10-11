/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipShort_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_lCuW0() {
    ZipShort zipShort = new ZipShort(new byte[0]);
    assertTrue(zipShort.equals(zipShort));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_tCyW1() {
    Object obj = new Object();
    ZipShort zipShort = new ZipShort(new byte[0]);
    assertFalse(zipShort.equals(obj));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_withByteArrayOffset_Rsrw0() {
    ZipShort zipShort = new ZipShort(new byte[] {1, 2}, 0);
    assertEquals("ZipShort value: 0", zipShort.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_withByteArray_sXAF2() {
    ZipShort zipShort = new ZipShort(new byte[] {1, 2});
    assertEquals("ZipShort value: 258", zipShort.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_withByteArrayOffset_fWgV0() {
    ZipShort zipShort = new ZipShort(new byte[] {1, 2}, 0);
    assertEquals(258, zipShort.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_withByteArray_hBEh2() {
    ZipShort zipShort = new ZipShort(new byte[] {1, 2});
    assertEquals(258, zipShort.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_withByteOffset_CzkL0() {
    ZipShort zipShort = new ZipShort(new byte[] {1, 2, 3}, 1);
    byte[] result = zipShort.getBytes();
    assertArrayEquals(new byte[] {2, 1}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_byteArrayOffset_nUwU0() {
    ZipShort zipShort = new ZipShort(new byte[] {1, 2}, 0);
    assertEquals(256, zipShort.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_byteArray_fgPp2() {
    ZipShort zipShort = new ZipShort(new byte[] {1, 2});
    assertEquals(258, zipShort.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue1_mgLh0() {
    byte[] bytes = new byte[] {0, 1};
    assertEquals(1, ZipShort.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue5_hkZG4() {
    byte[] bytes = new byte[] {0, (byte) 0x80};
    assertEquals(128, ZipShort.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue6_bKug5() {
    byte[] bytes = new byte[] {0, (byte) 0x7F};
    assertEquals(127, ZipShort.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue8_VRUB7() {
    byte[] bytes = new byte[] {(byte) 0x7F, (byte) 0x7F};
    assertEquals(16256, ZipShort.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue9_kgKL8() {
    byte[] bytes = new byte[] {(byte) 0x80, (byte) 0x7F};
    assertEquals(32512, ZipShort.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue10_toFp9() {
    byte[] bytes = new byte[] {(byte) 0x7F, (byte) 0x80};
    assertEquals(16256, ZipShort.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_TNRi0() {
    byte[] bytes = new byte[] {0x12, 0x34, 0x56, 0x78};
    int offset = 1;
    int result = ZipShort.getValue(bytes, offset);
    assertEquals(0x3456, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes2_EmGE1() {
    byte[] result = ZipShort.getBytes(1);
    assertArrayEquals(new byte[] {0, 1}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes3_Jcex2() {
    byte[] result = ZipShort.getBytes(256);
    assertArrayEquals(new byte[] {1, 0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes6_pvdL5() {
    byte[] result = ZipShort.getBytes(Short.MIN_VALUE);
    assertArrayEquals(new byte[] {(byte) 0x80, (byte) 0x00}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes7_NpPY6() {
    byte[] result = ZipShort.getBytes(Short.MAX_VALUE);
    assertArrayEquals(new byte[] {(byte) 0x7F, (byte) 0xFF}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes8_IXbN7() {
    byte[] result = ZipShort.getBytes(32767);
    assertArrayEquals(new byte[] {(byte) 0x7F, (byte) 0xFF}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes9_QKaX8() {
    byte[] result = ZipShort.getBytes(-32768);
    assertArrayEquals(new byte[] {(byte) 0x80, (byte) 0x00}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes10_GAEh9() {
    byte[] result = ZipShort.getBytes(128);
    assertArrayEquals(new byte[] {(byte) 0x00, (byte) 0x80}, result);
}
@Test
@Timeout(value =3, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_withByteOffset_CzkL0_fid1() {
    ZipShort zipShort = new ZipShort(new byte[] {1, 2, 3},3);
    byte[] result = zipShort.getBytes();
    assertArrayEquals(new byte[] {2,3}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes2_EmGE1_fid1() {
    byte[] result = ZipShort.getBytes(1);
    assertArrayEquals(new byte[] {1, 1}, result);
}
}