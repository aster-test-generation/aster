/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BaseNCodecInputStream_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkipWithNegativeLength_AkrF0() throws java.io.IOException {
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, false);
        try {
            baseNCodecInputStream.skip(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Negative skip length: -1", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkipWithZeroLength_DtKM1() throws java.io.IOException {
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, false);
        assertEquals(0, baseNCodecInputStream.skip(0));
    }
}