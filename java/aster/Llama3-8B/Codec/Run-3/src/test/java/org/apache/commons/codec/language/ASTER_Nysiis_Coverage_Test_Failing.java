/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Nysiis_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiisE_chLN1() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("E");
        assertEquals("A", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiisI_egBq2() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("I");
        assertEquals("A", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiisO_iAcq3() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("O");
        assertEquals("A", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiisU_mIwR4() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("U");
        assertEquals("A", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEVtoAF_Jikw0() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("EVE");
        assertEquals("AF", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQtoG_qgFb2() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("Q");
        assertEquals("G", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testZtoS_MhpQ3() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("Z");
        assertEquals("S", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMtoN_HQou4() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("M");
        assertEquals("N", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testKtoNN_BLag6() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("KN");
        assertEquals("NN", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSCHtoSSS_kzJd7() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("SCH");
        assertEquals("SSS", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPtoFF_wkKM8() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("PH");
        assertEquals("FF", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultipleConversions_zvXH11_fid2() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("EVEQZM");
        assertEquals("AFGNS", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLongString_YoHL16() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        assertEquals("A", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEVtoAF_fFsr0() {
        Nysiis nysiis = new Nysiis();
        String str = "EVE";
        String result = nysiis.nysiis(str);
        assertEquals("AF", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQtoG_Ohqw2() {
        Nysiis nysiis = new Nysiis();
        String str = "Q";
        String result = nysiis.nysiis(str);
        assertEquals("G", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testZtoS_OkEI3() {
        Nysiis nysiis = new Nysiis();
        String str = "Z";
        String result = nysiis.nysiis(str);
        assertEquals("S", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMtoN_Qqfs4() {
        Nysiis nysiis = new Nysiis();
        String str = "M";
        String result = nysiis.nysiis(str);
        assertEquals("N", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testKNtoNN_OIRn6() {
        Nysiis nysiis = new Nysiis();
        String str = "KN";
        String result = nysiis.nysiis(str);
        assertEquals("NN", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSCHtoSSS_lyHB7() {
        Nysiis nysiis = new Nysiis();
        String str = "SCH";
        String result = nysiis.nysiis(str);
        assertEquals("SSS", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPtoFF_WWld8() {
        Nysiis nysiis = new Nysiis();
        String str = "PH";
        String result = nysiis.nysiis(str);
        assertEquals("FF", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHtoPreviousVowel_xIbm10() {
        Nysiis nysiis = new Nysiis();
        String str = "HE";
        String result = nysiis.nysiis(str);
        assertEquals("E", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWtoPreviousVowel_EwDW11() {
        Nysiis nysiis = new Nysiis();
        String str = "WE";
        String result = nysiis.nysiis(str);
        assertEquals("E", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultipleTranscodings_NtIh13_fid2() {
        Nysiis nysiis = new Nysiis();
        String str = "SCHPH";
        String result = nysiis.nysiis(str);
        assertEquals("SSSFF", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLongString_NlSW14_fid2() {
        Nysiis nysiis = new Nysiis();
        String str = "SCHPHKNM";
        String result = nysiis.nysiis(str);
        assertEquals("SSSFFNNN", result);
    }
}