/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.CodecPolicy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Base32_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_EiVB0() {
        Base32 base32 = new Base32(5, new byte[]{10}, true, (byte) 0, CodecPolicy.STRICT);
        String pArray = "1234567890";
        byte[] expected = new byte[]{(byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90};
        byte[] actual = base32.decode(pArray);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeSingleByte_YePq2() {
        Base32 base32 = new Base32();
        byte[] pArray = new byte[]{0x01};
        byte[] result = base32.decode(pArray);
        assertArrayEquals(new byte[]{0x01}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeMultipleBytes_Ndqc3() {
        Base32 base32 = new Base32();
        byte[] pArray = new byte[]{0x01, 0x02, 0x03};
        byte[] result = base32.decode(pArray);
        assertArrayEquals(new byte[]{0x01, 0x02, 0x03}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPad_Vrtz0_fid1() {
        Base32 base32 = new Base32();
        byte[] arrayOctet = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        assertTrue(base32.containsAlphabetOrPad(arrayOctet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithInvalidInput_UATp6_ZUkZ0_fid1() {
        Base32 base32 = new Base32();
        byte[] pArray = new byte[]{0x01, 0x02, 0x03, 0x04};
        boolean result = base32.containsAlphabetOrPad(pArray);
        assertTrue(result);
    }
}