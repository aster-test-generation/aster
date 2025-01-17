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

public class Aster_SoundexUtils_Coverage_Test_Passing {
    {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferenceEncodedWithNullInput_TvNB0() {
        String es1 = null;
        String es2 = "123";
        int diff = SoundexUtils.differenceEncoded(es1, es2);
        assertEquals(0, diff);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferenceEncodedWithEmptyInput_PiHN1() {
        String es1 = "";
        String es2 = "";
        int diff = SoundexUtils.differenceEncoded(es1, es2);
        assertEquals(0, diff);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferenceEncodedWithNonNullAndNonEmptyInput_aLSU2() {
        String es1 = "abc";
        String es2 = "def";
        int diff = SoundexUtils.differenceEncoded(es1, es2);
        assertEquals(0, diff);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmpty_sMeU0() {
        SoundexUtils soundexUtils = new SoundexUtils();
        boolean isEmpty = soundexUtils.isEmpty(null);
        assertTrue(isEmpty);
    }
}