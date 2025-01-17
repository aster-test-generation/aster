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
public class Aster_ConstantValueAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameObject_berM0() throws Exception {
        ConstantValueAttribute attribute = new ConstantValueAttribute(new ByteCode(1));
        assertTrue(attribute.equals(attribute));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNullObject_Urlu1() throws Exception {
        ConstantValueAttribute attribute = new ConstantValueAttribute(new ByteCode(1));
        assertTrue(!attribute.equals(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentClassObject_Ueuq2() throws Exception {
        ConstantValueAttribute attribute = new ConstantValueAttribute(new ByteCode(1));
        assertTrue(!attribute.equals(""));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithEqualObjects_UFhx3() throws Exception {
        ConstantValueAttribute attribute1 = new ConstantValueAttribute(new ByteCode(1));
        ConstantValueAttribute attribute2 = new ConstantValueAttribute(new ByteCode(1));
        assertTrue(attribute1.equals(attribute2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNonEqualObjects_UJEU4() throws Exception {
        ConstantValueAttribute attribute1 = new ConstantValueAttribute(new ByteCode(1));
        ConstantValueAttribute attribute2 = new ConstantValueAttribute(new ByteCode(2));
        assertTrue(!attribute1.equals(attribute2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLineCoverage_LRgb5() throws Exception {
        ConstantValueAttribute attribute = new ConstantValueAttribute(new ByteCode(1));
        attribute.equals(null);
        attribute.equals(attribute);
        attribute.equals("");
        attribute.equals(new ConstantValueAttribute(new ByteCode(1)));
        attribute.equals(new ConstantValueAttribute(new ByteCode(2)));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBranchCoverage_SplT6_1() throws Exception {
        ConstantValueAttribute attribute = new ConstantValueAttribute(new ByteCode(1));
        if (attribute.equals(null)) {
        } else {
        }
        if (attribute.equals(attribute)) {
        } else {
        }
        if (attribute.equals("")) {
        } else {
        }
        if (attribute.equals(new ConstantValueAttribute(new ByteCode(1)))) {
        } else {
        }
        if (attribute.equals(new ConstantValueAttribute(new ByteCode(2)))) {
        } else {
        }
            assertTrue(true);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBranchCoverage_SplT6_2() throws Exception {
        ConstantValueAttribute attribute = new ConstantValueAttribute(new ByteCode(1));
        if (attribute.equals(null)) {
        } else {
        }
        if (attribute.equals(attribute)) {
        } else {
        }
        if (attribute.equals("")) {
        } else {
        }
        if (attribute.equals(new ConstantValueAttribute(new ByteCode(1)))) {
        } else {
        }
        if (attribute.equals(new ConstantValueAttribute(new ByteCode(2)))) {
        } else {
        }
            assertTrue(false);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_pxhd0() throws Exception {
        ConstantValueAttribute attribute = new ConstantValueAttribute(new ByteCode(1));
        assertEquals("Constant:ByteCode [opcode=1, nested=null]", attribute.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNestedByteCode_Yjnr1() throws Exception {
        ConstantValueAttribute attribute = new ConstantValueAttribute(new ByteCode(1, new ClassFileEntry[0]));
        assertEquals("Constant:ByteCode [opcode=1, nested=[]]", attribute.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testLength_rbba0() throws Exception {
		ConstantValueAttribute attribute = new ConstantValueAttribute(new ByteCode(1));
		assertEquals(2, attribute.getLength());
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResolve_noIO0() throws Exception {
        ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute(new ByteCode(1));
        ClassConstantPool classConstantPool = new ClassConstantPool();
        constantValueAttribute.resolve(classConstantPool);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResolveWithNullPool_ZJSS1() throws Exception {
        ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute(new ByteCode(1));
        constantValueAttribute.resolve(null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResolveWithNullEntry_MkkO7() throws Exception {
        ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute(null);
        ClassConstantPool classConstantPool = new ClassConstantPool();
        constantValueAttribute.resolve(classConstantPool);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testWriteBody_mjie0() throws IOException {
        ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute(new ByteCode(1));
        DataOutputStream dos = new DataOutputStream(System.out);
        constantValueAttribute.writeBody(dos);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testWriteBodyWithCoverage_pvDk1() throws IOException {
        ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute(new ByteCode(1));
        DataOutputStream dos = new DataOutputStream(System.out);
        dos.writeShort(0);
        constantValueAttribute.writeBody(dos);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode1_WXUz0() throws Exception {
        ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute(new ByteCode(1));
        assertEquals(32, constantValueAttribute.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode2_kruM1() throws Exception {
        ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute(new ByteCode(2));
        assertEquals(33, constantValueAttribute.hashCode());
    }
}