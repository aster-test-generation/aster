/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_InnerClassesAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringCoverage_Rneo2() {
        InnerClassesAttribute attribute = new InnerClassesAttribute("test");
        attribute.toString();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameObject_aRVx0() {
        final InnerClassesAttribute attribute = new InnerClassesAttribute("name");
        final boolean result = attribute.equals(attribute);
        assert result;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNullObject_McXv1() {
        final InnerClassesAttribute attribute = new InnerClassesAttribute("name");
        final boolean result = attribute.equals(null);
        assert !result;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithObjectOfDifferentClass_onoI2() {
        final InnerClassesAttribute attribute = new InnerClassesAttribute("name");
        final boolean result = attribute.equals(new Object());
        assert !result;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithObjectOfSameClassAndNullName_hbGw3() {
        final InnerClassesAttribute attribute = new InnerClassesAttribute(null);
        final InnerClassesAttribute other = new InnerClassesAttribute(null);
        final boolean result = attribute.equals(other);
        assert result;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithObjectOfSameClassAndNonNullName_FFSa4() {
        final InnerClassesAttribute attribute = new InnerClassesAttribute("name");
        final InnerClassesAttribute other = new InnerClassesAttribute("name");
        final boolean result = attribute.equals(other);
        assert result;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNestedClassFileEntriesTest_tBeg0() {
        InnerClassesAttribute innerClassesAttribute = new InnerClassesAttribute("name");
        ClassFileEntry[] result = innerClassesAttribute.getNestedClassFileEntries();
        assertNotEquals(0, result.length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testWriteBody_xqoJ0() throws IOException {
        InnerClassesAttribute attribute = new InnerClassesAttribute("name");
        DataOutputStream dos = new DataOutputStream(System.out);
        attribute.writeBody(dos);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEntries_hozq1() {
        ClassConstantPool classConstantPool = new ClassConstantPool();
        assertNotNull(classConstantPool.entries());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_XKOf6() {
        CPUTF8 utf81 = new CPUTF8("test1");
        CPUTF8 utf82 = new CPUTF8("test2");
        assertTrue(utf81.hashCode() != utf82.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnderlyingString_zJPq5() {
        CPUTF8 utf8 = new CPUTF8("test");
        assertEquals("test", utf8.underlyingString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNotEquals_qIDS3_EsKD0() {
        CPUTF8 utf81 = new CPUTF8("test1", 1);
        CPUTF8 utf82 = new CPUTF8("test2", 2);
        assertFalse(utf81.equals(utf82));
    }
}