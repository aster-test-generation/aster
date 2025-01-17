/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Metaphone_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxCodeLen_fVxb0() {
        Metaphone metaphone = new Metaphone();
        metaphone.setMaxCodeLen(5);
        assert metaphone.getMaxCodeLen() == 5;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsMetaphoneEqual_DDAh0() {
        Metaphone metaphone = new Metaphone();
        assertTrue(metaphone.isMetaphoneEqual("hello", "hollo"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsMetaphoneNotEqual_wzFr1() {
        Metaphone metaphone = new Metaphone();
        assertFalse(metaphone.isMetaphoneEqual("hello", "goodbye"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNonString_FLvV1() {
        Metaphone metaphone = new Metaphone();
        try {
            metaphone.encode(new Object());
            fail("EncoderException should be thrown");
        } catch (EncoderException e) {
            assertEquals("Parameter supplied to Metaphone encode is not of type java.lang.String", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone1_OiIb0() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("K");
        Assertions.assertEquals("K", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone2_KUbI1() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("G");
        Assertions.assertEquals("G", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone3_ZbwZ2() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("P");
        Assertions.assertEquals("P", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone4_SRZi3() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("A");
        Assertions.assertEquals("A", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone5_CCKD4() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("E");
        Assertions.assertEquals("E", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone6_TUSt5() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("I");
        Assertions.assertEquals("I", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone7_BWQc6() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("O");
        Assertions.assertEquals("O", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone8_tgNK7() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("U");
        Assertions.assertEquals("U", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone9_iguN8() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("B");
        Assertions.assertEquals("B", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone10_pCrW9() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("C");
        Assertions.assertEquals("C", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone11_qsFH10() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("D");
        Assertions.assertEquals("D", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone12_YuKt11() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("F");
        Assertions.assertEquals("F", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone14_oxAi13() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("H");
        Assertions.assertEquals("H", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone15_IsEo14() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("J");
        Assertions.assertEquals("J", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone17_MjCB16() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("L");
        Assertions.assertEquals("L", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone18_vAUX17() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("M");
        Assertions.assertEquals("M", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone19_bbqU18() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("N");
        Assertions.assertEquals("N", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone21_LRNz20() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("Q");
        Assertions.assertEquals("Q", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone1_IFdN0() {
        Metaphone metaphone = new Metaphone();
        assertEquals("M0", metaphone.metaphone("Math"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone3_IzMc2() {
        Metaphone metaphone = new Metaphone();
        assertEquals("F", metaphone.metaphone("F"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone4_WkYr3() {
        Metaphone metaphone = new Metaphone();
        assertEquals("X", metaphone.metaphone("X"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone5_cKAM4() {
        Metaphone metaphone = new Metaphone();
        assertEquals("K", metaphone.metaphone("K"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone6_AZFc5() {
        Metaphone metaphone = new Metaphone();
        assertEquals("G", metaphone.metaphone("G"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone7_ELvJ6() {
        Metaphone metaphone = new Metaphone();
        assertEquals("P", metaphone.metaphone("P"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone8_wZWM7() {
        Metaphone metaphone = new Metaphone();
        assertEquals("Q", metaphone.metaphone("Q"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone9_LBUp8() {
        Metaphone metaphone = new Metaphone();
        assertEquals("S", metaphone.metaphone("S"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone10_jujH9() {
        Metaphone metaphone = new Metaphone();
        assertEquals("T", metaphone.metaphone("T"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone11_yYNn10() {
        Metaphone metaphone = new Metaphone();
        assertEquals("V", metaphone.metaphone("V"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone12_KGWl11() {
        Metaphone metaphone = new Metaphone();
        assertEquals("W", metaphone.metaphone("W"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone13_OruP12() {
        Metaphone metaphone = new Metaphone();
        assertEquals("Y", metaphone.metaphone("Y"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone14_jwaw13() {
        Metaphone metaphone = new Metaphone();
        assertEquals("Z", metaphone.metaphone("Z"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone19_dcUn18() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("R");
        Assertions.assertEquals("R", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone20_vivg19() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("S");
        Assertions.assertEquals("S", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone21_MCpf20() {
        Metaphone metaphone = new Metaphone();
        String result = metaphone.metaphone("T");
        Assertions.assertEquals("T", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone2_YsgZ1() {
        Metaphone metaphone = new Metaphone();
        assertEquals("FNT", metaphone.metaphone("Find"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone3_qEYB2() {
        Metaphone metaphone = new Metaphone();
        assertEquals("FNT", metaphone.metaphone("Fined"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone4_CkiE3() {
        Metaphone metaphone = new Metaphone();
        assertEquals("KNT", metaphone.metaphone("Kind"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone5_vhVm4() {
        Metaphone metaphone = new Metaphone();
        assertEquals("KNT", metaphone.metaphone("Kined"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone6_Ljyi5() {
        Metaphone metaphone = new Metaphone();
        assertEquals("PNT", metaphone.metaphone("Pent"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone7_zHYV6() {
        Metaphone metaphone = new Metaphone();
        assertEquals("PNTT", metaphone.metaphone("Pented"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone8_VAOT7() {
        Metaphone metaphone = new Metaphone();
        assertEquals("TX", metaphone.metaphone("Tatch"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone9_Sqax8() {
        Metaphone metaphone = new Metaphone();
        assertEquals("TXT", metaphone.metaphone("Tetched"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone2_PooE1() {
        Metaphone metaphone = new Metaphone();
        assertEquals("FN", metaphone.metaphone("Phon"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone3_ffoh2() {
        Metaphone metaphone = new Metaphone();
        assertEquals("0N", metaphone.metaphone("Thon"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone11_mxIS10() {
        Metaphone metaphone = new Metaphone();
        assertEquals("A", metaphone.metaphone("A"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone12_YmDv11() {
        Metaphone metaphone = new Metaphone();
        assertEquals("E", metaphone.metaphone("E"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone13_mkxa12() {
        Metaphone metaphone = new Metaphone();
        assertEquals("I", metaphone.metaphone("I"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone14_RSdK13() {
        Metaphone metaphone = new Metaphone();
        assertEquals("O", metaphone.metaphone("O"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone15_uhOm14() {
        Metaphone metaphone = new Metaphone();
        assertEquals("U", metaphone.metaphone("U"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone16_HNlG15() {
        Metaphone metaphone = new Metaphone();
        assertEquals("B", metaphone.metaphone("B"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone17_rLxv16() {
        Metaphone metaphone = new Metaphone();
        assertEquals("C", metaphone.metaphone("C"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone18_ppTD17() {
        Metaphone metaphone = new Metaphone();
        assertEquals("D", metaphone.metaphone("D"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone20_kpgt19() {
        Metaphone metaphone = new Metaphone();
        assertEquals("H", metaphone.metaphone("H"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone21_kany20() {
        Metaphone metaphone = new Metaphone();
        assertEquals("J", metaphone.metaphone("J"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone22_qfEl21() {
        Metaphone metaphone = new Metaphone();
        assertEquals("L", metaphone.metaphone("L"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone23_xuzZ22() {
        Metaphone metaphone = new Metaphone();
        assertEquals("M", metaphone.metaphone("M"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMetaphone24_nUPZ23() {
        Metaphone metaphone = new Metaphone();
        assertEquals("N", metaphone.metaphone("N"));
    }
}