/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ConstantValueAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_lLCN0() {
        ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute(new ByteCode(1));
        String actual = constantValueAttribute.toString();
        String expected = "Constant:ConstantValueAttribute[opcode=1, nested=[]]";
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConstantValueAttributeGetLength_hwbH0() {
        ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute(new ByteCode(0));
        assertEquals(2, constantValueAttribute.getLength());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteBody_Grju0() throws IOException {
        ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute(new ByteCode(0));
        DataOutputStream dos = new DataOutputStream(System.out);
        constantValueAttribute.writeBody(dos);
        dos.flush();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_hqXU0() {
        ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute(new ByteCode(0));
        assertEquals(31, constantValueAttribute.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithNestedEntries_BRHf1() {
        ClassFileEntry[] nestedEntries = new ClassFileEntry[1];
        nestedEntries[0] = new ByteCode(0);
        ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute(new ByteCode(0, nestedEntries));
        assertEquals(62, constantValueAttribute.hashCode());
    }
}