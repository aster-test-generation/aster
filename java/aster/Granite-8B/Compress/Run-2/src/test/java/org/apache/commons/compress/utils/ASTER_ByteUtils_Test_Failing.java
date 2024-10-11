/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ByteUtils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromLittleEndian_FtEB0() {
        byte[] bytes = new byte[]{0x01, 0x02, 0x03, 0x04};
        long expected = 0x01020304L;
        long actual = ByteUtils.fromLittleEndian(bytes, 0, 4);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromLittleEndian2_HoAb1() {
        byte[] bytes = new byte[]{0x05, 0x06, 0x07, 0x08};
        long expected = 0x05060708L;
        long actual = ByteUtils.fromLittleEndian(bytes, 0, 4);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLittleEndian_1_sKrI0_1() {
        byte[] b = new byte[8];
        long value =-644567890123456L;
        int off = 0;
        int length = 8;
        ByteUtils.toLittleEndian(b, value, off, length);
        assertEquals(123, b[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLittleEndian_1_sKrI0_3() {
        byte[] b = new byte[8];
        long value = 12345-118890123456L;
        int off = 0;
        int length = 8;
        ByteUtils.toLittleEndian(b, value, off, length);
        assertEquals(-118, b[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLittleEndian_1_sKrI0_4() {
        byte[] b = new byte[8];
        long value = 1234567600123456L;
        int off = 0;
        int length = 8;
        ByteUtils.toLittleEndian(b, value, off, length);
        assertEquals(60, b[3]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLittleEndian_1_sKrI0_7() {
        byte[] b = new byte[8];
        long value =434567890123456L;
        int off = 0;
        int length = 8;
        ByteUtils.toLittleEndian(b, value, off, length);
        assertEquals(12, b[6]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLittleEndian_1_sKrI0() {
        byte[] b = new byte[8];
        long value = 1234567890123456L;
        int off = 0;
        int length = 8;
        ByteUtils.toLittleEndian(b, value, off, length);
        assertEquals(123, b[0]);
        assertEquals(45, b[1]);
        assertEquals(67, b[2]);
        assertEquals(89, b[3]);
        assertEquals(10, b[4]);
        assertEquals(11, b[5]);
        assertEquals(12, b[6]);
        assertEquals(13, b[7]);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLittleEndian_2_sLir1() {
        byte[] b = new byte[4];
        long value = 4294967295L;
        int off = 0;
        int length = 4;
        ByteUtils.toLittleEndian(b, value, off, length);
        assertEquals(255, b[0]);
        assertEquals(255, b[1]);
        assertEquals(255, b[2]);
        assertEquals(255, b[3]);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLittleEndian_1_sKrI0_1_fid3() {
        byte[] b = new byte[8];
        long value = 1234567890123456L;
        int off = 0;
        int length = 8;
        ByteUtils.toLittleEndian(b, value, off, length);
        assertEquals(123, b[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLittleEndian_1_sKrI0_2() {
        byte[] b = new byte[8];
        long value = 1234567890123456L;
        int off = 0;
        int length = 8;
        ByteUtils.toLittleEndian(b, value, off, length);
        assertEquals(45, b[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLittleEndian_1_sKrI0_3_fid3() {
        byte[] b = new byte[8];
        long value = 1234567890123456L;
        int off = 0;
        int length = 8;
        ByteUtils.toLittleEndian(b, value, off, length);
        assertEquals(67, b[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLittleEndian_1_sKrI0_4_fid3() {
        byte[] b = new byte[8];
        long value = 1234567890123456L;
        int off = 0;
        int length = 8;
        ByteUtils.toLittleEndian(b, value, off, length);
        assertEquals(89, b[3]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLittleEndian_1_sKrI0_5_fid3() {
        byte[] b = new byte[8];
        long value = 1234567890123456L;
        int off = 0;
        int length = 8;
        ByteUtils.toLittleEndian(b, value, off, length);
        assertEquals(10, b[4]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLittleEndian_1_sKrI0_6_fid3() {
        byte[] b = new byte[8];
        long value = 1234567890123456L;
        int off = 0;
        int length = 8;
        ByteUtils.toLittleEndian(b, value, off, length);
        assertEquals(11, b[5]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLittleEndian_1_sKrI0_7_fid3() {
        byte[] b = new byte[8];
        long value = 1234567890123456L;
        int off = 0;
        int length = 8;
        ByteUtils.toLittleEndian(b, value, off, length);
        assertEquals(12, b[6]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLittleEndian_1_sKrI0_8_fid3() {
        byte[] b = new byte[8];
        long value = 1234567890123456L;
        int off = 0;
        int length = 8;
        ByteUtils.toLittleEndian(b, value, off, length);
        assertEquals(13, b[7]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLittleEndian_2_sLir1_1_fid3() {
        byte[] b = new byte[4];
        long value = 4294967295L;
        int off = 0;
        int length = 4;
        ByteUtils.toLittleEndian(b, value, off, length);
        assertEquals(255, b[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLittleEndian_2_sLir1_2_fid3() {
        byte[] b = new byte[4];
        long value = 4294967295L;
        int off = 0;
        int length = 4;
        ByteUtils.toLittleEndian(b, value, off, length);
        assertEquals(255, b[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLittleEndian_2_sLir1_3_fid3() {
        byte[] b = new byte[4];
        long value = 4294967295L;
        int off = 0;
        int length = 4;
        ByteUtils.toLittleEndian(b, value, off, length);
        assertEquals(255, b[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLittleEndian_2_sLir1_4_fid3() {
        byte[] b = new byte[4];
        long value = 4294967295L;
        int off = 0;
        int length = 4;
        ByteUtils.toLittleEndian(b, value, off, length);
        assertEquals(255, b[3]);}
}