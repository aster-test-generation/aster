/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.CodecPolicy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Base64_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytes_bitLengthNotMultipleOf8_qdMo0() {
        BigInteger bigInt = new BigInteger("1234567890");
        int lineLength = 8;
        byte[] lineSeparator = new byte[]{10};
        boolean urlSafe = false;
        CodecPolicy decodingPolicy = CodecPolicy.STRICT;
        Base64 base64 = new Base64(lineLength, lineSeparator, urlSafe, decodingPolicy);
        byte[] result = Base64.toIntegerBytes(bigInt);
        assertEquals(bigInt.bitLength() / 8 + 1, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_xJLC0_1() {
        Base64 base64 = new Base64();
        byte[] decodeTable = new byte[256];
        for (int i = 0; i < 256; i++) {
            decodeTable[i] = (byte) i;
        }
        assertFalse(base64.isInAlphabet((byte) 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_xJLC0_2() {
        Base64 base64 = new Base64();
        byte[] decodeTable = new byte[256];
        for (int i = 0; i < 256; i++) {
            decodeTable[i] = (byte) i;
        }
        assertFalse(base64.isInAlphabet((byte) 255));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_xJLC0_3() {
        Base64 base64 = new Base64();
        byte[] decodeTable = new byte[256];
        for (int i = 0; i < 256; i++) {
            decodeTable[i] = (byte) i;
        }
        assertFalse(base64.isInAlphabet((byte) -1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_xJLC0_4() {
        Base64 base64 = new Base64();
        byte[] decodeTable = new byte[256];
        for (int i = 0; i < 256; i++) {
            decodeTable[i] = (byte) i;
        }
        assertFalse(base64.isInAlphabet((byte) 256));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_xJLC0_5() {
        Base64 base64 = new Base64();
        byte[] decodeTable = new byte[256];
        for (int i = 0; i < 256; i++) {
            decodeTable[i] = (byte) i;
        }
        assertFalse(base64.isInAlphabet((byte) -128));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultBufferSize_rBYN0() {
        Base64 base64 = new Base64();
        int defaultBufferSize = base64.getDefaultBufferSize();
        assertEquals(8192, defaultBufferSize);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_octetInRange_tPjK1() {
        byte octet = 0;
        assertFalse(Base64.isBase64(octet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_octetOutOfRange_uUME2() {
        byte octet = -1;
        assertFalse(Base64.isBase64(octet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_decodeTableIndexOutOfRange_FPGo3() {
        byte octet = 100;
        assertTrue(Base64.isBase64(octet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncodedLength1_ISMn0() {
        Base64 base64 = new Base64(10, new byte[]{10, 20, 30}, true);
        byte[] pArray = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long expected = 22;
        long actual = base64.getEncodedLength(pArray);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncodedLength2_briE1() {
        Base64 base64 = new Base64(10, new byte[]{10, 20, 30}, true);
        byte[] pArray = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        long expected = 22;
        long actual = base64.getEncodedLength(pArray);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncodedLength3_gxRO2() {
        Base64 base64 = new Base64(10, new byte[]{10, 20, 30}, true);
        byte[] pArray = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        long expected = 22;
        long actual = base64.getEncodedLength(pArray);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncodedLength4_Lizs3() {
        Base64 base64 = new Base64(10, new byte[]{10, 20, 30}, true);
        byte[] pArray = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        long expected = 29;
        long actual = base64.getEncodedLength(pArray);
        assertEquals(expected, actual);
    }
}