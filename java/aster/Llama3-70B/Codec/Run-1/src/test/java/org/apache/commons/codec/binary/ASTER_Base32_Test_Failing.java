/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.CodecPolicy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Base32_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet4_CEAr3() {
        Base32 base32 = new Base32(10, new byte[]{1, 2}, true, (byte) '=', CodecPolicy.STRICT);
        assertFalse(base32.isInAlphabet((byte) 100));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_NonEmptyArray_MPIc1() {
        Base32 base32 = new Base32(76, new byte[]{13, 10}, true, (byte) 61, CodecPolicy.LENIENT);
        byte[] pArray = "SGVsbG8gd29ybGQh".getBytes();
        byte[] expectedResult = "Hello world!".getBytes();
        byte[] result = base32.decode(pArray);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadResults4_PWvI3_LrJH0_1() {
        Base32 base32 = new Base32(10, new byte[]{1, 2});
        byte[] b = new byte[10];
        int bPos = 0;
        int bAvail = 5;
        assertEquals(5, base32.readResults(b, bPos, bAvail, null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet1_bzlB0_fid2() {
        Base32 base32 = new Base32();
        assertTrue(base32.isInAlphabet((byte) 10));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet3_BULW2_fid2() {
        Base32 base32 = new Base32(true);
        assertTrue(base32.isInAlphabet((byte) 20));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet4_CEAr3_fid2() {
        Base32 base32 = new Base32(10, new byte[]{1, 2}, true, (byte) 10, CodecPolicy.STRICT);
        assertFalse(base32.isInAlphabet((byte) 100));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncodedLength1_fTPR0_fid2() {
        Base32 base32 = new Base32(10, new byte[]{13, 10});
        byte[] pArray = new byte[20];
        long result = base32.getEncodedLength(pArray);
        assertEquals(30, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncodedLength2_uUcZ1_fid2() {
        Base32 base32 = new Base32(true, (byte) 61);
        byte[] pArray = new byte[30];
        long result = base32.getEncodedLength(pArray);
        assertEquals(45, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_NonEmptyArray_MPIc1_fid2() {
        Base32 base32 = new Base32(76, new byte[]{13, 10}, true, (byte) 61, CodecPolicy.STRICT);
        byte[] pArray = "SGVsbG8gd29ybGQh".getBytes();
        byte[] expectedResult = "Hello world!".getBytes();
        byte[] result = base32.decode(pArray);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadResults2_yWfn1_NLLo0() {
        Base32 base32 = new Base32(10);
        byte[] b = new byte[10];
        int bPos = 0;
        int bAvail = 5;
        assertEquals(0, base32.readResults(b, bPos, bAvail, null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadResults4_PWvI3_LrJH0_2_fid2() {
        Base32 base32 = new Base32(10, new byte[]{1, 2});
        byte[] b = new byte[10];
        int bPos = 0;
        int bAvail = 5;
        assertTrue(base32.containsAlphabetOrPad(b));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPad_MFHG0_aYRR0_fid2() {
        Base32 base32 = new Base32();
        byte[] arrayOctet = {1, 2, 3};
        boolean result = base32.containsAlphabetOrPad(arrayOctet);
        assertTrue(result);
    }
}