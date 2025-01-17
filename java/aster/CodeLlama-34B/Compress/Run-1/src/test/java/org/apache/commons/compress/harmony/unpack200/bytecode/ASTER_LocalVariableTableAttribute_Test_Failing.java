/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LocalVariableTableAttribute_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries1_hZWr0_Iekt0_1_fid2() {
    LocalVariableTableAttribute attr = new LocalVariableTableAttribute(1, new int[] { 0 }, new int[] { 1 }, new CPUTF8[] { new CPUTF8("name") }, new CPUTF8[] { new CPUTF8("descriptor") }, new int[] { 0 });
    ClassFileEntry[] entries = attr.getNestedClassFileEntries();
    assertEquals(2, entries.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries1_hZWr0_Iekt0_2() {
    LocalVariableTableAttribute attr = new LocalVariableTableAttribute(1, new int[] { 0 }, new int[] { 1 }, new CPUTF8[] { new CPUTF8("name") }, new CPUTF8[] { new CPUTF8("descriptor") }, new int[] { 0 });
    ClassFileEntry[] entries = attr.getNestedClassFileEntries();
    assertEquals(new CPUTF8("name"), entries[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries1_hZWr0_Iekt0_3() {
    LocalVariableTableAttribute attr = new LocalVariableTableAttribute(1, new int[] { 0 }, new int[] { 1 }, new CPUTF8[] { new CPUTF8("name") }, new CPUTF8[] { new CPUTF8("descriptor") }, new int[] { 0 });
    ClassFileEntry[] entries = attr.getNestedClassFileEntries();
    assertEquals(new CPUTF8("descriptor"), entries[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries2_CUwr1_NnKD0_1() {
    LocalVariableTableAttribute attr = new LocalVariableTableAttribute(2, new int[] { 0, 1 }, new int[] { 1, 2 }, new CPUTF8[] { new CPUTF8("name1"), new CPUTF8("name2") }, new CPUTF8[] { new CPUTF8("descriptor1"), new CPUTF8("descriptor2") }, new int[] { 0, 1 });
    ClassFileEntry[] entries = attr.getNestedClassFileEntries();
    assertEquals(4, entries.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries2_CUwr1_NnKD0_2() {
    LocalVariableTableAttribute attr = new LocalVariableTableAttribute(2, new int[] { 0, 1 }, new int[] { 1, 2 }, new CPUTF8[] { new CPUTF8("name1"), new CPUTF8("name2") }, new CPUTF8[] { new CPUTF8("descriptor1"), new CPUTF8("descriptor2") }, new int[] { 0, 1 });
    ClassFileEntry[] entries = attr.getNestedClassFileEntries();
    assertEquals(new CPUTF8("name1"), entries[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries2_CUwr1_NnKD0_3() {
    LocalVariableTableAttribute attr = new LocalVariableTableAttribute(2, new int[] { 0, 1 }, new int[] { 1, 2 }, new CPUTF8[] { new CPUTF8("name1"), new CPUTF8("name2") }, new CPUTF8[] { new CPUTF8("descriptor1"), new CPUTF8("descriptor2") }, new int[] { 0, 1 });
    ClassFileEntry[] entries = attr.getNestedClassFileEntries();
    assertEquals(new CPUTF8("descriptor1"), entries[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries2_CUwr1_NnKD0_4() {
    LocalVariableTableAttribute attr = new LocalVariableTableAttribute(2, new int[] { 0, 1 }, new int[] { 1, 2 }, new CPUTF8[] { new CPUTF8("name1"), new CPUTF8("name2") }, new CPUTF8[] { new CPUTF8("descriptor1"), new CPUTF8("descriptor2") }, new int[] { 0, 1 });
    ClassFileEntry[] entries = attr.getNestedClassFileEntries();
    assertEquals(new CPUTF8("name2"), entries[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries2_CUwr1_NnKD0_5() {
    LocalVariableTableAttribute attr = new LocalVariableTableAttribute(2, new int[] { 0, 1 }, new int[] { 1, 2 }, new CPUTF8[] { new CPUTF8("name1"), new CPUTF8("name2") }, new CPUTF8[] { new CPUTF8("descriptor1"), new CPUTF8("descriptor2") }, new int[] { 0, 1 });
    ClassFileEntry[] entries = attr.getNestedClassFileEntries();
    assertEquals(new CPUTF8("descriptor2"), entries[3]);}
}