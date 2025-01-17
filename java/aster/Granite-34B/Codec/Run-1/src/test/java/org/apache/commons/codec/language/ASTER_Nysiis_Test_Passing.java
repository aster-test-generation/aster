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

public class Aster_Nysiis_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrictTrueConstructor_WbLe1() {
        Nysiis nysiis = new Nysiis(true);
        assertEquals(true, nysiis.isStrict());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrictFalseConstructor_KIeS2() {
        Nysiis nysiis = new Nysiis(false);
        assertEquals(false, nysiis.isStrict());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_1_iNsk0() {
        Nysiis nysiis = new Nysiis();
        assertEquals("A", nysiis.nysiis("A"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_2_Ykdt1() {
        Nysiis nysiis = new Nysiis();
        assertEquals("B", nysiis.nysiis("B"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_3_rqbs2() {
        Nysiis nysiis = new Nysiis();
        assertEquals("C", nysiis.nysiis("C"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_4_hWaS3() {
        Nysiis nysiis = new Nysiis();
        assertEquals("D", nysiis.nysiis("D"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_5_aRCe4() {
        Nysiis nysiis = new Nysiis();
        assertEquals("E", nysiis.nysiis("E"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_6_rQHM5() {
        Nysiis nysiis = new Nysiis();
        assertEquals("F", nysiis.nysiis("F"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_7_PzRu6() {
        Nysiis nysiis = new Nysiis();
        assertEquals("G", nysiis.nysiis("G"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_8_OpOd7() {
        Nysiis nysiis = new Nysiis();
        assertEquals("H", nysiis.nysiis("H"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_9_OUAo8() {
        Nysiis nysiis = new Nysiis();
        assertEquals("J", nysiis.nysiis("J"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_11_uRGI10() {
        Nysiis nysiis = new Nysiis();
        assertEquals("L", nysiis.nysiis("L"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_12_mUak11() {
        Nysiis nysiis = new Nysiis();
        assertEquals("M", nysiis.nysiis("M"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_13_tlwb12() {
        Nysiis nysiis = new Nysiis();
        assertEquals("N", nysiis.nysiis("N"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_14_fWgP13() {
        Nysiis nysiis = new Nysiis();
        assertEquals("P", nysiis.nysiis("P"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_15_HDWQ14() {
        Nysiis nysiis = new Nysiis();
        assertEquals("Q", nysiis.nysiis("Q"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_16_lVtK15() {
        Nysiis nysiis = new Nysiis();
        assertEquals("R", nysiis.nysiis("R"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_17_kCzk16() {
        Nysiis nysiis = new Nysiis();
        assertEquals("S", nysiis.nysiis("S"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_18_XJDW17() {
        Nysiis nysiis = new Nysiis();
        assertEquals("T", nysiis.nysiis("T"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_19_NFda18() {
        Nysiis nysiis = new Nysiis();
        assertEquals("V", nysiis.nysiis("V"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithString_lbIn0() throws EncoderException {
        Nysiis nysiis = new Nysiis();
        String input = "inputString";
        Object expected = nysiis.nysiis(input);
        Object actual = nysiis.encode(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonString_QXRi1() {
        Nysiis nysiis = new Nysiis();
        Object input = new Object();
        try {
            nysiis.encode(input);
        } catch (EncoderException e) {
            assertEquals("Parameter supplied to Nysiis encode is not of type java.lang.String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrictDefaultConstructor_vSLd0_fid1() {
        Nysiis nysiis = new Nysiis();
        assertEquals(true, nysiis.isStrict());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_QfpD0_1_fid1() {
        Nysiis nysiis = new Nysiis();
        assertEquals("JAN", nysiis.nysiis("JAN"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_QfpD0_2_fid1() {
        Nysiis nysiis = new Nysiis();
        assertEquals("JAN", nysiis.nysiis("Jonez"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_QfpD0_3_fid1() {
        Nysiis nysiis = new Nysiis();
        assertEquals("JANAS", nysiis.nysiis("JANASes"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_RClL0_fid1() {
        Nysiis nysiis = new Nysiis();
        assertEquals("INPATS", nysiis.encode("input string"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStrict_Ggkm1_fid1() {
        Nysiis nysiis = new Nysiis(true);
        assertEquals("INPATS", nysiis.encode("input string"));
    }
}