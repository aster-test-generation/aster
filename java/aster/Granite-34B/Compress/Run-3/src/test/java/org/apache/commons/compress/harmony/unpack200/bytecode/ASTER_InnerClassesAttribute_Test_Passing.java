/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import org.apache.commons.compress.harmony.unpack200.Segment;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_InnerClassesAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testToString_OBkN0() throws Exception {
        InnerClassesAttribute attribute = new InnerClassesAttribute("name");
        String actual = attribute.toString();
        String expected = "InnerClasses: " + attribute.getAttributeName();
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNestedClassFileEntriesTest_WwDd0() throws Exception {
        InnerClassesAttribute innerClassesAttribute = new InnerClassesAttribute("name");
        ClassFileEntry[] expected = new ClassFileEntry[0];
        ClassFileEntry[] actual = innerClassesAttribute.getNestedClassFileEntries();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResolve_XAgC2() throws Exception {
        ClassConstantPool classConstantPool = new ClassConstantPool();
        Segment segment = new Segment();
        classConstantPool.resolve(segment);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void writeBodyTest1_QOsd0() throws IOException {
        InnerClassesAttribute attribute = new InnerClassesAttribute("name");
        DataOutputStream dos = new DataOutputStream(System.out);
        attribute.writeBody(dos);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setAttributeName_WhenValidInput_SetsAttributeName_uFKK0() throws Exception {
        CPUTF8 cpUTF8Value = new CPUTF8("validName");
        InnerClassesAttribute.setAttributeName(cpUTF8Value);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setAttributeName_WhenNullInput_SetsAttributeNameToNull_bloC1() throws Exception {
        CPUTF8 cpUTF8Value = null;
        InnerClassesAttribute.setAttributeName(cpUTF8Value);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setAttributeName_WhenEmptyInput_SetsAttributeNameToEmpty_dbga2() throws Exception {
        CPUTF8 cpUTF8Value = new CPUTF8("");
        InnerClassesAttribute.setAttributeName(cpUTF8Value);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_qtnM0() throws Exception {
        InnerClassesAttribute innerClassesAttribute = new InnerClassesAttribute("name");
        assertEquals(31 + "name".hashCode(), innerClassesAttribute.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithNullAttributeName_Btqn1() throws Exception {
        InnerClassesAttribute innerClassesAttribute = new InnerClassesAttribute(null);
        assertEquals(31, innerClassesAttribute.hashCode());
    }
}