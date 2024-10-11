/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPFloat_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareTo_gQcJ0() {
        CPFloat obj1 = new CPFloat(10.0f);
        CPFloat obj2 = new CPFloat(20.0f);
        assertEquals(-1, obj1.compareTo(obj2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareTo_lJnd1() {
        CPFloat obj1 = new CPFloat(10.0f);
        CPFloat obj2 = new CPFloat(10.0f);
        assertEquals(0, obj1.compareTo(obj2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareTo_oCXc2() {
        CPFloat obj1 = new CPFloat(20.0f);
        CPFloat obj2 = new CPFloat(10.0f);
        assertEquals(1, obj1.compareTo(obj2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFloat_tJJI0() {
        CPFloat floatObj = new CPFloat(10.5f);
        float actual = floatObj.getFloat();
        float expected = 10.5f;
        assertEquals(expected, actual, 0.0);
    }
}