/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SourceFileAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeNameNull_gswq0() {
    SourceFileAttribute attribute = new SourceFileAttribute(null);
    int result = attribute.hashCode();
    assertEquals(31, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentName_PWdQ3_RuQK0() {
    SourceFileAttribute attribute = new SourceFileAttribute(new CPUTF8("test"));
    SourceFileAttribute other = new SourceFileAttribute(new CPUTF8("other"));
    boolean result = attribute.equals(other);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObjectWithSameName_NZCt4_NwBG0() {
    SourceFileAttribute attribute = new SourceFileAttribute(new CPUTF8("test"));
    SourceFileAttribute other = new SourceFileAttribute(new CPUTF8("test"));
    boolean result = attribute.equals(other);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_dFUs0_Igvd0() {
    CPUTF8 cpuTF8 = new CPUTF8("name", 0);
    SourceFileAttribute sourceFileAttribute = new SourceFileAttribute(cpuTF8);
    ClassFileEntry[] expected = new ClassFileEntry[] { cpuTF8, cpuTF8 };
    ClassFileEntry[] actual = sourceFileAttribute.getNestedClassFileEntries();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_Sakz0_Itkl0() {
    CPUTF8 name = new CPUTF8("test", 0);
    SourceFileAttribute sourceFileAttribute = new SourceFileAttribute(name);
    assertEquals(4, sourceFileAttribute.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSourceFileAttribute_VjAb0_ykVA0() {
    SourceFileAttribute sourceFileAttribute = new SourceFileAttribute(new CPUTF8("name"));
    assertTrue(sourceFileAttribute.isSourceFileAttribute());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testResolve_BRrK0_XZOV1() {
    CPUTF8 name = new CPUTF8("test", 0);
    ClassConstantPool pool = new ClassConstantPool();
    SourceFileAttribute attribute = new SourceFileAttribute(name);
    attribute.resolve(pool);
    assertEquals(0, attribute.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeNameNotNull_pZyi1_dFLe0() {
    CPUTF8 name = new CPUTF8("test", 0);
    SourceFileAttribute attribute = new SourceFileAttribute(name);
    int result = attribute.hashCode();
}
}