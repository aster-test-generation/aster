/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DeprecatedAttribute_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLengthWithNonZeroLength_dWef1() {
    DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
    int length = deprecatedAttribute.getLength();
    assertNotEquals(0, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLengthWithNegativeLength_zMVL2() {
    DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
    int length = deprecatedAttribute.getLength();
    assertTrue(length < 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLengthWithPositiveLength_qttz3() {
    DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
    int length = deprecatedAttribute.getLength();
    assertTrue(length > 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLengthWithMaxValue_aGqt4() {
    DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
    int length = deprecatedAttribute.getLength();
    assertEquals(Integer.MAX_VALUE, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLengthWithMinValue_eXni5() {
    DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
    int length = deprecatedAttribute.getLength();
    assertEquals(Integer.MIN_VALUE, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLengthWithNull_BnZR7() {
    DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
    int length = deprecatedAttribute.getLength();
    assertNull(length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithEmptyString_djRn3_ITbg1() {
    String expected = "";
    DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
    String actual = deprecatedAttribute.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithMultipleTabs_hmsf9_TFwJ1() {
    DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
    String expected = "Deprecated\tAttribute\t";
    String actual = deprecatedAttribute.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithSpecialCharacters_zcaw10_CSnv1() {
    DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
    String expected = "Deprecated\u0000Attribute";
    String actual = deprecatedAttribute.toString();
    assertEquals(expected, actual);
}
}