/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;
import org.apache.commons.codec.DecoderException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Utils_Coverage_Test_Passing {
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigit16InvalidInput_oTOj1() throws org.apache.commons.codec.DecoderException {
        byte b = (byte) 128;
        Utils.digit16(b);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigit16ValidInput_oHsB0() throws org.apache.commons.codec.DecoderException {
        byte b = (byte) '0';
        int result = Utils.digit16(b);
        assertEquals(0, result);
}
}