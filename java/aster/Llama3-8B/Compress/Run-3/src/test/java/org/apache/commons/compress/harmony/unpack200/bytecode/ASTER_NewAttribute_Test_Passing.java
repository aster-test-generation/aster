/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_NewAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStartPCs_zTfF0() {
        NewAttribute newAttribute = new NewAttribute(new CPUTF8("attributeName", 0), 0);
        int[] result = newAttribute.getStartPCs();
        assertArrayEquals(new int[0], result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testResolve_ClassConstantPoolEmpty_ULpy0() {
    NewAttribute attribute = new NewAttribute(new CPUTF8("attributeName"), 0);
    ClassConstantPool pool = new ClassConstantPool();
    attribute.resolve(pool);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLayoutIndex_iWCn0() {
        CPUTF8 attributeName = new CPUTF8("attributeName", 0);
        NewAttribute newAttribute = new NewAttribute(attributeName, 1);
        assertEquals(1, newAttribute.getLayoutIndex());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRenumber1_JuxD0() {
    NewAttribute newAttribute = new NewAttribute(new CPUTF8("attributeName", 0), 0);
    List<Integer> byteCodeOffsets = Arrays.asList(1, 2, 3, 4, 5);
    newAttribute.renumber(byteCodeOffsets);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_GWAP0_WXhq0() {
    CPUTF8 attributeName = new CPUTF8("attributeName");
    NewAttribute newAttribute = new NewAttribute(attributeName, 0);
    assertEquals("attributeName", newAttribute.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_EmptyBody_ReturnsEmptyArray_RYMV0_ffaX0() {
    NewAttribute newAttribute = new NewAttribute(new CPUTF8("attributeName", 0), 0);
    ClassFileEntry[] result = newAttribute.getNestedClassFileEntries();
    assert result.length == 0;
}
}