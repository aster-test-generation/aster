/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Caverphone1_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_KEaX0() throws EncoderException {
        Caverphone1 caverphone1 = new Caverphone1();
        String str1 = "string1";
        String str2 = "string2";
        boolean result = caverphone1.isEncodeEqual(str1, str2);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_dvlJ0() throws EncoderException {
        Caverphone1 caverphone1 = new Caverphone1();
        String source = "Hello";
        String expected = "AL1111";
        String actual = (String) caverphone1.encode(source);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSpecialCharacters_Rptg1() throws EncoderException {
        Caverphone1 caverphone1 = new Caverphone1();
        String source = "Hello, World!";
        String expected = "ALWT11";
        String actual = (String) caverphone1.encode(source);
        assertEquals(expected, actual);
    }
}