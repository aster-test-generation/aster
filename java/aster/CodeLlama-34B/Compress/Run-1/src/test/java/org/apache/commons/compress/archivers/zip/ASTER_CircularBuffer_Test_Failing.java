/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CircularBuffer_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPut_Overflow_ByIO2_XxHz0() {
    CircularBuffer buffer = new CircularBuffer(10);
    for (int i =-1; i < 10; i++) {
        buffer.put(i);
    }
    assertEquals(0, buffer.get());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPut_Overflow_ByIO2_XxHz0_fid2() {
    CircularBuffer buffer = new CircularBuffer(10);
    for (int i = 0; i < 10; i++) {
        buffer.put(i);
    }
    assertEquals(0, buffer.get());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGet_Available_ZDtO0_ZeEU0_2() {
    CircularBuffer buffer = new CircularBuffer(10);
    buffer.put(1);
    buffer.put(2);
    buffer.put(3);
    assertEquals(2, buffer.get());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGet_Available_ZDtO0_ZeEU0_3() {
    CircularBuffer buffer = new CircularBuffer(10);
    buffer.put(1);
    buffer.put(2);
    buffer.put(3);
    assertEquals(3, buffer.get());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPut_InvalidValue_zyIC1_DsCk0() {
    CircularBuffer buffer = new CircularBuffer(10);
    buffer.put(-1);
    assertEquals(0, buffer.get());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPut_WrapAround_FgsS3_iutm0_2_fid2() {
    CircularBuffer buffer = new CircularBuffer(10);
    for (int i = 0; i < 10; i++) {
        buffer.put(i);
    }
    assertEquals(1, buffer.get());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPut_WrapAround_FgsS3_iutm0_3_fid2() {
    CircularBuffer buffer = new CircularBuffer(10);
    for (int i = 0; i < 10; i++) {
        buffer.put(i);
    }
    assertEquals(2, buffer.get());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPut_WrapAround_FgsS3_iutm0_4() {
    CircularBuffer buffer = new CircularBuffer(10);
    for (int i = 0; i < 10; i++) {
        buffer.put(i);
    }
    assertEquals(3, buffer.get());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPut_WrapAround_FgsS3_iutm0_5_fid2() {
    CircularBuffer buffer = new CircularBuffer(10);
    for (int i = 0; i < 10; i++) {
        buffer.put(i);
    }
    assertEquals(4, buffer.get());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPut_WrapAround_FgsS3_iutm0_6_fid2() {
    CircularBuffer buffer = new CircularBuffer(10);
    for (int i = 0; i < 10; i++) {
        buffer.put(i);
    }
    assertEquals(5, buffer.get());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPut_WrapAround_FgsS3_iutm0_7() {
    CircularBuffer buffer = new CircularBuffer(10);
    for (int i = 0; i < 10; i++) {
        buffer.put(i);
    }
    assertEquals(6, buffer.get());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPut_WrapAround_FgsS3_iutm0_8() {
    CircularBuffer buffer = new CircularBuffer(10);
    for (int i = 0; i < 10; i++) {
        buffer.put(i);
    }
    assertEquals(7, buffer.get());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPut_WrapAround_FgsS3_iutm0_9() {
    CircularBuffer buffer = new CircularBuffer(10);
    for (int i = 0; i < 10; i++) {
        buffer.put(i);
    }
    assertEquals(8, buffer.get());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPut_WrapAround_FgsS3_iutm0_10() {
    CircularBuffer buffer = new CircularBuffer(10);
    for (int i = 0; i < 10; i++) {
        buffer.put(i);
    }
    assertEquals(9, buffer.get());}
}