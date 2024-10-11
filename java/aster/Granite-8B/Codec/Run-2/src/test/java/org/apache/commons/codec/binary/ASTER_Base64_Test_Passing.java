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
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsUrlSafe_jxcB0() {
        Base64 base64 = new Base64();
        boolean result = base64.isUrlSafe();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInteger_XmfJ0() {
        byte[] input = new byte[]{0, 1, 2, 3};
        BigInteger expected = new BigInteger("000000000000000000000000000000", 16);
        BigInteger actual = Base64.decodeInteger(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 0, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInteger2_BkNI1() {
        byte[] input = new byte[]{1, 2, 3, 4};
        BigInteger expected = new BigInteger("000000000000000000000000000001", 06);
        BigInteger actual = Base64.decodeInteger(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBase64String_WLdw0() {
        byte[] binaryData = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String expected = "AAECAwQFBgcICQ==";
        String actual = Base64.encodeBase64String(binaryData);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytes4_vmud3() {
        BigInteger bigInt = new BigInteger("1");
        byte[] expected = {1};
        byte[] actual = Base64.toIntegerBytes(bigInt);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytes6_jVqK5() {
        BigInteger bigInt = new BigInteger("127");
        byte[] expected = {127};
        byte[] actual = Base64.toIntegerBytes(bigInt);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytes7_RRpd6() {
        BigInteger bigInt = new BigInteger("-128");
        byte[] expected = {-128};
        byte[] actual = Base64.toIntegerBytes(bigInt);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytes10_rqmf9() {
        BigInteger bigInt = new BigInteger("32767");
        byte[] expected = {127, -1};
        byte[] actual = Base64.toIntegerBytes(bigInt);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytes11_gRvf10() {
        BigInteger bigInt = new BigInteger("-32768");
        byte[] expected = {-128, 0};
        byte[] actual = Base64.toIntegerBytes(bigInt);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytes14_csSf13() {
        BigInteger bigInt = new BigInteger("2147483647");
        byte[] expected = {127, -1, -1, -1};
        byte[] actual = Base64.toIntegerBytes(bigInt);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_LineLength100_CustomLineSeparator_runH6() {
        byte[] customLineSeparator = new byte[]{10, 13};
        Base64 base64 = new Base64(100, customLineSeparator);
        byte[] lineSeparator = base64.getLineSeparator();
        assertArrayEquals(customLineSeparator, lineSeparator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_LineLength100_UrlSafe_CustomLineSeparator_VbCv7() {
        byte[] customLineSeparator = new byte[]{10, 13};
        Base64 base64 = new Base64(100, customLineSeparator, true);
        byte[] lineSeparator = base64.getLineSeparator();
        assertArrayEquals(customLineSeparator, lineSeparator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_LineLength100_UrlSafe_StrictPolicy_CustomLineSeparator_kRRJ8() {
        byte[] customLineSeparator = new byte[]{10, 13};
        Base64 base64 = new Base64(100, customLineSeparator, true, CodecPolicy.STRICT);
        byte[] lineSeparator = base64.getLineSeparator();
        assertArrayEquals(customLineSeparator, lineSeparator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_LineLength100_UrlSafe_LenientPolicy_CustomLineSeparator_uZlc9() {
        byte[] customLineSeparator = new byte[]{10, 13};
        Base64 base64 = new Base64(100, customLineSeparator, true, CodecPolicy.LENIENT);
        byte[] lineSeparator = base64.getLineSeparator();
        assertArrayEquals(customLineSeparator, lineSeparator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBase64URLSafeString_zPLV0() {
        byte[] binaryData = new byte[]{1, 2, 3};
        String expected = "AQID";
        String actual = Base64.encodeBase64URLSafeString(binaryData);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsArrayByteBase64_FbFX0() {
        byte[] arrayOctet = new byte[10];
        assertFalse(Base64.isArrayByteBase64(arrayOctet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsArrayByteBase64WithInvalidInput_aXMO1() {
        byte[] arrayOctet = new byte[11];
        assertFalse(Base64.isArrayByteBase64(arrayOctet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsArrayByteBase64WithEmptyInput_rmTA2() {
        byte[] arrayOctet = new byte[0];
        assertTrue(Base64.isArrayByteBase64(arrayOctet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBase64_1_TPot0() {
        byte[] binaryData = new byte[0];
        boolean isChunked = true;
        boolean urlSafe = true;
        int maxResultSize = 100;
        byte[] expected = new byte[0];
        byte[] actual = Base64.encodeBase64(binaryData, isChunked, urlSafe, maxResultSize);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBase64_2_KmME1() {
        byte[] binaryData = new byte[0];
        boolean isChunked = false;
        boolean urlSafe = true;
        int maxResultSize = 100;
        byte[] expected = new byte[0];
        byte[] actual = Base64.encodeBase64(binaryData, isChunked, urlSafe, maxResultSize);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBase64_3_gHXv2() {
        byte[] binaryData = new byte[0];
        boolean isChunked = true;
        boolean urlSafe = false;
        int maxResultSize = 100;
        byte[] expected = new byte[0];
        byte[] actual = Base64.encodeBase64(binaryData, isChunked, urlSafe, maxResultSize);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBase64_4_OQAg3() {
        byte[] binaryData = new byte[0];
        boolean isChunked = false;
        boolean urlSafe = false;
        int maxResultSize = 100;
        byte[] expected = new byte[0];
        byte[] actual = Base64.encodeBase64(binaryData, isChunked, urlSafe, maxResultSize);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64WithEmptyArray_OpNw0() {
        byte[] arrayOctet = new byte[0];
        boolean result = Base64.isBase64(arrayOctet);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64WithValidArray_EstK1() {
        byte[] arrayOctet = "abcd1234".getBytes();
        boolean result = Base64.isBase64(arrayOctet);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64WithInvalidArray_qxyc2() {
        byte[] arrayOctet = "abcd1234=".getBytes();
        boolean result = Base64.isBase64(arrayOctet);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64WithInvalidArray2_kHqx3() {
        byte[] arrayOctet = "abcd1234!".getBytes();
        boolean result = Base64.isBase64(arrayOctet);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64WithInvalidArray3_xREy4() {
        byte[] arrayOctet = "abcd1234\n".getBytes();
        boolean result = Base64.isBase64(arrayOctet);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_Oklr0_1() {
        byte octet1 = 65;
        boolean expected1 = true;
        boolean actual1 = Base64.isBase64(octet1);
        byte octet2 = 43;
        boolean expected2 = true;
        boolean actual2 = Base64.isBase64(octet2);
        byte octet3 = 127;
        boolean expected3 = true;
        boolean actual3 = Base64.isBase64(octet3);
        byte octet4 = -1;
        boolean expected4 = false;
        boolean actual4 = Base64.isBase64(octet4);
        byte octet5 = 100;
        boolean expected5 = false;
        boolean actual5 = Base64.isBase64(octet5);
        assertEquals(expected1, actual1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_Oklr0_2() {
        byte octet1 = 65;
        boolean expected1 = true;
        boolean actual1 = Base64.isBase64(octet1);
        byte octet2 = 43;
        boolean expected2 = true;
        boolean actual2 = Base64.isBase64(octet2);
        byte octet3 = 127;
        boolean expected3 = true;
        boolean actual3 = Base64.isBase64(octet3);
        byte octet4 = -1;
        boolean expected4 = false;
        boolean actual4 = Base64.isBase64(octet4);
        byte octet5 = 100;
        boolean expected5 = false;
        boolean actual5 = Base64.isBase64(octet5);
        assertEquals(expected2, actual2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_Oklr0_3() {
        byte octet1 = 65;
        boolean expected1 = false;
        boolean actual1 = Base64.isBase64(octet1);
        byte octet2 = 43;
        boolean expected2 = false;
        boolean actual2 = Base64.isBase64(octet2);
        byte octet3 = 127;
        boolean expected3 = false;
        boolean actual3 = Base64.isBase64(octet3);
        byte octet4 = -1;
        boolean expected4 = false;
        boolean actual4 = Base64.isBase64(octet4);
        byte octet5 = 100;
        boolean expected5 = false;
        boolean actual5 = Base64.isBase64(octet5);
        assertEquals(expected3, actual3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_Oklr0_4() {
        byte octet1 = 65;
        boolean expected1 = true;
        boolean actual1 = Base64.isBase64(octet1);
        byte octet2 = 43;
        boolean expected2 = true;
        boolean actual2 = Base64.isBase64(octet2);
        byte octet3 = 127;
        boolean expected3 = true;
        boolean actual3 = Base64.isBase64(octet3);
        byte octet4 = -1;
        boolean expected4 = false;
        boolean actual4 = Base64.isBase64(octet4);
        byte octet5 = 100;
        boolean expected5 = false;
        boolean actual5 = Base64.isBase64(octet5);
        assertEquals(expected4, actual4);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_Oklr0_5() {
        byte octet1 = 65;
        boolean expected1 = true;
        boolean actual1 = Base64.isBase64(octet1);
        byte octet2 = 43;
        boolean expected2 = true;
        boolean actual2 = Base64.isBase64(octet2);
        byte octet3 = 127;
        boolean expected3 = true;
        boolean actual3 = Base64.isBase64(octet3);
        byte octet4 = -1;
        boolean expected4 = true;
        boolean actual4 = Base64.isBase64(octet4);
        byte octet5 = 100;
        boolean expected5 = true;
        boolean actual5 = Base64.isBase64(octet5);
        assertEquals(expected5, actual5);
    }
}