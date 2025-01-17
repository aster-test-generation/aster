/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DeprecatedAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testToString_cjeS0() {
        DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
        String actual = deprecatedAttribute.toString();
        String expected = "Deprecated Attribute";
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_CvwR0() {
    DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
    int actual = deprecatedAttribute.getLength();
    int expected = 0;
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteBody_Hhwe0() throws IOException {
        DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
        DataOutputStream dos = new DataOutputStream(System.out);
        deprecatedAttribute.writeBody(dos);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteBodyWithCoverage_ZgeP1() throws IOException {
        DeprecatedAttribute deprecatedAttribute = new DeprecatedAttribute();
        DataOutputStream dos = new DataOutputStream(System.out);
        deprecatedAttribute.writeBody(dos);
        deprecatedAttribute.writeBody(dos);
        deprecatedAttribute.writeBody(dos);
        deprecatedAttribute.writeBody(dos);
        deprecatedAttribute.writeBody(dos);
        deprecatedAttribute.writeBody(dos);
        deprecatedAttribute.writeBody(dos);
        deprecatedAttribute.writeBody(dos);
        deprecatedAttribute.writeBody(dos);
        deprecatedAttribute.writeBody(dos);
    }
}