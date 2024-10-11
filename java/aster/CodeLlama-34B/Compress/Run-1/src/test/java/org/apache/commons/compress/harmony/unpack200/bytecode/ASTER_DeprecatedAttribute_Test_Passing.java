/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DeprecatedAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_RmmN0() {
    DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
    int length = deprecatedAttribute.getLength();
    assertEquals(0, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLengthWithNegativeLength_QHss2() {
    DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
    int length = deprecatedAttribute.getLength();
    assertNotEquals(-1, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLengthWithInvalidStringAndZeroLength_lYDY18() {
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setUp_rfCE0_nebq0() {
    DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
    assertEquals(0, deprecatedAttribute.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLengthWithNonZeroLength_okTT1_fid1() {
    DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
    int length = deprecatedAttribute.getLength();
}
}