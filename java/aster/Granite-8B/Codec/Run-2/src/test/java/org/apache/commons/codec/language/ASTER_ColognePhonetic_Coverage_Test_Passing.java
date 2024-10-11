/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ColognePhonetic_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_pFJm0() throws org.apache.commons.codec.EncoderException {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        Object object = new Object();
        try {
            colognePhonetic.encode(object);
            fail("Expected EncoderException to be thrown");
        } catch (EncoderException e) {
            assertTrue(e.getMessage().contains("This method's parameter was expected to be of the type java.lang.String"));
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringObject_wdHO1() throws org.apache.commons.codec.EncoderException {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String object = "test";
        String encodedString = colognePhonetic.encode(object);
        assertNotNull(encodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmptyStringObject_NxEp3() throws org.apache.commons.codec.EncoderException {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String object = "";
        String encodedString = colognePhonetic.encode(object);
        assertNotNull(encodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_sNRD282() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String text = "Test";
        String expected = "282";
        String actual = colognePhonetic.colognePhonetic(text);
        assertEquals(expected, actual);
    }
}