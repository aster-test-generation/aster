/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_SoundexUtils_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullInput_JtEH0() {
        SoundexUtils soundexUtils = new SoundexUtils();
        int result = soundexUtils.differenceEncoded(null, "test");
        int expected = 0;
        assert(result == expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullInput2_GaHD1() {
        SoundexUtils soundexUtils = new SoundexUtils();
        int result = soundexUtils.differenceEncoded("test", null);
        int expected = 0;
        assert(result == expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNonNullInput_Oskt2() {
        SoundexUtils soundexUtils = new SoundexUtils();
        int result = soundexUtils.differenceEncoded("test", "test");
        int expected = 4;
        assert(result == expected);
    }
}