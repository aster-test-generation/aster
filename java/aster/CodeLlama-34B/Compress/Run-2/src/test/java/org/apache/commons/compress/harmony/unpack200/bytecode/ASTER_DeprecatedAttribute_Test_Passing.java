/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DeprecatedAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithMultipleNonPrintableCharactersAndNullAndSpecialCharacters_jHzj17() {
        String expected = "Deprecated\u0001Attribute\u0001";
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_EYhH0() {
    DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
    int length = deprecatedAttribute.getLength();
    assertEquals(0, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void writeBody(DataOutputStream dos) throws IOException {
        dos.writeUTF("");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLengthWithNegativeLength_zMVL2_fid1() {
    DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
    int length = deprecatedAttribute.getLength();
    assertFalse(length < 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLengthWithPositiveLength_qttz3_fid1() {
    DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
    int length = deprecatedAttribute.getLength();
    assertFalse(length > 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLengthWithNonEmptyArray_EBBg12_fid1() {
    DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
    int length = deprecatedAttribute.getLength();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithMultipleTabs_hmsf9_TFwJ1_fid1() {
    DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
    String expected = "Deprecated\tAttribute\t";
    String actual = deprecatedAttribute.toString();
}
}