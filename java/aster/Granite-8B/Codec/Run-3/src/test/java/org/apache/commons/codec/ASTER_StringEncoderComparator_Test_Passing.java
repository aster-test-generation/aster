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
    public void testCompare_xqNQ0() throws Exception {
        Nysiis nysiis = new Nysiis();
        StringEncoderComparator comparator = new StringEncoderComparator(nysiis);
        Object o1 = new Object();
        Object o2 = new Object();
        int compareCode = comparator.compare(o1, o2);
        assertEquals(0, compareCode);
    }
}