/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;
import java.security.SecureRandom;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Random;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_B64_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomSalt_yRXn0() {
        SecureRandom random = new SecureRandom();
        String result = B64.getRandomSalt(10, random);
        assert result != null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomSalt_bJHM0() {
        Random random = new Random();
        String result = B64.getRandomSalt(10, random);
        System.out.println("result = " + result);
        assert result.length() == 10;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomSalt2_iooG1() {
        Random random = new Random();
        String result = B64.getRandomSalt(5, random);
        System.out.println("result = " + result);
        assert result.length() == 5;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testB64from24bit_euct0() {
        StringBuilder buffer = new StringBuilder();
        B64.b64from24bit((byte) 0x12, (byte) 0x34, (byte) 0x56, 6, buffer);
        assertEquals("KFX2..", buffer.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testB64from24bit2_XHOB1() {
        StringBuilder buffer = new StringBuilder();
        B64.b64from24bit((byte) 0x78, (byte) 0x9a, (byte) 0xbc, 5, buffer);
        assertEquals("we7S.", buffer.toString());
    }
}