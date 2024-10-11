/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LZMA2Decoder_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionsAsProperties_CanF0() {
        LZMA2Decoder lzma2Decoder = new LZMA2Decoder();
        Object opts = new Object();
        int dictSize = 1;
        int lead = Integer.numberOfLeadingZeros(dictSize);
        int secondBit = (dictSize >>> 30 - lead) - 2;
        byte[] expected = new byte[] { (byte) ((19 - lead) * 2 + secondBit) };
        byte[] result = lzma2Decoder.getOptionsAsProperties(opts);
        assertArrayEquals(expected, result);
    }
}