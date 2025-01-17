/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ColognePhonetic_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullObject_ryIj2() throws org.apache.commons.codec.EncoderException {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String encodedString = colognePhonetic.encode(null);
        assertNotNull(encodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_sNRD0() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String text = "Test";
        String expected = "0";
        String actual = colognePhonetic.colognePhonetic(text);
        assertEquals(expected, actual);
    }
}