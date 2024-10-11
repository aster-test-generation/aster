/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Base64_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytesWithZero_hzZN0() {
        BigInteger bigInt = BigInteger.ZERO;
        byte[] expected = new byte[1];
        byte[] actual = Base64.toIntegerBytes(bigInt);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBase64_SimpleDataChunked_fHKg1() {
        byte[] simpleData = "Hello".getBytes();
        byte[] expectedResult = java.util.Base64.getEncoder().encode(simpleData);
        byte[] result = Base64.encodeBase64(simpleData, true, false, 100);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBase64_SimpleDataUrlSafe_iAdt2() {
        byte[] simpleData = "Hello".getBytes();
        byte[] expectedResult = java.util.Base64.getUrlEncoder().encode(simpleData);
        byte[] result = Base64.encodeBase64(simpleData, false, true, 100);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInteger_jBtA0_OOkM0() {
        Base64 base64 = new Base64();
        byte[] encodedData = base64.encode("3224115".getBytes());
        BigInteger result = new BigInteger(base64.decode(encodedData));
        BigInteger expected = new BigInteger("3224115");
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_WithLineLength_PXHF1_fid2() {
        Base64 base64 = new Base64(76);
        byte[] result = base64.getLineSeparator();
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_WithUrlSafe_sAoL2_fid2() {
        Base64 base64 = new Base64(true);
        byte[] result = base64.getLineSeparator();
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInteger_jBtA0_OOkM0_fid2() {
        Base64 base64 = new Base64();
        byte[] encodedData = base64.encode("123".getBytes());
        BigInteger result = new BigInteger(base64.decode(encodedData));
        BigInteger expected = new BigInteger("123");
        assertEquals(expected, result);
    }
}