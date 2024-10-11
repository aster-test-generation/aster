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

public class Aster_Caverphone1_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode1_Aygb0_fid2() {
        Caverphone1 caverphone1 = new Caverphone1();
        String source = "test";
        String expected = "T3S3";
        String actual = caverphone1.encode(source);
        assertEquals(expected, actual);
    }
}