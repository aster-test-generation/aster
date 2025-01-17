/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Nysiis_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_EV_NoAw11() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("EV");
        assertEquals("EV", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_Vowel_tMXQ12() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("A");
        assertEquals("A", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_Q_NttM13() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("Q");
        assertEquals("Q", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_KN_wDtn16() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("KN");
        assertEquals("N", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTranscodeRemaining_A_cZaR1_SAwD0() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.encode("A");
        assertEquals("A", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTranscodeRemaining_H_mhXY9_rJwq0() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.encode("H");
        assertEquals("H", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTranscodeRemaining_Z_mJZm3_KZlQ0() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.encode("Z");
        assertEquals("Z", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTranscodeRemaining_M_NFVh4_BSEI0() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.encode("M");
        assertEquals("M", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTranscodeRemaining_W_KRtQ10_aWbI1() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.encode("W");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTranscodeRemaining_KN_QZPF5_HHAI0() {
        Nysiis nysiis = new Nysiis();
        char[] result = nysiis.encode("K").toCharArray();
    }
}