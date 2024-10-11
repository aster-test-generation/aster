/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.Random;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_B64_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomSalt_KoFJ0() {
    Random random = new Random();
    String salt = B64.getRandomSalt(10, random);
    assertEquals(10, salt.length());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomSalt_Empty_eTly1() {
    Random random = new Random();
    String salt = B64.getRandomSalt(0, random);
    assertEquals("", salt);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomSalt_omAI0_1() {
    String result = B64.getRandomSalt(10);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomSalt_omAI0_2() {
    String result = B64.getRandomSalt(10);
    assertEquals(10, result.length());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testB64From24Bit1_Jlmo0() {
    B64 b64 = new B64();
    StringBuilder buffer = new StringBuilder();
    b64.b64from24bit((byte) 0x12, (byte) 0x34, (byte) 0x56, 4, buffer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testB64From24Bit2_gUhU1() {
    B64 b64 = new B64();
    StringBuilder buffer = new StringBuilder();
    b64.b64from24bit((byte) 0x78, (byte) 0x90, (byte) 0xAB, 4, buffer);
    assertEquals("f07S", buffer.toString());
}
}