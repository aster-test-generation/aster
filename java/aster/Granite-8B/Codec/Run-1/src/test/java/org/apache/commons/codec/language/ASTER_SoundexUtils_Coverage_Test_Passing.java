/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_SoundexUtils_Coverage_Test_Passing {
    {
    }

    int diff = 0;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferenceEncoded_XwOz0_DxSa0() {
        SoundexUtils soundexUtils = new SoundexUtils();
        String es1 = "";
        String es2 = "";
        int diff = soundexUtils.differenceEncoded(es1, es2);
        assertEquals(0, diff);
    }
}