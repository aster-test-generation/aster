/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;

import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LocalVariableTypeTableAttribute_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRenumberWithEmptyOffsets_GSed0() {
    int[] startPcs = {0, 5, 10};
    int[] lengths = {5, 5, 5};
    CPUTF8[] names = new CPUTF8[]{new CPUTF8("a"), new CPUTF8("b"), new CPUTF8("c")};
    CPUTF8[] signatures = new CPUTF8[]{new CPUTF8("I"), new CPUTF8("J"), new CPUTF8("D")};
    int[] indexes = {1, 2, 3};
    LocalVariableTypeTableAttribute attribute = new LocalVariableTypeTableAttribute(3, startPcs, lengths, names, signatures, indexes);
    List<Integer> byteCodeOffsets = new ArrayList<>();
    try {
        attribute.renumber(byteCodeOffsets);
    } catch (Pack200Exception e) {
        assertEquals("Error renumbering bytecode indexes", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_alOK0_qZMD0_fid2() {
    int localVariableTypeTableLength = 3;
    int[] startPcs = {0, 10, 20};
    int[] lengths = {5, 5, 5};
    CPUTF8[] names = {new CPUTF8("var1", 0), new CPUTF8("var2", 0), new CPUTF8("var3", 0)};
    CPUTF8[] signatures = {new CPUTF8("I", 0), new CPUTF8("LString;", 0), new CPUTF8("[I", 0)};
    int[] indexes = {1, 2, 3};
    LocalVariableTypeTableAttribute attribute = new LocalVariableTypeTableAttribute(localVariableTypeTableLength, startPcs, lengths, names, signatures, indexes);
    String expected = "LocalVariableTypeTable: 3 variables";
    assertEquals(expected, attribute.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntriesEmpty_RYiT0_FbsZ0_2_fid2() {
    int localVariableTypeTableLength = 0;
    int[] startPcs = new int[0];
    int[] lengths = new int[0];
    CPUTF8[] names = new CPUTF8[0];
    CPUTF8[] signatures = new CPUTF8[0];
    int[] indexes = new int[0];
    LocalVariableTypeTableAttribute attribute = new LocalVariableTypeTableAttribute(localVariableTypeTableLength, startPcs, lengths, names, signatures, indexes);
    ClassFileEntry[] result = attribute.getNestedClassFileEntries();
    assertTrue(result[0] instanceof ClassFileEntry);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntriesEmpty_RYiT0_FbsZ0_3() {
    int localVariableTypeTableLength = 0;
    int[] startPcs = new int[0];
    int[] lengths = new int[0];
    CPUTF8[] names = new CPUTF8[0];
    CPUTF8[] signatures = new CPUTF8[0];
    int[] indexes = new int[0];
    LocalVariableTypeTableAttribute attribute = new LocalVariableTypeTableAttribute(localVariableTypeTableLength, startPcs, lengths, names, signatures, indexes);
    ClassFileEntry[] result = attribute.getNestedClassFileEntries();
    assertEquals("AttributeName", ((CPUTF8)result[0]).underlyingString());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntriesNonEmpty_UdYX1_NyoG0_2() {
    int localVariableTypeTableLength = 2;
    int[] startPcs = {0, 1};
    int[] lengths = {2, 2};
    CPUTF8[] names = {new CPUTF8("name1", 0), new CPUTF8("name2", 1)};
    CPUTF8[] signatures = {new CPUTF8("signature1", 0), new CPUTF8("signature2", 1)};
    int[] indexes = {0, 1};
    LocalVariableTypeTableAttribute attribute = new LocalVariableTypeTableAttribute(localVariableTypeTableLength, startPcs, lengths, names, signatures, indexes);
    ClassFileEntry[] result = attribute.getNestedClassFileEntries();
    assertTrue(result[0] instanceof ClassFileEntry);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntriesNonEmpty_UdYX1_NyoG0_3() {
    int localVariableTypeTableLength = 2;
    int[] startPcs = {0, 1};
    int[] lengths = {2, 2};
    CPUTF8[] names = {new CPUTF8("name1", 0), new CPUTF8("name2", 1)};
    CPUTF8[] signatures = {new CPUTF8("signature1", 0), new CPUTF8("signature2", 1)};
    int[] indexes = {0, 1};
    LocalVariableTypeTableAttribute attribute = new LocalVariableTypeTableAttribute(localVariableTypeTableLength, startPcs, lengths, names, signatures, indexes);
    ClassFileEntry[] result = attribute.getNestedClassFileEntries();
    assertEquals("AttributeName", ((CPUTF8)result[0]).underlyingString());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRenumberWithNonSequentialOffsets_FuBk2_kEGJ0() {
    int[] startPcs = {0, 3, 8};
    int[] lengths = {3, 5, 2};
    CPUTF8[] names = new CPUTF8[]{new CPUTF8("a"), new CPUTF8("b"), new CPUTF8("c")};
    CPUTF8[] signatures = new CPUTF8[]{new CPUTF8("I"), new CPUTF8("J"), new CPUTF8("D")};
    int[] indexes = {1, 2, 3};
    LocalVariableTypeTableAttribute attribute = new LocalVariableTypeTableAttribute(3, startPcs, lengths, names, signatures, indexes);
    List<Integer> byteCodeOffsets = Arrays.asList(0, 1, 2, 5, 6, 7, 10, 11);
    try {
        attribute.renumber(byteCodeOffsets);
    } catch (Exception e) {
        fail("Exception should not be thrown");
    }
    assertArrayEquals(new int[]{3, 2, 1}, lengths);
}
}