/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.CodecPolicy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Base64_Test_Passing {
    byte[] DECODE_TABLE = new byte[256];

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsUrlSafe_urlSafeTrue_UjSl0() {
        Base64 base64 = new Base64(true);
        assertTrue(base64.isUrlSafe());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsUrlSafe_urlSafeFalse_AObb1() {
        Base64 base64 = new Base64(false);
        assertFalse(base64.isUrlSafe());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsUrlSafe_urlSafeTrue_lineLength_QYwS2() {
        Base64 base64 = new Base64(10, new byte[0], true);
        assertTrue(base64.isUrlSafe());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsUrlSafe_urlSafeFalse_lineLength_qaJb3() {
        Base64 base64 = new Base64(10, new byte[0], false);
        assertFalse(base64.isUrlSafe());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsUrlSafe_urlSafeTrue_lineLength_decodingPolicy_GMIV4() {
        Base64 base64 = new Base64(10, new byte[0], true, CodecPolicy.STRICT);
        assertTrue(base64.isUrlSafe());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeBase64_1_UMgV0() {
        String base64String = "SGVsbG8gV29ybGQh";
        byte[] expected = "Hello World!".getBytes();
        byte[] actual = Base64.decodeBase64(base64String);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeBase64_8_Kflg7() {
        String base64String = "SGVsbG8gV29ybGQhIQ==";
        byte[] expected = "Hello World!".getBytes();
        byte[] actual = Base64.decodeBase64(base64String);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInteger1_QyBh0() {
        byte[] pArray = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BigInteger expected = new BigInteger("12345678910");
        BigInteger actual = Base64.decodeInteger(pArray);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBase64String1_VBUE0() {
        byte[] binaryData = new byte[0];
        String expected = "";
        String actual = Base64.encodeBase64String(binaryData);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBase64String2_tXsm1() {
        byte[] binaryData = new byte[]{1, 2, 3, 4, 5};
        String expected = "AQIDBAU=";
        String actual = Base64.encodeBase64String(binaryData);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBase64String3_HTiQ2() {
        byte[] binaryData = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String expected = "AQIDBAUGBwgJCg==";
        String actual = Base64.encodeBase64String(binaryData);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBase64String4_fEVW3() {
        byte[] binaryData = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        String expected = "AQIDBAUGFwgJCgsMDQ4PENvbnRlbnRQSwMECg==";
        String actual = Base64.encodeBase64String(binaryData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBase64String5_EArA4() {
        byte[] binaryData = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32};
        String expected = "AQIDBAUGFwgJCgsMDQ4PENvbnRlbnRQSwMECg==";
        String actual = Base64.encodeBase64String(binaryData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_IntConstructor_gndK1() {
        Base64 base64 = new Base64(10);
        byte[] lineSeparator = base64.getLineSeparator();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_IntByteArrayConstructor_jwTK2() {
        byte[] lineSeparator = new byte[]{10, 20, 30};
        Base64 base64 = new Base64(10, lineSeparator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_IntByteArrayBooleanConstructor_Gteq3() {
        byte[] lineSeparator = new byte[]{10, 20, 30};
        Base64 base64 = new Base64(10, lineSeparator, true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_BooleanConstructor_fwye4() {
        Base64 base64 = new Base64(true);
        byte[] lineSeparator = base64.getLineSeparator();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_IntConstructor_Negative_YJjX5() {
        Base64 base64 = new Base64(-10);
        byte[] lineSeparator = base64.getLineSeparator();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_IntByteArrayConstructor_Null_Yvef6() {
        Base64 base64 = new Base64(10, null);
        byte[] lineSeparator = base64.getLineSeparator();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_IntByteArrayBooleanConstructor_Null_ZbNg7() {
        Base64 base64 = new Base64(10, null, true);
        byte[] lineSeparator = base64.getLineSeparator();
        assertNull(lineSeparator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_IntConstructor_NonZero_uhSa9() {
        Base64 base64 = new Base64(2);
        byte[] lineSeparator = base64.getLineSeparator();
        assertEquals(2, lineSeparator.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBase64_2_vVfb1() {
        byte[] binaryData = new byte[10];
        byte[] expected = new byte[14];
        byte[] actual = Base64.encodeBase64(binaryData, true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBase64UrlSafe_ZBTx2() {
        byte[] binaryData = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean isChunked = false;
        boolean urlSafe = true;
        byte[] expectedResult = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        byte[] actualResult = Base64.encodeBase64(binaryData, isChunked, urlSafe);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeBase64_1_Zhvm0() {
        byte[] base64Data = new byte[0];
        byte[] expected = new byte[0];
        byte[] actual = Base64.decodeBase64(base64Data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode9_UFSC8() {
        Base64 base64 = new Base64(10, new byte[0], true, CodecPolicy.STRICT);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_ValidBase64String_NWJU2() {
        String base64 = "dGhpcyBpcyBhIHN0cmluZyB0byBiZSBlbmNvZGVkIHRoaXMgaXMgYSB0aGUgbGluZSBhbmQgYW5kIGFuZCBhZGRyZXNzIG9mIHRoZSBkZXZpY2UgY29udGVudHM=";
        assertTrue(Base64.isBase64(base64));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_ValidBase64StringWithLineSeparator_KaMi4() {
        String base64 = "dGhpcyBpcyBhIHN0cmluZyB0byBiZSBlbmNvZGVkIHRoaXMgaXMgYSB0aGUgbGluZSBhbmQgYW5kIGFuZCBhZGRyZXNzIG9mIHRoZSBkZXZpY2UgY29udGVudHM=\n";
        assertTrue(Base64.isBase64(base64));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBase64_EmptyInput_oZVk0() {
        byte[] binaryData = new byte[0];
        boolean isChunked = false;
        boolean urlSafe = false;
        int maxResultSize = 0;
        byte[] expected = new byte[0];
        byte[] actual = Base64.encodeBase64(binaryData, isChunked, urlSafe, maxResultSize);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_emptyArray_DCxG0() {
        byte[] arrayOctet = new byte[0];
        assertTrue(Base64.isBase64(arrayOctet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_allBase64Chars_gDNc1() {
        byte[] arrayOctet = new byte[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        assertTrue(Base64.isBase64(arrayOctet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_allWhitespaceChars_NLfd2() {
        byte[] arrayOctet = new byte[]{' ', '\t', '\n', '\r'};
        assertTrue(Base64.isBase64(arrayOctet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_mixedChars_WXep3() {
        byte[] arrayOctet = new byte[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/', ' ', '\t', '\n', '\r'};
        assertTrue(Base64.isBase64(arrayOctet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_invalidChars_jEcV4() {
        byte[] arrayOctet = new byte[]{'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '=', '+', '[', ']', '{', '}', '|', '\\', ':', ';', '"', '\'', '<', '>', ',', '.', '?', '/'};
        assertFalse(Base64.isBase64(arrayOctet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBase64URLSafe_1_hrNo0() {
        byte[] binaryData = new byte[0];
        byte[] expected = new byte[0];
        byte[] actual = Base64.encodeBase64URLSafe(binaryData);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_NotBase64_rKFU3() {
        byte octet = -1;
        assertFalse(Base64.isBase64(octet));
    }
}