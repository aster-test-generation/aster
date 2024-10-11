/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ColognePhonetic_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_WithStringObject_ReturnsEncodedString_vlCM1() throws EncoderException {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = (String) colognePhonetic.encode("Hello");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_WithEmptyStringObject_ReturnsEncodedString_JRLk3() throws EncoderException {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = (String) colognePhonetic.encode("");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_A_Umlaut_yOfx0() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_Capital_A_Umlaut_OVpD3() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("".toUpperCase(Locale.GERMAN));
        assertNotNull(result);
    }
}