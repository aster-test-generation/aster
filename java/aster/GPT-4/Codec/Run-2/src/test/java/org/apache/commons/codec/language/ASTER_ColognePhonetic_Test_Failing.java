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

public class Aster_ColognePhonetic_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_AEIJOUY_EleH3_fid2() {
        ColognePhonetic cp = new ColognePhonetic();
        assertEquals("000000", cp.colognePhonetic("AEIJOUY"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_PH_dZhv6() {
        ColognePhonetic cp = new ColognePhonetic();
        assertEquals("", cp.colognePhonetic("PH"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_FPVW_wAcb9_fid2() {
        ColognePhonetic cp = new ColognePhonetic();
        assertEquals("333", cp.colognePhonetic("FPVW"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_GKQ_OZVN10_fid2() {
        ColognePhonetic cp = new ColognePhonetic();
        assertEquals("444", cp.colognePhonetic("GKQ"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_MN_bbTM18_fid2() {
        ColognePhonetic cp = new ColognePhonetic();
        assertEquals("66", cp.colognePhonetic("MN"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_MixedCase_vBCp20_fid2() {
        ColognePhonetic cp = new ColognePhonetic();
        assertEquals("178", cp.colognePhonetic("MnR"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_ComplexString_XiHS21_fid2() {
        ColognePhonetic cp = new ColognePhonetic();
        assertEquals("481", cp.colognePhonetic("XBF"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_NumbersAndLetters_wRDT22_fid2() {
        ColognePhonetic cp = new ColognePhonetic();
        assertEquals("481", cp.colognePhonetic("123XBF456"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_SpecialCharacters_KLvc23_fid2() {
        ColognePhonetic cp = new ColognePhonetic();
        assertEquals("481", cp.colognePhonetic("@XBF#"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_RepeatedCharacters_AGXU25_fid2() {
        ColognePhonetic cp = new ColognePhonetic();
        assertEquals("111", cp.colognePhonetic("BBB"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticWithUmlautA_UGMq2_fid2() {
        ColognePhonetic cp = new ColognePhonetic();
        String result = cp.colognePhonetic("");
        assertEquals("0", result);
    }
}