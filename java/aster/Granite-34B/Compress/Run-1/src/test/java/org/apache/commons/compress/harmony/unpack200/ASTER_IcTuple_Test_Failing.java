/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_IcTuple_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOuterClassIndex_PEho0() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
        int actual = icTuple.outerClassIndex();
        int expected = 4;
        assert actual == expected;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNestedExplicitFlagSet_1_uqps1() {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 0, 0, 0, 0);
    boolean actual = icTuple.nestedExplicitFlagSet();
    boolean expected = true;
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOuterIsAnonymous_true_HGRT1() {
        IcTuple tuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
        boolean result = tuple.outerIsAnonymous();
        assert result == true;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPredictedTrue_kXJv0() {
    IcTuple tuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
    assertTrue(tuple.predicted());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSimpleClassNameIndex_fULP0() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
        int actual = icTuple.simpleClassNameIndex();
        int expected = 0; // Replace with the expected value
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAnonymous_KzaC0() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
        boolean expected = true;
        boolean actual = icTuple.isAnonymous();
        assert actual == expected;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAnonymous_VeKE1() {
        IcTuple icTuple1 = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
        boolean expected1 = true;
        boolean actual1 = icTuple1.isAnonymous();
        assert actual1 == expected1;
        IcTuple icTuple2 = new IcTuple("C", 1, "C2", "N", 1, 2, 3, 4);
        boolean expected2 = false;
        boolean actual2 = icTuple2.isAnonymous();
        assert actual2 == expected2;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOuterString_qtfF0() {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
    assertEquals("cachedOuterClassString", icTuple.outerClassString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testThisClassIndex_1_BNPi0() {
    IcTuple icTuple = new IcTuple("C", 0, "C2", "N", 0, 0, 0, 0);
    int actual = icTuple.thisClassIndex();
    int expected = 0;
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testThisClassString_1_FXOb0() {
    IcTuple icTuple = new IcTuple("C", 0, "C2", "N", 0, 0, 0, 0);
    String actual = icTuple.thisClassString();
    assertEquals("C", actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsMember_2_jzSm1() {
        IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 2, 3, 4, 5);
        boolean expected = false;
        boolean actual = icTuple.isMember();
        assert actual == expected;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_aVRX0() {
    IcTuple icTuple = new IcTuple("C", 1, "C2", "N", 1, 1, 1, 1);
    assertEquals("IcTuple (simpleClassName() in outerClassString())", icTuple.toString());
}
}