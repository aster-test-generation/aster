/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipLong_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_oGde3() {
    assertEquals(50331648, ZipLong.getValue(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_intValue_wuUa1() {
    ZipLong zipLong = new ZipLong(123456789);
    byte[] result = zipLong.getBytes();
    assertArrayEquals(new byte[]{(byte) 0x49, (byte) 0x96, (byte) 0x02, (byte) 0xd2}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_byteArrayOffset_fIEp0() {
    ZipLong zipLong = new ZipLong(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 1);
    assertEquals(0, zipLong.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_byteArray_VCbs3() {
    ZipLong zipLong = new ZipLong(new byte[]{1, 2, 3});
    assertEquals(zipLong.getValue(new byte[]{1, 2, 3}), zipLong.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIntValue_LongValue_llxj2() {
    ZipLong zipLong = new ZipLong(2112454933123456789L);
    assertEquals(2112454933, zipLong.getIntValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLong_byteArray_int_uVRS0() {
    ZipLong zipLong = new ZipLong(new byte[] {1, 2, 3, 4,0, 6, 7, 8});
    byte[] buf = new byte[8];
    int offset = 0;
    zipLong.putLong(buf, offset);
    assertArrayEquals(new byte[] {1, 2, 3, 4,0, 6, 7, 8}, buf);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes3_GNuc2() {
    byte[] result = ZipLong.getBytes(Long.MAX_VALUE);
    assertArrayEquals(new byte[] {(byte) 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes4_VPSE3() {
    byte[] result = ZipLong.getBytes(Long.MIN_VALUE);
    assertArrayEquals(new byte[] {(byte) 0x80, (byte) 0x00, (byte) 0x00, (byte) 0x00}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes5_boWP4() {
    byte[] result = ZipLong.getBytes(123456789L);
    assertArrayEquals(new byte[] {0, 0, 0, 73, 101, 54, 57}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes6_OOjM5() {
    byte[] result = ZipLong.getBytes(-123456789L);
    assertArrayEquals(new byte[] {(byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0x33}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue1_Cshj0() {
    byte[] bytes = new byte[8];
    bytes[0] = (byte) 0x12;
    bytes[1] = (byte) 0x34;
    bytes[2] = (byte) 0x56;
    bytes[3] = (byte) 0x78;
    bytes[4] = (byte) 0x90;
    bytes[5] = (byte) 0xAB;
    bytes[6] = (byte) 0xCD;
    bytes[7] = (byte) 0xEF;
    assertEquals(0x1234567890ABCDEFL, ZipLong.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes8_iube7_azBr0() {
    byte[] result = ZipLong.getBytes(-2147483648L);
    assertArrayEquals(new byte[] {(byte)128, (byte)0, (byte)0, (byte)0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArrayOffset_fglv0() {
    ZipLong zipLong = new ZipLong(new byte[]{1, 2, 3}, 0);
    assertEquals(0, zipLong.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_oGde3_fid2() {
    ZipLong zipLong = new ZipLong(new byte[]{1, 2, 3});
    assertEquals(0, zipLong.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_byteArrayOffset_WDrC0_fid2() {
    ZipLong zipLong = new ZipLong(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 0);
    byte[] result = zipLong.getBytes();
    assertArrayEquals(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_intValue_wuUa1_fid2() {
    ZipLong zipLong = new ZipLong(123456789);
    byte[] result = zipLong.getBytes();
    assertArrayEquals(new byte[]{(byte) 0x7, (byte) 0x91, (byte) 0x78, (byte) 0x56, (byte) 0x34, (byte) 0x12}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_longValue_XvxJ2_fid2() {
    ZipLong zipLong = new ZipLong(123456789012345678L);
    byte[] result = zipLong.getBytes();
    assertArrayEquals(new byte[]{(byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90, (byte) 0x12, (byte) 0x34, (byte) 0x56}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_byteArray_iQCa3_fid2() {
    ZipLong zipLong = new ZipLong(new byte[]{1, 2, 3, 4, 5, 6, 7, 8});
    byte[] result = zipLong.getBytes();
    assertArrayEquals(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_byteArrayOffset_fIEp0_fid2() {
    ZipLong zipLong = new ZipLong(new byte[]{1, 2, 3}, 1);
    assertEquals(1, zipLong.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_byteArray_VCbs3_fid2() {
    ZipLong zipLong = new ZipLong(new byte[]{1, 2, 3});
    assertEquals(1, zipLong.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIntValue_LongValue_llxj2_fid2() {
    ZipLong zipLong = new ZipLong(1234567890123456789L);
    assertEquals(1234567890, zipLong.getIntValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLong_byteArray_int_uVRS0_fid2() {
    ZipLong zipLong = new ZipLong(new byte[] {1, 2, 3, 4, 5, 6, 7, 8});
    byte[] buf = new byte[8];
    int offset = 0;
    zipLong.putLong(buf, offset);
    assertArrayEquals(new byte[] {1, 2, 3, 4, 5, 6, 7, 8}, buf);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_egpg0_fid2() {
    byte[] bytes = new byte[8];
    bytes[0] = (byte) 0x12;
    bytes[1] = (byte) 0x34;
    bytes[2] = (byte) 0x56;
    bytes[3] = (byte) 0x78;
    long result = ZipLong.getValue(bytes, 0);
    assertEquals(0x12345678L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes1_djUa0_fid2() {
    byte[] result = ZipLong.getBytes(0L);
    assertArrayEquals(new byte[] {0, 0, 0, 0, 0, 0, 0, 0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes2_xxXZ1_fid2() {
    byte[] result = ZipLong.getBytes(1L);
    assertArrayEquals(new byte[] {0, 0, 0, 0, 0, 0, 0, 1}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes3_GNuc2_fid2() {
    byte[] result = ZipLong.getBytes(Long.MAX_VALUE);
    assertArrayEquals(new byte[] {-1, -1, -1, -1, -1, -1, -1, -1}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes4_VPSE3_fid2() {
    byte[] result = ZipLong.getBytes(Long.MIN_VALUE);
    assertArrayEquals(new byte[] {0, 0, 0, 0, 0, 0, 0, 0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes5_boWP4_fid2() {
    byte[] result = ZipLong.getBytes(123456789L);
    assertArrayEquals(new byte[] {0, 0, 0, 0, 0, 72, 54, 57}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes6_OOjM5_fid2() {
    byte[] result = ZipLong.getBytes(-123456789L);
    assertArrayEquals(new byte[] {-1, -1, -1, -1, -1, 88, 101, 99}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes7_KuGb6_fid2() {
    byte[] result = ZipLong.getBytes(2147483647L);
    assertArrayEquals(new byte[] {-1, -1, -1, -1, -1, -1, -1, 127}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes9_gcZF8_fid2() {
    byte[] result = ZipLong.getBytes(4294967295L);
    assertArrayEquals(new byte[] {-1, -1, -1, -1, -1, -1, -1, -1}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes10_ylVE9_fid2() {
    byte[] result = ZipLong.getBytes(-4294967296L);
    assertArrayEquals(new byte[] {0, 0, 0, 0, 0, 0, 0, 0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue2_lcwR1_fid2() {
    byte[] bytes = new byte[4];
    bytes[0] = (byte) 0x12;
    bytes[1] = (byte) 0x34;
    bytes[2] = (byte) 0x56;
    bytes[3] = (byte) 0x78;
    assertEquals(0x12345678L, ZipLong.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue4_qpCa3_fid2() {
    byte[] bytes = new byte[8];
    bytes[0] = (byte) 0x7F;
    bytes[1] = (byte) 0xFF;
    bytes[2] = (byte) 0xFF;
    bytes[3] = (byte) 0xFF;
    bytes[4] = (byte) 0xFF;
    bytes[5] = (byte) 0xFF;
    bytes[6] = (byte) 0xFF;
    bytes[7] = (byte) 0xFF;
    assertEquals(Long.MAX_VALUE, ZipLong.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue5_kLcL4_fid2() {
    byte[] bytes = new byte[8];
    bytes[0] = (byte) 0x80;
    bytes[1] = (byte) 0x00;
    bytes[2] = (byte) 0x00;
    bytes[3] = (byte) 0x00;
    bytes[4] = (byte) 0x00;
    bytes[5] = (byte) 0x00;
    bytes[6] = (byte) 0x00;
    bytes[7] = (byte) 0x00;
    assertEquals(Long.MIN_VALUE, ZipLong.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIntValue_ByteOffset_bZEy0_dRdP0_fid3() {
    ZipLong zipLong = new ZipLong(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 0);
    assertEquals(0x0102030407080808L, zipLong.getValue(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes8_iube7_azBr0_fid3() {
    byte[] result = ZipLong.getBytes(-2147483648L);
    assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)128}, result);
}
}