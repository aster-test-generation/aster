/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Nysiis_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis3_XGpn2() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("MCLANA");
        assertEquals("MCLANA", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrict_DefaultConstructor_nNBo0_fid1() {
        Nysiis nysiis = new Nysiis();
        assertFalse(nysiis.isStrict());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis3_XGpn2_fid1() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("MCClennan");
        assertEquals("MCClennan", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis4_rJmc3_fid1() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("Knickman");
        assertEquals("NNickman", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis5_BPQJ4_fid1() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("Phelps");
        assertEquals("FFelps", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis6_iUlc5_fid1() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("Schmidt");
        assertEquals("SSSmit", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis7_KqDh6_fid1() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("Eevans");
        assertEquals("Yvans", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis8_lkek7_fid1() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("Dutton");
        assertEquals("Dton", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis9_NrmF8_fid1() {
        Nysiis nysiis = new Nysiis(true);
        String result = nysiis.nysiis("EVans");
        assertEquals("AFans", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis10_ZPgR9_fid1() {
        Nysiis nysiis = new Nysiis(true);
        String result = nysiis.nysiis("Qiuick");
        assertEquals("Giuick", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis11_cKOL10_fid1() {
        Nysiis nysiis = new Nysiis(true);
        String result = nysiis.nysiis("Zimmer");
        assertEquals("Simer", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis12_jeQI11_fid1() {
        Nysiis nysiis = new Nysiis(true);
        String result = nysiis.nysiis("Walter");
        assertEquals("Alter", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis13_NSIQ12_fid1() {
        Nysiis nysiis = new Nysiis(true);
        String result = nysiis.nysiis("Harris");
        assertEquals("Hris", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis14_NFuI13_fid1() {
        Nysiis nysiis = new Nysiis(true);
        String result = nysiis.nysiis("KWHarris");
        assertEquals("CWHris", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiisEV_lMjz2_fid1() {
        Nysiis nysiis = new Nysiis();
        assertEquals("AF", nysiis.nysiis("EV"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiisVowel_ZLsF3_fid1() {
        Nysiis nysiis = new Nysiis();
        assertEquals("A", nysiis.nysiis("E"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiisQ_mbIB4_fid1() {
        Nysiis nysiis = new Nysiis();
        assertEquals("G", nysiis.nysiis("Q"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiisZ_PfAe5_fid1() {
        Nysiis nysiis = new Nysiis();
        assertEquals("S", nysiis.nysiis("Z"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiisM_jZxQ6() {
        Nysiis nysiis = new Nysiis();
        assertEquals("N", nysiis.nysiis("M"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiisKN_AkCk7_fid1() {
        Nysiis nysiis = new Nysiis();
        assertEquals("NN", nysiis.nysiis("KN"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiisSCH_yWuU8_fid1() {
        Nysiis nysiis = new Nysiis();
        assertEquals("SSS", nysiis.nysiis("SCH"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiisPH_QTGe9_fid1() {
        Nysiis nysiis = new Nysiis();
        assertEquals("FF", nysiis.nysiis("PH"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiisH_dstG10_fid1() {
        Nysiis nysiis = new Nysiis();
        assertEquals("A", nysiis.nysiis("HA"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiisW_Lggs11_fid1() {
        Nysiis nysiis = new Nysiis();
        assertEquals("A", nysiis.nysiis("WA"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiisStrict_RSGo12_fid1() {
        Nysiis nysiis = new Nysiis(true);
        assertEquals("AF", nysiis.nysiis("EV"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeString_xqfU0() {
        Nysiis nysiis = new Nysiis();
        Object result = nysiis.encode("Hello World");
        assertNotNull(result);
        assertEquals("HELLO", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_MmGa0_fid1() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.encode("Hello World");
        assertEquals("HL WRD", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeString_xqfU0_2_fid2() {
        Nysiis nysiis = new Nysiis();
        Object result = nysiis.encode("Hello World");
        assertEquals("HELLO", result);
    }
}