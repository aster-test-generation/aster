/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.bzip2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CRC_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueThrowsException_IjYr14_ZLVY0() {
    CRC crc = new CRC();
    try {
        int value = crc.getValue();
        fail("Expected exception not thrown");
    } catch (Exception e) {
        assertTrue(e instanceof IllegalArgumentException);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue2_MtAo1_fid1() {
    CRC crc = new CRC();
    int value = crc.getValue();
    assertEquals(1, value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue3_dZfi2_fid1() {
    CRC crc = new CRC();
    int value = crc.getValue();
    assertEquals(2, value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue4_GScf3() {
    CRC crc = new CRC();
    int value = crc.getValue();
    assertEquals(3, value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue5_qTHu4() {
    CRC crc = new CRC();
    int value = crc.getValue();
    assertEquals(4, value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue6_plDx5() {
    CRC crc = new CRC();
    int value = crc.getValue();
    assertEquals(5, value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue7_xUxI6_fid1() {
    CRC crc = new CRC();
    int value = crc.getValue();
    assertEquals(6, value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue8_YBeJ7() {
    CRC crc = new CRC();
    int value = crc.getValue();
    assertEquals(7, value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue9_Hurt8() {
    CRC crc = new CRC();
    int value = crc.getValue();
    assertEquals(8, value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue10_ngJY9_fid1() {
    CRC crc = new CRC();
    int value = crc.getValue();
    assertEquals(9, value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueCalledWithDifferentValue_jEek13_cnIU0_fid2() {
    CRC crc = new CRC();
    crc.update(1, 1);
    int value = crc.getValue();
    assertEquals(1, value);
}
}