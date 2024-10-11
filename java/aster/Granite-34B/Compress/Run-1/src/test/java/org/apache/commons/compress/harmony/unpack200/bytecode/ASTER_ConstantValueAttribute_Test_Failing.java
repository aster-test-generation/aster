/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ConstantValueAttribute_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_kqcA0() {
        ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute(new ByteCode(1));
        assertEquals(-111517308, constantValueAttribute.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithNullEntry_gAMF1() {
        ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute(null);
        assertEquals(31, constantValueAttribute.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void writeBodyTest_branchCoverage_vfzg2() throws IOException {
        ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute(new ByteCode(1));
        DataOutputStream dos = new DataOutputStream(System.out);
        constantValueAttribute.writeBody(dos);
        constantValueAttribute.writeBody(null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResolve_tvXu0() {
        ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute(new ByteCode(1));
        ClassConstantPool classConstantPool = new ClassConstantPool();
        constantValueAttribute.resolve(classConstantPool);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResolveWithNullPool_CFJx1() {
        ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute(new ByteCode(1));
        constantValueAttribute.resolve(null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithEqualObjects_gcYK3_fid2() {
        ConstantValueAttribute attribute1 = new ConstantValueAttribute(new ByteCode(1));
        ConstantValueAttribute attribute2 = new ConstantValueAttribute(new ByteCode(1));
        assertTrue(attribute1.equals(attribute2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToString_pnTz0_fid2() {
		ByteCode bytecode = new ByteCode(1);
		ConstantValueAttribute attribute = new ConstantValueAttribute(bytecode);
		assertEquals("Constant:ByteCode [opcode=1, nested=null]", attribute.toString());
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToStringWithNestedByteCode_yNio1_fid2() {
		ByteCode bytecode = new ByteCode(1, new ClassFileEntry[0]);
		ConstantValueAttribute attribute = new ConstantValueAttribute(bytecode);
		assertEquals("Constant:ByteCode [opcode=1, nested=[]]", attribute.toString());
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_kqcA0_fid2() {
        ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute(new ByteCode(1));
        assertEquals(32, constantValueAttribute.hashCode());
    }
}