/**
 * Generated by Aster
 */
package org.apache.commons.codec;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.language.Nysiis;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_StringEncoderComparator_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareWithEqualStrings_Xwtc0() throws Exception {
        Nysiis nysiis = new Nysiis();
        StringEncoderComparator comparator = new StringEncoderComparator(nysiis);
        String s1 = "test";
        String s2 = "test";
        int result = comparator.compare(s1, s2);
        assertEquals(0, result);
    }
}