/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Nysiis_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_Usrg0() throws org.apache.commons.codec.EncoderException {
        Nysiis nysiis = new Nysiis();
        Object obj = new Object();
        try {
            nysiis.encode(obj);
            fail("EncoderException expected");
        } catch (EncoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringObject_qlNz1() throws org.apache.commons.codec.EncoderException {
        Nysiis nysiis = new Nysiis();
        String input = "example";
        String expected = "EXANPL";
        String actual = nysiis.encode(input);
        assertEquals(expected, actual);
    }
}