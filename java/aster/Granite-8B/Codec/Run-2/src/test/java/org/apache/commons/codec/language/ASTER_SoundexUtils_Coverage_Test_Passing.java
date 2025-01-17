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

public class Aster_SoundexUtils_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferenceEncoded_ublH0() {
        String es1 = null;
        String es2 = null;
        int diff = SoundexUtils.differenceEncoded(es1, es2);
        assertEquals(0, diff);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferenceEncoded_vdrf2() {
        String es1 = "abc";
        String es2 = null;
        int diff = SoundexUtils.differenceEncoded(es1, es2);
        assertEquals(0, diff);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferenceEncoded_eelm3() {
        String es1 = null;
        String es2 = "abc";
        int diff = SoundexUtils.differenceEncoded(es1, es2);
        assertEquals(0, diff);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferenceEncoded_Untr4() {
        String es1 = "abc";
        String es2 = "abc";
        int diff = SoundexUtils.differenceEncoded(es1, es2);
        assertEquals(3, diff);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferenceEncoded_Kulg5() {
        String es1 = "abc";
        String es2 = "abcd";
        int diff = SoundexUtils.differenceEncoded(es1, es2);
        assertEquals(3, diff);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferenceEncoded_IjDC6() {
        String es1 = "abcd";
        String es2 = "abc";
        int diff = SoundexUtils.differenceEncoded(es1, es2);
        assertEquals(3, diff);
    }
}