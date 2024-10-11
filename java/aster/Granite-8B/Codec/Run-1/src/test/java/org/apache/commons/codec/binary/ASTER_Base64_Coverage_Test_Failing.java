/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Base64_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytes1_PVCA0() {
        BigInteger bigInt = new BigInteger("12345678901234567890");
        byte[] expected = new byte[]{52, 48, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48};
        byte[] actual = Base64.toIntegerBytes(bigInt);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytes2_sGbf1() {
        BigInteger bigInt = new BigInteger("123456789012345678901234567890");
        byte[] expected = new byte[]{52, 48, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48};
        byte[] actual = Base64.toIntegerBytes(bigInt);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_rUNb0() {
        byte[] arrayOctet = new byte[10];
        for (int i = 0; i < arrayOctet.length; i++) {
            arrayOctet[i] = (byte) (Math.random() * 256);
            if (!Base64.isBase64(arrayOctet[i]) && !Character.isWhitespace(arrayOctet[i])) {
                Assertions.assertFalse(Base64.isBase64(arrayOctet));
            }
        }
        Assertions.assertTrue(Base64.isBase64(arrayOctet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetEncodedLength_IAnQ0() {
        Base64 base64 = new Base64();
        byte[] pArray = new byte[10];
        long len = base64.getEncodedLength(pArray);
        assertEquals(13, len);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetEncodedLength2_EFRF1() {
        Base64 base64 = new Base64();
        byte[] pArray = new byte[100];
        long len = base64.getEncodedLength(pArray);
        assertEquals(132, len);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetEncodedLength3_YjNo2() {
        Base64 base64 = new Base64();
        byte[] pArray = new byte[1000];
        long len = base64.getEncodedLength(pArray);
        assertEquals(1332, len);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetEncodedLength4_LAFq3() {
        Base64 base64 = new Base64();
        byte[] pArray = new byte[10000];
        long len = base64.getEncodedLength(pArray);
        assertEquals(13332, len);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrictDecodingWithStrictDecodingPolicy_zmYR0() {
        Base64 base64 = new Base64();
        boolean result = base64.isStrictDecoding();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_rUNb0_2_fid3() {
        byte[] arrayOctet = new byte[10];
        for (int i = 0; i < arrayOctet.length; i++) {
            arrayOctet[i] = (byte) (Math.random() * 256);
            if (!Base64.isBase64(arrayOctet[i]) && !Character.isWhitespace(arrayOctet[i])) {
            }
        }
        Assertions.assertTrue(Base64.isBase64(arrayOctet));
    }
}