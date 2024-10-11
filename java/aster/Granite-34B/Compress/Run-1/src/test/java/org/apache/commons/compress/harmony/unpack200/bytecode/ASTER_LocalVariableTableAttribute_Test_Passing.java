/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LocalVariableTableAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteBodyWithEmptyArray_lbrO1() throws IOException {
        LocalVariableTableAttribute attribute = new LocalVariableTableAttribute(0, new int[]{}, new int[]{}, new CPUTF8[]{}, new CPUTF8[]{}, new int[]{});
        DataOutputStream dos = new DataOutputStream(System.out);
        attribute.writeBody(dos);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testToString_lUPA0() {
        LocalVariableTableAttribute attribute = new LocalVariableTableAttribute(1, new int[]{1}, new int[]{1}, new CPUTF8[]{new CPUTF8("name1")}, new CPUTF8[]{new CPUTF8("descriptor1")}, new int[]{1});
        String actual = attribute.toString();
        String expected = "LocalVariableTable: 1 variables";
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testToString_cBtV1() {
        LocalVariableTableAttribute attribute = new LocalVariableTableAttribute(0, new int[]{}, new int[]{}, new CPUTF8[]{}, new CPUTF8[]{}, new int[]{});
        String actual = attribute.toString();
        String expected = "LocalVariableTable: 0 variables";
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testToString_zuel2() {
        LocalVariableTableAttribute attribute = new LocalVariableTableAttribute(2, new int[]{1, 2}, new int[]{1, 2}, new CPUTF8[]{new CPUTF8("name1"), new CPUTF8("name2")}, new CPUTF8[]{new CPUTF8("descriptor1"), new CPUTF8("descriptor2")}, new int[]{1, 2});
        String actual = attribute.toString();
        String expected = "LocalVariableTable: 2 variables";
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testToString_PUVv3() {
        LocalVariableTableAttribute attribute = new LocalVariableTableAttribute(3, new int[]{1, 2, 3}, new int[]{1, 2, 3}, new CPUTF8[]{new CPUTF8("name1"), new CPUTF8("name2"), new CPUTF8("name3")}, new CPUTF8[]{new CPUTF8("descriptor1"), new CPUTF8("descriptor2"), new CPUTF8("descriptor3")}, new int[]{1, 2, 3});
        String actual = attribute.toString();
        String expected = "LocalVariableTable: 3 variables";
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testToString_qhir4() {
        LocalVariableTableAttribute attribute = new LocalVariableTableAttribute(4, new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}, new CPUTF8[]{new CPUTF8("name1"), new CPUTF8("name2"), new CPUTF8("name3"), new CPUTF8("name4")}, new CPUTF8[]{new CPUTF8("descriptor1"), new CPUTF8("descriptor2"), new CPUTF8("descriptor3"), new CPUTF8("descriptor4")}, new int[]{1, 2, 3, 4});
        String actual = attribute.toString();
        String expected = "LocalVariableTable: 4 variables";
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNestedClassFileEntriesWithNegativeLength_wtxJ3() {
        LocalVariableTableAttribute attribute = new LocalVariableTableAttribute(-1, new int[]{}, new int[]{}, new CPUTF8[]{}, new CPUTF8[]{}, new int[]{});
        ClassFileEntry[] entries = attribute.getNestedClassFileEntries();
        assertEquals(1, entries.length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setAttributeName_WhenValidInput_SetsAttributeName_iiuy0() {
        CPUTF8 cpUTF8Value = new CPUTF8("validName");
        LocalVariableTableAttribute.setAttributeName(cpUTF8Value);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setAttributeName_WhenNullInput_SetsAttributeNameToNull_BGEw1() {
        CPUTF8 cpUTF8Value = null;
        LocalVariableTableAttribute.setAttributeName(cpUTF8Value);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_hGCS0_zAtv0() {
    LocalVariableTableAttribute attribute = new LocalVariableTableAttribute(0, new int[0], new int[0], new CPUTF8[0], new CPUTF8[0], new int[0]);
    int actual = attribute.getLength();
    int expected = 2 + 10 * 0;
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLengthWithNonZeroLength_atJf1_ZPZz0() {
    LocalVariableTableAttribute attribute = new LocalVariableTableAttribute(1, new int[1], new int[1], new CPUTF8[1], new CPUTF8[1], new int[1]);
    int actual = attribute.getLength();
    int expected = 2 + 10 * 1;
    assertEquals(expected, actual);
}
}