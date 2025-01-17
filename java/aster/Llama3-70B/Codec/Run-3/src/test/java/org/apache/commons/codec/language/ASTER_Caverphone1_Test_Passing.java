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

public class Aster_Caverphone1_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNull_wlCl0() throws Exception {
        Caverphone1 caverphone1 = new Caverphone1();
        assertEquals("111111", caverphone1.encode(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeEmpty_Hesa1() throws Exception {
        Caverphone1 caverphone1 = new Caverphone1();
        assertEquals("111111", caverphone1.encode(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeValid_OFbK2() throws Exception {
        Caverphone1 caverphone1 = new Caverphone1();
        assertEquals("S111111", caverphone1.encode("Smith"));
    }
}