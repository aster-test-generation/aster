/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Base32_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_Vxao0() {
        Base32 base32 = new Base32();
        String input = "SGVsbG8gd29ybGQh";
        byte[] expectedOutput = new byte[]{0x48, 0x65, 0x6c, 0x6c, 0x6f, 0x2c, 0x20, 0x77, 0x6f, 0x72, 0x6c, 0x64, 0x21};
        byte[] actualOutput = base32.decode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithLineLength_CPIS1() {
        Base32 base32 = new Base32(10);
        String input = "SGVsbG8gd29ybGQh";
        byte[] expectedOutput = new byte[]{0x48, 0x65, 0x6c, 0x6c, 0x6f, 0x2c, 0x20, 0x77, 0x6f, 0x72, 0x6c, 0x64, 0x21};
        byte[] actualOutput = base32.decode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithLineSeparator_vaUP2() {
        Base32 base32 = new Base32(10, new byte[]{0x0a});
        String input = "SGVsbG8gd29ybGQh";
        byte[] expectedOutput = new byte[]{0x48, 0x65, 0x6c, 0x6c, 0x6f, 0x2c, 0x20, 0x77, 0x6f, 0x72, 0x6c, 0x64, 0x21};
        byte[] actualOutput = base32.decode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithHex_jfWT3() {
        Base32 base32 = new Base32(10, new byte[]{0x0a}, true);
        String input = "SGVsbG8gd29ybGQh";
        byte[] expectedOutput = new byte[]{0x48, 0x65, 0x6c, 0x6c, 0x6f, 0x2c, 0x20, 0x77, 0x6f, 0x72, 0x6c, 0x64, 0x21};
        byte[] actualOutput = base32.decode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithPadding_NgSj4() {
        Base32 base32 = new Base32(10, new byte[]{0x0a}, true, (byte) 0x3d);
        String input = "SGVsbG8gd29ybGQh";
        byte[] expectedOutput = new byte[]{0x48, 0x65, 0x6c, 0x6c, 0x6f, 0x2c, 0x20, 0x77, 0x6f, 0x72, 0x6c, 0x64, 0x21};
        byte[] actualOutput = base32.decode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNonEmptyArray_nbBh1_2_fid1() {
        Base32 base32 = new Base32();
        byte[] input = new byte[]{1, 2, 3, 4, 5};
        byte[] output = base32.encode(input);
        assertEquals(10, output.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNonEmptyArray_nbBh1() {
        Base32 base32 = new Base32();
        byte[] input = new byte[]{1, 2, 3, 4, 5};
        byte[] output = base32.encode(input);
        assertNotNull(output);
        assertEquals(10, output.length);
    }
}