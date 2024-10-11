/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_NullPointer_Coverage_Test_Passing {
    public void testHashCode_ZVHg0() {
        NullPointer nullPointer = new NullPointer(new Locale("en"), "id");
        assertEquals(0, nullPointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_qaAe0() {
        NullPointer np = new NullPointer(new Locale("en"), "id");
        NullPointer np2 = new NullPointer(new Locale("en"), "id");
        assertEquals(true, np.equals(np2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_SwQU1_fid2() {
        NullPointer np = new NullPointer(new Locale("en"), "id");
        NullPointer np2 = new NullPointer(new Locale("en"), "id1");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test5_zkqK4_fid2() {
        NullPointer np = new NullPointer(new Locale("en"), "id");
        NullPointer np2 = new NullPointer(new Locale("en"), "id1");
        assertEquals(true, np.equals(np2));
    }
}