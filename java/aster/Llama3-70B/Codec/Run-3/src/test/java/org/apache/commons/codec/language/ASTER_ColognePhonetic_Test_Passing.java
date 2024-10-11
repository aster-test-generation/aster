/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ColognePhonetic_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_String_kNUd0() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = (String) colognePhonetic.encode("Hello");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_mRhB0() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.encode("Schmidt");
        assertEquals("4623", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_SameText_ReturnsTrue_zfNA0() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String text1 = "Hello";
        String text2 = "Hello";
        assertTrue(colognePhonetic.isEncodeEqual(text1, text2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticNull_MFCM0() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        Assertions.assertNull(colognePhonetic.colognePhonetic(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticEmptyString_RJMk1() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        Assertions.assertEquals("", colognePhonetic.colognePhonetic(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticA_xYZM2() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        Assertions.assertEquals("0", colognePhonetic.colognePhonetic("A"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticB_CbPb3() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        Assertions.assertEquals("1", colognePhonetic.colognePhonetic("B"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticC_dwbJ4() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        Assertions.assertEquals("8", colognePhonetic.colognePhonetic("C"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticD_ONTY5() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        Assertions.assertEquals("2", colognePhonetic.colognePhonetic("D"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticE_ziig6() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        Assertions.assertEquals("0", colognePhonetic.colognePhonetic("E"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticF_pvGS7() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        Assertions.assertEquals("3", colognePhonetic.colognePhonetic("F"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticG_WZDu8() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        Assertions.assertEquals("4", colognePhonetic.colognePhonetic("G"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticH_wHyc9() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        Assertions.assertEquals("", colognePhonetic.colognePhonetic("H"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticI_cUMn10() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        Assertions.assertEquals("0", colognePhonetic.colognePhonetic("I"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticJ_DCHq11() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        Assertions.assertEquals("0", colognePhonetic.colognePhonetic("J"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticK_cQTF12() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        Assertions.assertEquals("4", colognePhonetic.colognePhonetic("K"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticL_PzFh13() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        Assertions.assertEquals("5", colognePhonetic.colognePhonetic("L"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticM_pCYe14() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        Assertions.assertEquals("6", colognePhonetic.colognePhonetic("M"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticN_DWcq15() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        Assertions.assertEquals("6", colognePhonetic.colognePhonetic("N"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticO_jSkh16() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        Assertions.assertEquals("0", colognePhonetic.colognePhonetic("O"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticP_tjvK17() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        Assertions.assertEquals("1", colognePhonetic.colognePhonetic("P"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticQ_TCtH18() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        Assertions.assertEquals("4", colognePhonetic.colognePhonetic("Q"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticR_KPDu19() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        Assertions.assertEquals("7", colognePhonetic.colognePhonetic("R"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticS_iEGr20() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticNullInput_MMXN0() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticEmptyInput_hXgx1() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticAEIJOUY_LsRB2() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("AEIJOUY");
        assertEquals("0000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticBP_PgRe3() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("BP");
        assertEquals("11", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticDT_aoiv4() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("DT");
        assertEquals("22", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticFPVW_gdTj5() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("FPVW");
        assertEquals("3333", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticGKQ_nCQi6() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("GKQ");
        assertEquals("444", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticX_Mlla7() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("X");
        assertEquals("48", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticSZ_Vbal8() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("SZ");
        assertEquals("88", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticC_tMXN9() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("C");
        assertEquals("4", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticDTX_mAXH10() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("DTX");
        assertEquals("888", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticR_guuI11() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("R");
        assertEquals("7", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticL_dZjG12() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("L");
        assertEquals("5", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticMN_icUR13() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("MN");
        assertEquals("66", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticH_liDN14() throws Exception {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("H");
        assertEquals("", result);
    }
}