/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;
import java.security.SecureRandom;
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
    public void testGetRandomSalt_nMEL0_1() throws Exception {
        int num = 10;
        SecureRandom secureRandom = new SecureRandom();
        String salt = B64.getRandomSalt(num, secureRandom);
        for (int i = 0; i < num; i++) {
        }
        assertNotNull(salt);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomSalt_nMEL0_2() throws Exception {
        int num = 10;
        SecureRandom secureRandom = new SecureRandom();
        String salt = B64.getRandomSalt(num, secureRandom);
        for (int i = 0; i < num; i++) {
        }
        assertEquals(num, salt.length());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomSalt_1_eETw0() throws Exception {
    int num = 10;
    Random random = new Random();
    String salt = B64.getRandomSalt(num, random);
    assertEquals(num, salt.length());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testB64from24bit_1_WZau0() throws Exception {
    byte b2 = 0x01;
    byte b1 = 0x02;
    byte b0 = 0x03;
    int outLen = 4;
    StringBuilder buffer = new StringBuilder();
    B64.b64from24bit(b2, b1, b0, outLen, buffer);
    assertEquals("AQID", buffer.toString());
}
}