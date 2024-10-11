/**
 * Generated by Aster
 */
package org.apache.commons.codec;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.language.Nysiis;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_StringEncoderComparator_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareWithEqualStrings_KQkg0() {
        Nysiis nysiisEncoder = new Nysiis();
        StringEncoderComparator comparator = new StringEncoderComparator(nysiisEncoder);
        String s1 = "test";
        String s2 = "test";
        int result = comparator.compare(s1, s2);
        assertEquals(0, result);
    }
}