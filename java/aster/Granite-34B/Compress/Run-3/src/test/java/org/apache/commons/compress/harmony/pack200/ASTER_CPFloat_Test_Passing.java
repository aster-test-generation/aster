/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPFloat_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testcompareTo_oJnH0() throws Exception {
    final float theFloat = 0.0F;
    final CPFloat cpfloat1 = new CPFloat(theFloat);
    final float theFloat2 = 0.0F;
    final CPFloat cpfloat2 = new CPFloat(theFloat2);
    final int expected = 0;
    final int actual = cpfloat1.compareTo(cpfloat2);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testcompareTo2_Mfwl1() throws Exception {
    final float theFloat = 1.0F;
    final CPFloat cpfloat1 = new CPFloat(theFloat);
    final float theFloat2 = 0.0F;
    final CPFloat cpfloat2 = new CPFloat(theFloat2);
    final int expected = 1;
    final int actual = cpfloat1.compareTo(cpfloat2);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testcompareTo3_anLd2() throws Exception {
    final float theFloat = 0.0F;
    final CPFloat cpfloat1 = new CPFloat(theFloat);
    final float theFloat2 = 1.0F;
    final CPFloat cpfloat2 = new CPFloat(theFloat2);
    final int expected = -1;
    final int actual = cpfloat1.compareTo(cpfloat2);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testcompareTo4_smxi3() throws Exception {
    final float theFloat = 1.0F;
    final CPFloat cpfloat1 = new CPFloat(theFloat);
    final float theFloat2 = 1.0F;
    final CPFloat cpfloat2 = new CPFloat(theFloat2);
    final int expected = 0;
    final int actual = cpfloat1.compareTo(cpfloat2);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFloat_pKxq0() throws Exception {
        CPFloat floatObject = new CPFloat(1.0f);
        float result = floatObject.getFloat();
        assertEquals(1.0f, result, 0.0f);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFloat_zero_kViR1() throws Exception {
        CPFloat floatObject = new CPFloat(0.0f);
        float result = floatObject.getFloat();
        assertEquals(0.0f, result, 0.0f);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFloat_negative_niYW2() throws Exception {
        CPFloat floatObject = new CPFloat(-1.0f);
        float result = floatObject.getFloat();
        assertEquals(-1.0f, result, 0.0f);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFloat_maxValue_UbMR4() throws Exception {
        CPFloat floatObject = new CPFloat(Float.MAX_VALUE);
        float result = floatObject.getFloat();
        assertEquals(Float.MAX_VALUE, result, 0.0f);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFloat_minValue_fHVx5() throws Exception {
        CPFloat floatObject = new CPFloat(Float.MIN_VALUE);
        float result = floatObject.getFloat();
        assertEquals(Float.MIN_VALUE, result, 0.0f);
    }
}