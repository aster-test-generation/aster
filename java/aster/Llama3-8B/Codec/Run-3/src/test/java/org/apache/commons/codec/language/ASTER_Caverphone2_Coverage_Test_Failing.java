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

public class Aster_Caverphone2_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeEmptyString_YZbs0_DGiV0_fid2() {
        Caverphone2 caverphone2 = new Caverphone2();
        String result = caverphone2.encode("");
        assertEquals("00000", result);
    }
}