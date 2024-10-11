/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Nysiis_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_lhEc0() throws org.apache.commons.codec.EncoderException {
        Nysiis nysiis = new Nysiis();
        Object obj = new Object();
        try {
            nysiis.encode(obj);
        } catch (EncoderException e) {
            assertEquals("Parameter supplied to Nysiis encode is not of type java.lang.String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringObject_mzpT1() throws org.apache.commons.codec.EncoderException {
        Nysiis nysiis = new Nysiis();
        String input = "Hello";
        String expectedOutput = "HAL";
        String actualOutput = nysiis.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis1_nKAe6() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("A");
        assert result.equals("A");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis2_LMla7() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("AA");
        assert result.equals("A");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis5_SFtA10() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("K");
        assert result.equals("C");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis8_UtuL13() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("EE");
        assert result.equals("Y");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis9_nhWg14() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("DT");
        assert result.equals("D");
    }
}