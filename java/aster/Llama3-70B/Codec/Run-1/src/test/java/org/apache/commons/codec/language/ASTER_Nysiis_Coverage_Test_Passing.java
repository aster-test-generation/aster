/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Nysiis_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_WithStringObject_ReturnsNysiisEncodedString_IuJq1_1() throws EncoderException {
        Nysiis nysiis = new Nysiis();
        String obj = "Test String";
        Object result = nysiis.encode(obj);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_WithStringObject_ReturnsNysiisEncodedString_IuJq1_2() throws EncoderException {
        Nysiis nysiis = new Nysiis();
        String obj = "Test String";
        Object result = nysiis.encode(obj);
        assertTrue(result instanceof String);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_Q_Hwiv0() {
        Nysiis nysiis = new Nysiis();
        assertEquals("Q", nysiis.nysiis("Q"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_KN_eGRQ3() {
        Nysiis nysiis = new Nysiis();
        assertEquals("N", nysiis.nysiis("KN"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_SCH_guPr4() {
        Nysiis nysiis = new Nysiis();
        assertEquals("S", nysiis.nysiis("SCH"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_PH_lpYy5() {
        Nysiis nysiis = new Nysiis();
        assertEquals("F", nysiis.nysiis("PH"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_W_lqDB7() {
        Nysiis nysiis = new Nysiis();
        assertEquals("A", nysiis.nysiis("AW"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_EV_cMgf8() {
        Nysiis nysiis = new Nysiis();
        assertEquals("EV", nysiis.nysiis("EV"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_K_Ppzu9() {
        Nysiis nysiis = new Nysiis();
        assertEquals("C", nysiis.nysiis("K"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_DT_D_gELM9() {
        Nysiis nysiis = new Nysiis();
        assertEquals("D", nysiis.nysiis("DT"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_WithStringObject_ReturnsNysiisEncodedString_IuJq1() throws EncoderException {
        Nysiis nysiis = new Nysiis();
        String obj = "Test String";
        Object result = nysiis.encode(obj);
        assertNotNull(result);
        assertTrue(result instanceof String);
    }
}