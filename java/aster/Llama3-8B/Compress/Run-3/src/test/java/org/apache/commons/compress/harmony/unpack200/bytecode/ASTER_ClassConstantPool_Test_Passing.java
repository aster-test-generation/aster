/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ClassConstantPool_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEntries_IiRw0() {
        ClassConstantPool classConstantPool = new ClassConstantPool();
        List<ClassFileEntry> entries = classConstantPool.entries();
        assertNotNull(entries);
        assertEquals(0, entries.size());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGet_dtQf0() {
        ClassConstantPool classConstantPool = new ClassConstantPool();
        ClassFileEntry result = classConstantPool.get(0);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNegativeIndex_mfQB1() {
        ClassConstantPool classConstantPool = new ClassConstantPool();
        try {
            classConstantPool.get(-1);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddNestedEntries_EmptyEntries_pijd0() {
    ClassConstantPool classConstantPool = new ClassConstantPool();
    classConstantPool.addNestedEntries();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddNestedEntries_EmptyParents_tyUr3() {
    ClassConstantPool classConstantPool = new ClassConstantPool();
    List<ClassFileEntry> parents = new ArrayList<>();
    List<ClassFileEntry> children = new ArrayList<>();
    classConstantPool.addNestedEntries();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSize_AEqy0() {
        ClassConstantPool classConstantPool = new ClassConstantPool();
        int result = classConstantPool.size();
        assertEquals(0, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEntries_IiRw0_1() {
        ClassConstantPool classConstantPool = new ClassConstantPool();
        List<ClassFileEntry> entries = classConstantPool.entries();
        assertNotNull(entries);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEntries_IiRw0_2() {
        ClassConstantPool classConstantPool = new ClassConstantPool();
        List<ClassFileEntry> entries = classConstantPool.entries();
        assertEquals(0, entries.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIndexOfNullEntry_JZJG0_hVQP0() {
    ClassConstantPool classConstantPool = new ClassConstantPool();
    Integer entryIndex = classConstantPool.indexOf(null);
    assert entryIndex == null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIndexOfNonResolvedEntry_kAMc2_bfLB1() {
    ClassConstantPool classConstantPool = new ClassConstantPool();
    Integer entryIndex = classConstantPool.indexOf(null);
    assert entryIndex == -1;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testResolveInitialSortEntries_wxWY2_djwp0() {
    ClassConstantPool classConstantPool = new ClassConstantPool();
    assertEquals(0, classConstantPool.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddNestedEntries_SingleEntry_HGbm1_LxuY0() {
    ClassConstantPool classConstantPool = new ClassConstantPool();
    List<ClassFileEntry> entries = new ArrayList<>();
    classConstantPool.addNestedEntries();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddNestedEntries_MultipleEntries_swmW2_KsPm0() {
    ClassConstantPool classConstantPool = new ClassConstantPool();
    List<ClassFileEntry> entries = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
    }
    classConstantPool.addNestedEntries();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddNestedEntries_EmptyChildren_TjJO4_WwZU0() {
    ClassConstantPool classConstantPool = new ClassConstantPool();
    List<ClassFileEntry> parents = new ArrayList<>();
    List<ClassFileEntry> children = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
    }
    classConstantPool.addNestedEntries();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddNestedEntries_MultipleParents_KUZI5_YUSV0() {
    ClassConstantPool classConstantPool = new ClassConstantPool();
    List<ClassFileEntry> parents = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
        parents.add(null); // Instantiate null instead of ClassFileEntry
    }
    List<ClassFileEntry> children = new ArrayList<>();
    classConstantPool.addNestedEntries();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddNullEntry_ejDK4_BDZp1() {
    ClassConstantPool classConstantPool = new ClassConstantPool();
    ClassFileEntry entry = null;
    try {
        classConstantPool.add(entry);
        org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
    }
}
}