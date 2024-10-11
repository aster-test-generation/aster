/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Base64_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsArrayByteBase64_NfLU0() {
        byte[] arrayOctet = new byte[10];
        boolean result = Base64.isArrayByteBase64(arrayOctet);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBase64_lenTooBig_WdNt0() {
        byte[] binaryData = new byte[10];
        boolean isChunked = false;
        boolean urlSafe = false;
        int maxResultSize = 10;
        try {
            Base64.encodeBase64(binaryData, isChunked, urlSafe, maxResultSize);
            assertTrue(false);
        } catch (IllegalArgumentException e) {
            assertEquals("Input array too big, the output array would be bigger (16) than the specified maximum size of 10", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_validOctet_QCGh1() {
        byte octet = 0;
        assertFalse(Base64.isBase64(octet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_invalidOctet_nGhP2() {
        byte octet = -1;
        assertFalse(Base64.isBase64(octet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_OuEY0() {
        Base64 base64 = new Base64();
        byte octet = 0;
        assertFalse(base64.isInAlphabet(octet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithNegativeOctet_tWXn1() {
        Base64 base64 = new Base64();
        byte octet = -1;
        assertFalse(base64.isInAlphabet(octet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithOctetGreaterThanDecodeTableLength_kzni2() {
        Base64 base64 = new Base64();
        byte octet = 100;
        assertTrue(base64.isInAlphabet(octet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithOctetEqualToDecodeTableLength_wmfj3() {
        Base64 base64 = new Base64();
        byte octet = 64;
        assertFalse(base64.isInAlphabet(octet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithOctetEqualToDecodeTableLengthMinusOne_DITt4() {
        Base64 base64 = new Base64();
        byte octet = 63;
        assertFalse(base64.isInAlphabet(octet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithOctetEqualToDecodeTableLengthPlusOne_iPux5() {
        Base64 base64 = new Base64();
        byte octet = 65;
        assertTrue(base64.isInAlphabet(octet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_padDefault_VeVy0_URXG0() {
        byte octet = Base64.PAD_DEFAULT;
        assertTrue(Base64.isBase64(octet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithOctetEqualToDecodeTableLengthTimesThree_FYlt8_gzHt0() {
        Base64 base64 = new Base64();
        byte octet = (byte) 192;
        assertFalse(base64.isInAlphabet(octet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithOctetEqualToDecodeTableLengthTimesTwo_tLSC6_ChKS0() {
        Base64 base64 = new Base64();
        byte octet = (byte) 128;
        assertFalse(base64.isInAlphabet(octet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithOctetEqualToDecodeTableLengthTimesFive_ewnW12_cHoR0() {
        Base64 base64 = new Base64();
        byte octet = (byte) 320;
        assertFalse(base64.isInAlphabet(octet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithOctetEqualToDecodeTableLengthTimesFourPlusOne_yxMp11_tRER0() {
        Base64 base64 = new Base64();
        byte octet = (byte) 257;
        assertFalse(base64.isInAlphabet(octet));
    }
}