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
public void testEquals_SameObject_WUuj0() {
    ZipShort zipShort = new ZipShort(new byte[0]);
    assertTrue(zipShort.equals(zipShort));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_tAtK1() {
    Object obj = new Object();
    ZipShort zipShort = new ZipShort(new byte[0]);
    assertFalse(zipShort.equals(obj));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_withByteOffset_UlVw0() {
    ZipShort zipShort = new ZipShort(new byte[] {1, 2}, 0);
    assertEquals("ZipShort value: 0", zipShort.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_withByteArray_WARv2() {
    ZipShort zipShort = new ZipShort(new byte[] {1, 2});
    assertEquals("ZipShort value: 258", zipShort.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArrayOffset_LBTt0() {
    ZipShort zipShort = new ZipShort(new byte[] {1, 2}, 0);
    assertEquals(258, zipShort.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_DwNh2() {
    ZipShort zipShort = new ZipShort(new byte[] {1, 2});
    assertEquals(258, zipShort.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes1_DyGb0() {
    ZipShort zipShort = new ZipShort(new byte[0], 0);
    byte[] result = zipShort.getBytes();
    assertArrayEquals(new byte[] {0, 0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes2_lszs1() {
    ZipShort zipShort = new ZipShort(123);
    byte[] result = zipShort.getBytes();
    assertArrayEquals(new byte[] {35, 0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes3_fJtx2() {
    ZipShort zipShort = new ZipShort(new byte[0]);
    byte[] result = zipShort.getBytes();
    assertArrayEquals(new byte[] {0, 0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue1_AasU0() {
    byte[] bytes = new byte[] { 0x01, 0x02 };
    assertEquals(0x0102, ZipShort.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue2_kasS1() {
    byte[] bytes = new byte[] { 0x03, 0x04 };
    assertEquals(0x0304, ZipShort.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue3_Npwy2() {
    byte[] bytes = new byte[] { 0x05, 0x06 };
    assertEquals(0x0506, ZipShort.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue4_cTGV3() {
    byte[] bytes = new byte[] { 0x07, 0x08 };
    assertEquals(0x0708, ZipShort.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue5_GsLC4() {
    byte[] bytes = new byte[] { 0x09, 0x10 };
    assertEquals(0x0910, ZipShort.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue6_CfcB5() {
    byte[] bytes = new byte[] { 0x11, 0x12 };
    assertEquals(0x1112, ZipShort.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue7_ZDRk6() {
    byte[] bytes = new byte[] { 0x13, 0x14 };
    assertEquals(0x1314, ZipShort.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue8_CuKL7() {
    byte[] bytes = new byte[] { 0x15, 0x16 };
    assertEquals(0x1516, ZipShort.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue9_vaWa8() {
    byte[] bytes = new byte[] { 0x17, 0x18 };
    assertEquals(0x1718, ZipShort.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue10_Zulo9() {
    byte[] bytes = new byte[] { 0x19, 0x20 };
    assertEquals(0x1920, ZipShort.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_byteArrayOffset_PnsZ0() {
    ZipShort zipShort = new ZipShort(new byte[] {1, 2, 3}, 1);
    assertEquals(1, zipShort.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_byteArray_kaVY2() {
    ZipShort zipShort = new ZipShort(new byte[] {1, 2, 3});
    assertEquals(3, zipShort.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes2_TTij1() {
    byte[] result = ZipShort.getBytes(1);
    assertArrayEquals(new byte[] {0, 1}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes3_sMli2() {
    byte[] result = ZipShort.getBytes(256);
    assertArrayEquals(new byte[] {1, 0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes6_gkaT5() {
    byte[] result = ZipShort.getBytes(-256);
    assertArrayEquals(new byte[] {(byte) 0xFF, 0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes7_Ffri6() {
    byte[] result = ZipShort.getBytes(Short.MAX_VALUE);
    assertArrayEquals(new byte[] {(byte) 0x7F, (byte) 0xFF}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes8_tZcX7() {
    byte[] result = ZipShort.getBytes(Short.MIN_VALUE);
    assertArrayEquals(new byte[] {(byte) 0x80, 0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes9_sUXa8() {
    byte[] result = ZipShort.getBytes(32767);
    assertArrayEquals(new byte[] {(byte) 0x7F, (byte) 0xFF}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes10_lEJQ9() {
    byte[] result = ZipShort.getBytes(-32768);
    assertArrayEquals(new byte[] {(byte) 0x80, 0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_VLQh0() {
    byte[] bytes = new byte[4];
    bytes[0] = (byte) 0x12;
    bytes[1] = (byte) 0x34;
    int result = ZipShort.getValue(bytes, 0);
    assertEquals(0x1234, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue() {
    byte[] bytes = new byte[2];
    bytes[0] = (byte) 0x01;
    bytes[1] = (byte) 0x02;
    assertEquals(258, ZipShort.getValue(bytes, 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue2_kasS1_fid1() {
    byte[] bytes = new byte[] { 0x03, 0x04 };
    assertEquals(772, ZipShort.getValue(bytes, 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue4_cTGV3_fid1() {
    byte[] bytes = new byte[] { 0x07, 0x08 };
    assertEquals(2056, ZipShort.getValue(bytes, 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue5_GsLC4_fid1() {
    byte[] bytes = new byte[] { 0x09, 0x10 };
    assertEquals(4109, ZipShort.getValue(bytes, 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue6_CfcB5_fid1() {
    byte[] bytes = new byte[] { (byte) 0xCf, (byte) 0xCB };
    assertEquals(5271, ZipShort.getValue(bytes, 0));
}
@Test
@Timeout(value =770, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_byteArrayOffset_PnsZ0_fid1() {
    ZipShort zipShort = new ZipShort(new byte[] {1, 2, 3},770);
    assertEquals(1, zipShort.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes2_TTij1_fid1() {
    byte[] result = ZipShort.getBytes(1);
    assertArrayEquals(new byte[] {1, 1}, result);
}
}