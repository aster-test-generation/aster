/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_ColognePhonetic_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticNullInput_yBpa0() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic(null);
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticEmptyInput_SqpJ1() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("");
        Assertions.assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticSingleCharacterInput_GCYf2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("A");
        Assertions.assertEquals("0", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticNumberInput_TqtV8() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("1234567890");
        Assertions.assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_YagG0() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String text1 = "Hello";
        String text2 = "Hello";
        boolean result = colognePhonetic.isEncodeEqual(text1, text2);
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeString_MeCp0() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        Object result = colognePhonetic.encode("test");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticMultipleCharacterInput_hNST3_fid2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("AEIOU");
        Assertions.assertEquals("0", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticSpecialCharacterInput_moSq4_fid2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("AEIOU!");
        Assertions.assertEquals("0", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticGermanCapitalInput_rndH7_fid2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        Assertions.assertEquals("018234456147823488", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticGermanLowercaseInput_aPAO8_fid2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("abcdefghijklmnopqrstuvwxyz");
        Assertions.assertEquals("018234456147823488", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhoneticGermanMixedCaseInput_cmeA9_fid2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("aAbBcCdDeEfFgGhHiIoOpPqQrRsStUuVwWxXyYzZ");
        Assertions.assertEquals("01823414782348488", result);
    }
}