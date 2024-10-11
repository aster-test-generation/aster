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
public class Aster_ZipShort_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_qogA0() {
    ZipShort zipShort = new ZipShort(new byte[] { 0x01, 0x02 }, 0);
    assertTrue(zipShort.equals(zipShort));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObject_lHdu1() {
    ZipShort zipShort1 = new ZipShort(new byte[] { 0x01, 0x02 }, 0);
    ZipShort zipShort2 = new ZipShort(new byte[] { 0x03, 0x04 }, 0);
    assertFalse(zipShort1.equals(zipShort2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_Null_ZTlE2() {
    ZipShort zipShort = new ZipShort(new byte[] { 0x01, 0x02 }, 0);
    assertFalse(zipShort.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutShort_LittleEndian_DeHy0() {
    byte[] buf = new byte[2];
    int value = 0x1234;
    int offset = 0;
    ZipShort.putShort(value, buf, offset);
    assertArrayEquals(new byte[] {0x34, 0x12}, buf);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutShort_BigEndian_lqPA1() {
    byte[] buf = new byte[2];
    int value = 0x1234;
    int offset = 0;
    ZipShort.putShort(value, buf, offset);
    assertArrayEquals(new byte[] {0x12, 0x34}, buf);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutShort_InvalidOffset_YAwI2() {
    byte[] buf = new byte[2];
    int value = 0x1234;
    int offset = 1;
    try {
        ZipShort.putShort(value, buf, offset);
        fail("Expected IndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithByteArrayAndOffset_cjsX0() {
    byte[] bytes = new byte[] { 0x01, 0x02 };
    int offset = 0;
    ZipShort zipShort = new ZipShort(bytes, offset);
    String expected = "ZipShort value: 258";
    String actual = zipShort.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithIntValue_NXuM1() {
    int value = 258;
    ZipShort zipShort = new ZipShort(value);
    String expected = "ZipShort value: 258";
    String actual = zipShort.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithByteArray_laUi2() {
    byte[] bytes = new byte[] { 0x01, 0x02 };
    ZipShort zipShort = new ZipShort(bytes);
    String expected = "ZipShort value: 258";
    String actual = zipShort.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue1_jVNH0() {
    byte[] bytes = {0x01, 0x02};
    int offset = 0;
    ZipShort zipShort = new ZipShort(bytes, offset);
    assertEquals(0x0102, zipShort.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue2_meHS1() {
    int value = 0x0102;
    ZipShort zipShort = new ZipShort(value);
    assertEquals(0x0102, zipShort.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue3_syRC2() {
    byte[] bytes = {0x01, 0x02};
    ZipShort zipShort = new ZipShort(bytes);
    assertEquals(0x0102, zipShort.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes1_UUoP0() {
    ZipShort zipShort = new ZipShort(new byte[] { 0x01, 0x02 }, 0);
    byte[] result = zipShort.getBytes();
    assertArrayEquals(new byte[] { 0x01, 0x02 }, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes2_MhUY1() {
    ZipShort zipShort = new ZipShort(new byte[] { 0x03, 0x04 }, 1);
    byte[] result = zipShort.getBytes();
    assertArrayEquals(new byte[] { 0x03, 0x04 }, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes3_dwSy2() {
    ZipShort zipShort = new ZipShort(new byte[] { 0x05, 0x06 }, 2);
    byte[] result = zipShort.getBytes();
    assertArrayEquals(new byte[] { 0x05, 0x06 }, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_1_euus0() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 0;
    int expected = 0x0102;
    int actual = ZipShort.getValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_2_FGMc1() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 1;
    int expected = 0x0203;
    int actual = ZipShort.getValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_3_McBL2() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 2;
    int expected = 0x0304;
    int actual = ZipShort.getValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_4_Plqu3() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 3;
    int expected = 0x0405;
    int actual = ZipShort.getValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_5_NXgj4() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 4;
    int expected = 0x0506;
    int actual = ZipShort.getValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_6_raHC5() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 5;
    int expected = 0x0607;
    int actual = ZipShort.getValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_7_KDPj6() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 6;
    int expected = 0x0708;
    int actual = ZipShort.getValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_8_PjzY7() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 7;
    int expected = 0x0809;
    int actual = ZipShort.getValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_9_WNGE8() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 8;
    int expected = 0x090A;
    int actual = ZipShort.getValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_10_eHNd9() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 9;
    int expected = 0x0A0B;
    int actual = ZipShort.getValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_1_oceZ0() {
    byte[] bytes = new byte[2];
    int offset = 0;
    ZipShort zipShort = new ZipShort(bytes, offset);
    int expected = 0;
    int actual = zipShort.hashCode();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_2_QVcC1() {
    int value = 10;
    ZipShort zipShort = new ZipShort(value);
    int expected = 10;
    int actual = zipShort.hashCode();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_3_YhTj2() {
    byte[] bytes = new byte[2];
    ZipShort zipShort = new ZipShort(bytes);
    int expected = 0;
    int actual = zipShort.hashCode();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClone_jmuU0() {
    ZipShort zipShort = new ZipShort(new byte[] { 1, 2, 3, 4 }, 0);
    ZipShort clone = (ZipShort) zipShort.clone();
    assertEquals(zipShort, clone);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloneWithDifferentOffset_iofJ1() {
    ZipShort zipShort = new ZipShort(new byte[] { 1, 2, 3, 4 }, 2);
    ZipShort clone = (ZipShort) zipShort.clone();
    assertEquals(zipShort, clone);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloneWithDifferentValue_alqY2() {
    ZipShort zipShort = new ZipShort(100);
    ZipShort clone = (ZipShort) zipShort.clone();
    assertEquals(zipShort, clone);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloneWithDifferentBytes_VSMU3() {
    ZipShort zipShort = new ZipShort(new byte[] { 1, 2, 3, 4 });
    ZipShort clone = (ZipShort) zipShort.clone();
    assertEquals(zipShort, clone);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloneWithNullBytes_INEQ4() {
    ZipShort zipShort = new ZipShort(null);
    ZipShort clone = (ZipShort) zipShort.clone();
    assertEquals(zipShort, clone);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloneWithNegativeOffset_oREi5() {
    ZipShort zipShort = new ZipShort(new byte[] { 1, 2, 3, 4 }, -1);
    ZipShort clone = (ZipShort) zipShort.clone();
    assertEquals(zipShort, clone);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloneWithOffsetGreaterThanBytesLength_tuuT6() {
    ZipShort zipShort = new ZipShort(new byte[] { 1, 2, 3, 4 }, 5);
    ZipShort clone = (ZipShort) zipShort.clone();
    assertEquals(zipShort, clone);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloneWithNegativeValue_Metw7() {
    ZipShort zipShort = new ZipShort(-100);
    ZipShort clone = (ZipShort) zipShort.clone();
    assertEquals(zipShort, clone);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloneWithInvalidValue_SWHB9() {
    ZipShort zipShort = new ZipShort(1000000);
    ZipShort clone = (ZipShort) zipShort.clone();
    assertEquals(zipShort, clone);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloneWithInvalidBytes_CFGH10() {
    ZipShort zipShort = new ZipShort(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
    ZipShort clone = (ZipShort) zipShort.clone();
    assertEquals(zipShort, clone);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloneWithInvalidOffset_LXlf11() {
    ZipShort zipShort = new ZipShort(new byte[] { 1, 2, 3, 4 }, -10);
    ZipShort clone = (ZipShort) zipShort.clone();
    assertEquals(zipShort, clone);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_int_Dqkm0_YdoB0() {
    int value = 1234;
    byte[] expected = {(byte) 0x04, (byte) 0xD2};
    byte[] actual = ZipShort.getBytes(value);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_byteArray_jtJn2_QwnF0_1() {
    byte[] bytes = {(byte) 0x04, (byte) 0xD2};
    byte[] expected = {(byte) 0x04, (byte) 0xD2};
    int actual = ZipShort.getValue(bytes, 0);
    assertEquals(expected[0], actual);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_byteArray_jtJn2_QwnF0_2() {
    byte[] bytes = {(byte) 0x04, (byte) 0xD2};
    byte[] expected = {(byte) 0x04, (byte) 0xD2};
    int actual = ZipShort.getValue(bytes, 0);
    assertEquals(expected[1], actual);}
}