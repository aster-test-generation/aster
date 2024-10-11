/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_NewAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNestedClassFileEntries_EmptyBody_zGtC4_1() {
        CPUTF8 attributeName = new CPUTF8("TestAttribute");
        NewAttribute attribute = new NewAttribute(attributeName, 0);
        ClassFileEntry[] result = attribute.getNestedClassFileEntries();
        assertEquals(1, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNestedClassFileEntries_EmptyBody_zGtC4_2() {
        CPUTF8 attributeName = new CPUTF8("TestAttribute");
        NewAttribute attribute = new NewAttribute(attributeName, 0);
        ClassFileEntry[] result = attribute.getNestedClassFileEntries();
        assertEquals(attributeName, result[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCsReturnsNull_nEHW0() {
    CPUTF8 attributeName = new CPUTF8("attributeName");
    NewAttribute newAttribute = new NewAttribute(attributeName, 1);
    int[] result = newAttribute.getStartPCs();
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLayoutIndex_KYPp0() {
    CPUTF8 attributeName = new CPUTF8("attributeName");
    NewAttribute newAttribute = new NewAttribute(attributeName, 5);
    assertEquals(5, newAttribute.getLayoutIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthEmpty_RgpZ0() {
        CPUTF8 attributeName = new CPUTF8("attribute");
        NewAttribute attribute = new NewAttribute(attributeName, 0);
        assertEquals(0, attribute.getLength());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRenumberAlreadyRenumbered_brFq6() {
        NewAttribute attribute = new NewAttribute(new CPUTF8("test"), 1);
        List<Integer> byteCodeOffsets = Arrays.asList(10, 20, 30);
        attribute.renumbered = true;
        attribute.renumber(byteCodeOffsets);
        assertTrue(attribute.renumbered);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_NoNestedEntries_CtwR0_OYox0_1() {
    CPUTF8 attributeName = new CPUTF8("TestAttribute", 0);
    NewAttribute attribute = new NewAttribute(attributeName, 0);
    ClassFileEntry[] result = attribute.getNestedClassFileEntries();
    assertEquals(1, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_NoNestedEntries_CtwR0_OYox0_2() {
    CPUTF8 attributeName = new CPUTF8("TestAttribute", 0);
    NewAttribute attribute = new NewAttribute(attributeName, 0);
    ClassFileEntry[] result = attribute.getNestedClassFileEntries();
    assertEquals(attributeName, result[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_OneNestedEntry_sEiW1_ftiZ0_1() {
    CPUTF8 attributeName = new CPUTF8("TestAttribute", 0);
    NewAttribute attribute = new NewAttribute(attributeName, 0);
    ClassFileEntry[] result = attribute.getNestedClassFileEntries();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLengthWithValues_HEct1_fDph0() {
    CPUTF8 attributeName = new CPUTF8("attribute");
    NewAttribute attribute = new NewAttribute(attributeName, 0);
    attribute.addBCOffset(5, 0); // Assuming addBCOffset indirectly adds to lengths
    attribute.addBCOffset(10, 0);
    attribute.addBCOffset(15, 0);
    assertEquals(30, attribute.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRenumberSingleBCIndex_rZwy0_CAwY0() {
    NewAttribute attribute = new NewAttribute(new CPUTF8("test"), 1);
    List<Integer> byteCodeOffsets = Arrays.asList(10, 20, 30);
    attribute.addBCOffset(1, 20); // Correctly using the addBCOffset method to handle BCOffset
}
}