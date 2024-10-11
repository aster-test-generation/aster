/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Blake3_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testKeyedHash_emptyKey_QEkf0() throws Exception {
    byte[] key = new byte[0];
    byte[] data = new byte[0];
    byte[] expected = new byte[0];
    byte[] actual = Blake3.keyedHash(key, data);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testKeyedHash_emptyData_Fydx1() throws Exception {
    byte[] key = new byte[1];
    byte[] data = new byte[0];
    byte[] expected = new byte[0];
    byte[] actual = Blake3.keyedHash(key, data);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testKeyedHash_nonEmptyKeyAndData_MXBu3() throws Exception {
    byte[] key = new byte[1];
    byte[] data = new byte[1];
    byte[] expected = new byte[1];
    byte[] actual = Blake3.keyedHash(key, data);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testKeyedHash_differentKeyAndData_ergi4() throws Exception {
    byte[] key = new byte[1];
    byte[] data = new byte[2];
    byte[] expected = new byte[2];
    byte[] actual = Blake3.keyedHash(key, data);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testKeyedHash_differentKeyAndData2_YJmm5() throws Exception {
    byte[] key = new byte[2];
    byte[] data = new byte[1];
    byte[] expected = new byte[2];
    byte[] actual = Blake3.keyedHash(key, data);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testKeyedHash_differentKeyAndData3_OKhY6() throws Exception {
    byte[] key = new byte[1];
    byte[] data = new byte[3];
    byte[] expected = new byte[3];
    byte[] actual = Blake3.keyedHash(key, data);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testKeyedHash_differentKeyAndData4_CdFq7() throws Exception {
    byte[] key = new byte[3];
    byte[] data = new byte[1];
    byte[] expected = new byte[3];
    byte[] actual = Blake3.keyedHash(key, data);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testKeyedHash_differentKeyAndData5_czGR8() throws Exception {
    byte[] key = new byte[2];
    byte[] data = new byte[2];
    byte[] expected = new byte[4];
    byte[] actual = Blake3.keyedHash(key, data);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testKeyedHash_differentKeyAndData6_pYEl9() throws Exception {
    byte[] key = new byte[3];
    byte[] data = new byte[3];
    byte[] expected = new byte[6];
    byte[] actual = Blake3.keyedHash(key, data);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testKeyedHash_differentKeyAndData7_Ewxe10() throws Exception {
    byte[] key = new byte[4];
    byte[] data = new byte[4];
    byte[] expected = new byte[8];
    byte[] actual = Blake3.keyedHash(key, data);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testKeyedHash_differentKeyAndData8_GBKK11() throws Exception {
    byte[] key = new byte[5];
    byte[] data = new byte[5];
    byte[] expected = new byte[10];
    byte[] actual = Blake3.keyedHash(key, data);
    assertArrayEquals(expected, actual);
}
}