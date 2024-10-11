/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_InnerClassesAttribute_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentAttributeName_muAx3() {
    InnerClassesAttribute obj1 = new InnerClassesAttribute("test1");
    InnerClassesAttribute obj2 = new InnerClassesAttribute("test2");
    assertEquals(false, obj1.equals(obj2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentAttributeNameNull_XEAr5() {
    InnerClassesAttribute obj1 = new InnerClassesAttribute("test");
    InnerClassesAttribute obj2 = new InnerClassesAttribute(null);
    assertEquals(false, obj1.equals(obj2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_Jjsx0() {
        InnerClassesAttribute innerClassesAttribute = new InnerClassesAttribute("test");
        assertEquals("InnerClasses: test", innerClassesAttribute.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNestedClassFileEntries_jiIF0() {
        InnerClassesAttribute innerClassesAttribute = new InnerClassesAttribute("name");
        ClassFileEntry[] expected = new ClassFileEntry[0];
        ClassFileEntry[] actual = innerClassesAttribute.getNestedClassFileEntries();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testResolve_ClassConstantPoolNotnull_VsNg0() {
    InnerClassesAttribute attribute = new InnerClassesAttribute("name");
    ClassConstantPool pool = new ClassConstantPool();
    attribute.resolve(pool);
    assertEquals(true, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testResolve_ClassConstantPoolNull_MWpV1() {
    InnerClassesAttribute attribute = new InnerClassesAttribute("name");
    attribute.resolve(null);
    assertEquals(true, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeAttributeNameNull_HIth0() {
    InnerClassesAttribute attribute = new InnerClassesAttribute(null);
    int result = attribute.hashCode();
    assertEquals(31, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeAttributeNameNull_KXKV2() {
    InnerClassesAttribute attribute = new InnerClassesAttribute(null);
    int result = attribute.hashCode();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeAttributeNameNotNull_hhEx3() {
    InnerClassesAttribute attribute = new InnerClassesAttribute("test");
    int result = attribute.hashCode();
    assertEquals(31 * attribute.getAttributeName().hashCode() + 31, result);
}
}