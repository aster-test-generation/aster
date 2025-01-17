/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPDouble_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_getDouble_12_UaxE12() {
	CPDouble cpDouble = new CPDouble(12.0);
	assertEquals(12.0, cpDouble.getDouble(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_getDouble_13_Psnx13() {
	CPDouble cpDouble = new CPDouble(13.0);
	assertEquals(13.0, cpDouble.getDouble(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_getDouble_14_acWm14() {
	CPDouble cpDouble = new CPDouble(14.0);
	assertEquals(14.0, cpDouble.getDouble(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_getDouble_15_cyEU15() {
	CPDouble cpDouble = new CPDouble(15.0);
	assertEquals(15.0, cpDouble.getDouble(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_getDouble_16_FjEk16() {
	CPDouble cpDouble = new CPDouble(16.0);
	assertEquals(16.0, cpDouble.getDouble(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_getDouble_17_qXvw17() {
	CPDouble cpDouble = new CPDouble(17.0);
	assertEquals(17.0, cpDouble.getDouble(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_getDouble_18_roxp18() {
	CPDouble cpDouble = new CPDouble(18.0);
	assertEquals(18.0, cpDouble.getDouble(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_getDouble_19_IjEJ19() {
	CPDouble cpDouble = new CPDouble(19.0);
	assertEquals(19.0, cpDouble.getDouble(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_getDouble_20_siLQ20() {
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompareTo_zEhE0_GyTy0_1() {
        CPDouble double1 = new CPDouble(1.0);
        CPDouble double2 = new CPDouble(1.0);
        CPDouble double3 = new CPDouble(1.0);
        assertEquals(0, double1.compareTo(double3));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompareTo_zEhE0_GyTy0_2() {
        CPDouble double1 = new CPDouble(1.0);
        CPDouble double2 = new CPDouble(1.0);
        CPDouble double3 = new CPDouble(1.0);
        assertFalse(double1.compareTo(double2) < 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompareTo_zEhE0_GyTy0_3() {
        CPDouble double1 = new CPDouble(1.0);
        CPDouble double2 = new CPDouble(1.0);
        CPDouble double3 = new CPDouble(1.0);
        assertFalse(double2.compareTo(double1) > 0);}
}