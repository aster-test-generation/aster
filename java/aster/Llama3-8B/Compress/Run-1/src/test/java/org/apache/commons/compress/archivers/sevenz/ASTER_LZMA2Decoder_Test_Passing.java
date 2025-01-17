/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LZMA2Decoder_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionsAsProperties_lrQU0() {
        LZMA2Decoder lzma2Decoder = new LZMA2Decoder();
        Object opts = new Object();
        byte[] result = lzma2Decoder.getOptionsAsProperties(opts);
        assert result.length == 1;
    }
}