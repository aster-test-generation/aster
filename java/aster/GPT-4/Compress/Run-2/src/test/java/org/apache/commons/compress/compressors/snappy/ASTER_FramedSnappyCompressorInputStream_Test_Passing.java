/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.snappy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FramedSnappyCompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchesWithCorrectSignature_rLds0() throws Exception {
        byte[] signature = new byte[] { -1, 6, 0, 0, 115, 78, 97, 80, 112, 89 }; // Assuming SZ_SIGNATURE is { -1, 6, 0, 0, 115, 78, 97, 80, 112, 89 }
        int length = 10;
        assertTrue(FramedSnappyCompressorInputStream.matches(signature, length));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchesWithIncorrectSignature_uVUY1() throws Exception {
        byte[] signature = new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int length = 10;
        assertFalse(FramedSnappyCompressorInputStream.matches(signature, length));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchesWithShorterLengthThanSignature_gfrb2() throws Exception {
        byte[] signature = new byte[] { -1, 6, 0, 0, 115, 78, 97, 80, 112, 89 };
        int length = 5; // Less than SZ_SIGNATURE length
        assertFalse(FramedSnappyCompressorInputStream.matches(signature, length));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnmask_qYkO0() throws Exception {
    long input = 0x12345678L;
    long expected = 0x1E6A2C48L;
    long result = FramedSnappyCompressorInputStream.unmask(input);
    assertEquals(expected, result);
}
}