/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;
import org.apache.commons.codec.DecoderException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Utils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigit16InvalidDigit_AuUH1() {
        try {
            Utils.digit16((byte) 'a');
            fail("Expected DecoderException");
        } catch (DecoderException e) {
            assertEquals("Invalid URL encoding: not a valid digit (radix " + 16 + "): a", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit16_ofaF16_fid2() {
        assertEquals('F', Utils.hexDigit(16));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit17_eXtr17_fid2() {
        assertEquals('F', Utils.hexDigit(17));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit18_GWoz18_fid2() {
        assertEquals('F', Utils.hexDigit(18));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit19_Dusu19_fid2() {
        assertEquals('F', Utils.hexDigit(19));
    }
}