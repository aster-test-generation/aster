/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DeprecatedAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_SDkE0() {
        DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
        String expected = "Deprecated Attribute";
        String actual = deprecatedAttribute.toString();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getLengthTest_aWEY0() {
        DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
        int actual = deprecatedAttribute.getLength();
        int expected = 0;
        assert actual == expected;
    }
}