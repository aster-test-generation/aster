/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPInt_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCompareTo_Equal_qMLo0() {
    CPInt cpInt1 = new CPInt(10);
    CPInt cpInt2 = new CPInt(10);
    int result = cpInt1.compareTo(cpInt2);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCompareTo_Greater_mXKP1() {
    CPInt cpInt1 = new CPInt(10);
    CPInt cpInt2 = new CPInt(5);
    int result = cpInt1.compareTo(cpInt2);
    assertTrue(result > 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCompareTo_Less_wQLt2() {
    CPInt cpInt1 = new CPInt(5);
    CPInt cpInt2 = new CPInt(10);
    int result = cpInt1.compareTo(cpInt2);
    assertTrue(result < 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInt_NupG0() {
        CPInt cpInt = new CPInt(10);
        int result = cpInt.getInt();
        assertEquals(10, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIntWithNegativeValue_uCbg1() {
        CPInt cpInt = new CPInt(-10);
        int result = cpInt.getInt();
        assertEquals(-10, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIntWithZeroValue_qEOz2() {
        CPInt cpInt = new CPInt(0);
        int result = cpInt.getInt();
        assertEquals(0, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIntWithMaxValue_WNSW3() {
        CPInt cpInt = new CPInt(Integer.MAX_VALUE);
        int result = cpInt.getInt();
        assertEquals(Integer.MAX_VALUE, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIntWithMinValue_KzrU4() {
        CPInt cpInt = new CPInt(Integer.MIN_VALUE);
        int result = cpInt.getInt();
        assertEquals(Integer.MIN_VALUE, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIntWithInvalidValue4_sCTZ8_xAhx0() {
    CPInt cpInt = new CPInt(1);
    int result = cpInt.getInt();
    assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIntWithInvalidValue7_cYRD11_dQxK0() {
    CPInt cpInt = new CPInt(7);
    int result = cpInt.getInt();
    assertEquals(7, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIntWithInvalidValue9_RQZq13_Psyl0() {
    CPInt cpInt = new CPInt(9);
    int result = cpInt.getInt();
    assertEquals(9, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIntWithInvalidValue6_otnb10_HXte0_fid1() {
    CPInt cpInt = new CPInt(1);
    int result = cpInt.getInt();
}
}