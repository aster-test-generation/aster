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

public class Aster_Caverphone1_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNullInput_botB0_Eupd0_fid3() {
        Caverphone1 caverphone1 = new Caverphone1();
        String result = caverphone1.encode(null);
        assertEquals("0000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeEmptyInput_YNWu1_XgfJ0_fid3() {
        Caverphone1 caverphone1 = new Caverphone1();
        String result = caverphone1.encode("");
        assertEquals("0000", result);
    }
}