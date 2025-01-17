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

public class Aster_Nysiis_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_EV_NoAw11_fid2() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("EV");
        assertEquals("AF", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_Q_NttM13_fid2() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("Q");
        assertEquals("G", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_Z_cFkW14() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("Z");
        assertEquals("S", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_M_LUPf15() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("M");
        assertEquals("N", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_KN_wDtn16_fid2() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("KN");
        assertEquals("NN", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTranscodeRemaining_W_KRtQ10_aWbI1_fid3() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.encode("W");
        assertEquals("A", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTranscodeRemaining_KN_QZPF5_HHAI0_fid3() {
        Nysiis nysiis = new Nysiis();
        char[] result = nysiis.encode("K").toCharArray();
        assertEquals(new char[]{'N', 'N'}, result);
    }
}