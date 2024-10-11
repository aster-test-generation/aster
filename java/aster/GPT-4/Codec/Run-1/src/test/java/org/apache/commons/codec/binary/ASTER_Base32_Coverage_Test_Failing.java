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
    public void testDecodeWithNonEmptyArray_OuwM2() {
        Base32 base32 = new Base32();
        byte[] nonEmptyArray = {'M', 'F', 'Z', 'G', 'Y', '=', '='};
        byte[] expectedOutput = {(byte) 0x66}; // Assuming correct decoding for "MFZGY=="
        byte[] result = base32.decode(nonEmptyArray);
        assertArrayEquals(expectedOutput, result, "Decoding should match expected output.");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithInvalidData_JoBg3() {
        Base32 base32 = new Base32();
        byte[] invalidData = {'!', '@', '#', '$', '%'};
        try {
            base32.decode(invalidData);
            fail("Should throw an exception due to invalid Base32 data");
        } catch (Exception e) {
            assertNotNull(e, "Exception should be thrown for invalid data.");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithRealWorldExample_tMCM5() {
        Base32 base32 = new Base32();
        byte[] realWorldExample = "JBSWY3DPFQQFO33SNRSCC===".getBytes();
        byte[] expectedOutput = "Hello World".getBytes(); // Assuming correct decoding for the example
        byte[] result = base32.decode(realWorldExample);
        assertArrayEquals(expectedOutput, result, "Decoding real world example should match 'Hello World'.");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithExtendedInput_nFQr7() {
        Base32 base32 = new Base32();
        byte[] extendedInput = "JBSWY3DPFQQFO33SNRSCC===JBSWY3DPFQQFO33SNRSCC===".getBytes();
        byte[] expectedOutput = "Hello WorldHello World".getBytes(); // Assuming correct decoding for the example
        byte[] result = base32.decode(extendedInput);
        assertArrayEquals(expectedOutput, result, "Decoding extended input should match expected output.");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithLineBreaks_TNco8() {
        Base32 base32 = new Base32();
        byte[] inputWithLineBreaks = "JBSWY3DP\nFQQFO33S\nNRSCC===".getBytes();
        byte[] expectedOutput = "Hello World".getBytes(); // Assuming correct decoding for the example without line breaks
        byte[] result = base32.decode(inputWithLineBreaks);
        assertArrayEquals(expectedOutput, result, "Decoding with line breaks should handle or ignore line breaks.");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithWhitespace_ueYT9() {
        Base32 base32 = new Base32();
        byte[] inputWithWhitespace = "JBSWY3DP FQQFO33S NRSCC===".getBytes();
        byte[] expectedOutput = "Hello World".getBytes(); // Assuming correct decoding for the example without whitespace
        byte[] result = base32.decode(inputWithWhitespace);
        assertArrayEquals(expectedOutput, result, "Decoding with whitespace should handle or ignore whitespace.");
    }
}