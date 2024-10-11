/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Metaphone_Test_Failing {
    private Metaphone metaphone;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone4_GvJs3() {
        Metaphone metaphone = new Metaphone();
        String txt = "BTat";
        String expected = "BT";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone10_ZXlW9() {
        Metaphone metaphone = new Metaphone();
        String txt = "INKnk";
        String expected = "INK";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone11_OyxN10() {
        Metaphone metaphone = new Metaphone();
        String txt = "JMam";
        String expected = "JM";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone12_PdKTP11() {
        Metaphone metaphone = new Metaphone();
        String txt = "KTite";
        String expected = "KT";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone13_shni12() {
        Metaphone metaphone = new Metaphone();
        String txt = "LNion";
        String expected = "LN";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone2_wPBn1() {
        Metaphone metaphone = new Metaphone();
        String txt = "KSThost";
        String expected = "KST";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone4_VLkV3() {
        Metaphone metaphone = new Metaphone();
        String txt = "BRKark";
        String expected = "BRK";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone7_KrbB6() {
        Metaphone metaphone = new Metaphone();
        String txt = "FRKark";
        String expected = "FRK";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone9_AIjm8() {
        Metaphone metaphone = new Metaphone();
        String txt = "WRKark";
        String expected = "WRK";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone10_kapi9() {
        Metaphone metaphone = new Metaphone();
        String txt = "YRKark";
        String expected = "YRK";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxCodeLen_negative_NOYi7() {
        Metaphone metaphone = new Metaphone();
        metaphone.setMaxCodeLen(-1 - 10);
        assertEquals(-10, metaphone.getMaxCodeLen());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone1_LLHb0_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "Knight";
        String expected = "N";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone2_fdRo1_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "Ghost";
        String expected = "G";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone3_lQGF2() {
        Metaphone metaphone = new Metaphone();
        String txt = "Pit";
        String expected = "P";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone4_GvJs3_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "Bat";
        String expected = "B";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone5_CwLS4_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "Cat";
        String expected = "C";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone6_EDYa5() {
        Metaphone metaphone = new Metaphone();
        String txt = "Dog";
        String expected = "D";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone7_tiXu6_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "Fox";
        String expected = "F";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone8_ofGt7() {
        Metaphone metaphone = new Metaphone();
        String txt = "Grapes";
        String expected = "G";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone9_SExZ8() {
        Metaphone metaphone = new Metaphone();
        String txt = "Hat";
        String expected = "H";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone10_ZXlW9_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "Ink";
        String expected = "I";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone11_OyxN10_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "Jam";
        String expected = "J";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone12_PdKP11() {
        Metaphone metaphone = new Metaphone();
        String txt = "Kite";
        String expected = "K";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone13_shni12_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "Lion";
        String expected = "L";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone14_tSfb13() {
        Metaphone metaphone = new Metaphone();
        String txt = "Mango";
        String expected = "M";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone3_SOPF2() {
        Metaphone metaphone = new Metaphone();
        String txt = "Park";
        String expected = "P";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone4_VLkV3_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "Bark";
        String expected = "B";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone5_essu4() {
        Metaphone metaphone = new Metaphone();
        String txt = "Dark";
        String expected = "T";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone6_VShF5() {
        Metaphone metaphone = new Metaphone();
        String txt = "Hark";
        String expected = "H";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone7_KrbB6_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "Fark";
        String expected = "F";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone8_dTaU7() {
        Metaphone metaphone = new Metaphone();
        String txt = "Spark";
        String expected = "S";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone9_AIjm8_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "Wark";
        String expected = "W";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone10_kapi9_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "Yark";
        String expected = "Y";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone11_Xtgd10() {
        Metaphone metaphone = new Metaphone();
        String txt = "Zark";
        String expected = "S";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone6_Hwga5_fid2() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("KNKNKN");
        assertEquals("NKNKN", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone7_cBgR6_fid2() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("KNKNKNK");
        assertEquals("NKNKNK", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone8_iusD7_fid2() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("KNKNKNKN");
        assertEquals("NKNKNKN", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone9_dHTS8_fid2() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("KNKNKNKNK");
        assertEquals("NKNKNKNK", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone10_PxMH9_fid2() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("KNKNKNKNKN");
        assertEquals("NKNKNKNKN", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone11_JBdc10_fid2() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("KNKNKNKNKNK");
        assertEquals("NKNKNKNKNK", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone12_ulQP11_fid2() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("KNKNKNKNKNKN");
        assertEquals("NKNKNKNKNKN", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone13_XJvd12_fid2() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("KNKNKNKNKNKNK");
        assertEquals("NKNKNKNKNKNK", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone14_oCgf13_fid2() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("KNKNKNKNKNKNKN");
        assertEquals("NKNKNKNKNKNKN", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone2_jGnI1_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "Girl";
        String expected = "G";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone3_jwUW2_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "Pear";
        String expected = "P";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone5_SlaC4_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "C";
        String expected = "K";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone6_mXlT5() {
        Metaphone metaphone = new Metaphone();
        String txt = "D";
        String expected = "T";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone8_lAdj7_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "G";
        String expected = "K";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone2_rjvZ1_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "def";
        String expected = "DFK";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone3_geQI2_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "ghi";
        String expected = "JK";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone6_GNrq5_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "pqr";
        String expected = "PR";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone8_Uawf7_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "vwx";
        String expected = "VWX";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone9_eVmR8_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "yz";
        String expected = "YZ";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone10_RDwr9_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "abcdef";
        String expected = "ABKDF";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone11_RcRs10_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "ghijkl";
        String expected = "JKL";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone12_hcKl11_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "mnopqr";
        String expected = "MNPR";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone13_lxOX12_fid2() {
        Metaphone metaphone = new Metaphone();
        String txt = "stuvwx";
        String expected = "STVWX";
        String actual = metaphone.metaphone(txt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxCodeLen_invalid_SZvk1_fid2() {
        Metaphone metaphone = new Metaphone();
        metaphone.setMaxCodeLen(-1);
        assertEquals(0, metaphone.getMaxCodeLen());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxCodeLen_negative_NOYi7_fid2() {
        Metaphone metaphone = new Metaphone();
        metaphone.setMaxCodeLen(-10);
        assertEquals(0, metaphone.getMaxCodeLen());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsMetaphoneEqual_ZeOC0_fid2() {
        Metaphone metaphone = new Metaphone();
        String str1 = "hello";
        String str2 = "world";
        assertTrue(metaphone.isMetaphoneEqual(str1, str2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsMetaphoneEqualWithDifferentAccents_Yppi7_fid2() {
        Metaphone metaphone = new Metaphone();
        String str1 = "hello";
        String str2 = "hllo";
        assertTrue(metaphone.isMetaphoneEqual(str1, str2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_MultipleCharacters_EjLr2_fid2() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.encode("abc");
        assertEquals("ABC", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_SpecialCharacters_IJeD3() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.encode("!@#$%^&*()_+-=[]{}|;':\"<>,./?");
        assertEquals("!@#$%^&*()_+-=[]{}|;':\"<>,./?", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxCodeLen_TMVa1() {
        int maxCodeLen = metaphone.getMaxCodeLen();
        assertEquals(10, maxCodeLen);
    }
}