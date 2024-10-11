/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.pack200;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Pack200CompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches2_lbNb1() {
        byte[] signature = new byte[4];
        signature[0] = (byte) 0xCA;
        signature[1] = (byte) 0xFE;
        signature[2] = (byte) 0xB1;
        signature[3] = (byte) 0x08;
        boolean result = Pack200CompressorInputStream.matches(signature, 4);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches3_MivT2() {
        byte[] signature = new byte[3];
        signature[0] = (byte) 0xCA;
        signature[1] = (byte) 0xFE;
        signature[2] = (byte) 0xB1;
        boolean result = Pack200CompressorInputStream.matches(signature, 3);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches1_RADI0_fid2() {
        byte[] signature = new byte[4];
        signature[0] = (byte) 0xCA;
        signature[1] = (byte) 0xFE;
        signature[2] = (byte) 0xB1;
        signature[3] = (byte) 0x09;
        boolean result = Pack200CompressorInputStream.matches(signature, 4);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches4_VuhR3_fid2() {
        byte[] signature = new byte[5];
        signature[0] = (byte) 0xCA;
        signature[1] = (byte) 0xFE;
        signature[2] = (byte) 0xB1;
        signature[3] = (byte) 0x09;
        signature[4] = (byte) 0x00;
        boolean result = Pack200CompressorInputStream.matches(signature, 5);
        assertFalse(result);
    }
}