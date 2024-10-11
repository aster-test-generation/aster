/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;
import java.math.BigInteger;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Base64_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeBase64_PFTb0() {
        String base64String = "SGVsbG8gd29ybGQ=";
        byte[] expected = new byte[] {72, 101, 108, 108, 111, 32,119, 111, 119, 97, 109};
        byte[] result = Base64.decodeBase64(base64String);
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBase64_ZIFd0() {
        byte[] binaryData = new byte[] {1, 2, 3, 4, 5};
        byte[] expected = new byte[] {(byte) 'A', (byte) 'Q', (byte) 'g', (byte) 'w', (byte) '8', (byte) '9', (byte) 'A', (byte) 'Q', (byte) 'g', (byte) 'w', (byte) '8', (byte) '9'};
        byte[] result = Base64.encodeBase64(binaryData);
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBase64_nkOF0() {
        byte[] binaryData = "Hello, World!".getBytes();
        boolean isChunked = false;
        boolean urlSafe = true;
        byte[] result = Base64.encodeBase64(binaryData, isChunked, urlSafe);
        String expected = "SGVsbG8sIFdvcmxkIQ==";
        assert Arrays.equals(result, expected.getBytes());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeBase64_hfKP0() {
        byte[] base64Data = "SGVsbG8gd29ybGQ=".getBytes();
        byte[] expected = "Hello World".getBytes();
        byte[] result = Base64.decodeBase64(base64Data);
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsArrayByteBase64Null_qSSc2() {
        byte[] arrayOctet = null;
        assertFalse(Base64.isArrayByteBase64(arrayOctet));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator1_rVpk0() {
        Base64 base64 = new Base64(10);
        byte[] expected = new byte[0];
        byte[] result = base64.getLineSeparator();
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator4_uWZp3() {
        Base64 base64 = new Base64(true);
        byte[] expected = new byte[0];
        byte[] result = base64.getLineSeparator();
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToIntegerBytes2_gCMv1_jVOz0() {
    BigInteger bigInt = new BigInteger("123456789012345678901234567890");
    byte[] result = Base64.toIntegerBytes(bigInt);
    byte[] expected = new byte[] {(byte)0x12, (byte)0x34, (byte)0x56, (byte)0x78, (byte)0x90, (byte)0x12, (byte)0x34, (byte)0x56, (byte)0x78, (byte)0x90, (byte)0x12, (byte)0x34, (byte)0x56, (byte)0x78, (byte)0x90};
    assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToIntegerBytes1_mTQD0_ClaD0() {
    BigInteger bigInt = new BigInteger("12345678901234567890");
    byte[] result = Base64.toIntegerBytes(bigInt);
    byte[] expected = new byte[] {(byte)0x12, (byte)0x34, (byte)0x56, (byte)0x78, (byte)0x90, (byte)0x01, (byte)0x23, (byte)0x45, (byte)0x67, (byte)0x89, (byte)0x0a, (byte)0x12, (byte)0x34, (byte)0x56, (byte)0x78, (byte)0x90};
    assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToIntegerBytes3_eJxm2_IsBy0() {
    BigInteger bigInt = new BigInteger("1234567890123456789012345678901234567890");
    byte[] result = Base64.toIntegerBytes(bigInt);
    byte[] expected = new byte[] {(byte)0x12, (byte)0x34, (byte)0x56, (byte)0x78, (byte)0x90, (byte)0x12, (byte)0x34, (byte)0x56, (byte)0x78, (byte)0x90, (byte)0x12, (byte)0x34, (byte)0x56, (byte)0x78, (byte)0x90, (byte)0x12, (byte)0x34, (byte)0x56, (byte)0x78, (byte)0x90};
    assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToIntegerBytes4_BJII3_bltx0() {
    BigInteger bigInt = new BigInteger("12345678901234567890123456789012345678901234567890");
    byte[] result = Base64.toIntegerBytes(bigInt);
    byte[] expected = new byte[] {(byte)0x12, (byte)0x34, (byte)0x56, (byte)0x78, (byte)0x90, (byte)0x12, (byte)0x34, (byte)0x56, (byte)0x78, (byte)0x90, (byte)0x12, (byte)0x34, (byte)0x56, (byte)0x78, (byte)0x90, (byte)0x12, (byte)0x34, (byte)0x56, (byte)0x78, (byte)0x90, (byte)0x12, (byte)0x34, (byte)0x56, (byte)0x78, (byte)0x90};
    assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeBase64_PFTb0_fid2() {
        String base64String = "SGVsbG8gd29ybGQ=";
        byte[] expected = new byte[] {72, 101, 108, 108, 111, 32, 100, 111, 119, 97, 109};
        byte[] result = Base64.decodeBase64(base64String);
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInteger_yAmo0_fid2() {
        byte[] pArray = Base64.decodeBase64("AQIDBA==".getBytes());
        BigInteger result = Base64.decodeInteger(pArray);
        assertEquals(BigInteger.valueOf(123), result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBase64URLSafeString_nivO0_fid2() {
        byte[] binaryData = new byte[] {1, 2, 3, 4, 5};
        String expected = "YWJjZA==";
        assertEquals(expected, Base64.encodeBase64URLSafeString(binaryData));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64Invalid_SIUe1_fid2() {
        assertFalse(Base64.isBase64("InvalidBase64"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64Empty_QBzI3_fid2() {
        assertFalse(Base64.isBase64(""));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet1_ijRk0_fid2() {
        Base64 base64 = new Base64();
        boolean result = base64.isInAlphabet((byte) 0);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet3_cTJe2_fid2() {
        Base64 base64 = new Base64();
        boolean result = base64.isInAlphabet((byte) 62);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsArrayByteBase64NotBase64_hnAA1_fid2() {
        byte[] arrayOctet = "Hello World".getBytes();
        assertFalse(Base64.isArrayByteBase64(arrayOctet));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsArrayByteBase64Empty_hWFo3_fid2() {
        byte[] arrayOctet = new byte[0];
        assertFalse(Base64.isArrayByteBase64(arrayOctet));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator6_AlNj5() {
        Base64 base64 = new Base64();
        byte[] expected = new byte[0];
        byte[] result = base64.getLineSeparator();
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvalidBase64_fEOb1_fid2() {
        byte[] arrayOctet = "HelloWorld".getBytes();
        assertFalse(Base64.isBase64(arrayOctet));
    }
}