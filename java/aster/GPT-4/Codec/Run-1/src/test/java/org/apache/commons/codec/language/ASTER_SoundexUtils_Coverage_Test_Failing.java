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

public class Aster_SoundexUtils_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferenceEncodedWithPartialMatches_iYJG3_zVPX0_fid3() {
        assertEquals(2, SoundexUtils.differenceEncoded("A123", "A153"));
    }
}