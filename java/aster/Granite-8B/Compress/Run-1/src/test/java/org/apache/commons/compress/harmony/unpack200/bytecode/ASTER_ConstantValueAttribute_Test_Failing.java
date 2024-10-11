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
public class Aster_ConstantValueAttribute_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_uKTy0_fid2() {
        ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute(new ByteCode(1));
        String expected = "Constant:ConstantValueAttribute:1";
        String actual = constantValueAttribute.toString();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_pmGZ1_fid2() {
        ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute(new ByteCode(1, new ClassFileEntry[0]));
        String expected = "Constant:ConstantValueAttribute:1";
        String actual = constantValueAttribute.toString();
        assertEquals(expected, actual);
    }
}