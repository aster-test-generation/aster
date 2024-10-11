/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ColognePhonetic_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_NullInput_nTEx0() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_EmptyString_YIdN1() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_SingleLetter_BmXe3() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("A");
        assertEquals("0", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_Umlauts_jSTu4() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("");
        assertEquals("000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_BasicWord_JfHN5() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("Hallo");
        assertEquals("05", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_ComplexWord_sZbo6() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("Brcke");
        assertEquals("174", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_Numbers_qOCB7() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("123");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_SpecialCharacters_Vyei8() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("#$%");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_MixedInput_jIwy9() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("Test123!");
        assertEquals("28", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_LongText_MbIF10() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("Dies ist ein langer Text zum Testen der Cologne Phonetic Methode.");
        assertEquals("28 082 06 564 2868 862 2826 27 064 856", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_Capitalization_dmnv11() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("TeSt");
        assertEquals("28", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_IgnoreH_GPtj12() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("Hase");
        assertEquals("08", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_PH_hnwV13() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("Phonetic");
        assertEquals("36", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_CK_Setc14() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("Back");
        assertEquals("14", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_DT_AyZP15() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("Daten");
        assertEquals("26", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_X_oNWv16() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("Fax");
        assertEquals("48", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_SZ_MdBK17() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("Fu");
        assertEquals("38", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_MultipleWords_Iqgo18() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("Mnchen ist schn");
        assertEquals("664 082 86", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_LetterR_wnEZ19() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("Rosen");
        assertEquals("76", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_LetterL_blnE20() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("Leipzig");
        assertEquals("518", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_LetterM_RKnu21() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("Mann");
        assertEquals("66", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_LetterN_rUhh22() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("Namen");
        assertEquals("66", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_ComplexCases_tHtf23() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("Csar");
        assertEquals("487", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_LeadingC_ayuv24() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("Cello");
        assertEquals("85", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_CombinedCases_IWKT25() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("Xylophon");
        assertEquals("486", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_AEIJOUY_ePjo3() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("AEIJOUY");
        assertEquals("0000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_B_qmhZ4() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("B");
        assertEquals("1", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_P_SgFT5() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("P");
        assertEquals("1", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_PH_YnOM6() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("PH");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_DT_nrWw7() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("DT");
        assertEquals("22", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_FPVW_rppa8() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("FPVW");
        assertEquals("3333", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_GKQ_OzRx9() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("GKQ");
        assertEquals("444", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_X_TRKo10() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("X");
        assertEquals("48", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_SZ_mafC11() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("SZ");
        assertEquals("88", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_C_ApBV12() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("C");
        assertEquals("8", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_CK_sjHb13() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("CK");
        assertEquals("48", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_R_oYwM14() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("R");
        assertEquals("7", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_L_RYRO15() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("L");
        assertEquals("5", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_MN_pPLQ16() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("MN");
        assertEquals("66", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_H_Czwy17() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("H");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_MixedInput_sTQP18() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("Hello World");
        assertEquals("57", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_CombinedCases_rfhc19() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("Bach");
        assertEquals("84", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_RepeatedCharacters_Vnnn20() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("AAA");
        assertEquals("000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_ComplexString_DBVi21() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("Cryptography");
        assertEquals("84792", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_NumbersAndLetters_QNZu22() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("A1B2C3");
        assertEquals("018", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_SpecialCharacters_ahSS23() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("@#%&*!");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_CaseSensitivity_WExm24() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("abc");
        assertEquals("018", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_LongString_dfzw25() throws Exception {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        assertEquals("01760278448407278", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqualWithSimilarSounds_agao0() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        boolean result = colognePhonetic.isEncodeEqual("Meyer", "Meier");
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithValidString_mLYO0() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String input = "Test";
        String expected = "282"; // Assuming 'Test' encodes to '282'
        String result = (String) colognePhonetic.encode(input);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmptyString_SzgN0() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.encode("");
        assertEquals("", result);
    }
}