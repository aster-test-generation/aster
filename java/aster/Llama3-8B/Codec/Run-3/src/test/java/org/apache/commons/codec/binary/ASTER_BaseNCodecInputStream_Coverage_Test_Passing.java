/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BaseNCodecInputStream_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkipNegativeLength_ZNZT0() throws java.io.IOException {
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, false);
        try {
            baseNCodecInputStream.skip(-1);
            assert false;
        } catch (IllegalArgumentException e) {
            assert true;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkipZeroLength_XmDl1() throws java.io.IOException {
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, false);
        long result = baseNCodecInputStream.skip(0);
        assert result == 0;
    }
}